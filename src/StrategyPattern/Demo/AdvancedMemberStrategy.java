package StrategyPattern.Demo;

/*
 * 具体策略角色C：高级会员折扣类
 */
public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于高级会员的折扣为20%");
		return booksPrice * 0.8;
	}

}
