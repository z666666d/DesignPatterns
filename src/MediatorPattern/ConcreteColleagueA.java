package MediatorPattern;

/*
 * 具体同事类(ConcreteColleague)角色
 * 所有的具体同事类均从抽象同事类继承而来。
 * 实现自己的业务，在需要与其他同事通信的时候，就与持有的调停者通信，调停者会负责与其他的同事交互。
 */
public class ConcreteColleagueA extends Colleague {
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 示意方法，执行某些操作
	 */
	public void operation() {
		// 在需要跟其他同事通信的时候，通知调停者对象
		getMediator().changed(this);
	}
}
