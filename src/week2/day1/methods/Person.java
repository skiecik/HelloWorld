package week2.day1.methods;

public class Person {

	private String name;
	private String surname;
	private int age;
	private char gender;

	public String getFullName() {
		return this.name + " " + this.surname;
	}
	
	public void invcreaseAge() {
		this.age++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getSurname() {
		return surname;
	}
	
}
