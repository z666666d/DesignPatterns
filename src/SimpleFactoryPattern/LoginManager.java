package SimpleFactoryPattern;

/**
 * 工厂类，根据不同的登录需求，创建出不同的登录对象并返回。碰到不合法的请求，抛出一个异常
 * 
 * 简单工厂模式的优点：
 * 该模式的核心为工厂类。在这个类中含有必要的逻辑判断，在本例中，由工厂类来决定什么时候创建什么方式登录验证类实例
 * 调用者不需要对创建对象负责。在后续引入新的方式后，不需要调用者作任何修改
 * 
 * 缺点：
 * 工厂类集中了所有的创建逻辑，所有登录验证相关的业务逻辑都由该类控制。若该类不能正常工作，整个系统都将受到影响
 * 
 * @author Administrator
 *
 */
public class LoginManager {

	// 调用工厂方法，获得不同登录方式对应的登录对象
	public static Login loginFactory(String loginType) {
		if (loginType.equals("password")) {
			return new PasswordLogin();
		} else if (loginType.equals("domain")) {
			return new DomainLogin();
		} else {
			throw new RuntimeException("没有找到该登录类型");
		}
	}
}
