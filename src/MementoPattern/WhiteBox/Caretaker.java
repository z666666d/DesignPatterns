package MementoPattern.WhiteBox;

/*
 * 负责人（Caretaker）角色
 * 负责人角色有如下责任：（1）负责保存备忘录对象 （2）不检查备忘录对象的内容
 */
public class Caretaker {
	private Memento memento;

	/**
	 * 备忘录的取值方法
	 */
	public Memento retrieveMemento() {
		return this.memento;
	}

	/**
	* 备忘录的赋值方法
	*/
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
}
