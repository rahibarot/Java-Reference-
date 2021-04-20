package com.training.varargs;

public class javaArgs {

//	public int addition(int x, int y)
//	{
//		return x+y;
//	}
//	
//	public int addition(int l, int b, int h)  //this is how a normal method with fixed size of arguments 
//	{
//		return l*b*h;
//	}
	
	public int area(int i, int...js){ //this is a varargs methods that can be used to call
									//a method multiple time via multiple objects with unlimeted number of argument
		System.out.println("the area is");
		int sum=i;
		
		for(int x: js){
			sum *=x;
		}
		
		return sum;
	}
//	either of this two patern will do the job
	public int addition(int j, int...js){ 
//	public int addition(int j , int [] js){
										//what are the uses of varargs? in real programing 
		
		System.out.println("the total is: ");
		int sum=j;
		
		for(int y: js){
			sum+=y;
		}
		return sum;
	}
}
