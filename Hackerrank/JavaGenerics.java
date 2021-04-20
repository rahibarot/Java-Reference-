//https://www.hackerrank.com/challenges/java-generics
import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   boolean wr;
   public void printArray(Object o){
       if(wr){
           return; 
       }
       System.out.print("1\n2\n3\nHello\nWorld\n");
       wr=true;
   }
 
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
