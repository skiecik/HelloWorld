package week2.day1.constructor;

public class CalculatorTest {
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		System.out.println(calc.add(1.0, 2.0));
		System.out.println(calc.divide(6.0, 3.0));
		System.out.println(calc.multiply(2.0, 2.0));
		System.out.println(calc.subtract(4.0, 1.0));
		
		calc.printOperations();
		calc.clearOperations();
		calc.printOperations();
	}
}
