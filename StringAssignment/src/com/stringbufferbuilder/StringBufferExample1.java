package com.stringbufferbuilder;

public class StringBufferExample1 {

	public static void main(String[] args) {
	
		StringBuffer sb1 = new StringBuffer("This is new example.");
		
		// append 
		sb1.append("1");
		System.out.println("StringBuffer sb1 after append 1 = "+sb1);
		
		// insert
		sb1.insert(12, "an ");
		System.out.println("StringBuffer sb1 after inser \"an\" = "+sb1);
		
		// reverse
		sb1.reverse();
		System.out.println("StringBuffer in place reverse = "+sb1);
		sb1.reverse();
		// replace
		sb1.replace(2, 4, "e");
		System.out.println("StringBuffer after replace of \"is\" with \"e\" =" +sb1);
		
		// delete
		sb1.delete(0,11);
		System.out.println("After delete = "+sb1);
		
		// capacity
		StringBuffer sb2 = new StringBuffer("");
		System.out.println("StringBuffer capacity sb2 (empty) = "+sb2.capacity());
		
		sb2.append("cat");
		System.out.println("StringBuffer capacity after appending 3 letters = "+sb2.capacity());
	
		sb2.append(" is from kingdom cat");
		System.out.println("StringBuffer capacity after appending 10+ letters = "+sb2.capacity());
	//capacity became current*2 +2 
		
		
		// ensureCapacity 
		StringBuilder sb3 = new StringBuilder("");
		System.out.println("sb3 capacity = "+sb3.capacity());
		sb3.ensureCapacity(30);
		System.out.println("sb3 ensure capacity 30 = "+sb3.capacity());

		
	}

}
