package com.testPaper9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Q5. Create an arraylist :{‘a’,’b’,’a’,’c’,’a’,’b’}
Create a hashmap as: { (‘a’,3),(‘b’,2),(‘c’,1)}

 */
public class CountCharHashMap {

	public static void countLetters(ArrayList<String> letters) {
		
		HashMap<String,Integer> letterCount = new HashMap<>();
		
		for(String s:letters) {
			if(!letterCount.containsKey(s)) {
				letterCount.put(s, 1);
			}
			else {
				letterCount.put(s, letterCount.get(s)+1);
			}
		}
		for(Map.Entry<String, Integer> en : letterCount.entrySet()) {
			System.out.println(en.getKey()+" : "+en.getValue());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		System.out.println("Characters (with space) = ");
		str = sc.nextLine();
//		String letters[] = str.split(" ");
//		System.out.println(Arrays.toString(letters));
		ArrayList<String> letters2 = new ArrayList<>(Arrays.asList(str.split(" ")));
		System.out.println(letters2);
		
		countLetters(letters2);
		
	}

}
