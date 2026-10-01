package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.domain.Student;
import com.util.SortByRollno;
import com.util.SortByName;
import com.util.SortbyMarks;


public class Program {
	
	public static Scanner sc = new Scanner(System.in);
	public static List<Student> list = new ArrayList<>();
	
	public static void addStudent() {
		
		Student s = new Student();
		
		System.out.println("Enter a rollno : ");
		int rollno = sc.nextInt();
		s.setRollno(rollno);
		
		
		System.out.println("Enter a name : ");
		String name = sc.next();
		s.setName(name);
		
		System.out.println("Enter a marks : ");
		double marks = sc.nextDouble();
		s.setMarks(marks);
		
		list.add(s);
		
		System.out.println("Student added successfully");
	}
	
	public static void accpetRecord(int[] rollno) {
		System.out.println("Enter a rollno : ");
		rollno[0] = sc.nextInt();
	}
	
	public static void displayAll() {
		Iterator<Student> itr = list.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s);
		}
		
	}
	
	public static Student findStudent(int rollno) {
		Student key = new Student();
		key.setRollno(rollno);
		int idx = list.indexOf(key);
		if(idx != -1) {
			return list.get(idx);
		}
		return null;
	}
	
	public static void printEmployee(Student s) {
		if(s != null) {
			System.out.println(s.toString());
		}
		else
			System.out.println("Employee not found");
	}
	
    public static int menuList() {
    	System.out.println("0.Exit");
    	System.out.println("1.AddStudent");
    	System.out.println("2.Display Students");
    	System.out.println("3.Find Student");
    	System.out.println("4.SortByRollno");
    	System.out.println("5.SortByName");
    	System.out.println("6.SortByMarks");
    	System.out.println("Enter a choice : ");
    	return sc.nextInt();
    }
	

	public static void main(String[] args) {
		int[] rollno = new int[1];
		
		Comparator<Student> comparator = null;
		
		int choice;
		
		while((choice = menuList())!=0) {
			try {
				switch(choice) {
				
				case 1:
					Program.addStudent();
					break;
					
				case 2:
					Program.displayAll();
					break;
					
				case 3:
					Program.accpetRecord(rollno);
					Student s = Program.findStudent(rollno[0]);
					Program.printEmployee(s);
					break;
					
				case 4:
					comparator = new SortByRollno();
					//list.sort((x,y) -> Integer.compare(x.getRollno(), y.getRollno()));
					break;
					
				case 5:
					comparator = new SortByName();
					//list.sort((x,y) -> x.getName().compareTo(y.getName()));
					break;
					
				case 6:
					comparator = new SortbyMarks();
					//list.sort((x,y) -> Double.compare(x.getMarks(), y.getMarks()));
					break;
					
				default :
					System.out.println("Invalid choice");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
