package com.maxtrain.bootcamp.banking;

public class Program {

	public static void main(String[] args) {
	
	try {
		var account2 = new Account();
		var account = new Account();
		account.deposit(100);
		System.out.printf("Balance is %,7.2f%n", account.getBalance());
		account.withdraw(50);
		System.out.printf("Balance is %,7.2f%n", account.getBalance());
		account.transfer(-5, account2);
		System.out.printf("Balance is %,7.2f and Account2 Ballance is %,7.2f%n", 
				account.getBalance(), account2.getBalance());
		System.out.println("Account2 Balance is " + account2.getBalance());
		
	}	catch(Exception ex) {
		System.out.printf("EXCEPTION: %s%n",ex.getMessage());
	}
	}
}
