package MementoPattern.MultipleCheckpoint;

/*
 * 客户端角色通过不断改变发起人角色的状态，并将之存储在备忘录里面。
 * 通过指明检查点指数可以将发起人角色恢复到相应的检查点所对应的状态上。
 */
public class Client {
	public static void main(String[] args) {
		Originator o = new Originator();
		Caretaker c = new Caretaker(o);

		// 改变状态
		o.setState("state 0");
		// 建立一个检查点
		c.createMemento();
		// 改变状态
		o.setState("state 1");
		// 建立一个检查点
		c.createMemento();
		// 改变状态
		o.setState("state 2");
		// 建立一个检查点
		c.createMemento();
		// 改变状态
		o.setState("state 3");
		// 建立一个检查点
		c.createMemento();
		// 打印出所有检查点
		o.printStates();
		System.out.println("-----------------恢复检查点-----------------");
		// 恢复到第二个检查点
		c.restoreMemento(2);
		// 打印出所有检查点
		o.printStates();
	}
}
