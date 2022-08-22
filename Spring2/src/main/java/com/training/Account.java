package com.training;

public class Account {
	
	private int id;
	private String accountNumber;
	private String accountName;
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountName=" + accountName + "]";
	}
	public Account(int id, String accountNumber, String accountName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

}
