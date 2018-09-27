package DecoratorPattern.Demo;

/*
 * 具体装饰器
 * 大圣通过七十二变变成鸟
 */
public class Bird extends Change {
	public Bird(TheGreatestSage sage) {
		super(sage);
	}

	@Override
	public void move() {
		// 代码
		System.out.println("Bird Move");
	}
}
