package com.maxtrain.bootcamp.banking;

public class Program {

	public static void main(String[] args) {
	
	try {
		var account2 = new Account();
		var account = new Account();
		account.deposit(100);
		System.out.println("Balance is " + account.getBalance());
		account.withdraw(50);
		System.out.println("Balance is " + account.getBalance());
		account.transfer(5, account2);
		System.out.println("Balance is " + account.getBalance());
		System.out.println("Account2 Balance is " + account2.getBalance());
		
	}	catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	}
}
