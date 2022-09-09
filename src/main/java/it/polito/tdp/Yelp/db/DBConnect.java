package it.polito.tdp.Yelp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class DBConnect {
	
	static private HikariDataSource ds = null;
	static String url = "jdbc:mysql://localhost:3306/yelp";
	

	public static Connection getConnection() {
		
		if(ds==null) { //SINGLETON
			
			//crea nuova data source, la inizializzo una sola volta all'inizio
			ds = new HikariDataSource();
			ds.setJdbcUrl(url);
			ds.setUsername("root");
			ds.setPassword("rootroot");
		}
		try {
			
		return ds.getConnection();
		
		} catch (SQLException e) {
			System.out.println("ERRORE di connessione al database");
			e.printStackTrace();
			return null ;
		}
	}
}
