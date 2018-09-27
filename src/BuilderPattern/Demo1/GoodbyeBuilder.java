package BuilderPattern.Demo1;

/**
 * 欢送邮件的具体建造者
 * 
 * @author Administrator
 *
 */
public class GoodbyeBuilder extends Builder {

	public GoodbyeBuilder() {
		msg = new GoodbyeMessage();
	}

	@Override
	public void buildSubject() {
		// TODO Auto-generated method stub
		msg.setSubject("欢送标题");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		msg.setBody("欢送内容");
	}

}
