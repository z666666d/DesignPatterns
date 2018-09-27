package SimpleFactoryPattern;

/**
 * 登录方式二：密码口令登录
 * 
 * @author Administrator
 *
 */
public class PasswordLogin implements Login {

	@Override
	public boolean verify(String loginName, String password) {
		// TODO Auto-generated method stub
		/*
		 * 业务逻辑
		 * 
		 */
		return true;
	}

}
