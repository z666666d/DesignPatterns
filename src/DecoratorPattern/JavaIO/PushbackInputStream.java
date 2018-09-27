package DecoratorPattern.JavaIO;

import java.io.IOException;

/*
 * PushbackInputStream为具体装饰器，这个装饰类提供了额外的方法unread()
 * 这就意味着PushbackInputStream是一个半透明的装饰类，它破坏了理想的装饰模式的要求
 * 
 * 现实世界与理论总归是有一段差距的。纯粹的装饰模式在真实的系统中很难找到。一般所遇到的，都是这种半透明的装饰模式。
 */
public class PushbackInputStream extends FilterInputStream {
	private void ensureOpen() throws IOException {
	}

	public PushbackInputStream(InputStream in, int size) {
		super(in);
	}

	public PushbackInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException {
		return 0;
	}

	public int read(byte[] b, int off, int len) throws IOException {
		return len;
	}

	public void unread(int b) throws IOException {
	}

	public void unread(byte[] b, int off, int len) throws IOException {
	}

	public void unread(byte[] b) throws IOException {
	}

	public int available() throws IOException {
		return 0;
	}

	public long skip(long n) throws IOException {
		return n;
	}

	public boolean markSupported() {
		return false;
	}

	public synchronized void mark(int readlimit) {
	}

	public synchronized void reset() throws IOException {
	}

	public synchronized void close() throws IOException {
	}
}
