package com.xadmin.username.daoImplement;
import com.xadmin.usermanagement.bean.User;
import java.sql.*;

import java.util.ArrayList;

import com.xadmin.usermanagement.bean.User;
import com.xadmin.username.dao.UserDao;
import com.xadmin.username.dbcon.dbcon;

public class UserDaoImp implements UserDao {
	String jdcUrl="jdbc:postgresql://localhost:5432/lmsdb";
	String userName = "postgres";
	String userPasword ="Admin@123";
	dbcon db = new dbcon();

	@Override
	public boolean insert(User user) throws ClassNotFoundException, SQLException {
		boolean flag;
		
		Connection con=db.getConnection(jdcUrl, userName, userPasword );
		String Insert_query ="Insert into user" +"(name,email,country) values"+"(?,?,?);";
		PreparedStatement pstmt = con.prepareStatement(Insert_query);
		pstmt.setString(1,"user.getName()");
		pstmt.setString(2,"user.getEmail()");
		pstmt.setString(3,"user.getCountry()");
		flag = pstmt.executeUpdate()>0;
		pstmt.close();
		con.close();
		return flag;
	}

	@Override
	public boolean update(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		boolean flag;
		Connection con=db.getConnection(jdcUrl, userName, userPasword );
		String Update_Query ="Update user set name=?,email=?,country=? where id=?;";
		PreparedStatement pstmt = con.prepareStatement(Update_Query);
		pstmt.setString(1,"user.getName()");
		pstmt.setString(2,"user.getEmail()");
		pstmt.setString(3,"user.getCountry()");
		flag = pstmt.executeUpdate()>0;
		pstmt.close();
		con.close();
		return flag;
	}

	@Override
	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		boolean flag;
		Connection con=db.getConnection(jdcUrl, userName, userPasword );
		String Delete_Query ="DELETE FROM user WHERE  id = ?";
		PreparedStatement pstmt = con.prepareStatement(Delete_Query);
		pstmt.setInt(1,id);
		flag = pstmt.executeUpdate()>0;
		pstmt.close();
		con.close();
		return flag;
	}

	@Override
	public User getUser(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		User user = null;
		Connection con=db.getConnection(jdcUrl, userName, userPasword );
		String USer_By_Id_Query="Select * from user where id=?";
		PreparedStatement pstmt = con.prepareStatement(USer_By_Id_Query);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			String name = rs.getString("name");
			String email = rs.getString("email");
			String country = rs.getString("country");
			user=new User(id,name,email,country);
			
		}
		rs.close();
		pstmt.close();
		con.close();
		return user;
	}

	@Override
	public ArrayList<User> getUser() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		User user=null;
		ArrayList<User>arr= new ArrayList<>();
		Connection con=db.getConnection(jdcUrl, userName, userPasword );
		String Select_All_User="Select * from user";
		PreparedStatement pstmt = con.prepareStatement(Select_All_User);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String country = rs.getString("country");
			user=new User(id,name,email,country);
			arr.add(user);
			
		}
		rs.close();
		pstmt.close();
		con.close();
		return arr;
	}

}
