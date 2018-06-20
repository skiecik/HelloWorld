package week2.day3.mysql.creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateAndConnectToProducts {

	private String queryDB = "CREATE DATABASE products_ex "
			+ "CHARACTER SET utf8 COLLATE utf8_general_ci";
	
	private String queryProducts = "CREATE TABLE Products "
			+ "(id int AUTO_INCREMENT, name varchar(255), "
			+ "description varchar(255), price decimal(6,2), "
			+ "PRIMARY KEY(id))";
	private String queryOrders = "CREATE TABLE Orders "
			+ "(id int AUTO_INCREMENT, description varchar(255), "
			+ "PRIMARY KEY(id))";
	private String queryClients = "CREATE TABLE Clients "
			+ "(id int AUTO_INCREMENT, name varchar(255), "
			+ "surname varchar(255), PRIMARY KEY(id))";
	
	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/products_ex?"
						+ "useSSL=false&useUnicode=true&"
						+ "useJDBCCompliantTimezoneShift=true&"
						+ "useLegacyDatetimeCode=false&"
						+ "serverTimezone=Europe/Warsaw",
						"root", "")) {
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
}
