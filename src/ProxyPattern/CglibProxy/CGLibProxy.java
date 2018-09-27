package ProxyPattern.CglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/*
 * cglib实现动态代理
 * 因为Java只允许单继承，而JDK生成的代理类本身就继承了Proxy类
 * 因此，使用JDK实现的动态代理不能完成继承式的动态代理，但是我们可以使用cglib来实现继承式的动态代理。
 * 大名鼎鼎的Spring中就含有cglib动态代理，在此也以Spring中自带的cglib完成动态代理的实现
 * 
 * 注意：cglib实现动态代理需要依赖cglib.jar、asm.jar两个jar包
 * 
 */
public class CGLibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();

	public Object getProxy(Class<?> clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	/** 
	 * 拦截所有目标类方法的调用 
	 * 参数： 
	 * obj目标实例对象 
	 *method 目标方法的反射对象 
	 * args方法的参数 
	 * proxy代理类的实例 
	 */
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// 代理类调用父类的方法
		System.out.println("日志开始");
		proxy.invokeSuper(obj, args);
		System.out.println("日志结束");
		return null;
	}
}
