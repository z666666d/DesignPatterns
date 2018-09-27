package AdapterPattern.ClassAdapter;
/*
 * 适配器模式把一个类的接口变换成客户端所期待的另一种接口，
 * 从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 * 
 * 适配器模式有类的适配器模式和对象的适配器模式两种不同的形式。
 * 类适配器模式:类的适配器模式把适配的类的API转换成为目标类的API。
 * 
 */

/*
 * 适配器(Adaper)角色：类适配器模式的核心，适配器把源接口转换成目标接口。
 * 显然，这一角色不可以是接口，而必须是具体类。Adapter与Adaptee是继承关系
 * 
 */
public class Adapter extends Adaptee implements Target {

	/**
	 * 由于源类Adaptee没有方法sampleOperation2()
	 * 因此适配器补充上这个方法
	 */
	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		// 相关代码
	}

}
