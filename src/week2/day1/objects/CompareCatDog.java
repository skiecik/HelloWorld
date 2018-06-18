package week2.day1.objects;

public class CompareCatDog {

	//basic task to show some theory in use
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		if (cat.equals(dog)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}
}
