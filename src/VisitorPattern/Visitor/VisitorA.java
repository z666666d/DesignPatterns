package VisitorPattern.Visitor;

/*
 * 具体访问者VisitorA类
 * 具体访问者(ConcreteVisitor)角色：实现抽象访问者所声明的接口，也就是抽象访问者所声明的各个访问操作。
 */
public class VisitorA implements Visitor {
	/**
	 * 对应于NodeA的访问操作
	 */
	@Override
	public void visit(NodeA node) {
		System.out.println(node.operationA());
	}

	/**
	 * 对应于NodeB的访问操作
	 */
	@Override
	public void visit(NodeB node) {
		System.out.println(node.operationB());
	}

}
