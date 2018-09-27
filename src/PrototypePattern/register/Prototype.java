package PrototypePattern.register;
/**
 * 原型模式之二：登记形式
 * 与简单形式相比，该形式多了一个原型管理器（PrototypeManager）角色
 * 
 */

/**
 * 抽象原型角色
 * 
 * @author Administrator
 *
 */
public interface Prototype {
	public Prototype clone();

	public String getName();

	public void setName(String name);
}
