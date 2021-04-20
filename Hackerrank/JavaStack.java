//Challenge: https://www.hackerrank.com/challenges/java-stack
import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println((balancePrent(input)));        
		}
	}
    public static boolean balancePrent(String s){
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i <s.length(); i++){
            char c= s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                st.push(c);
            }else if(c== '}'){
                if(st.isEmpty() || st.pop() != '{'){
                    return false;
                }
            }else if( c == ']'){
                if(st.isEmpty() || st.pop() != '['){
                    return false;
                }
            }else if(c == ')'){
                if(st.isEmpty() || st.pop() != '('){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}



