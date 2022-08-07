package com.xadmin.username.dao;

import java.sql.SQLException;
import java.util.ArrayList;


import com.xadmin.usermanagement.bean.User;

public interface UserDao {
public boolean insert(User user)throws ClassNotFoundException,SQLException;
public boolean update(User user)throws ClassNotFoundException,SQLException;
public boolean delete(int id)throws ClassNotFoundException,SQLException;
public User getUser(int id)throws ClassNotFoundException,SQLException;
public ArrayList<User> getUser()throws ClassNotFoundException,SQLException;

}
