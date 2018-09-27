package ProxyPattern.StaticProxy;

/*
 * 聚合式静态代理
 * 
 * 聚合式中代理类持有一个被代理类实例，且代理类和被代理类都实现了同一接口，可实现灵活多变，继承式则不够灵活
 * 
 * 例如，一个系统要增加权限处理、日志记录、操作后数据变化三个功能。
 * 三个功能有多种可能的组合，用继承式就要写多个代理类，而聚合式只需要写三个代理类，在业务逻辑中根据需要选择代理类即可
 */
public class CompositeAdminPoly implements Manager {

	private Admin admin;

	public CompositeAdminPoly(Admin admin) {
		super();
		this.admin = admin;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("Log:admin操作开始");
		admin.doSomething();
		System.out.println("Log:admin操作结束");
	}

}
