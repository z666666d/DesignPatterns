package FlyweightPattern.CompositeFlyweightPattern;

/*
 * 抽象享元(Flyweight)角色
 * 给出一个抽象接口，以规定出所有具体享元角色需要实现的方法。
 */
public interface Flyweight {
	// 一个示意性方法，参数state是外蕴状态
	public void operation(String state);
}
