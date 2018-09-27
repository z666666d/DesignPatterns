package CompositePattern.SafeComposite;
/*
 * 组合模式：又叫做“部分-整体”模式。合成模式是将对象组织到树状结构中，可以用来描述整体和部分的关系
 * 组合模式可以使客户端将单纯元素和有单纯元素复合而成的复合元素同等看待。
 * 
 * 例如，文件系统就是一个典型的组合模式系统，在文件系统中目录和文件一个是合成元素，一个是组合元素
 * 但是在很多情况下，我们可以将目录和文件当成同等对象去处理，这也就是组合模式的应用。
 * 
 * 组合模式可以不提供父对象的管理方法，但是必须在合适的地方提供子对象的管理方法，如：：add()、remove()、以及getChild()等
 * 组合模式的实现根据所实现接口的区别分为两种形式，分别称为安全式和透明式
 */

/*
 * 安全式组合模式要求管理聚集的方法只出现在树枝构件中，而不能出现在树叶构件中
 * 一般包含三种角色：抽象构件角色、树叶构件角色、树枝构件角色
 * 
 * 树枝构件类(Composite)给出了addChild()、removeChild()以及getChild()等方法的声明和实现
 * 而树叶构件类则没有给出这些方法的声明或实现，这样的做法是安全的做法。
 * 由于这个特点，客户端应用程序不可能错误地调用树叶构件的聚集方法，因为树叶构件没有这些方法，调用会导致编译错误。
 * 安全式合成模式的缺点是不够透明，因为树叶类和树枝类将具有不同的接口。
 */

/*
 *  抽象构件(Component)角色：作为一个抽象角色，给出了所有组合元素的公共接口和默认行为，可以用来管理所有子对象
 *  组合对象通常把它包含的所有子对象当作Component对象
 *  在安全式组合模式中，抽象构件角色并不定义管理子对象的方法，这一定义由树枝构件对象给出
 */

public interface Component {

	/**
	* 在抽象构件角色中定义一些所有元素都具有的方法
	* 输出组建自身的名称
	*/
	public void printStruct(String preStr);
}
