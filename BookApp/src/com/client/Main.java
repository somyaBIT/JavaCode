package com.client;

import java.sql.SQLException;

import com.dao.impl.BookdaoImpl;
import com.entity.Book;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     Book b=new Book();
     BookdaoImpl bd = new BookdaoImpl();
     b.setBook_id(20700);
     b.setBook_name("God");
     b.setBook_price(500);
     b.setIsbn_no(12344);
     bd.add(b);
     
   System.out.println(bd.getBookList());
     
     

	}

}
