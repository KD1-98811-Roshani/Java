package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	
	Collections.addAll(list,"Orange","Greeen","White","Blue","Red","Indigo");
	for(String ele:list) {
		System.out.print(ele+" ");
	}
	Collections.sort(list);
	System.out.println();
	System.out.println("Sorted List");
	for(String ele:list) {
		System.out.print(ele+" ");
	}
}

}
