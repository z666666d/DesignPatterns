package AbstractFactoryPattern;

/**
 * 具体产品
 * 
 * @author Administrator
 *
 */
public class IntelCpu implements Cpu {

	/**
	 * cpu的针脚数
	 */
	private int pins = 0;

	public IntelCpu(int pins) {
		this.pins = pins;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Intel CPU的针脚数：" + pins);
	}

}
