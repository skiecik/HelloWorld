package week2.day1.methods;

public class SetPersonDetails {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("Skiecik");
		person.setSurname("Programmer");
		person.setAge(26);
		person.setGender('M');

		System.out.println(person.getName());
		System.out.println(person.getSurname());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		System.out.println(person.getFullName());
		person.invcreaseAge();
		System.out.println(person.getAge());
	}
}
