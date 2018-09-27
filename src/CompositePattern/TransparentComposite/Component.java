package CompositePattern.TransparentComposite;

import java.util.List;

/*
 * 透明式组合模式要求所有的具体构件类，不论是树枝构件还是树叶构件，均符合一个固定接口
 * 
 * 这样客户端就无需在区分是树枝对象还是树叶对象，对于客户端而言操作的都是Component对象
 */

/*
 * 安全式和透明式的选择：
 * 安全是指客户端使用是否安全，会不会发生误操作，能访问的方法是不是都被支持
 * 透明是指客户端使用时是否要区分“树枝”和“树叶”，客户端只需要面对Component对象，具体类型客户端无需关心
 * 
 * 对于组合模式而言，会更看重透明性，因为组合模式的目的就是让客户端不在区分操作树枝和树叶对象，而是统一处理。
 * 对于安全式而言，还是要区分树枝和树叶对象，因此在使用组合模式时，建议更多的采用透明式的实现方式。
 */
public abstract class Component {

	/**
	 * 输出组建自身的名称
	 */
	public abstract void printStruct(String preStr);

	/**
	 * 聚集管理方法，增加一个子构件对象
	 * @param child 子构件对象
	 */
	public void addChild(Component child) {
		/**
		 * 缺省实现，抛出异常，因为叶子对象没有此功能
		 * 或者子组件没有实现这个功能
		 */
		throw new UnsupportedOperationException("对象不支持此功能");
	}

	/**
	 * 聚集管理方法，删除一个子构件对象
	 * @param index 子构件对象的下标
	 */
	public void removeChild(int index) {
		/**
		 * 缺省实现，抛出异常，因为叶子对象没有此功能
		 * 或者子组件没有实现这个功能
		 */
		throw new UnsupportedOperationException("对象不支持此功能");
	}

	/**
	 * 聚集管理方法，返回所有子构件对象
	 */
	public List<Component> getChild() {
		/**
		 * 缺省实现，抛出异常，因为叶子对象没有此功能
		 * 或者子组件没有实现这个功能
		 */
		throw new UnsupportedOperationException("对象不支持此功能");
	}
}
