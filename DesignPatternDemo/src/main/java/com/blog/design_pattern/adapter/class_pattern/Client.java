package com.blog.design_pattern.adapter.class_pattern;

public class Client {
	
	public static void main(String[] args) {
		Target target = new Adapter();
		int value = target.get22V();
		System.out.println("Client-使用的电源是：" + value + "V");
	}

}
