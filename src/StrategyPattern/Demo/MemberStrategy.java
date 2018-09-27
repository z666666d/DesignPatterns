package StrategyPattern.Demo;
/*
 * 场景描述：
 * 假设一个贩卖书籍的商务网站
 * 有一个需求：对高级会员提供每本20%的促销折扣；对中级会员提供每本10%的促销折扣；对初级会员没有折扣。
 */

/*
 * 抽象策略角色
 */
public interface MemberStrategy {
	/**
	* 计算图书的价格
	* @param booksPrice    图书的原价
	* @return    计算出打折后的价格
	*/
	public double calcPrice(double booksPrice);
}
