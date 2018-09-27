package SingletonPattern;

/**
 * 单元素的枚举是实现Singleton的最佳方法
 * 
 * @author Administrator
 *
 */
public enum Singleton_3 {

	// 定义一个枚举元素，他就代表了Singleton_3的一个实例
	Singleton("name");

	// 单例可以有自己的成员变量
	private String name;

	private Singleton_3(String name) {
		this.name = name;
	}

	// 单例可以由自己的操作
	public String getName() {
		return name;
	}

	/**
	 * 使用枚举来实现单例模式控制会更加简洁，且无偿的提供了序列化机制
	 * 并由JVM根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实例实现方式
	 */

}
