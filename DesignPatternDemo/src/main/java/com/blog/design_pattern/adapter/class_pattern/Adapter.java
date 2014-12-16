package com.blog.design_pattern.adapter.class_pattern;

public class Adapter extends Adaptee implements Target {

	@Override
	public int get22V() {
		int resource = get220V();
		System.out.println("Adapter-将220V转化为22V");
		int target = resource / 10;
		System.out.println("Adapter-得到22V电源");
		return target;
	}

}
