package com.training.varargs;

public class testJavaArgs {
	public static void main(String[] args) {
		javaArgs java = new javaArgs();
		
		int num1=java.addition(0, 2,3,4,5,6,7);
		
		int num2=java.area(2, 3,5);

		System.out.println(num1);
		System.out.println(num2);
	}

}
