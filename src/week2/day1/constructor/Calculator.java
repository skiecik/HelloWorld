package week2.day1.constructor;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	protected List<String> operations;

	public Calculator() {
		this.operations = new ArrayList<>();
	}

	public void addToOperations(String operation) {
		this.operations.add(operation);
	}
	
	public double add(double num1, double num2) {
		double result = num1 + num2;

		addToOperations(num1 + " + " + num2 + " = " + result);
		return result;
	}

	public double subtract(double num1, double num2) {
		double result = num1 - num2;

		addToOperations(num1 + " - " + num2 + " = " + result);
		return result;
	}

	public double multiply(double num1, double num2) {
		double result = num1 * num2;

		addToOperations(num1 + " * " + num2 + " = " + result);
		return result;
	}

	public double divide(double num1, double num2) {
		if (num2 != 0) {
			double result = num1 / num2;
			addToOperations(num1 + " / " + num2 + " = " + result);
			return result;
		} else {
			System.out.println("Not possible to divide by zero");
			return 0;
		}
	}
	
	public void printOperations() {
		for (String s : this.operations) {
			System.out.println(s);
		}
	}
	
	public void clearOperations() {
		this.operations = new ArrayList<>();
	}
}
