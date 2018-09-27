package BuilderPattern.Demo1;

/**
 * 客户端
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {

		// 创建一个欢迎邮件的具体建造者，自动发送一个欢迎邮件到指定地址
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("toAddress@126.com", "fromAddress@126.com");
	}
}
