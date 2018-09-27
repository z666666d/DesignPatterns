package FacadePattern;

/*
 * 子系统角色：系统中可以由一个或多个子系统
 * 每个子系统都不是一个单独的类，而是一个类的集合（如本例的子系统就是由ModuleA、ModuleB、ModuleC三个类组合而成）。
 * 每个子系统都可以被客户端直接调用，或者被外观角色调用。
 * 子系统并不知道外观角色的存在，对于子系统而言，外观仅仅是另外一个客户端而已。
 */
public class ModuleA {
	// 示意方法
	public void testA() {
		System.out.println("调用ModuleA中的testA方法");
	}
}
