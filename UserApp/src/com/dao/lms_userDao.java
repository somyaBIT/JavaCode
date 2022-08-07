package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;


import com.entity.lms_User;



public interface lms_userDao {
	public boolean Is_Valid(lms_User user) throws ClassNotFoundException, SQLException;
//	public ArrayList<lms_User> getBookList() throws SQLException, ClassNotFoundException;
	public lms_User getUser(String email)throws ClassNotFoundException,SQLException;

}
