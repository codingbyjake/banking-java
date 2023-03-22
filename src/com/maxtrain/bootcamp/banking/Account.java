package com.maxtrain.bootcamp.banking;

public class Account {

	private int id = 0;
	private String description;
	private double balance = 0;
	
	public void deposit(double amount) throws Exception{
		checkAmountGTZero(amount);
		setBalance (getBalance() + amount);
	}
	
	public void withdraw(double amount) throws Exception{
		checkAmountGTZero(amount);
		checkInsufficientFunds(amount);
		setBalance (getBalance() - amount);
	}
	
	public void transfer(double amount, Account toAccount) throws Exception{
		checkAmountGTZero(amount);
		checkInsufficientFunds(amount);
		setBalance (getBalance() - amount);
		toAccount.deposit(amount);
	}
	
	private void checkAmountGTZero(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be positive and non-zero!!");
		}
	}
	
	private void checkInsufficientFunds(double amount) throws Exception {
		if(amount > getBalance()) {
			throw new Exception("Insufficient funds!!");
		}
	}
	
	
	
	public int getId() {
		return id;
	}
	private void setId(int id) throws Exception {
		if(id<0)
			throw new Exception("Id cannot be negative!!");
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
