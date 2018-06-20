package week2.day3.mysql.tables;

public class TablesProduct {

	private String queryProduct1 = "INSERT INTO Products (name, description, price) "
			+ "VALUES ('prod1', 'this is prod1', 10.45)";
	private String queryProduct2 = "INSERT INTO Products (name, description, price) "
			+ "VALUES ('prod2', 'this is prod2', 7.25)";
	private String queryClient1 = "INSERT INTO Clients (name, surname) VALUES ('Name1', 'Surname1')";
	private String queryClient2 = "INSERT INTO Clients (name, surname) VALUES ('Name2', 'Surname2')";
	private String queryOrder1 = "INSERT INTO Orders (description) VALUES ('order1')";
	private String queryOrder2 = "INSERT INTO Orders (description) VALUES ('order2')";
}
