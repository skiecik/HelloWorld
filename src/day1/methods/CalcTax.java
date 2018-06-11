package day1.methods;

public class CalcTax {

	public static double calculateNet(double gross, double vat) {
		return gross/(1+vat);
	}
	
	public static void main(String[] args) {
		System.out.println(calculateNet(14145.00, 0.23));
	}
}
