package week2.day3.mysql.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintAllProducts {

	public static void printProducts() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/products_ex?"
				+ "useSSL=false&useUnicode=true&" + "useJDBCCompliantTimezoneShift=true&"
				+ "useLegacyDatetimeCode=false&" + "serverTimezone=Europe/Warsaw", "root", "")) {

			Statement stmt = conn.createStatement();
			String querySelect = "SELECT * FROM Products";
			ResultSet rs = stmt.executeQuery(querySelect);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String description = rs.getString("description");
				double price = rs.getDouble("price");
				
				System.out.print(id + " " + name + " ");
				if (description.length() > 20) {
					String desc = description.substring(0, 19);
					System.out.print(desc + "... ");
				} else {
					System.out.print(description + " ");
				}
				System.out.println(price);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		printProducts();
	}
}