package ProxyPattern.StaticProxy;

//真实主题类
public class Admin implements Manager {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("Admin do something.");
	}

}
