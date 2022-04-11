package it.polito.tdp.Yelp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/yelp?user=root&password=root";
		try {
			Connection conn = DriverManager.getConnection(url);
			return conn ;
		} catch (SQLException e) {
			System.out.println("ERRORE di connessione al database");
			e.printStackTrace();
			return null ;
		}
	}
}
