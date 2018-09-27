package AbstractFactoryPattern;

/**
 * 具体工厂，每一个具体工厂对应一个产品族类
 * 同一产品族类中不同产品间具有某种联系，如本例中cpu引脚与主板cpu插槽需要对应
 * 
 * @author Administrator
 *
 */
public class IntelFactory implements AbstractFactory {
	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(755);
	}

	@Override
	public Mainboard createMainboard() {
		// TODO Auto-generated method stub
		return new IntelMainboard(755);
	}
}
