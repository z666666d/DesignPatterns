package FacadePattern;

/*
 * 外观角色Facade  外观模式的核心，客户端调用这个角色的方法访问各个子系统
 * 该角色知晓相关的（一个或者多个）子系统的功能和责任。
 * 正常情况下，本角色会将所有从客户端发来的请求委派到相应的子系统去。
 * 
 * 有了外观类，客户端就不用去调用子系统的A、B、C模块了,也不需要知道系统内部的实现细节
 * 甚至不需要知道A、B、C模块的存在，客户端只需要跟Facade类交互就好了
 * 从而更好地实现了客户端和子系统中A、B、C模块的解耦，让客户端更容易地使用系统。
 */
public class Facade {
	// 示意方法，满足客户端需要的功能
	public void test() {
		ModuleA a = new ModuleA();
		a.testA();
		ModuleB b = new ModuleB();
		b.testB();
		ModuleC c = new ModuleC();
		c.testC();
	}
}
