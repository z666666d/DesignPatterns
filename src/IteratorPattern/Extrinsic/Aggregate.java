package IteratorPattern.Extrinsic;

/*
 * 聚集(Aggregate)角色：此抽象角色给出创建迭代子(Iterator)对象的接口。
 * 这个角色规定出所有的具体聚集必须实现的接口。
 * 迭代子模式要求聚集对象必须有一个工厂方法，也就是createIterator()方法，以向外界提供迭代子对象的实例。
 */
public abstract class Aggregate {
	/**
	 * 工厂方法，创建相应迭代子对象的接口
	 */
	public abstract Iterator createIterator();
}
