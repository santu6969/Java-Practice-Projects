package com.santhosh.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class StudentCollectionsRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Santhosh"),
				new Student(355, "Suresh"), new Student(98, "Ramu"),
				new Student(4, "Bhavani"), new Student(2, "Mohini"));
		ArrayList<Student> StudentsAl = new ArrayList<>(students);
		System.out.println(StudentsAl);
		Collections.sort(StudentsAl);
		System.out.println("Desc " + StudentsAl);
		StudentsAl.sort(new AscendingStudentComparator());
		System.out.println("Asce " + StudentsAl);

	}

}
