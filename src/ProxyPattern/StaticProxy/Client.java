package ProxyPattern.StaticProxy;

//客户端类
public class Client {
	public static void main(String[] args) {

		// 聚合式静态代理
		Admin admin = new Admin();
		Manager m = new CompositeAdminPoly(admin);
		m.doSomething();

		// 继承式静态代理
		ExtendsAdminPoly extendsAdminPoly = new ExtendsAdminPoly();
		extendsAdminPoly.doSomething();
	}
}
