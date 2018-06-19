package week2.day2.advanced;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> products = new ArrayList<>();
	
	public void addProduct(Product newProduct) {
		products.add(newProduct);
	}
	
	public void removeProduct(int productId) {
		for (Product prod : products) {
			if (prod.getId() == productId)
				products.remove(prod);
		}
	}
	
	public void changeProductId(int prodId, int newQuantity) {
		for (Product prod : products) {
			if (prod.getId() == prodId) {
				prod.setQuantity(newQuantity);
			}
		}
	}
	
	public String printReceipt() {
		double totalSum = 0;
		StringBuilder strB = new StringBuilder();
		for (Product prod : products) {
			strB.append(prod.getId() + ": ");
			strB.append(prod.getName() + ", ");
			strB.append(prod.getQuantity() + "x");
			strB.append(prod.getPrice() + " = ");
			strB.append(prod.getTotalSum());
			strB.append("\n");
			totalSum += prod.getTotalSum();
		}
		strB.append("----------------------\n");
		strB.append("All: " + totalSum);
		return strB.toString();
	}
}
