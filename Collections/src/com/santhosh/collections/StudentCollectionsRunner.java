package com.santhosh.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<StudentCollection> {
	public int compare(StudentCollection student1, StudentCollection student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class StudentCollectionsRunner {

	public static void main(String[] args) {
		List<StudentCollection> students = List.of(new StudentCollection(1, "Santhosh"),
				new StudentCollection(355, "Suresh"), new StudentCollection(98, "Ramu"),
				new StudentCollection(4, "Bhavani"), new StudentCollection(2, "Mohini"));
		ArrayList<StudentCollection> StudentsAl = new ArrayList<>(students);
		System.out.println(StudentsAl);
		Collections.sort(StudentsAl);
		System.out.println("Desc " + StudentsAl);
		StudentsAl.sort(new AscendingStudentComparator());
		System.out.println("Asce " + StudentsAl);

	}

}
