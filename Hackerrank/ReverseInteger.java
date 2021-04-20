//https://leetcode.com/problems/reverse-integer
class Solution {
public int reverse(int x) {
    
    long a=0;
    
    boolean flag=false;
    
    int y=x;
    
    if(y<0){
        x= -1*y;
        flag= true;
    }
    while(x>0){
        a= a*10 + x%10;
        x= x/10;
    }
    if(flag){
        a = -1*a;
        
    }
    if( a< -2147483648 || a> 2147483647){
        a=0;
    }
    return (int)a;
    }
    
}
