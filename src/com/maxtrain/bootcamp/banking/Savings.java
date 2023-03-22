package com.maxtrain.bootcamp.banking;

public class Savings extends Account{
	
	// Class Fields
	private double interestRate = .12d;

	// Methods
	public void addInterest(Savings sacct) {
		sacct.setBalance(sacct.getBalance() + sacct.interestRate*sacct.getBalance());
	}
	
	public void payInterest(int months) throws Exception {
		var interest = calculateInterest(months);
		deposit(interest);
				
	}
	
	public double calculateInterest(int months) {
		if(months < 1) {
			return 0;
		}
		return getBalance() * (getInterestRate() / 12) * months;
				
	}
	
	public String toString() {
		return String.format("%2d | %-15s | %,7.2f% | %,7.2f%n"
				, getId(), getDescription(), getBalance(), getInterestRate());
	}
	
	// Constructors 
	
	public Savings() {
		super();
	}
	
	public Savings(String description) {
		super(description);
	}
	
	
	// Class Getters and Setters
	public double getInterestRate() {
		return interestRate;
	}
	private void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
