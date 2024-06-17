package com.product;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		Product p1=new Product("Chips",20,250);
		Product p2=new Product("Sprite",17,520);
		
		list.insert(p1);
		list.insert(p2);
		//list.insert(2);
		
		
//		boolean isInserted=list.insert(50);
//		System.out.println(isInserted);
//		list.insert(50);
		
		list.display();
		

	}

}
