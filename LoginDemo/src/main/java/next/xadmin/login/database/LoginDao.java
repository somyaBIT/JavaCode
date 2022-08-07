package next.xadmin.login.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import next.xadmin.login.bean.LoginBean;
import next.xadmin.login.connection.LoginConnection;

public class LoginDao {

	 private String jdcUrl="jdbc:postgresql://localhost:5432/logindb";
	 private String userName = "postgres";
	 private  String userPassword ="Admin@123";
   LoginConnection lc = new LoginConnection();
    
   
	public boolean validate(LoginBean lb) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		boolean status =false;
		Connection con = lc.getConnection(jdcUrl, userName, userPassword);
		String sql ="select * from login where username=? and password =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,lb.getUsername());
		ps.setString(2,lb.getPassword());
	ResultSet rs =	ps.executeQuery();
	status = rs.next();
		ps.close();
		con.close();
		return status;
		
	}
    
    
}
