package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryProgram {
	public static void main(String[ ] args)
	{
		String jdcUrl="jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPasword ="Admin@123";
		String selectString= "Select * from book";
		String selectUpdate ="update book set book_price='500' where book_id=101";
		String selectDelete ="DELETE FROM book WHERE  book_id = 101";
		try {
//			load the driver
			Class.forName("org.postgresql.Driver");
//			create connection
			Connection connection = DriverManager.getConnection(jdcUrl,userName,userPasword);
			System.out.println("connection successful");
//			create sql statement
			Statement statement= connection.createStatement();
//			updation
		      statement.executeUpdate(selectDelete);
//		      getting query
			ResultSet resultset = statement.executeQuery(selectString);
			
			while(resultset.next())
			{
				System.out.println(resultset.getInt("book_id")+"\t"+resultset.getString("book_name")+"\t"+resultset.getInt("isbn_no")+"\t"+resultset.getInt("book_price"));
				
			}
			resultset.close();
			
			statement.close();
			connection.close();
		
		
		} catch (ClassNotFoundException | SQLException cnfe)
		{
			cnfe.printStackTrace();
		}
	}

}
