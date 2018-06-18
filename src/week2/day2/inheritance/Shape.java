package week2.day2.inheritance;

public class Shape {

	private double x;
	private double y;
	private String color;
	
	public Shape(double x, double y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void getDescription () {
		System.out.println("Middle: x = " + this.x + " y = " + this.y + " color: " + this.color);
	}
	
	public double getDistance(Shape shape) {
		return Math.sqrt(Math.pow((this.x - shape.getX()), 2) + Math.pow((this.y - shape.getY()), 2));
	}

	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
}
