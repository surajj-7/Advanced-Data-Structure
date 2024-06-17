package com.product;

public class Product {
	private static int count=0;
	private int pid;
	private String pname;
	private int qty;
	private double price;
	

	public Product(String pname, int qty, double price) {
		super();
		this.pid=++count;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
	}
	
	

}
