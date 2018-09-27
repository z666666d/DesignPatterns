package DecoratorPattern.Demo;

/*
 * 具体装饰器角色
 * 大圣通过七十二变变成鱼
 */
public class Fish extends Change {

	public Fish(TheGreatestSage sage) {
		super(sage);
	}

	@Override
	public void move() {
		// 代码
		System.out.println("Fish Move");
	}
}
