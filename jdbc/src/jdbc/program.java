package jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class program {

	public static void main(String[] args) throws ClassNotFoundException , SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		String jdcUrl="jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPasword ="Admin@123";
//		create connection
		Connection connection = DriverManager.getConnection(jdcUrl,userName,userPasword);
		String InsertSql = "insert into book(book_id,book_name,isbn_no,book_price)"+"values(111,'Life is beautiful',23456,120),(112,'is beautiful',234568,120),(113,'Life',234569,120);";
//		create sql statement
		Statement statement= connection.createStatement();
//		run executeupdate
		statement.execute(InsertSql);
//		close
		statement.close();
		connection.close();
		
		
		System.out.println("connection successful");
		
	}
	}