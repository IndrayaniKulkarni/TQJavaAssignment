/*
 * 1.	Show one example of boxing and unboxing for all 8 primitive data types
 */
package com.boxingUnboxing;

public class PrimitiveDT {

	public static void main(String[] args) {
		
	    // Byte
		System.out.println("BYTE");
		byte b1= 123;
		Byte b11 = b1;//boxing
		System.out.println("Byte value = "+b1+" Byte obj ="+b11.byteValue());
		Byte b22= 45;
		byte b2 = b22;
		System.out.println("Byte value = "+b2+" Byte obj ="+b22.byteValue());
	
		//Short
		System.out.println("SHORT");
		short s1 = 1000;
		Short s11 = s1;
		System.out.println("Short value = "+s1+" Short obj ="+s11.byteValue());
		Short s22 = 1232;
		short s2 = s22;
		System.out.println("Short value = "+s22+" Short obj ="+s22.byteValue());
		
		//Integer 
		System.out.println("INTEGER");
		int num = 10;
//		The constructor Integer(int) has been deprecated since version 9 and marked for removal
//		Integer num1 = new Integer(10); //boxing
		Integer num1 = num; //autoboxing
//		System.out.println("Num = "+num+" Integer Num1 = "+num1.toString());
		System.out.println("Num = "+num+" Integer Num1 = "+num1.intValue());
//		num1.intValue() // unboxing - return int value from obj
		
		Integer num2 = 1200;
		int num22 = num2; //autounboxing
		
		//Long
		System.out.println("LONG");
		long l1 = 1213124235;
		Long l11 = l1;
		System.out.println("Long value = "+l1+" Long obj = "+l11.longValue());
		Long l22 = 232523342L;
		long l2 = l22;
		System.out.println("Long value = "+l2+" Long obj = "+l22.longValue());
		
		//Float
		System.out.println("FLOAT");
		float f1 = 10.34f;
		Float f11 = f1 ; //autoboxing
		System.out.println("float value = "+f1+" Float obj ="+f11.floatValue());
		Float f22 = 23.27f;
		float f2 = f22;
		System.out.println("float value = "+f2+" Float obj ="+f22.floatValue());
		
		//Double 
		System.out.println("DOUBLE");
		double d1 = 10212.34;
		Double d11 = d1 ; //autoboxing
		System.out.println("double value = "+d1+" Double obj ="+d11.doubleValue());
		Double d22 = 34223.27;
		double d2 = d22;
		System.out.println("double value = "+d2+" Double obj ="+d22.doubleValue());
		
		//bool
		System.out.println("Boolean");
		boolean bool1 = true;
		Object bool11 = bool1 ; //autoboxing
		System.out.println("Boolean value = "+bool1+" Boolean obj ="+bool11.toString());
		Object bool22 = false;
//		boolean bool2 = bool22.getBoolean();//Type mismatch: cannot convert from Object to boolean
//		System.out.println("Boolean value = "+bool2+" Boolean obj ="+bool22.getBoolean());
		
		//Char
		System.out.println("Character");
		char ch1 = 'a';
		Object ch11 = ch1;
		System.out.println("Character value = "+ch11+" Character obj"+ch11.toString());
		Object ch22 = 'w';
//		char ch2 = ch22;
//		System.out.println("Character value = "+ch2+" Character obj"+ch22.toString());
		
	}

}
