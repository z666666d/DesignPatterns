package BuilderPattern;

/**
 * 产品类--需要建造的复杂对象，由多个内部表象（零件）组成
 * 建造过程中可能会对应一些复杂的逻辑，例如：某些属性必须按照某个顺序赋值才有意义等等
 * 
 * 一般来说，一个系统中可能会有多个产品类，而这些产品类之间没有共同的接口，甚至毫无关联
 * 
 * 内部表象：
 * 一个产品常有不同的组成成分作为产品的零件，这些零件有可能是对象，也有可能不是对象，它们通常又叫做产品的内部表象
 * 不同的产品可以有不同的内部表象，也就是不同的零件。
 * 使用建造模式可以使客户端不需要知道所生成的产品有哪些零件，
 * 每个产品的对应零件彼此有何不同，是怎么建造出来的，以及怎么组成产品。
 * 
 * @author Administrator
 *
 */
public class Product {
	/**
	 * 定义一些关于产品的操作
	 */
	private String part1;
	private String part2;

	public String getPart1() {
		return part1;
	}

	public void setPart1(String part1) {
		this.part1 = part1;
	}

	public String getPart2() {
		return part2;
	}

	public void setPart2(String part2) {
		this.part2 = part2;
	}
}
