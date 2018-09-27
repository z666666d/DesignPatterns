package VisitorPattern.Visitor;

public class NodeB extends Node {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	/**
	 * NodeB特有的方法
	 */
	public String operationB() {
		return "NodeB";
	}

}
