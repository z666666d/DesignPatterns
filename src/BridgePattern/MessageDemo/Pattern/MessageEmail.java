package BridgePattern.MessageDemo.Pattern;

public class MessageEmail implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		System.out.println("使用邮件短消息的方法，发送消息'" + message + "'给" + toUser);
	}

}
