package PrototypePattern.register;

/**
 * 具体原型角色1
 * 
 * @author Administrator
 *
 */
public class ConcretePrototype1 implements Prototype {

	private String name;

	/**
	 * 实现抽象原型接口的克隆方法，用于复制对象
	 * 
	 */
	@Override
	public Prototype clone() {
		// TODO Auto-generated method stub
		ConcretePrototype1 prototype = new ConcretePrototype1();
		prototype.setName(this.name);
		return prototype;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Now in Prototype1 , name = " + this.name;
	}

}
