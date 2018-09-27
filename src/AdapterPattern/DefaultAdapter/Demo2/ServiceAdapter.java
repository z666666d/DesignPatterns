package AdapterPattern.DefaultAdapter.Demo2;

/*
 * 缺省适配器：为接口的所有方法提供一个平庸的实现
 * 任何继承ServiceAdapter的类都只需要重写它所需要的方法，而不必理会不需要的方法
 * 
 * 适配器模式的用意是要改变源接口以适应目标接口，而缺省适配模式为了方便建立一个具体实现而提供的一个平庸实现
 * 
 * 在不准备实现一个接口中所有方法时，就可以使用缺省适配模式制造一个抽象类，给所有方法提供一个平庸的实现
 * 从这个抽象类在继承下去的子类就不必再去实现所有方法了
 */
public abstract class ServiceAdapter implements AbstractService {

	@Override
	public void serviceOperation1() {
		// TODO Auto-generated method stub

	}

	@Override
	public int serviceOperation2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String serviceOperation3() {
		// TODO Auto-generated method stub
		return null;
	}

}
