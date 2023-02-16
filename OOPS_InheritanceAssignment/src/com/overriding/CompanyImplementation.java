/*
 * 2) WAP to create class company with method address. 
 * create class eBay which extends company implement 
 * address() differently in eBay class.Here the method address ()
 * has been overridden in child class.
 */
package com.overriding;
class Company{
	void address() {
		System.out.println("\n 742 Evergreen terrace springfield.");
	}
}
class Ebay extends Company{
	void address() {
		System.out.println("\n 23WS4 Little Kilton.");
	}
}
public class CompanyImplementation {

	public static void main(String[] args) {
		
		Company c = new Company();
		c.address();
		Ebay e = new Ebay();
		e.address();
	}

}
