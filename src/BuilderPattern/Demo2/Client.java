package BuilderPattern.Demo2;

/**
 * 对于复杂对象的创建，有可能有很多不同的选择和步骤，所以可以干脆去掉“导演者”
 * 由client来充当导演者的角色，由客户端直接知道构建器去构建对象
 * 
 * 在产品对象构建过程中，有多个参数需要传入，且一部分为必要参数，一部分为可选参数时
 * 采用多个重载构造器的方式，会导致大量的重复代码，采用javaBean的方式会导致对象构造过程不可控且缺少必要的参数检验
 * 这样可以选择本例的方式，采用建造者模式的简化方式
 * 
 * 1.产品类的构造器私有且接收一个构建器对象
 * 2.一个内部类构建器，构建器的构造器接收构建产品对象的必要参数
 * 3.在构建器中为每一个可选参数创建一个setter方法，通过setter方法传入可选参数
 * 4.构建器中的build方法首先进行参数校验，然后调用产品类构造器，将构建器对象传入创建产品对象
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {

		// 创建构建器对象，传入构建合同的必须参数
		InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);

		// 通过构建器的setter方法传入可选参数，然后构建保险合同对象
		InsuranceContract contract = builder.setPersonName("小明").setOtherData("test").build();

		// 使用合同对象进行相应的操作
		contract.someOperation();
	}
}
