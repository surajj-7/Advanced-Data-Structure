package com.product;

public class LinkedList {
	private Node head;

	public LinkedList() {
		head=null;
	}

	public Node getHead() {
		return head;
	}
	public boolean insert(Product product) 
	{
		Node newNode=new Node(product);
		if(newNode==null) {
			return false;
		}
		
		if(head==null) {
			head=(Node)newNode;
			return true;
		}
		
		Node temp=head;
//		if(head.==data)
//			return false;
		
		while(temp.getNext()!=null) {
			temp=temp.getNext();
			if(temp.getProduct()==product) {
				return false;
			}
		}
		
		temp.setNext(newNode);
		return true;
		
	}
	
	public void display() {
		Node temp=head;
		
		while(temp !=null) {
//			System.out.print("Pid:"+temp.getPid()+" ");
//			System.out.print("Pname:"+temp.getPname()+" ");
//			System.out.print("Pqty"+temp.getQty()+" ");
//			System.out.print("Price:"+temp.getPrice()+" ");
			System.out.println("Product:"+temp.getProduct());
			System.out.println("->");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	
	
}
