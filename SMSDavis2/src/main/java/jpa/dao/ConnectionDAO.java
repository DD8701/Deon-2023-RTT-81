package jpa.dao;
	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class ConnectionDAO {
		
		static Connection conn = null;
		protected PreparedStatement ps = null;
		protected ResultSet rs = null;
		
		public static Connection getConnection() {
			final String dburl = "jdbc:mysql://localhost:3306/SMSDavis2";
			final String dbuser = "root";
			final String dbpassword = "De310966!";
			try {
				conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
				System.out.println("Connected Database Successfully");
			}catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
				
			}
			
			return conn;

	}
	}



