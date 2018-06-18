package week2.day2.inheritance;

import week2.day1.constructor.Calculator;

public class AdvancedCalculator extends Calculator{

	public double pow(double num1, double num2) {
		
		double result = Math.pow(num1, num2);
		this.operations.add(num1 + " ^ " + num2 + " = " + result);
		return result;
	}
	
	public double root(double num1, double num2) {
		double result = Math.pow(num1, 1.0/num2);
		this.operations.add("root " + num2 + " of " + num1 + " = " + result);
		return result;
	}
}
