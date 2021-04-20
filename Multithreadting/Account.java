package com.java.training.multithreads;

public class Account {
	private int balance = 3000; //my balance 
	
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}
	
}
