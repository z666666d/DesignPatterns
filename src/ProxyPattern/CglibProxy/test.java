package ProxyPattern.CglibProxy;

public class test {
	public static void main(String[] args) {
		CGLibProxy proxy = new CGLibProxy();
		Train t = (Train) proxy.getProxy(Train.class);
		t.move();
	}
}
