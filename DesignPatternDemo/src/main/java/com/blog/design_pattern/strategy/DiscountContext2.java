package com.blog.design_pattern.strategy;

public class DiscountContext2 {

    private DiscountStrategy discountStrategy;
	
	public DiscountContext2(String type) throws Exception {
		if (type.equals("普通")) {
			discountStrategy = new CommonDiscountStrategy();
		} else if (type.equals("银卡")) {
			discountStrategy = new SilverDiscountStrategy();
		} else if (type.equals("金卡")) {
			discountStrategy = new GoldDiscountStrategy();
		} else {
			throw new Exception("会员类型不对");
		}
	}
	
	/**
	 * 获取打折后的最终价格，
	 * 该方法可以对计算结果进行格式化，比如加上单位、精确小数位等，是客户端更方便使用。
	 * 
	 * @param price
	 * @return
	 */
	public String computePrice(double price) {
		double discountPrice = discountStrategy.getDiscountPrice(price);
		StringBuilder resultBuilder = new StringBuilder("￥")
		        .append(discountPrice).append("元");
		return resultBuilder.toString();
	}
}
