package SingletonPattern;

/**
 * 单例设计模式：对象创建模式的一种，单例模式确保该类的实例只有一个，且自身实例化并通过工厂方法向整个系统提供该实例
 * 
 * 单例设计模式的特点： 1.只有一个实例; 2.唯一实例由自己创建;3.给其他对象提供该实例
 * 
 * 恶汉式单例：在类加载的时候就创建对象，饿汉式用空间换取时间，不管需不需要使用，先将实例创建出来
 * 
 * @author Administrator
 *
 * 
 */
public class EagerSingleton {
	// 定义一个私有域为该类的实例，并在类加载的时候完成实例化
	private static EagerSingleton instance = new EagerSingleton();

	// 私有化默认构造器，不允许其他类实例化该对象，若需要有参构造器，其访问权限也必须是私有的
	private EagerSingleton() {
	};

	// 提供一个静态工厂方法，将该类的唯一实例返回
	public static EagerSingleton getInstance() {
		return instance;
	}

}
