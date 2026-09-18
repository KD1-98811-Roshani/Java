package com.sunbeam;


public class Invoice {

	private String p_num;
	private String p_desc;
	private int p_quantity;
	private double price;

	public Invoice() {

	}

	public Invoice(String p_num, String p_desc, int p_quantity, double price) {
		this.p_num = p_num;
		this.p_desc = p_desc;

		if(p_quantity > 0)
			this.p_quantity = p_quantity;
		else
			this.p_quantity = 0;

		if(price > 0)
			this.price = price;
		else
			this.price = 0.0;
	}

	public String getP_num() {
		return p_num;
	}

	public void setP_num(String p_num) {
		this.p_num = p_num;
	}

	public String getP_desc() {
		return p_desc;
	}

	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}

	public int getP_quantity() {
		return p_quantity;
	}

	public void setP_quantity(int p_quantity) {
		if(p_quantity > 0)
			this.p_quantity = p_quantity;
		else
			this.p_quantity = 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0)
			this.price = price;
		else
			this.price = 0.0;
	}
	
	public double getInvoiceAmount() {
		return p_quantity * price;
	}
	
	
}

