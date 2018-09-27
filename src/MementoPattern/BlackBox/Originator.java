package MementoPattern.BlackBox;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("赋值状态：" + state);
	}

	/**
	 * 工厂方法，返还一个新的备忘录对象
	 */
	public MementoIF createMemento() {
		return new Memento(state);
	}

	/**
	 * 发起人恢复到备忘录对象记录的状态
	 */
	public void restoreMemento(MementoIF memento) {
		this.setState(((Memento) memento).getState());
	}

	/*
	 * 以内部类实现备忘录角色。 这样备忘录对象的状态就只对发起者可见
	 */
	private class Memento implements MementoIF {
		private String state;

		/**
		 * 构造方法
		 */
		private Memento(String state) {
			this.state = state;
		}

		private String getState() {
			return state;
		}

		private void setState(String state) {
			this.state = state;
		}
	}
}
