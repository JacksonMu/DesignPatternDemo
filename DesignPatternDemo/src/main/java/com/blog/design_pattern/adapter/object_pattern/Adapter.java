package com.blog.design_pattern.adapter.object_pattern;

public class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	@Override
	public int get22V() {
		int resource = adaptee.get220V();
		System.out.println("Adapter-将220V转化为22V");
		int target = resource / 10;
		System.out.println("Adapter-得到22V电源");
		return target;
	}

}
