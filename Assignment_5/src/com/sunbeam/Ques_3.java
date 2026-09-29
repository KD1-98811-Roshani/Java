package com.sunbeam;

import java.util.Scanner;

public class Ques_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a String to find length :  ");
		String str = sc.nextLine();
		
		str  = str.trim();
		String [] words = str.split(" ");
		
		System.out.println(" Length is : "+words.length);
	}

}
