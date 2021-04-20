package com.java.training.threads;

//you use wait state when there is diffrent process you are exicuting at the same time 
class Queue
	{
		int num;
		boolean valueSet = false;
		public synchronized void put(int num)  {
			while(valueSet) {
				try {
				wait();
				} catch(Exception e) {
			
				}
			}
			System.out.println("Put : " + num);
			this.num = num;
			valueSet = true;
			notify();
		}
		public synchronized void get() 
		{
			while(!valueSet) {
			try {
			wait();
			} catch(Exception e) {
		
			}
			}
			System.out.println("Get : " + num);
			valueSet=false;
			notify();
	
	}
	}

class Producer implements Runnable
	{
	Queue queue;
	public Producer(Queue queue) 
	{
		this.queue = queue;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	public void run() 
		{
		int i =0;
			while(true)
			{
				queue.put(i++);
				try {
					Thread.sleep(1000);
					} catch(Exception e) 
					{
						
					}
			}
		}
	}
class Consumer implements Runnable
{
	Queue queue;
	public Consumer(Queue queue) 
	{
		this.queue = queue;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	public void run() 
		{
			while(true)
			{
				queue.get();
				try {
					Thread.sleep(1000);
					} catch(Exception e) {
						
					}
			}
		}
}

public class InterThread 
{
	public static void main(String[] args) {
		Queue queue = new Queue();
		new Producer(queue);
		new Consumer(queue);
		
	}
}
