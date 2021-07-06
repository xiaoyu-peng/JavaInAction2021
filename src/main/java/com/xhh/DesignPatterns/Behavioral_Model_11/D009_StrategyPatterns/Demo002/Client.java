package com.xhh.DesignPatterns.Behavioral_Model_11.D009_StrategyPatterns.Demo002;

/**
 * MovieTicket充当环境类角色，Discount充当抽象策略角色，StudentDiscount、 ChildrenDiscount 和VIPDiscount充当具体策略角色。
 */
class Client {
	public static void main(String args[]) {
		MovieTicket mt = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;
		
		mt.setPrice(originalPrice);
		System.out.println("原始价为：" + originalPrice);
		System.out.println("---------------------------------");
			
		Discount discount = new ChildrenDiscount();
		//注入折扣对象
		mt.setDiscount(discount);
		
		currentPrice = mt.getPrice();
		System.out.println("折后价为：" + currentPrice);
	}
}