package AbstractFactoryPattern;

/**
 * 抽象工厂，为一系列相互关联或相互依赖的对象的产生创建一个接口，抽象工厂定义了一个产品族
 * 切换产品族的时候只需要提供不同的抽象工厂实现即可，也就是说一个产品族必须作为一个整体切换
 * 
 * 适用抽象工厂模式的情况：
 * 1.一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节，这一条对于所有形式的工厂模式都适用
 * 2.系统中有多个产品族，而只需要消费某一族产品
 * 3.同属一产品族的产品需要在一起使用，这一约束必须在系统设计中体现出来
 * 4.系统提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于实现
 * 
 * 抽象工厂模式的优点：
 * 1.分离了接口和具体实现
 * 	客户端使用抽象工厂来创建需要的对象，客户端根本不知道具体的实现细节，只需要面向接口编程，使客户端从具体产品中解耦
 * 	所有工厂模式都具有与具体产品实现解耦的优点
 * 2.使切换产品族变得容易
 * 	一个具体工厂就对应一个产品族，切换产品族只需要切换对应的具体工厂，而不需要去修改每一个产品的创建代码
 * 
 * 缺点：
 * 不容易扩展新的产品，需要扩展新的产品就需要修改抽象工厂，这样就需要去修改所有的具体工厂
 * 
 * 抽象工厂模式和工厂方法模式的区别在于抽象工程模式对应的是多个产品等级而工厂方法模式面对的是一个产品等级
 * 
 * @author Administrator
 *
 */
public interface AbstractFactory {

	/**
	* 创建CPU对象
	* @return CPU对象
	*/
	public Cpu createCpu();

	/**
	 * 创建主板对象
	 * @return 主板对象
	 */
	public Mainboard createMainboard();
}
