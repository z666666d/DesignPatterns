package AdapterPattern.ClassAdapter;

/**
 * 目标角色（Target）：所期待得到的接口。注意：由于这里讨论的是类适配器模式，所以目标不可以是类
 * 
 * @author Administrator
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
