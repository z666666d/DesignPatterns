package BridgePattern.MessageDemo.NoPattern;

/*
 * 邮件消息类
 */
public class CommonMessageEmail implements Message {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		System.out.println("使用邮件短消息的方法，发送消息'" + message + "'给" + toUser);
	}

}
