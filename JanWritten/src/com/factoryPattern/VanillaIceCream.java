package com.factoryPattern;

public class VanillaIceCream implements IceCream{

	@Override
	public void prepare() {
		System.out.println("Preparing vanilla ice cream..");
	}

	@Override
	public void freeze() {
		System.out.println("Freezing vanilla ice cream..");
	}

	@Override
	public void serve() {
		System.out.println("Serving vanilla ice cream..");
	}
}
