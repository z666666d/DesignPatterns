package FactoryMethodPattern;

/**
 * 具体产品
 * 
 * @author Administrator
 *
 */
public class ExportFinancialPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		/**
		 * 业务逻辑
		 */
		System.out.println("导出财务版PDF文件");
		return true;
	}

}
