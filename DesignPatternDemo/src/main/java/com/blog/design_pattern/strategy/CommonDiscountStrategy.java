package com.blog.design_pattern.strategy;

/**
 * 普通会员策略，不打折。
 * 
 * @author admin
 *
 */
public class CommonDiscountStrategy implements DiscountStrategy {

	@Override
	public double getDiscountPrice(double price) {
		
		return price;
	}

}
