package FactoryMethodPattern;

/**
 * 客户端代码
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {

		String data = "1111111";
		ExportFactory exportFactory = new ExportHtmlFactory();

		ExportFile exportFile = exportFactory.factory("financial");
		exportFile.export(data);
	}
}
