package com.maxtrain.bootcamp.banking;

public class Program {

	public static void main(String[] args) {
	
	try {
		
		var account = new Account("Second Account");
		var account2 = new Account("First Account");
		var savings1 = new Savings("Bob Savings Account");
		
		account.deposit(100);
		//System.out.printf("Balance is %,7.2f%n", account.getBalance());
		account.withdraw(50);
		//System.out.printf("Balance is %,7.2f%n", account.getBalance());
		account.transfer(5, account2);
		//System.out.printf("Balance is %,7.2f and Account2 Ballance is %,7.2f%n", 
		//		account.getBalance(), account2.getBalance());
		//System.out.println("Account2 Balance is " + account2.getBalance());
		//System.out.println(account.toString());
		//System.out.println(account2.toString());
		//System.out.println(savings1.toString());  // <<<<<<<<<<< EXCEPTION Conversion = ' '
		System.out.println("***********************************");
		System.out.printf("savings1 id: %s%n", savings1.getId());
		System.out.printf("savings1 description: %s%n", savings1.getDescription());
		System.out.printf("savings1 balance: %s%n", savings1.getBalance());
		System.out.printf("savings1 interest rate: %s%n", savings1.getInterestRate());
		
		savings1.deposit(100);
		
		System.out.println("***********************************");
		System.out.printf("savings1 id: %s%n", savings1.getId());
		System.out.printf("savings1 description: %s%n", savings1.getDescription());
		System.out.printf("savings1 balance: %s%n", savings1.getBalance());
		System.out.printf("savings1 interest rate: %s%n", savings1.getInterestRate());
		
		savings1.addInterest(savings1);
		
		System.out.println("***********************************");
		System.out.printf("savings1 id: %s%n", savings1.getId());
		System.out.printf("savings1 description: %s%n", savings1.getDescription());
		System.out.printf("savings1 balance: %s%n", savings1.getBalance());
		System.out.printf("savings1 interest rate: %s%n", savings1.getInterestRate());
		
		savings1.payInterest(3);
		
		System.out.println("***********************************");
		System.out.printf("savings1 id: %s%n", savings1.getId());
		System.out.printf("savings1 description: %s%n", savings1.getDescription());
		System.out.printf("savings1 balance: %s%n", savings1.getBalance());
		System.out.printf("savings1 interest rate: %s%n", savings1.getInterestRate());
		
		
	}	catch(Exception ex) {
		System.out.printf("EXCEPTION: %s%n",ex.getMessage());
	}
	}
}
