package week2.day1.exercises;

public class BookUserAuthorTest {

	public static void main(String[] args) {
		Author author1 = new Author(1, "SkiecikAuthor", "Programmer", "skiecik");
		User user = new User(1, "SkiecikUser", "Programmer");
		Book book = new Book(1, "Book1", author1);
		
		System.out.println(book.isAvailable());
		
		book.borrowTo(user);
		
		System.out.println(book.isAvailable());
	
		System.out.println(book.getAuthor().getFirstName());
		
		System.out.println(book.getUser().getFirstName());
		
		System.out.println(user.getBooks().get(0).getTitle());
		
	}
}
