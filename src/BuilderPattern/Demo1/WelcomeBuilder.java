package BuilderPattern.Demo1;

/**
 * 欢迎邮件的具体建造者
 * 
 * @author Administrator
 *
 */
public class WelcomeBuilder extends Builder {

	public WelcomeBuilder() {
		msg = new WelcomeMessage();
	}

	@Override
	public void buildSubject() {
		// TODO Auto-generated method stub
		msg.setSubject("欢迎标题");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		msg.setBody("欢迎内容");
	}

}
