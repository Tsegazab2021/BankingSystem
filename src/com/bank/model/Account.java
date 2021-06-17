package com.bank.model;

public class Account {
	private int accountNo;
	private String firstName;
	private String lastName;
	private double balance;
	public Account(int accountNo, String firstName, String lastName, double balance) {
		super();
		this.accountNo = accountNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", firstName=" + firstName + ", lastName=" + lastName + ", balance="
				+ balance + "]";
	}

	
}
