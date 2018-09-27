package VisitorPattern.Visitor;

/*
 * 具体节点(ConcreteNode)角色：实现了抽象节点所规定的接受操作。
 */
public class NodeA extends Node {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	/**
	 * NodeA特有的方法
	 */
	public String operationA() {
		return "NodeA";
	}
}
