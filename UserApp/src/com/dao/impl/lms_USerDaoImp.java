package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.lms_userDao;

import com.entity.lms_User;

import dbutil.DBConnection;

public class lms_USerDaoImp implements lms_userDao {
	String jdcUrl="jdbc:postgresql://localhost:5432/lmsdb";
	String userName = "postgres";
	String userPasword ="Admin@123";
	DBConnection  dbcon =  new DBConnection ();
	
	@Override
	public boolean Is_Valid(lms_User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = dbcon.getConnection(jdcUrl, userName,userPasword);
		boolean flag=false;
		String email = user.getEmail();
		String pass = user.getPassword();
		String query ="Select * from lms_User where email=?";
		PreparedStatement pstmt =con.prepareStatement(query);
		pstmt.setString(1, email);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			if(rs.getString("Email")==email && rs.getString("Password")==pass)
			{
				flag=true;
			}
		}
		
		con.close();
		return flag;
	}
	@Override
	public lms_User getUser(String email)throws ClassNotFoundException,SQLException
	{
		Connection con = dbcon.getConnection(jdcUrl, userName,userPasword);
		
		lms_User user=new lms_User();
		String query ="Select * from lms_User where email=?";
		PreparedStatement pstmt =con.prepareStatement(query);
		pstmt.setString(1, email);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			user.setUser_id(rs.getInt("user_id"));
			user.setFirst_name(rs.getString("first_name"));
			user.setLast_name(rs.getString("last_name"));
			user.setEmail(rs.getString("Email"));
			user.setCreated_by(rs.getString("Created_by"));
				}
		pstmt.close();
		con.close();
		return user;
		
	}
	

}	
