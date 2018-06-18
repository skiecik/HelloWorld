package week2.day2.inheritance;

public class SalariedEmployee extends Employee{

	public SalariedEmployee(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName, salary);
	}

	public double computePayment(double hours) {
		return 190*this.salary;
	}
}
