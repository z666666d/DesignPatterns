package SimpleFactoryPattern;

/**
 * 定义一个登录接口，通过实现该接口添加不同的登录方式
 * 
 * @author Administrator
 *
 */
public interface Login {
	public boolean verify(String loginName, String password);
}
