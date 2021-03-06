package PrototypePattern.simple;
/**
 * 
 * 原型模式：通过给出一个原型对象来指明所有创建的对象的类型，然后用复制这个原型对象的办法创建出更多同类型的对象
 * 
 * 原型模式要求对象实现一个可以“克隆”自身的接口，这样就可以通过复制一个实例对象本身来创建一个新的实例
 * 这样一来，通过原型实例创建新的对象，就不再需要关心这个实例本身的类型
 * 只要实现了克隆自身的方法，就可以通过这个方法来获取新的对象，而无须再去通过new来创建
 * 
 * 简单形式和登记形式比较：
 * 1.如果要创建的原型对象数目较少且比较固定的话，可以采取简单形式，在这种情况下原型对象可以由客户端自己保存
 * 2.如果要创建的原型对象数目不固定的话，可以采用登记形式。
 * 	在登记形式下，客户端不保存原型对象引用，这个任务被交给了原型管理器角色。
 * 	在复制一个原型对象之前，客户端可以查看管理员中是否已经有一个满足要求的原型对象
 * 
 */

/*
 * 原型模式优缺点：
 * 优点：
 * 		原型模式允许在运行时动态的改变具体的实现类型。原型模式可以在运行期间，由用户来注册符合原型接口的实现类型
 * 		也可以动态的改变具体的实现类型，看起来接口没有任何变化，但实际上已经运行的是另外一个实例了
 * 		因为克隆一个原型，就类似于实例化一个类
 * 
 * 缺点：
 * 		主要缺点就是每个类都需要一个克隆方法。而配备克隆方法需要对类的功能进行通盘考虑。
 * 		这一点对于一个全新的类来说不是很难，但是对于一个已有的类来说不一定容易
 * 		特别是当一个类引用了不支持序列化的间接对象，或者引用含有循环结构的时候
 * 
 */

/**
 * 原型模式表现形式之一：简单形式
 * 
 * 简单形式有三个角色：客户（Client）、抽象原型（Prototype）、具体原型（Concrete Prototype）
 * 
 */

/**
 * 简单形式原型模式角色之一：抽象原型(Prototype)角色
 * 抽象原型通常是一个接口或抽象类，用以给所有的具体原型类提供统一的接口
 * 
 * @author Administrator
 *
 */
public interface Prototype {

	/**
	* 克隆自身的方法
	* @return 一个从自身克隆出来的对象
	*/
	public Prototype clone();
}
