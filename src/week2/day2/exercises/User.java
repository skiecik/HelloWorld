package week2.day2.exercises;

import java.util.ArrayList;
import java.util.List;

public class User {

	protected int id;
	protected String firstName;
	protected String lastName;
	protected List<Book> books = new ArrayList<>();
	protected int nextId = 1;
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = nextId;
		this.nextId++;
	}
	
	public void returnBook(Book book) {
		book.setAvailable(true);
		books.remove(book);
	}
	
	public void returnAllBooks() {
		for (Book book : books) {
			books.remove(book);
		}
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

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getId() {
		return id;
	}
	
}
