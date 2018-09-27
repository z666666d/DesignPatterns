package DecoratorPattern.JavaIO;

import java.io.IOException;

/*
 * FilterInputStream是抽象装饰角色
 * FilterInputStream的接口与InputStream的接口是完全一致的
 * 
 */
public class FilterInputStream extends InputStream {

	protected FilterInputStream(InputStream in) {
	}

	public int read() throws IOException {
		return 0;
	}

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
