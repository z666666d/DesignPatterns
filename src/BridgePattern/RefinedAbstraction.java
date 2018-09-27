package BridgePattern;

/*
 * 修正抽象化(RefinedAbstraction)角色：扩展抽象化角色，改变和修正父类对抽象化的定义。
 */
public class RefinedAbstraction extends Abstraction {
	public RefinedAbstraction(Implementor impl) {
		super(impl);
	}

	// 其他的操作方法
	public void otherOperation() {

	}
}
