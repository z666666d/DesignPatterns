package DecoratorPattern.JavaIO;

import java.io.IOException;

/*
 *装饰器模式在java中的应用最著名的莫过于Java I/O标准库了
 *由于在IO库中需要大量的功能组合，如果都通过继承来实现的话，每一种组合就需要一个类。
 *如果采用装饰器模式的话，就能大大的减少所需类的数目，功能的重复也减至最少，装饰器模式是Java I/O库的基本模式
 *
 *以InputStream为例：
 *InputStream是抽象构件(Component)角色，为各个子类提供统一的接口
 *ByteArrayInputStream、FileInputStream、PipedInputStream、StringBufferInputStream等类是具体构件(ConcreteComponent)角色
 *FilterInputStream是抽象装饰(Decorator)角色，它实现了InputStream所规定的接口
 * BufferedInputStream、DataInputStream等是具体装饰(ConcreteDecorator)角色
 * 
 * InputStream类型中的装饰模式是半透明的，在InputStream源码中，定义了九个方法，其中八个给出了具体实现
 * 有一个抽象方法由子类实现
 */
public abstract class InputStream {
	public abstract int read() throws IOException;

	public int read(byte b[]) throws IOException {
		return 0;

	}

	public int read(byte b[], int off, int len) throws IOException {
		return len;
	}

	public long skip(long n) throws IOException {
		return n;
	}

	public int available() throws IOException {
		return 0;
	}

	public void close() throws IOException {
	}

	public synchronized void mark(int readlimit) {
	}

	public synchronized void reset() throws IOException {
	}

	public boolean markSupported() {
		return false;
	}

}
