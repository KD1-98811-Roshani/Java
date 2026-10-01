package com.util;

import java.util.Comparator;

import com.domain.Student;

public class SortByRollno implements Comparator<Student>{
	public int compare(Student x, Student y) {
		return Integer.compare(x.getRollno(), y.getRollno());
	}
}

