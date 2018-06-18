package week2.day1.constructor;

public class Person {

	private String name;
	private String surname;
	private int age;
	private char gender;
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(String name, String surname, int age, char gender) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
}
