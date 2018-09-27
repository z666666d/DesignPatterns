package SimpleFactoryPattern;

/**
 * 测试方法
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		String loginType = "password";
		String loginName = "name";
		String password = "password";

		// 用接口代替具体实现类，实现了解耦
		Login login = LoginManager.loginFactory(loginType);
		// 验证登录
		boolean flag = login.verify(loginName, password);

		if (flag) {
			/*
			 * 登录成功业务逻辑
			 */
		} else {
			/*
			 * 登录失败业务逻辑
			 */
		}
	}
}
