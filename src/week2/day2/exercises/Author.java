package week2.day2.exercises;

public class Author extends User{

	private String pseudonim;	

	public Author(String firstName, String lastName, String pseudonim) {
		super(firstName, lastName);
		this.pseudonim = pseudonim;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPseudonim() {
		return pseudonim;
	}

	public void setPseudonim(String pseudonim) {
		this.pseudonim = pseudonim;
	}

	public int getId() {
		return id;
	}
	
}
