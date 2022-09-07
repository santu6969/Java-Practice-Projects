import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] listOfMarks = { 95, 96, 85, 96, 79, 82 };
		Student student = new Student("Santhosh", listOfMarks);

		student.addMark(35);
		student.removeMarkAtIndex(1);

		int number = student.getNoOfMarks();
		System.out.println("Total Number of Marks is : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Total Sum of Marks is : " + sum);

		int maxMark = student.getMaximumMark();
		System.out.println("Maximum no of Mark is : " + maxMark);

		int minMark = student.getMinimumMark();
		System.out.println("Minimum no of Mark is : " + minMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("The Average Number of marks is : " + average);

		System.out.println(student);
	}

}
