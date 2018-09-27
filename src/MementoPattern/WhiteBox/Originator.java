package MementoPattern.WhiteBox;

/*
 * 发起人（Originator）角色
 * 创建一个含有当前的内部状态的备忘录对象。使用备忘录对象存储其内部状态。
 */
public class Originator {
	private String state;

	/**
	 * 工厂方法，返回一个新的备忘录对象
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * 将发起人恢复到备忘录对象所记载的状态
	 */
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前状态：" + this.state);
	}
}
