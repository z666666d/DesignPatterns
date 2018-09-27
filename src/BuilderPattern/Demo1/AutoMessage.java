package BuilderPattern.Demo1;

import java.util.Date;

/**
 * 这里的邮件具有一个公共的抽象类，但这并不是建造者模式的特点，建造者模式完全可以应用到完全不同接口的产品上
 * 
 * 大多数情况下是不知道最终构建出来的产品是什么样的，所以在建造者模式中，一般不需要给产品定义一个公共接口
 * 
 * 
 * @author Administrator
 *
 */
public abstract class AutoMessage {
	// 收件人地址
	private String to;
	// 发件人地址
	private String from;
	// 标题
	private String subject;
	// 内容
	private String body;
	// 发送日期
	private Date sendDate;

	public void send() {
		System.out.println("收件人地址：" + to);
		System.out.println("发件人地址：" + from);
		System.out.println("标题：" + subject);
		System.out.println("内容：" + body);
		System.out.println("发送日期：" + sendDate);
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

}
