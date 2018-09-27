package PrototypePattern.javaClone;
/*
 * java的克隆方法：
 * java的所有类都继承自java.lang.Object类，而Object类中提供了一个protected Object clone()方法对对象进行复制
 * 子类也可以重写这个方法，提供满足自身需求的复制方法
 * 
 * 复制对象有一个基本的问题，就是对象中通常都持有其他对象的引用。当使用Object的clone()方法复制对象时，对象持有的引用也会被复制一份
 * 
 * java中提供的Cloneable接口只有一个作用，就是在运行时期通知java虚拟机可以安全地在这个类上使用clone()方法
 * 由于Object类没有实现Cloneable接口，因此如果要使用clone()方法的类没有实现Cloneable接口
 * 调用clone()方法时会抛出CloneNotSupportedException异常
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/* 
 * 克隆满足的条件：
 * clone()方法是将对象复制一份并返还给调用者。所谓“复制”的含义要看clone()方法的具体实现，一般而言，要满足以下条件：
 * 1.对于任何对象x，都有x.clone()!=x。也就是说，克隆对象与原对象不是同一对象
 * 2.x.clone().getClass() == x.getClass()。也就是说，克隆对象与原对象的类型一样
 * 3.如果对象的equals()方法定义得当，那么应该有x.equals(x.clone())
 * 
 * 在java的API中，凡是提供了clone()方法的类，都满足上诉条件。在设计自己的clone()方法时也应当遵守上诉三个条件
 * 一般而言，上诉三个条件中，前两个条件是必须的，而第三个是可选的
 */

/*
 * 浅克隆与深克隆：
 * 无论是自己实现clone方法还是使用java的clone方法，都会存在一个浅克隆和深克隆问题
 * 浅克隆：只负责克隆按值传递的数据（比如基本数据类型、String），而不复制它所引用的对象
 * 			换言之，所有对其他对象的引用都仍然指向原来的对象
 * 深克隆:除了浅克隆要克隆的值以外，深克隆还要负责克隆引用类型的数据，所有引用将指向被复制的新对象。
 * 			换言之，深克隆要把复制对象所引用的所有对象都复制一遍，这种对被引用到的对象的复制叫作间接复制
 * 
 * 深克隆要深入到多少层，是一个不易确定的问题。在决定以深克隆方式复制对象时，必须决定间接复制对象时采用浅克隆还是继续采取深克隆
 * 因此，在采取深克隆时，要考虑要克隆多深。此外，在深克隆的过程中，很可能会出现循环引用的情况，必须要小心处理
 */

/*
 * 利用序列化实现深度克隆：
 * 被序列化的对象实际上是对象的一个拷贝，原对象仍然存在于JVM中，所以能够通过序列化来实现对象的深度克隆
 * 
 * 在Java中，深度克隆一个对象，可以使对象实现Serializable接口，然后将对象序列化（写到一个流里），再反序列化（从流里读出来）重建对象
 * 
 * 这样做有一个前提：被复制对象以及对象内部所引用到的所有对象都是可序列化的
 * 					否则，就需要仔细考察那些不可序列化的对象可否设成transient，从而将之排除在复制过程之外。
 */

/*
 * 浅度克隆显然比深度克隆更容易实现，因为在Java中所有类都会继承一个clone()方法，而这个方法实现的正是浅度克隆
 * 
 * 在克隆过程中，要注意如Thread对象、socket对象，是不能简单复制或共享的，不管是浅克隆还是深克隆
 * 只要涉及到这些对象，必须把这些间接对象设置成transient不予复制，或创建出同类对象，权且当做复制件使用
 */

public class Clone {

	public static Serializable deepClone(Serializable Object) throws IOException, ClassNotFoundException {
		// 将对象写到流里
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(Object);

		// 从流里读回来
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (Serializable) ois.readObject();
	}

	public static void main(String[] args) {
		Date date = new Date();
		try {
			Date date2 = (Date) deepClone(date);
			System.out.println(date == date2);
			System.out.println(date);
			System.out.println(date2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
