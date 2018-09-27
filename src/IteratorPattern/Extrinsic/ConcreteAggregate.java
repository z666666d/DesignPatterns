package IteratorPattern.Extrinsic;

/*
 * 具体聚集(ConcreteAggregate)角色：实现了创建迭代子(Iterator)对象的接口，返回一个合适的具体迭代子实例。
 * 此外，还有方法getElement()向外界提供聚集元素，而方法size()向外界提供聚集的大小等。
 * 
 * 由于聚集自己实现迭代逻辑，并向外部提供适当的接口，使得迭代子可以从外部控制聚集元素的迭代过程。
 * 这样一来迭代子所控制的仅仅是一个游标而已，这种迭代子叫做游标迭代子（Cursor Iterator）。
 * 由于迭代子是在聚集结构之外的，因此这样的迭代子又叫做外禀迭代子（Extrinsic Iterator）。
 * 
 * 白箱聚集与外禀迭代子
 * 一个白箱聚集向外界提供访问自己内部元素的接口（称作遍历方法或者Traversing Method）
 * 从而使外禀迭代子可以通过聚集的遍历方法实现迭代功能。
 * 
 * 因为迭代的逻辑是由聚集对象本身提供的，所以这样的外禀迭代子角色往往仅仅保持迭代的游标位置。
 */
public class ConcreteAggregate extends Aggregate {
	private Object[] objArray = null;

	/**
	 * 构造方法，传入聚合对象的具体内容
	 */
	public ConcreteAggregate(Object[] objArray) {
		this.objArray = objArray;
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	/**
	 * 取值方法：向外界提供聚集元素
	 */
	public Object getElement(int index) {

		if (index < objArray.length) {
			return objArray[index];
		} else {
			return null;
		}
	}

	/**
	 * 取值方法：向外界提供聚集的大小
	 */
	public int size() {
		return objArray.length;
	}
}
