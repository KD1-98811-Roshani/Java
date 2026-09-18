package com.sunbeam;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date(9, 16, 2026);

		System.out.println("Month : " + date.getMonth());
		System.out.println("Day : " + date.getDay());
		System.out.println("Year : " + date.getYear());

		System.out.println("Date : ");
		date.displayDate();
	}
}
