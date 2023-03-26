package com.linkedList01;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleJoinCloneLL {

	public static void main(String[] args) {
		
		LinkedList<Integer> nums = new LinkedList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		LinkedList<Integer> nums2 = new LinkedList<>();
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
//		1.	WAP to shuffle the elements in a linked list.
		System.out.println("1.	WAP to shuffle the elements in a linked list.");
		System.out.println("Before shuffle = "+nums);
		Collections.shuffle(nums);
		System.out.println("After shuffle = "+nums);
		System.out.println("\n-------------------------------------------");
//		2.	WAP to join two linked lists.
		System.out.println("2.	WAP to join two linked lists.");
		System.out.println("Before join nums = "+nums);
		System.out.println("Before join nums2 = "+nums2);
		LinkedList<Integer> merge = new LinkedList<>();
		merge.addAll(nums);
		merge.addAll(nums2);
		System.out.println("Merged nums = "+merge);
		System.out.println("\n-------------------------------------------");
		
//		3.	WAP to clone a linked list to another linked list.
		System.out.println("3.	WAP to clone a linked list to another linked list.");
		LinkedList cloneNum = new LinkedList();
		System.out.println("Before cloning = "+cloneNum);
		cloneNum = (LinkedList) nums.clone();
		System.out.println("After cloning = "+cloneNum);
		
	}

}
