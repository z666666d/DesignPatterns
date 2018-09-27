package BuilderPattern;

/**
 * 具体建造者--负责具体的建造任务
 * 1.实现抽象建造者接口，给出一步一步完成建造产品实例的操作
 * 2.在建造完成后提供产品实例
 * 
 * 
 * 一般来说，一个产品类就相应的对应一个具体建造者，这些产品应该具有一样数目的零件，或者说一样数目的建造步骤
 * 
 * @author Administrator
 *
 */
public class ConcreteBuilder implements Builder {

	private Product product = new Product();

	/**
	 * 产品零件建造方法1
	 */
	@Override
	public void buildPart1() {
		// 构建产品的第一个零件
		product.setPart1("编号：9527");
	}

	/**
	 * 产品零件建造方法2
	 */
	@Override
	public void buildPart2() {
		// 构建产品的第二个零件
		product.setPart2("名称：XXX");
	}

	/**
	 * 产品返还方法
	 */
	@Override
	public Product retrieveResult() {
		return product;
	}
}
