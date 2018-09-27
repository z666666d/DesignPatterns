package BridgePattern.MessageDemo.NoPattern;

/*
 * 消息的统一接口
 */
public interface Message {
	/**
	 * 发送消息
	 * @param message 要发送消息的内容
	 * @param toUser  消息的接受者
	 */
	public void send(String message, String toUser);
}
