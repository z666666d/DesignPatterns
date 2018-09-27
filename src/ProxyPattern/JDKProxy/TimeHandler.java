package ProxyPattern.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * 动态代理
 * 对于代理模式而言，一个主题类应该与一个代理类对应，这也是静态代理的特点
 * 但是实际情况中，也会有N个主题类，但代理类的“前处理，后处理”都一样，仅仅只是调用的主题不同。
 * 也就是说多个主题类对应一个代理类，共享代理类的“前处理，后处理”功能。
 * 动态调用所需主题，大大减小程序的规模，这就是动态代理的特点。
 */

/*
 * JDK动态代理的实现步骤
 * 1. 创建一个实现InvocationHandler接口的类，它必须实现invoke()方法
 * 2. 创建被代理的类及接口
 * 3. 调用Proxy的静态方法newProxyInstance，创建一个代理类
 * 4. 通过代理调用方法
 */

/*
 * JDK动态代理
 * 事务处理器
 */
public class TimeHandler implements InvocationHandler {

	private Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	/** 
	* 参数： 
	*proxy 被代理的对象 
	*method 被代理对象的方法 
	*args 方法的参数 
	* 返回： 
	*Object 方法返回值 
	*/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶…");
		method.invoke(target, args);
		long stopTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶…汽车行驶时间：" + (stopTime - startTime) + "毫秒！");
		return null;
	}

}
