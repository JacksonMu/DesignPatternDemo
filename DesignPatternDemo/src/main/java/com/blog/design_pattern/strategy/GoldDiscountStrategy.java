package com.blog.design_pattern.strategy;

/**
 * 金卡会员打八折
 * 
 * @author admin
 *
 */
public class GoldDiscountStrategy implements DiscountStrategy {

	@Override
	public double getDiscountPrice(double price) {
		
		return price * 0.8;
	}

}
