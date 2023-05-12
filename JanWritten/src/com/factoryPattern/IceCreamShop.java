package com.factoryPattern;

import java.util.Scanner;

public class IceCreamShop {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      System.out.println("ICE CREAM SHOP");
      System.out.println("Which flavour (Vanilla / Chocolate) = ");
      String flavour = sc.next();
      IceCreamFactory order = new IceCreamFactory();
      IceCream plate = order.createIceCream(flavour);
      plate.prepare();
      plate.freeze();
      plate.serve();
      sc.close();
      
	}

}
