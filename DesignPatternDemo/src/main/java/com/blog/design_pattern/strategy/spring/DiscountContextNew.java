package com.blog.design_pattern.strategy.spring;

import java.util.HashMap;
import java.util.Map;

import com.blog.design_pattern.strategy.DiscountStrategy;

public class DiscountContextNew {

    private DiscountStrategy discountStrategy;
    // 将打折策略注入到Map中。
    Map<String, DiscountStrategy> strategyMap = new HashMap<String, DiscountStrategy>();
	
	/**
	 * 获取打折后的最终价格，
	 * 该方法可以对计算结果进行格式化，比如加上单位、精确小数位等，是客户端更方便使用。
	 * 
	 * @param price
	 * @return
	 * @throws Exception 
	 */
	public String computePrice(String type, double price) throws Exception {
		// 获取策略
		discountStrategy = strategyMap.get(type);
		if (discountStrategy == null) {
			throw new Exception("没有相对应的策略。");
		}
		
		double discountPrice = discountStrategy.getDiscountPrice(price);
		StringBuilder resultBuilder = new StringBuilder("￥")
		        .append(discountPrice).append("元");
		return resultBuilder.toString();
	}

	public Map<String, DiscountStrategy> getStrategyMap() {
		return strategyMap;
	}

	public void setStrategyMap(Map<String, DiscountStrategy> strategyMap) {
		this.strategyMap = strategyMap;
	}
	
}
