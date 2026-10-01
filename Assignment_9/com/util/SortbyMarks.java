package com.util;

import java.util.Comparator;

import com.domain.Student;

public class SortbyMarks implements Comparator<Student>{
	public int compare(Student x, Student y) {
		return Double.compare(x.getMarks(), y.getMarks());
	}

}
