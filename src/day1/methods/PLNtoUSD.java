package day1.methods;

public class PLNtoUSD {

	public static double convertToUsd(double zlotys) {
		return zlotys*4.04;
	}
	
	public static void main(String[] args) {
		System.out.println(convertToUsd(2.0));
	}
}