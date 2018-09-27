package ProxyPattern.StaticProxy;

/*
 * 继承式静态代理
 */
public class ExtendsAdminPoly extends Admin {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub

		System.out.println("Log:admin操作开始");
		super.doSomething();
		System.out.println("Log:admin操作结束");
	}

}
