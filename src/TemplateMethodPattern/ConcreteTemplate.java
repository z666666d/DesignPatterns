package TemplateMethodPattern;

/*
 * 具体模板角色
 * 实现父类所定义的一个或多个抽象方法，它们是一个顶级逻辑的组成步骤。
 * 每一个抽象模板角色都可以有任意多个具体模板角色与之对应，而每一个具体模板角色都可以给出这些抽象方法的不同实现
 * 也可以对抽象模板角色的某些具体方法进行重写
 * 
 * 关键：子类可以置换掉父类的可变部分，但是子类却不可以改变模板方法所代表的顶级逻辑。
 * 每当定义一个新的子类时，不要按照控制流程的思路去想，而应当按照“责任”的思路去想。
 * 换言之，应当考虑哪些操作是必须置换掉的，哪些操作是可以置换掉的，以及哪些操作是不可以置换掉的。
 * 使用模板模式可以使这些责任变得清晰。
 */
public class ConcreteTemplate extends AbstractTemplate {

	// 基本方法的实现
	@Override
	protected void abstractMethod() {
		// TODO Auto-generated method stub
		// 业务相关的代码
	}

	// 重写父类的方法
	@Override
	public void hookMethod() {
		// 业务相关的代码
	}

}
