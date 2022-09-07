import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
	String name;

	Student(String name, int... listOfMarks) {
		for (int marks : listOfMarks) {
			this.listOfMarks.add(marks);
		}
		this.name = name;

	}

	public int getNoOfMarks() {
		return listOfMarks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int marks : listOfMarks) {
			sum += marks;
		}
		return sum;
	}

	public int getMaximumMark() {
		// int maxMark = 0;
		// for (int marks : this.listOfMarks) {
		// if (maxMark <= marks) {
		// maxMark = marks;
		// }}
		return Collections.max(listOfMarks);
	}

	public int getMinimumMark() {
		// int minMark = 100;
		// for (int marks : this.listOfMarks) {
		// if (minMark >= marks) {
		// minMark = marks;
		// }
		// }
		// return minMark;
		return Collections.min(listOfMarks);
	}

	public BigDecimal getAverageMarks() {
		int total = getTotalSumOfMarks();
		int totalSubjects = getNoOfMarks();
		return new BigDecimal(total).divide(new BigDecimal(totalSubjects), 3, RoundingMode.UP);
	}

	public String toString() {
		return name + listOfMarks;
	}

	public void addMark(int mark) {
		listOfMarks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		listOfMarks.remove(index);
	}
}
