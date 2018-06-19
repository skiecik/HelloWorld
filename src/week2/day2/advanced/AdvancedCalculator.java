package week2.day2.advanced;

import java.util.ArrayList;
import java.util.List;

import week2.day1.constructor.Calculator;

public class AdvancedCalculator extends Calculator {

	public static double PI = 3.14159265;
	public static List<String> globalOperations = new ArrayList<>();

	public static double computeCircleArea(double radius) {
		return PI * Math.pow(radius, 2);
	}

	@Override
	public void addToOperations(String operation) {
		super.addToOperations(operation);
		globalOperations.add(operation);
	}

	public static void printGlobalOperations() {
		for (String s : globalOperations) {
			System.out.println(s);
		}
	}

	public static void printGlobalOperations(int length) {

		if (length > globalOperations.size()) {
			System.out.println("There are not enough operations to print");
		} else {
			for (int i = 0; i < length; i++) {
				System.out.println(globalOperations.get(i));
			}
		}
	}

	public static void printGlobalOperations(String length) {
		try {
			int intLength = Integer.parseInt(length);

			if (intLength > globalOperations.size()) {
				for (int i = 0; i < intLength; i++) {
					System.out.println(globalOperations.get(i));
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public double pow(double num1, double num2) {

		double result = Math.pow(num1, num2);
		addToOperations(num1 + " ^ " + num2 + " = " + result);
		return result;
	}

	public double root(double num1, double num2) {
		double result = Math.pow(num1, 1.0 / num2);
		addToOperations("root " + num2 + " of " + num1 + " = " + result);
		return result;
	}
}
