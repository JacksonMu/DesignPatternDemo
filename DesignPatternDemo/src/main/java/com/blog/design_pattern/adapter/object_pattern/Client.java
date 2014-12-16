package com.blog.design_pattern.adapter.object_pattern;

public class Client {
	
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		int value = target.get22V();
		System.out.println("Client-使用的电源是：" + value + "V");
	}

}
