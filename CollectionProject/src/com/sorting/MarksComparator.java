package com.sorting;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return (int) (o2.getMarks()-o1.getMarks());
	}

}
