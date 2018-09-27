package ObserverPattern.LaObserverPattern;

/*
 * 推模型的update对象接收subject主动传递过来的数据
 * 而拉模型接收一个subject对象，需要什么数据自己获取
 */
public class ConcreteObserver implements Observer {

	// 观察者的状态
	private String observerState;

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		/**
		 * 更新观察者的状态，使其与目标的状态保持一致
		 */
		observerState = ((ConcreteSubject) subject).getState();
		System.out.println("观察者状态为：" + observerState);
	}

}
