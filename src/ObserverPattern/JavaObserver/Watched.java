package ObserverPattern.JavaObserver;

import java.util.Observable;

/*
 * 被观察者，继承自java.util.Observable类
 */
public class Watched extends Observable {
	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {

		if (!this.data.equals(data)) {
			this.data = data;
			setChanged();
		}
		notifyObservers();
	}
}
