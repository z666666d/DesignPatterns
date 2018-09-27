package SimpleFactoryPattern;

/**
 * 登录方式一：域认证
 * 
 * @author Administrator
 *
 */
public class DomainLogin implements Login {

	@Override
	public boolean verify(String loginName, String password) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 业务逻辑
		 * 
		 */
		return true;
	}

}
