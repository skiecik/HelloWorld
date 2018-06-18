package week2.day1.exercises;

public class Book {

	private int id;
	private String title;
	private boolean available = true;
	private Author author;
	private Author[] additionalAuthors;
	private User user;
	
	public void borrowTo(User user) {
		this.setAvailable(false);
		this.user = user; 
		user.getBooks().add(this);
	}
	
	public Book(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Book(int id, String title, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	public Book(int id, String title, Author author, Author[] additionalAuthors) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.additionalAuthors = additionalAuthors;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Author[] getAdditionalAuthors() {
		return additionalAuthors;
	}
	public void setAdditionalAuthors(Author[] additionalAuthors) {
		this.additionalAuthors = additionalAuthors;
	}
	public int getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
