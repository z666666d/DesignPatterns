package FlyweightPattern.SimpleFlyweightPattern;

/*
 * 这里从享元工厂申请了三次享元对象，实际上只创建了两个享元对象
 */
public class Client {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();

		Flyweight fly = factory.factory(new Character('a'));
		fly.operation("First Call");

		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");

		fly = factory.factory(new Character('a'));
		fly.operation("Third Call");

	}
}
