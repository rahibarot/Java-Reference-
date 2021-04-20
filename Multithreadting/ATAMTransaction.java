package com.java.training.multithreads;

public class ATAMTransaction extends Thread{
  //remove the comment lines for deamon test
//	public void run(){   //deamon test 
//		
//		  // Checking whether the thread is Daemon or not
//		  if(Thread.currentThread().isDaemon()){ 
//		      System.out.println("Daemon thread executing");  
//		  }  
//		  else{  
//		      System.out.println("user(normal) thread executing");  
//	          }  
//	   }  
	
	public static void main(String[] args) {
		
		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account,500); //this ammount I am withdrawing is 1000
																	//if we withdraw less 3000 there is not overdrafts?
																	//why it doesn;t run into an issue if the ammount is less then or equal to 3000?
									
		

		
		Thread t1 = new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		Thread t3 = new Thread(accountHolder);
		Thread t4 = new Thread(accountHolder);
		Thread t5 = new Thread(accountHolder);
		t1.setName("You");
		t2.setName("Your Partner");
		t3.setName("test");
		t4.setName("test2");
		t5.setName("test3");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		
		
	}

}
