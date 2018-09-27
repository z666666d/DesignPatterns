package BridgePattern;

/*
 * 抽象化(Abstraction)角色：抽象化给出的定义，并保存一个对实现化对象的引用。
 */
public abstract class Abstraction {
	protected Implementor impl;

	public Abstraction(Implementor impl) {
		this.impl = impl;
	}

	// 示例方法
	public void operation() {

		impl.operationImpl();
	}
}
