package BuilderPattern;

/**
 *  建造者模式分成两个重要部分：
 * 1.Builder接口，在这里定义了如何构建各个部件，也就是知道每个部件功能如何实现，以及如何将这些部件装配到产品中去
 * 2.Director，Director是知道如何来组合这些构建，也就是说Director负责整体的构建算法，通常是分步骤来执行的
 * 
 * 不管怎么变化，建造者模式都存在这两个部分，一部分是部件构造和产品装配，一部分是整体的构建算法
 * 在建造者模式中，强调的是固定整体的构建算法，而灵活地扩展和切换部件的具体构造和产品的装配方式
 * 建造者模式的重心在于分离构建算法和具体构造实现，从而使构建算法可以重用
 * 具体的构造实现可以方便的扩展和切换，从而可以灵活地构造出不同的产品对象
 * 
 * 什么情况下使用建造者模式：
 * 1.需要生成的产品对象有复杂的内部结构，每一个内部成分本身可以是一个对象，也可以是一个对象的一个组成部分
 * 
 * 2.需要生产的产品对象的属性间相互依赖。建造者模式可以强制实行一种分步骤进行的建造过程
 * 	因此，如果产品对象的一个属性必须在另一个属性被赋值后才可以被赋值，使用建造者模式会是一种很好的设计思想
 * 
 * 3.在对象的创建过程中会使用系统中的其他一些对象，这些对象在产品对象的创建过程中不易得到
 * 
 * 建造者模式可以将一个产品的内部表象和产品的生产过程分割开来，从而可以使用同一个建造过程创建具有不同内部表象的产品对象
 */

/**
 * 抽象建造者--给出一个抽象接口，用以规范产品对象各组成成分的建造
 * 抽象建造者只给出规范，而直接创建产品对象有具体建造者来完成
 * 
 * 在抽象建造者中定义两类方法：
 * 1.建造方法：用于建造产品的各个零件
 * 2.返还结构方法：返回一个产品实例
 * 
 * 一般而言，产品所包含的零件数目与建造方法的数目相对应，也就是说，产品有多少零件，就有多少个建造方法
 * 
 * 
 * @author Administrator
 *
 */
public interface Builder {

	public void buildPart1();

	public void buildPart2();

	public Product retrieveResult();
}