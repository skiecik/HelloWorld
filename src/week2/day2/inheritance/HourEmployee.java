package week2.day2.inheritance;

public class HourEmployee extends Employee{

	public HourEmployee(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName, salary);
	}
	
	public double computePayment(double hours) {
		return hours*this.salary;
	}
}
