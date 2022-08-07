package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.entity.Book;

public interface BookDao {
	public String add(Book book) throws  ClassNotFoundException, SQLException;
	public void update(Book book)throws ClassNotFoundException,SQLException;
	public void delete(Book book) throws ClassNotFoundException, SQLException;
	public Book getBook(int book_no)throws ClassNotFoundException,SQLException;
	public ArrayList<Book> getBookList()throws ClassNotFoundException,SQLException;
	

}
