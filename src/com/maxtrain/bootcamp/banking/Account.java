package com.maxtrain.bootcamp.banking;

public class Account {

	//***************** Class Fields
	
	private int id = 0;
	private String description;
	private double balance = 0;
	private static int nextId = 1;
	
	//***************** Class Methods
	
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
	
	public String toString() {
		return String.format("%2d | %-15s | %,7.2f%n", getId(), getDescription(), getBalance());
	}
	
	//***************** Constructors 
	
	public Account(String description){
		setId(nextId++);
		setDescription(description);
		setBalance(0);		
	}
	
	public Account() {
		this("New Account");
	}
	
	//***************** Getters and Setters
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
	
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
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBalanceFormatted() {
		return String.format("%,7.2f",  getBalance());
	}
	
}
