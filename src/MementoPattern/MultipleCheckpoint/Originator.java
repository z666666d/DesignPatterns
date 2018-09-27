package MementoPattern.MultipleCheckpoint;

import java.util.ArrayList;
import java.util.List;

/*
 * 白箱和黑箱的示意性实现都是只存储一个状态的简单实现，也可以叫做只有一个检查点。
 * 常见的系统往往需要存储不止一个状态，而是需要存储多个状态，或者叫做有多个检查点。
 * 
 * 备忘录模式可以将发起人对象的状态存储到备忘录对象里面，
 * 备忘录模式可以将发起人对象恢复到备忘录对象所存储的某一个检查点上。
 */
public class Originator {
	private List<String> states;

	// 检查点指数
	private int index;

	/**
	* 构造函数
	*/
	public Originator() {
		states = new ArrayList<String>();
		index = 0;
	}

	/**
	 * 工厂方法，返还一个新的备忘录对象
	 */
	public Memento createMemento() {
		return new Memento(states, index);
	}

	/**
	 * 将发起人恢复到备忘录对象记录的状态上
	 */
	public void restoreMemento(Memento memento) {
		states = memento.getStates();
		index = memento.getIndex();
	}

	/**
	 * 状态的赋值方法
	 */
	public void setState(String state) {
		states.add(state);
		index++;
	}

	/**
	 * 辅助方法，打印所有状态
	 */
	public void printStates() {

		for (String state : states) {
			System.out.println(state);
		}
	}
}
