package com.core;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		
		list.insert(8);
		list.insert(1);
		list.insert(2);
		list.insert(5);
		list.insert(7);
		list.insert(4);
		
//		boolean isInserted=list.insert(50);
//		System.out.println(isInserted);
//		list.insert(50);
		
		list.display();
		list.displayReverse();
		list.findMaxElement();
		list.findMinElement();
		list.findSumOfEven();

	}

}
