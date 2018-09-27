package BridgePattern.MessageDemo.NoPattern;

/*
 * 邮件加急短消息类
 */
public class UrgencyMessageEmail implements UrgencyMessage {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		message = "加急：" + message;
		System.out.println("使用邮件短消息的方法，发送消息'" + message + "'给" + toUser);
	}

	@Override
	public Object watch(String messageId) {
		// TODO Auto-generated method stub
		// 根据消息id获取消息的状态，组织成监控的数据对象，然后返回
		return null;
	}

}
