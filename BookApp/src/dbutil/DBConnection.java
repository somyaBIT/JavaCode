package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public Connection getConnection(String jdbcUrl,String userName, String userPwd) throws SQLException, ClassNotFoundException
	{
//		load the driver
		Class.forName("org.postgresql.Driver");
//		create connection
		Connection connection = DriverManager.getConnection(jdbcUrl,userName,userPwd);
		return connection;
	}
	
}
