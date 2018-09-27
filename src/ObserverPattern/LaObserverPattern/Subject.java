package ObserverPattern.LaObserverPattern;

import java.util.ArrayList;
import java.util.List;

/*
 * 拉模型的抽象主题
 * 主要的改变是nodifyObservers()方法。
 * 在循环通知观察者的时候，也就是循环调用观察者的update()方法的时候，将自身引用传递给了观察者
 */
public abstract class Subject {
	/**
	* 用来保存注册的观察者对象
	*/
	private List<Observer> list = new ArrayList<Observer>();

	/**
	 * 注册观察者对象
	 * @param observer    观察者对象
	 */
	public void attach(Observer observer) {

		list.add(observer);
		System.out.println("Attached an observer");
	}

	/**
	* 删除观察者对象
	* @param observer    观察者对象
	*/
	public void detach(Observer observer) {

		list.remove(observer);
	}

	/**
	 * 通知所有注册的观察者对象
	 */
	public void nodifyObservers() {

		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
