package MementoPattern.HistoryOnSelfPattern;

/*
 * 自述历史  ：备忘录模式的一个变种
 * 在备忘录模式中，发起人(Originator)角色、负责人(Caretaker)角色和备忘录(Memento)角色都是独立的角色。
 * 虽然在实现上备忘录类可以成为发起人类的内部成员类，但是备忘录类仍然保持作为一个角色的独立意义。
 * 
 * 在“自述历史”模式里面，发起人角色自己兼任负责人角色。
 */
public class Originator {
	public String state;

	/**
	 * 改变状态
	 */
	public void changeState(String state) {
		this.state = state;
		System.out.println("状态改变为：" + state);
	}

	/**
	 * 工厂方法，返还一个新的备忘录对象
	 */
	public Memento createMemento() {
		return new Memento(this);
	}

	/**
	 * 将发起人恢复到备忘录对象所记录的状态上
	 */
	public void restoreMemento(MementoIF memento) {
		Memento m = (Memento) memento;
		changeState(m.state);
	}

	private class Memento implements MementoIF {

		private String state;

		/**
		 * 构造方法
		 */
		private Memento(Originator o) {
			this.state = o.state;
		}

		private String getState() {
			return state;
		}

	}
}
