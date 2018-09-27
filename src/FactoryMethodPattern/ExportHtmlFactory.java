package FactoryMethodPattern;

/**
 * 具体工厂:工厂方法模式的四个角色之一，是实现了抽象工厂的实现类
 * 在具体工厂中，包含了与业务密切相关的逻辑代码，并且有使用者调用创建导出类
 * 
 * @author Administrator
 *
 */
public class ExportHtmlFactory implements ExportFactory {

	@Override
	public ExportFile factory(String type) {

		// 根据不同的类型创建不同的对象返回以得到不同模式的导出文件
		if (type.equals("standard")) {
			return new ExportStandardHtmlFile();
		} else if (type.equals("financial")) {
			return new ExportFinancialHtmlFile();
		} else {
			throw new RuntimeException("没有改导出模式");
		}
	}

}
