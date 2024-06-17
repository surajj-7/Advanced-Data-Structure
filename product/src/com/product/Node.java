package com.product;

public class Node {
	private Product product; 
	private Node next;
	
	public Node(Product product) {
		super();
		this.product=product;
		this.next=null;
	}

	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	
	
	
	
	
}
