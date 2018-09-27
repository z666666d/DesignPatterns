package PrototypePattern.simple;

/**
 * 具体原型角色1
 * 被复制的对象。此角色需要实现抽象的原型角色所要求的接口。
 * 
 * @author Administrator
 *
 */
public class ConcretePrototype1 implements Prototype {
	@Override
	public Prototype clone() {
		// 最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
		Prototype prototype = new ConcretePrototype1();
		return prototype;
	}
}
