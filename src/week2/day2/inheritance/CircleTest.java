package week2.day2.inheritance;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle cir1 = new Circle(3, 2, "red", 4);
		Circle cir2 = new Circle(1, 2, "red", 4);
		
		System.out.println(cir1.getDistance(cir2));
		
		System.out.println(cir2.getArea());
		System.out.println(cir1.getArea());
		System.out.println(cir2.getCircuit());
		System.out.println(cir2.getCircuit());
	}
}
