package ObserverPattern.LaObserverPattern;

/*
 * 与推模型相比，变化就是调用通知观察者的方法的时候，不需要传入参数了
 * 因为在nodifyObservers()方法中已经将subject对象引用传递给了观察者，观察者需要什么自己获取
 */
public class ConcreteSubject extends Subject {
	private String state;

	public String getState() {
		return state;
	}

	public void change(String newState) {
		state = newState;
		System.out.println("主题状态为：" + state);
		// 状态发生改变，通知各个观察者
		this.nodifyObservers();
	}
}
