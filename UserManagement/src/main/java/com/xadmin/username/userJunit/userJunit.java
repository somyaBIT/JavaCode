package com.xadmin.username.userJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.xadmin.usermanagement.bean.User;
import com.xadmin.username.daoImplement.UserDaoImp;

class userJunit {

	@Test
	void test() throws ClassNotFoundException, SQLException {
		User user = new User();
		 user.setId(1);
	     user.setName("Somya");
	     user.setEmail("abc@gmail.com");
	     user.setCountry("India");
		UserDaoImp udi = new UserDaoImp();
		assertEquals("false",udi.insert(user));
		
		
	}

}
