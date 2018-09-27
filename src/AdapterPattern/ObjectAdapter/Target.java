package AdapterPattern.ObjectAdapter;

/*
 * 目标接口
 * 
 */
public interface Target {
	/**
	 * 这是源类Adaptee也有的方法
	 */
	public void sampleOperation1();

	/**
	 * 这是源类Adapteee没有的方法
	 */
	public void sampleOperation2();
}
