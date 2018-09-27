package SingletonPattern;

/**
 * 双重检查加锁模式减小了同步范围，相比于将工厂方法作为同步方法，效率上有所提高
 * 
 * 注意：在java1.4及以前版本中，很多JVM对于volatile关键字的实现的问题，会导致“双重检查加锁”的失败
 * 因此“双重检查加锁”机制只只能用在java5及以上的版本
 * 
 * @author Administrator
 *
 */
public class Singleton_1 {

	// 双重检查加锁的关键在于使用volatile关键字
	// 被volatile关键字修饰的变量值，将不会被本地线程缓存，任何对该变量的读写操作都是直接操作共享内存
	// 也就是说，线程对该变量的任何操作对于其他线程都是可见的，这样确保了多个线程能够正确的处理该变量
	private static volatile Singleton_1 instance = null;

	// 私有的构造器
	private Singleton_1() {

	}

	public static Singleton_1 getInstance() {
		// 1.检查实例是否存在，不存在才进入同步代码块。
		// 这样就只有在创建实例的时候才会执行同步代码块，大大的降低了同步对性能的影响
		if (instance == null) {

			// 2.通过同步代码块，线程安全的创建实例
			synchronized (Singleton_1.class) {

				// 3.进入同步代码块后，再次实例是否存在，不存在才真正的去创建实例
				if (instance == null) {
					instance = new Singleton_1();
				}
			}
		}

		return instance;
	}

	// 注意：虽然通过双重检查加锁可以线程安全的去延迟创建实例，且不对性能造成太大的影响。
	// 但是由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高
	// 因此一般建议，没有特别的需要，不要使用。也就是说不建议大量采用该模式来实现单例，应该根据具体情况选择

}
