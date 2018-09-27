package VisitorPattern.Visitor;

import java.util.ArrayList;
import java.util.List;

/*
 * 结构对象角色类
 * 这个角色有如下责任：
 * 可以遍历结构中的所有元素
 * 如果需要，提供一个高层次的接口让访问者对象可以访问每一个元素
 * 如果需要，可以设计成一个复合对象或者一个聚集，如List或Set
 * 
 * 
 * 这个结构对象角色持有一个聚集，并向外界提供add()方法作为对聚集的管理操作。
 * 通过调用这个方法，可以动态地增加一个新的节点。
 */
public class ObjectStructure {
	private List<Node> nodes = new ArrayList<Node>();

	/**
	* 执行方法操作
	*/
	public void action(Visitor visitor) {

		for (Node node : nodes) {
			node.accept(visitor);
		}

	}

	/**
	 * 添加一个新元素
	 */
	public void add(Node node) {
		nodes.add(node);
	}
}
