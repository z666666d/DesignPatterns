package StatePattern;

/*
 * 环境(Context)角色
 * 定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。
 * 这个具体状态类的实例给出此环境对象的现有状态。
 */
public class Context {
	// 持有一个State类型的对象实例
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	/**
	 * 用户感兴趣的接口方法
	 */
	public void request(String sampleParameter) {
		// 转调state来处理
		state.handle(sampleParameter);
	}
}
