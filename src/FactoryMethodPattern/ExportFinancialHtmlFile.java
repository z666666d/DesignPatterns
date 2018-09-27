package FactoryMethodPattern;

/**
 * 具体产品：工厂方法模式四个角色之一  所有具体产品都实现了抽象产品接口
 * 由工厂方法创建的都是某个具体产品的实例
 * 
 * @author Administrator
 *
 */
public class ExportFinancialHtmlFile implements ExportFile {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		/**
		 * 业务逻辑
		 */
		System.out.println("导出财务版HTML文件");
		return true;
	}

}
