package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {
	final static String SQL__INSERT = "insert into book(book_id,book_name,isbn_no,book_price)"+"values(?,?,?,?);";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdcUrl="jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPasword ="Admin@123";
		try {
//			load the driver
			Class.forName("org.postgresql.Driver");
//			create connection
			Connection connection = DriverManager.getConnection(jdcUrl,userName,userPasword);
			System.out.println("connection successful");
//			
			PreparedStatement pst = connection.prepareStatement(SQL__INSERT);
			pst.setInt(1,110);
			pst.setString(2,"My Life");
			pst.setInt(3, 2345);
			pst.setInt(4, 200);
			int row =pst.executeUpdate();
			System.out.println("Insert done");
			connection.close();
		
		
		} catch (ClassNotFoundException | SQLException cnfe)
		{
			cnfe.printStackTrace();
		}

	}

}
