package BuilderPattern;

/**
 * 导演者--调用具体建造者以创建产品对象
 * 导演者并不知道产品的具体知识，只有具体建造者知道
 * 
 * 导演者是与客户端打交道的角色，导演者将客户端创建产品的请求划分为对各个零件建造的请求
 * 再将这些请求委派给具体建造者，实际建造对象的是具体建造者，而客户端并不知道
 * 
 * @author Administrator
 *
 */
public class Director {
	/**
	 * 持有当前需要使用的建造器对象
	 */
	private Builder builder;

	/**
	 * 构造方法，传入建造器对象
	 * @param builder 建造器对象
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * 产品构造方法，负责调用各个零件建造方法
	 */
	public void construct() {
		builder.buildPart1();
		builder.buildPart2();
	}
}
