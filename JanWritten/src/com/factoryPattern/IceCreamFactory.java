package com.factoryPattern;

public class IceCreamFactory {

	public IceCream createIceCream(String type) {
		if(type.equalsIgnoreCase("vanilla")) {
			return new VanillaIceCream();
		}
		else if(type.equalsIgnoreCase("chocolate")) {
			return new ChocolateIceCream();
		}
		else {
			return null;
		}
	}
}
