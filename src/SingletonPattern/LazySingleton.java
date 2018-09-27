package SingletonPattern;

/**
 * 懒汉式单例：懒汉式单例与饿汉式的区别在于，懒汉式是需要使用实例的时候再去创建实例，而不是类加载的时候就创建实例
 * 
 * 懒汉式单例用时间换取空间，类加载的时候并不创建实例，而是在第一次使用的时候去创建
 * 
 * 
 * @author Administrator
 *
 */
public class LazySingleton {

	// 定义一个私有静态域，但并没有创建对象
	private static LazySingleton instance = null;

	// 与饿汉式一样，所有的构造器必须私有
	private LazySingleton() {

	}

	// 提供一个公有静态方法，返回其唯一实例
	// 由于线程安全问题，该工厂方法需要同步
	public static synchronized LazySingleton getInstance() {

		// 每次调用，先检查是否已经存在该对象的实例，如果创建了直接返回，如果没有则先创建对象，再将其返回
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	// 由于线程安全的原因，工厂方法被设计为同步方法，降低了方法的效率，可以考虑用双重检查加锁代替同步方法
}