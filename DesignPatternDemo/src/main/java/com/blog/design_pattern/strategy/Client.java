package com.blog.design_pattern.strategy;

public class Client {
	
	public static void main(String[] args) {
		DiscountStrategy strategy = new GoldDiscountStrategy();
		DiscountContext context = new DiscountContext(strategy);
		double originalPrice = 100.00;
		String discountPrice = context.computePrice(originalPrice);
		System.out.println("原价为" + originalPrice + 
				", 作为金卡会员，购物花费为：" + discountPrice);
	}

}
