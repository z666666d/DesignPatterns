package AdapterPattern.DefaultAdapter.Demo1;
/*
 * 缺省适配模式：为一个接口提供缺省实现，子类可以从这个缺省实现扩展而不必从原接口扩展
 * 缺省适配模式是作为适配器模式的一个特例，在Java中起着特殊的作用 
 */

/*
 * 这里的天星就是一个适配器
 * 这个适配器实现了和尚接口所要求的所有方法，与普通的适配器模式不同的是，这里给出的都是一些“平庸化”的实现
 * 
 * 在很多情况下，一个具体类实现某个接口，但是这个类用不到这个接口规定的所有方法
 * 通常的做法是，那些有用的方法要有具体实现，那些没用的方法也要有空的或平庸的实现
 * 这些空的方法是一种浪费，有时也是一种混乱。缺省适配模式很好的处理了这种情况
 * 可以设计一个抽象的适配器类实现目标接口，此抽象类给接口中所有方法都提供一个空的实现，这样子类就不用去被迫实现空方法
 * 
 */
public class 天星 implements 和尚 {

	@Override
	public void 吃斋() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 念经() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 打坐() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 撞钟() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 习武() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
