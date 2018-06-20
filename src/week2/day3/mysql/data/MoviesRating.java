package week2.day3.mysql.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MoviesRating {

	public static void printGoodMovies() {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?"
				+ "useSSL=false&useUnicode=true&" + "useJDBCCompliantTimezoneShift=true&"
				+ "useLegacyDatetimeCode=false&" + "serverTimezone=Europe/Warsaw", "root", "")) {

			String queryMovies = "SELECT * FROM Movies WHERE rating > (SELECT AVG(rating) FROM Movies)";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(queryMovies);

			while (rs.next()) {
				System.out.println(
						rs.getString("name") + " " + rs.getString("description") + " " + rs.getDouble("rating"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		printGoodMovies();
	}
}
