package com.Hackerrank.Codes.Challenges;
import java.util.*;


//code link https://www.hackerrank.com/challenges/phone-book/problem

//simple phone book 
public class JavaMap {
	public static void main(String []argh)
	{
		System.out.println(" PLease enter the number of entries you want to insert in your phone book? ");
	    Scanner scan = new Scanner(System.in);
	    int contacts = scan.nextInt();
	    scan.nextLine();
	  //i got an error that said <> i not allowed in jre less 1.7 so how we define new hashmap in older jre version	
	    Map<String, Integer> map = new HashMap<>(contacts); 
	    for(int i=0; i < contacts; i++)
	    {
	    	System.out.println("Please enter the full name: ");
	        String name = scan.nextLine().trim(); //what is trim? 
	        System.out.println(" Please enter the phone number: ");
	        int phone = scan.nextInt();
	        scan.nextLine();
	        map.put(name, phone);
	    }        
	    System.out.println("Please enter the name to search in the phone book ");
	while(scan.hasNext())
	    {
			
	        String query = scan.nextLine().trim();
	        if(map.containsKey(query))
	        {
	            System.out.println(query + "=" + map.get(query));
	        }
	        else
	        {
	            System.out.println("Not found");
	        }
	        System.out.println("Please enter the name to search in the list");
	    }
	    scan.close();
	}
}
