package DecoratorPattern.Demo;

/*
 * 装饰器角色
 * 
 * 大圣的七十二变
 */
public class Change implements TheGreatestSage {

	private TheGreatestSage sage;

	public Change(TheGreatestSage sage) {
		this.sage = sage;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		// 代码
		sage.move();
	}

}
