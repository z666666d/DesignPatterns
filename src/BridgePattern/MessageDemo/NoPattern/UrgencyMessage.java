package BridgePattern.MessageDemo.NoPattern;

/*
 * 加急消息的接口
 * 加急消息的实现不同于普通消息，加急消息会自动在消息上添加加急，然后在再发送消息
 * 另外加急消息会提供监控的方法，让客户端可以随时通过这个方法来了解对于加急消息的处理进度。
 * 因此加急消息需要扩展出一个新的接口，除了基本的发送消息的功能，还需要添加监控功能。
 */
public interface UrgencyMessage extends Message {
	/**
	* 监控指定消息的处理过程
	* @param messageId  被监控的消息编号
	* @return    监控到的消息的处理状态
	*/
	public Object watch(String messageId);
}
