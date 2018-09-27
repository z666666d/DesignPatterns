package StatePattern;

/*
 * 具体状态(ConcreteState)角色
 * 每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。
 */
public class ConcreteStateA implements State {

	@Override
	public void handle(String sampleParameter) {
		// TODO Auto-generated method stub
		System.out.println("ConcreteStateA handle ：" + sampleParameter);
	}

}
