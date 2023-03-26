package com.testPaper8_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a program to create a set of 3 ice cream objects. Assign value to each variable by using getter setters. All fields in ice cream class are private. Accept values from user. 
 * Class Ice cream is as follows { int price , string scoopsize, Arraylist flavours } 
 * Values can be price – 80 , scoopsize – big/small , flavours – vanilla , mango, 
 * butterscotch.
 */

class IceCream{
	private int price;
	private String scoopSize;//big/small
	private ArrayList<String> Flavours;
	public IceCream() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IceCream(int price, String scoopSize, ArrayList<String> flavours) {
		super();
		this.price = price;
		this.scoopSize = scoopSize;
		this.Flavours = flavours;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getScoopSize() {
		return scoopSize;
	}
	public void setScoopSize(String scoopSize) {
		this.scoopSize = scoopSize;
	}
	public ArrayList<String> getFlavours() {
		return Flavours;
	}
	public void setFlavours(ArrayList<String> flavours) {
		Flavours = flavours;
	}
	@Override
	public String toString() {
		return "IceCream [price=" + price + ", scoopSize=" + scoopSize + ", Flavours=" + Flavours + "]";
	}
	
	
	
}
public class IceCreamTester {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	       ArrayList<IceCream> iceCreamSet = new ArrayList<>();

	        for (int i = 0; i < 3; i++) {
	            IceCream iceCream = new IceCream();
	            System.out.println("Enter price for ice cream " + (i+1) + ": ");
	            iceCream.setPrice(scanner.nextInt());
	            scanner.nextLine();
	            System.out.println("Enter scoop size for ice cream " + (i+1) + " (big/small): ");
	            iceCream.setScoopSize(scanner.nextLine());
	            System.out.println("Enter flavours for ice cream " + (i+1) + " (separated by commas): ");
	            String[] flavours = scanner.nextLine().split(",");
	            iceCream.setFlavours(new ArrayList<>(Arrays.asList(flavours)));
	            iceCreamSet.add(iceCream);
	        }

	        System.out.println("Ice cream set: " + iceCreamSet);
	}

}
