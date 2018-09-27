package InterpreterPattern;

/*
 * 代表逻辑“与”操作的And类，表示由两个布尔表达式通过逻辑“与”操作给出一个新的布尔表达式的操作
 * 
 * 非终结符表达式(Nonterminal Expression)角色
 * 文法中的每一条规则都需要一个具体的非终结符表达式，非终结符表达式一般是文法中的运算符或者其他关键字
 * 比如公式R=R1+R2中，“+"就是非终结符，解析“+”的解释器就是一个非终结符表达式。
 */
public class And extends Expression {

	private Expression left, right;

	public And(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof And) {
			return left.equals(((And) obj).left) && right.equals(((And) obj).right);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public boolean interpret(Context ctx) {

		return left.interpret(ctx) && right.interpret(ctx);
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " AND " + right.toString() + ")";
	}

}
