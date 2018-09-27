package AbstractFactoryPattern;

/**
 * 具体工厂
 * 
 * @author Administrator
 *
 */
public class AmdFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu(938);
	}

	@Override
	public Mainboard createMainboard() {
		// TODO Auto-generated method stub
		return new AmdMainboard(938);
	}

}
