package com.sunbeam;

public class InvoiceTest {
	public static void main(String[] args) {

		Invoice invoice = new Invoice(
			"P101",
			"Keyboard",
			2,
			500
		);

		System.out.println("Part Number : " + invoice.getP_num());
		System.out.println("Part Description : " + invoice.getP_desc());
		System.out.println("Quantity : " + invoice.getP_quantity());
		System.out.println("Price : " + invoice.getPrice());
		System.out.println("Invoice Amount : " + invoice.getInvoiceAmount());

	}
}