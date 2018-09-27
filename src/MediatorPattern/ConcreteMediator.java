package MediatorPattern;

/*
 * 具体调停者(ConcreteMediator)角色
 * 实现了抽象调停者所声明的事件方法。
 * 具体调停者知晓所有的具体同事类，并负责具体的协调各同事对象的交互关系。
 */
public class ConcreteMediator implements Mediator {
	// 持有并维护同事A
	private ConcreteColleagueA colleagueA;

	// 持有并维护同事B
	private ConcreteColleagueB colleagueB;

	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}

	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}

	@Override
	public void changed(Colleague c) {
		/**
		 * 某一个同事类发生了变化，通常需要与其他同事交互
		 * 具体协调相应的同事对象来实现协作行为
		 */
	}
}
