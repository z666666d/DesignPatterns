package DecoratorPattern;

/*
 * 具体装饰(ConcreteDecorator)角色
 */
public class ConcreteDecoratorB extends Decorator {
	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void sampleOperation() {
		super.sampleOperation();
		// 写相关的业务代码
	}
}
