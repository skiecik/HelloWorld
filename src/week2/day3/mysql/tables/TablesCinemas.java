package week2.day3.mysql.tables;

public class TablesCinemas {

	private String queryCinema1 = "INSERT INTO Cinemas (name, address) VALUES ('cinema1', 'address1')";
	private String queryCinema2 = "INSERT INTO Cinemas (name, address) VALUES ('cinema2', 'address2')";
	private String queryCinema3 = "INSERT INTO Cinemas (name, address) VALUES ('cinema3', 'address3')";
	private String queryCinema4 = "INSERT INTO Cinemas (name, address) VALUES ('cinema4', 'address4')";
	private String queryCinema5 = "INSERT INTO Cinemas (name, address) VALUES ('cinema5', 'address5')";
	
	private String queryMovie1 = "INSERT INTO Movies (name, description, rating) VALUES ('movie1', 'this is movie1', 4.92)";
	private String queryMovie2 = "INSERT INTO Movies (name, description, rating) VALUES ('movie2', 'this is movie2', 4.92)";
	private String queryMovie3 = "INSERT INTO Movies (name, description, rating) VALUES ('movie3', 'this is movie3', 4.92)";
	private String queryMovie4 = "INSERT INTO Movies (name, description, rating) VALUES ('movie4', 'this is movie4', 4.92)";
	private String queryMovie5 = "INSERT INTO Movies (name, description, rating) VALUES ('movie5', 'this is movie5', 4.92)";

	private String queryPayment1 = "INSERT INTO Payments (type, date) VALUES ('cash', '2018-02-23')";
	private String queryPayment2 = "INSERT INTO Payments (type, date) VALUES ('card', '2018-04-05')";
	private String queryPayment3 = "INSERT INTO Payments (type, date) VALUES ('cash', '2018-02-21')";
	private String queryPayment4 = "INSERT INTO Payments (type, date) VALUES ('card', '2018-01-16')";
	private String queryPayment5 = "INSERT INTO Payments (type, date) VALUES ('cash', '2017-11-14')";

	private String queryTicket1 = "INSERT INTO Tickets (quantity, price) VALUES (4, 11.50)";
	private String queryTicket2 = "INSERT INTO Tickets (quantity, price) VALUES (80, 16.50)";
	private String queryTicket3 = "INSERT INTO Tickets (quantity, price) VALUES (123, 131.50)";
	private String queryTicket4 = "INSERT INTO Tickets (quantity, price) VALUES (23, 16.50)";
	private String queryTicket5 = "INSERT INTO Tickets (quantity, price) VALUES (215, 13.50)";
}
