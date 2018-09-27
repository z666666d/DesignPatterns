package CompositePattern.SafeComposite;

/*
 * 树叶构件角色(Leaf):树叶对象是没有下级子对象的对象，定义出参加组合的原始对象的行为。
 * 
 */
public class Leaf implements Component {

	/**
	 * 叶子对象的名字
	 */
	private String name;

	/**
	* 构造方法，传入叶子对象的名称
	* @param name 叶子对象的名字
	*/
	public Leaf(String name) {
		this.name = name;
	}

	/**
	 * 输出叶子对象的结构，叶子对象没有子对象，也就是输出叶子对象的名字
	 * @param preStr 前缀，主要是按照层级拼接的空格，实现向后缩进
	 */
	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr + "-" + name);
	}

}
