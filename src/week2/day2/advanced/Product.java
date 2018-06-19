package week2.day2.advanced;

public class Product {

	private int id;
	private String name;
	private String description;
	private double price;
	private int quantity;
	private int nextId = 1;

	public Product(String name, String description, double price, int quantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.id = nextId;
		this.nextId++;
	}

	public double getTotalSum() {
		if (this.quantity >= 3) {
			return this.quantity * this.price * 0.8;
		} else {
			return this.quantity * this.price;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
}
