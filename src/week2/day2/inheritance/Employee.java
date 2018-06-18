package week2.day2.inheritance;

public class Employee {

	public int id;
	public String firstName;
	public String lastName;
	public double salary;
	
	public Employee(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public void riseSalary(double percentage) {
		this.salary += this.salary*percentage;
	}
}
