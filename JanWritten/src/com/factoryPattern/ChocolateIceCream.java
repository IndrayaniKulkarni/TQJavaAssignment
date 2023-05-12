package com.factoryPattern;

public class ChocolateIceCream implements IceCream{

	@Override
	public void prepare() {
		System.out.println("Preparing chocolate ice cream..");
	}

	@Override
	public void freeze() {
		System.out.println("Freezing chocolate ice cream..");
	}

	@Override
	public void serve() {
		System.out.println("Serving chocolate ice cream..");
	}
}
