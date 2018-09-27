package DecoratorPattern.JavaIO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 这是Java I/O的一个简单应用
 * 可以看出最里层是一个FileInputStream对象，然后把它传递给一个BufferedInputStream对象
 * 经过BufferedInputStream处理，再把处理后的对象传递给了DataInputStream对象进行处理
 * 这个过程其实就是装饰器的组装过程，FileInputStream对象相当于原始的被装饰的对象
 * 而BufferedInputStream对象和DataInputStream对象则相当于装饰器
 */
public class IOTest {
	public static void main(String[] args) throws IOException {
		// 流式读取文件
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			// 读取文件内容
			byte[] bs = new byte[dis.available()];
			dis.read(bs);
			String content = new String(bs);
			System.out.println(content);
		} finally {
			dis.close();
		}
	}

}
