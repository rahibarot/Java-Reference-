package com.training.employee;


/*
 * @author RahiBarot
 */
public class Employee {
	/*this are instance variable 
	check out the link below for more info
	https://en.wikipedia.org/wiki/Instance_variable
	*/
	public int EmpId;
	public String firstName;
	public String lastName;
	public float salary;
	// No Argument constructor:one with nothing between braces
	public Employee(){
		System.out.println("You are in the defualt constructor");
		 EmpId= 1;
		 firstName= "Rahi";
		 lastName= "Barot";
		 salary= 150000;
		
	}
	//Argument constructor
	public Employee(int ID, String fName, String lName, float sal){
		this.EmpId=ID;
		this.firstName=fName;
		this.lastName=lName;
		this.salary=sal;
		System.out.println("You are in the Argument constructor");
	}
	
	//public method with no return type "void"
	public void displayProfile(){
		System.out.println("ID: "+ EmpId+ 
							"\n"+ "FirstName: "+ firstName +
							"\n" + "LastName: " + lastName+
							"\n" + "Employee's Salary: " + salary);
		
	}
	
	
}

//Non public class
class nonPublicClass{
	public nonPublicClass(){
		System.out.println("you are in the non public class const  ");
	}
}
