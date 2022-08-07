package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.configure.Configure;
import com.dao.BookDao;
import com.entity.Book;

import dbutil.DBConnection;

public class BookdaoImpl implements BookDao {

	final static String SQL__INSERT = "insert into book(book_id,book_name,isbn_no,book_price)"+"values(?,?,?,?);";
	
	DBConnection db = new DBConnection();
	Configure conf = new Configure();
	@Override
	public String add(Book book) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
			
			Connection connection= db.getConnection(conf.jdcUrl,conf.userName, conf.userPassword );

			PreparedStatement pst = connection.prepareStatement(SQL__INSERT);
			pst.setInt(1,book.getBook_id());
			pst.setString(2,book.getBook_name());
			pst.setInt(3,book.getIsbn_no());
			pst.setInt(4,book.getBook_price());
			int row =pst.executeUpdate();
			System.out.println("Insert done");
			pst.close();
			connection.close();
			return "Insert done";
			
		


	}

	@Override
	public void update(Book book)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub

			
		Connection connection= db.getConnection(conf.jdcUrl,conf.userName, conf.userPassword );
			String selectUpdate ="update book set book_price=?,book_name=?,book_price=?,isbn_no=? where book_id=?";
			PreparedStatement pst = connection.prepareStatement(selectUpdate);
			pst.setInt(1,book.getBook_id());
			pst.setInt(2,book.getBook_price());
			pst.setString(3, book.getBook_name());
			pst.setInt(4, book.getIsbn_no());
			
			pst.executeUpdate();
            pst.close();
			connection.close();
			
			connection.close();
			
		

	}

	@Override
	public void delete(Book book) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub

			
		Connection connection= db.getConnection(conf.jdcUrl,conf.userName, conf.userPassword );
			String selectDelete ="DELETE FROM book WHERE  book_id = ?";
			PreparedStatement pst = connection.prepareStatement(selectDelete);
			pst.setInt(1,book.getBook_id());
			pst.executeUpdate();
            pst.close();
			connection.close();
			
		
	}

	@Override
	public Book getBook(int book_no)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub

			
		Connection connection= db.getConnection(conf.jdcUrl,conf.userName, conf.userPassword );
			String selectString= "Select * from book where book_id=?";
			Book b = new Book();
			PreparedStatement pst = connection.prepareStatement(selectString);
			pst.setInt(1,book_no);
//			   getting query
				ResultSet res = pst.executeQuery();
				while(res.next()) {
				b.setBook_id(res.getInt("book_id"));
				b.setBook_name(res.getString("book_name"));
				b.setBook_price(res.getInt("isbn_no"));
				b.setBook_price(res.getInt("book_price"));
				}
            pst.close();
			connection.close();
			
return b;
	}

	@Override
	public ArrayList<Book> getBookList()throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
		Connection connection= db.getConnection(conf.jdcUrl,conf.userName, conf.userPassword );
		ArrayList <Book>booklist= new ArrayList<Book>();
		String query ="select * from book";
		PreparedStatement pst = connection.prepareStatement(query);
		ResultSet resultset = pst.executeQuery();
		while(resultset.next())
		{
			Book b = new Book();
			b.setBook_id(resultset.getInt("book_id"));
			b.setBook_name(resultset.getString("book_name"));
			b.setBook_price(resultset.getInt("isbn_no"));
			b.setBook_price(resultset.getInt("book_price"));
			booklist.add(b);
		}     
		 resultset.close();
		 pst.close();
		connection.close();
		return booklist;
	}

}
