/*
 * 1) WAP to create a class Kid with method readBook() and another method readBook () 
 * with 2 parameters. 
 * The method readBook here is over-loaded (same method name but different
 * parameters) 
 * Create a class BigKid which extends Kid created above. 
 * Implement readBook() differently in BigKid class. 
 * Here the method readBook() has been over-ridden in the child class BigKid()
 */
package com.overriding;

class Kid{
	
	protected String reader;
	protected String title;
	
	Kid(){
		
	}
	Kid(String reader, String title) {
		this.reader = reader;
		this.title = title;
	}
	public String getReader() {
		return reader;
	}
	public void setReader(String reader) {
		this.reader = reader;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	void readBook() {
		
	}
	void readBook(String reader, String title) {
		System.out.println("Kid class..");
		System.out.println("book reader name= "+reader+", book title = "+title);
	}
	@Override
	public String toString() {
		return "Kid [" + reader + ", " + title + "]";
	}
	
	
}
class BigKid extends Kid{
	protected int days;//number of days kid is reading 
	
	BigKid(String reader, String title,int days) {
		super(reader,title);
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	void readBook(String reader, String title) {
		System.out.println("BigKid class..");
		System.out.println("book reader = "+reader+", book title = "+title+", days ="+days);
	}

	@Override
	public String toString() {
		return "BigKid ["+reader+", "+title+", " + days + "]";
	}
	
}
public class ImplementKid {

	public static void main(String[] args) {
		
		Kid k = new Kid("David","The tell-tale heart");
		k.readBook("David","The tell-tale heart");
		BigKid bk = new BigKid("David","The tell-tale heart",1);
		bk.readBook("David","The tell-tale heart");
	}

}
