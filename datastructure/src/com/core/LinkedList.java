package com.core;

import java.util.Stack;

public class LinkedList {
	private Node head;

	public LinkedList() {
		super();
		this.head=null;
	}

	public Node getHead() {
		return head;
	}

	public boolean insert(int data) 
	{
		Node newnode=new Node(data);
		if(newnode==null) {
			return false;
		}
		
		if(head==null) {
			head=newnode;
			return true;
		}
		
		Node temp=head;
		if(head.getData()==data)
			return false;
		
		while(temp.getNext()!=null) {
			temp=temp.getNext();
			if(temp.getData()==data) {
				return false;
			}
		}
		
		temp.setNext(newnode);
		return true;
		
	}
	public boolean insert(int data,int position) {
		if(position<=0 ||(position >1 && head==null)){
			return false;
		}
		
		Node newnode=new Node(data);
		if(newnode==null) {
			return false;
		}
		
		if(position==1) {
			newnode.setNext(head);
			head=newnode;
			return true;
		}
		//locate prev node
		Node prev=head;
		
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev==null)
				return false;
		}
		
		newnode.setNext(prev.getNext());
		prev.setNext(newnode);
		
		return true;
	}
	
	public void displayReverse() {
		Stack<Node>stack=new Stack<Node>();
		Node temp=head;
		
		while(temp!=null) {
			stack.push(temp);
			temp=temp.getNext();
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().getData());
		}
		System.out.println();
	}
	
	public void displayReverse(Node temp) {
		if(temp==null) {
			System.out.println();
			return;
			
		}
		displayReverse(temp.getNext());
		System.out.println(temp.getData()+"");
	}
	
	public void findMaxElement() {
		Node temp=head;
		int max=temp.getData();		
		temp=temp.getNext();
		while(temp!=null) {
			if(temp.getData()>max) {
				max=temp.getData();				
			}			
			temp=temp.getNext();
		}
		System.out.println("Max:"+max);
	}
	
	public void findMinElement() {
		Node temp=head;
		int min=temp.getData();
		while(temp!=null) {
			if(temp.getData()<min) {
				min=temp.getData();
			}
			temp=temp.getNext();
		}
		System.out.println("Min:"+min);
	}
	public void findSumOfEven() {
		Node temp=head;
		int sum=0;
		while(temp!=null) {
			if(temp.getData()%2==0) {
				sum+=temp.getData();
			}
			temp=temp.getNext();
		}
		System.out.println("Sum:"+sum);
	}
	
	public void display() {
		Node temp=head;
		
		while(temp !=null) {
			System.out.println(temp.getData()+"");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	
}
