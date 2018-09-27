package InterpreterPattern;
/*
 * 解释器模式是类的行为模式
 * 给定一个语言之后，解释器模式可以定义出其文法的一种表示，并同时提供一个解释器。
 * 客户端可以使用这个解释器来解释这个语言中的句子。
 */

/*
 * 抽象表达式(Expression)角色
 * 声明一个所有的具体表达式角色都需要实现的抽象接口。这个接口主要是一个interpret()方法，称做解释操作。
 */
public abstract class Expression {
	/**
	 * 以环境为准，本方法解释给定的任何一个表达式
	 */
	public abstract boolean interpret(Context ctx);

	/**
	 * 检验两个表达式在结构上是否相同
	 */
	public abstract boolean equals(Object obj);

	/**
	 * 返回表达式的hash code
	 */
	public abstract int hashCode();

	/**
	 * 将表达式转换成字符串
	 */
	public abstract String toString();
}
