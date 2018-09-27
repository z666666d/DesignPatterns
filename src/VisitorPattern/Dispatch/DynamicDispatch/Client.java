package VisitorPattern.Dispatch.DynamicDispatch;

/*
 * 动态分派
 * 这里h变量的实际类型是BlackHorse
 * Java编译器在编译时期并不总是知道哪些代码会被执行，因为编译器仅仅知道对象的静态类型，而不知道对象的真实类型
 * 而方法的调用则是根据对象的真实类型，而不是静态类型。
 * 所以这里调用的是BlackHorse的eat方法
 */
public class Client {
	public static void main(String[] args) {
		Horse h = new BlackHorse();
		h.eat();
	}
}
