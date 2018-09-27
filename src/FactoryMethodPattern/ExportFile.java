package FactoryMethodPattern;

/**
 * 抽象产品：工厂方法模式四个角色之一，工厂方法所创建对象的超类。也就是说由工厂方法创建的对象拥有共同的接口或父类
 * 在实际使用中，抽象产品也常常可以是抽象类
 * 
 * @author Administrator
 *
 */
public interface ExportFile {

	// 该方法用以将数据导出成不同的格式
	public boolean export(String data);
}
