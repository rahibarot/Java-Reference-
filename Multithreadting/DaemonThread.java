package com.java.training.multithreads;

public class DaemonThreadExample1 extends Thread{
	public void run(){   
		
		  // Checking whether the thread is Daemon or not
		  if(Thread.currentThread().isDaemon()){ 
		      System.out.println("Daemon thread executing");  
		  }  
		  else{  
		      System.out.println("user(normal) thread executing");  
	          }  
	   }  
	   public static void main(String[] args){  
		 /* Creating two threads: by default they are 
		  * user threads (non-daemon threads)
		  */
		 DaemonThreadExample1 t1=new DaemonThreadExample1();
		 DaemonThreadExample1 t2=new DaemonThreadExample1();   
		 
		 
		
		 t1.setName("Daemon");
			t2.setName("Non-setDaemon");
		 //Making user thread t1 to Daemon
	        t1.setDaemon(true);
			     
	        //starting both the threads 
	        t1.start(); 
	        t1.notify();
	        t2.start();  
	        
//	        t1.destroy();  
	        
//	        t1.resume();
	        
	        t1.yield(); 
	        System.out.println(t1.isInterrupted()); 
	        
	        
	        
	   } 
}
