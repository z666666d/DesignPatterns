package SimpleFactoryPattern;

/**
 * 不使用工厂方法的情况下，代码很混乱且与具体实现之间耦合度高
 * 
 * @author Administrator
 *
 */
public class ErrorTest {
	public static void main(String[] args) {
		String loginType = "password";// 登录类型
		String name = "name";// 登录名
		String password = "password";// 登录口令

		if (loginType.equals("password")) {// 处理密码登录
			PasswordLogin passwordLogin = new PasswordLogin();
			boolean flag = passwordLogin.verify(name, password);

			if (flag) {
				/*
				 * 登录成功业务逻辑
				 */
			} else {
				/*
				 * 登录失败业务逻辑
				 */
			}

		} else if (loginType.equals("domain")) {// 处理域认证登录
			DomainLogin domainLogin = new DomainLogin();
			boolean flag = domainLogin.verify(name, password);

			if (flag) {
				/*
				 * 登录成功业务逻辑
				 */
			} else {
				/*
				 * 登录失败业务逻辑
				 */
			}
		} else {
			/*
			 * 没有对应的登录方式，登录失败业务逻辑
			 */
		}
	}
}
