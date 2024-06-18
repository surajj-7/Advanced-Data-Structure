package com.core;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list=new CircularLinkedList();
		
		list.display();
		
		list.insert(10);
        list.display();
        list.insert(20);
        list.display();
        list.insert(30);
        list.display();
        list.insert(40);
        list.display();
        list.insert(50);
        list.display();
        
        list.insert(60, 1);
        list.display();
        list.insert(70, 4);
        list.display();
        list.insert(80, 8);
        list.display();
        list.insert(90, 12);
        list.display();

        list.deleteByPosition(1);
        list.display();
        list.deleteByPosition(4);
        list.display();
        list.deleteByPosition(6);
        list.display();
        list.deleteByPosition(6);
        list.display();
	}

}
