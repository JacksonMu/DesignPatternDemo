package com.blog.design_pattern.strategy;

public class Client2 {

	public static void main(String[] args) {
		String type = "金卡";
		DiscountContext2 context = null;
		try {
			context = new DiscountContext2(type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double originalPrice = 100.00;
		String discountPrice = context.computePrice(originalPrice);
		System.out.println("原价为" + originalPrice + 
				", 作为" + type + "会员，购物花费为：" + discountPrice);
	}
}
