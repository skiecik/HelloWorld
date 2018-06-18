package week2.day2.inheritance;

public class Circle extends Shape{
	
	private double radius;

	public Circle(double x, double y, String color, double radius) {
		super(x, y, color);
		this.radius = radius;
	}

	public void getDescription() {
		System.out.print("Radius:" + radius + " ");
		super.getDescription();
	}
	
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double getCircuit() {
		return 2*Math.PI*radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
