package com.blog.design_pattern.strategy;

/**
 * 银卡会员打九折
 * 
 * @author admin
 *
 */
public class SilverDiscountStrategy implements DiscountStrategy {

	@Override
	public double getDiscountPrice(double price) {
		
		return price * 0.9;
	}

}
