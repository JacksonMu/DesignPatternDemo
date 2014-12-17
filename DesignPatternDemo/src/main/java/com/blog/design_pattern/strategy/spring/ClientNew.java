package com.blog.design_pattern.strategy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientNew {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String type = "金卡";
		double originalPrice = 100.00;
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DiscountContextNew discountContextNew = ac.getBean(DiscountContextNew.class);
		
		String discountPrice = null;
		try {
			discountPrice = discountContextNew.computePrice(type, originalPrice);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("原价为" + originalPrice + 
				", 作为" + type + "会员，购物花费为：" + discountPrice);
	}
}
