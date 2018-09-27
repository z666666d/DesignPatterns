package ChainOfResponsibilityPattern;
/*
 * 责任链模式Chain of Responsibility Pattern
 * 在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。
 * 请求在这个链上传递，直到链上的某一个对象决定处理此请求。
 * 发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，
 * 这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。
 */

/*
 * 抽象处理者(Handler)角色
 * 定义出一个处理请求的接口。如果需要，接口可以定义 出一个方法以设定和返回对下家的引用。
 * 这个角色通常由一个Java抽象类或者Java接口实现。抽象方法handleRequest()规范了子类处理请求的操作。
 */
public abstract class Handler {
	/**
	 * 持有后继的责任对象
	 */
	protected Handler successor;

	/**
	 * 示意处理请求的方法，虽然这个示意方法是没有传入参数的
	 * 但实际是可以传入参数的，根据具体需要来选择是否传递参数
	 */
	public abstract void handleRequest();

	/**
	 * 取值方法
	 */
	public Handler getSuccessor() {
		return successor;
	}

	/**
	 * 赋值方法，设置后继的责任对象
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
}
