package IteratorPattern.Intrinsic;

/*
 * 客户端类
 */
public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		client.operation();
	}

	public void operation() {
		Object[] objArray = { "One", "Two", "Three", "Four", "Five", "Six" };

		// 创建聚合对象
		Aggregate agg = new ConcreteAggregate(objArray);

		// 获取迭代器
		Iterator it = agg.createIterator();

		// 操作迭代器进行迭代
		while (!it.isDone()) {
			System.out.println(it.currentItem());
			it.next();
		}
	}
}
