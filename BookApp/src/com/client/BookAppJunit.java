package com.client;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.dao.impl.BookdaoImpl;
import com.entity.Book;

class BookAppJunit {

	@Test
	void test() throws ClassNotFoundException, SQLException {
		 Book b=new Book();
		  BookdaoImpl bd = new BookdaoImpl();
		assertEquals("Life is beautiful",bd.getBook(111).getBook_name());
		   b.setBook_id(700);
		     b.setBook_name("Gods");
		     b.setBook_price(500);
		     b.setIsbn_no(12344);
		assertEquals("Insert done",bd.add(b));
	}

}
