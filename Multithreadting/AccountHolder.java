package com.java.training.multithreads;

public class AccountHolder implements Runnable {
	private Account account;
	int withdrawAmount;
	
	public AccountHolder(Account account, int amount) {
		this.account = account;
		this.withdrawAmount = amount;
	}
	
	public void run() {
		for(int i=1; i<=1;i++) {
			System.out.println(account.getBalance());

				if(account.getBalance() < 0) { 
				System.out.println("Your ACcount is Overdrwan");
			}
			else if(account.getBalance() <= 1000 && account.getBalance() >=1){ 
				System.out.println("low balance please deposit soon!!!");
			}
			else {
				makewithdrawal(withdrawAmount); 
			}
			
		}
		
	}
	
	
	
	public synchronized void makewithdrawal(int withdrawAmount) {
		if(account.getBalance() >= withdrawAmount) {
			System.out.println(Thread.currentThread().getName() +" is going to withdraw " + withdrawAmount); 
			try {
				
				Thread.sleep(1000);
				  
			} catch(InterruptedException ex) {
				
			}
			
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName() +" Completes the withdrawal of  " + withdrawAmount);
			System.out.println("Available Balance" + account.getBalance()); 
			

		} else {
			System.out.println("Withdraw Ammount: " + withdrawAmount);
			System.out.println("Not enough in Account for " + Thread.currentThread().getName() +" to withdraw " + account.getBalance());

		}
		

	}

}
