package SingletonPattern;

/**
 * 通过同步方法或双重检查加锁实现懒汉式单例都有一定的缺陷 
 * Lazy initialization holder class模式
 * 可以利用类级内部类以及多线程缺省同步锁的机制，实现延迟实例化和线程安全
 * 
 * 相关知识：
 * 1.类级内部类
 * 类级内部类是指由static关键字修饰的内部类，即静态内部类。不由static关键字修饰的内部类为对象级内部类
 * 类级内部类相当于外部类的静态成员，与外部类的对象之间不存在依赖关系，因此可以直接创建。
 * 类级内部类中，可以定义静态方法，在静态方法中只能引用外部类的静态成员
 * 类级内部类相当于外部类的成员，只有在第一次使用的时候才会被加载
 * 
 * 2.多线程缺省同步锁
 * 在多线程开发中，一般会使用synchronized关键字或Lock实现线程同步。
 * 但是在某些情况下，JVM已经隐式地执行了同步，这种情况下就不要需要在进行同步控制了
 * 不需要同步包括以下几种情况：
 * a.静态初始化器初始化数据时（包括静态成员变量初始化以及静态代码块中的初始化）
 * b.访问final字段时
 * c.在创建线程之前创建的对象
 * d.线程可以看见他将要处理的对象
 * 
 * 
 * @author Administrator
 *
 */
public class Singleton_2 {

	// 私有构造器
	private Singleton_2() {

	}

	// 静态内部类与外部类实例没有绑定关系，只有被调用到时，才会被加载
	private static class SingletonHolder {

		// 静态初始化器确保线程安全
		private static Singleton_2 instance = new Singleton_2();
	}

	// 静态工厂方法返回静态内部类中的外部类唯一实例
	public static Singleton_2 getInstance() {
		return SingletonHolder.instance;
	}

	/**
	 * 当静态工厂方法getInstance第一次被调用时，他第一次读取SingletonHolder.instance
	 * 使内部类SingletonHolder加载并执行初始化，这时会初始化他的静态域，从而产生Singleton_2实例
	 * 由于是静态域，因此只会在类加载的时候初始化一次，保证了单例，并且有虚拟机来保证其线程安全
	 * 这个模式的优势在于既实现了单例模式的延迟初始化，也没有造成性能损失
	 */
}
