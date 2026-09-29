package com.sunbeam;

import java.util.Scanner;

public class Ques_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		StringBuilder res = new StringBuilder(str);
		res.reverse();
		System.out.println("Reverse string : "+res);
	}

}
