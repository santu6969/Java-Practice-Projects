import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// Student santu = new Student();
		// santu.setCollege("Bapatla Engineering College");
		// santu.setName("Santhosh Kumar");
		// santu.setYear("2015");
		// System.out.println(santu);
		Employee employee = new Employee();
		employee.setName("Dasari LS Kumar");
		employee.setEmail("1sanu1@gmail.com");
		employee.setPhoneNumber("92900 90988");
		employee.setTitle("Java Developer");
		employee.setEmployeeGrade('A');
		employee.setEmployer("Vinspire Technologies Pvt. Ltd");
		employee.setSalary(new BigDecimal(60000));
		System.out.println(employee);
	}

}
