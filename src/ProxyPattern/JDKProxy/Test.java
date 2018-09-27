package ProxyPattern.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/** 
		 *	loader 类加载器 
		 *	interfaces 实现接口 
		 *	h InvocationHandler 事务处理器
		 *	获取Car的代理类，静态代理的代理类是提前编写好的，动态代理的代理类在程序中动态生成
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();
	}
}
