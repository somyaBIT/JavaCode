package com.entity;

public class Book {
	
	
	private int book_id;
	private String book_name;
	private int isbn_no;
	private int book_price;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getIsbn_no() {
		return isbn_no;
	}
	public void setIsbn_no(int isbn_no) {
		this.isbn_no = isbn_no;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", isbn_no=" + isbn_no + ", book_price="
				+ book_price + "]";
	}

}
