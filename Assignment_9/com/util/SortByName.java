package com.util;

import java.util.Comparator;

import com.domain.Student;

public class SortByName implements Comparator<Student>{
	public int compare(Student x, Student y) {
		return x.getName().compareTo(y.getName());
	}

}

