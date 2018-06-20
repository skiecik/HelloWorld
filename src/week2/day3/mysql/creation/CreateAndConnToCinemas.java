package week2.day3.mysql.creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateAndConnToCinemas {

	private String queryDB = "CREATE DATABASE products_ex "
			+ "CHARACTER SET utf8 COLLATE utf8_general_ci";	
	
	private String queryCinemas = "CREATE TABLE Cinemas "
			+ "(id int AUTO_INCREMENT, name varchar(255), "
			+ "address varchar(255), PRIMARY KEY(id))";
	private String queryMovies = "CREATE TABLE Movies "
			+ "(id int AUTO_INCREMENT, name varchar(255), "
			+ "description varchar(255), "
			+ "rating decimal(4,2), PRIMARY KEY(id))";
	private String queryTickets = "CREATE TABLE Tickets "
			+ "(id int AUTO_INCREMENT, "
			+ "quantity int, price decimal(5,2), PRIMARY KEY(id))";
	private String queryPayments = "CREATE TABLE Payments "
			+ "(id int AUTO_INCREMENT, type varchar(255), "
			+ "date date, PRIMARY KEY(id))";
	
	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?"
				+ "useSSL=false&useUnicode=true&" 
				+ "useJDBCCompliantTimezoneShift=true&"
				+ "useLegacyDatetimeCode=false&" 
				+ "serverTimezone=Europe/Warsaw", "root", "")) {

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
