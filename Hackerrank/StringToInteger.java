class Solution {
    public int myAtoi(String str) {
        int sign = 1; 
        int res= 0;
        int cur=0;
        int digit = 0;
        
        while(cur<str.length() && str.charAt(cur) == ' ') cur++;
        if(cur==str.length()) return 0;
        if(str.charAt(cur) == '-'){
            sign = -1;
            cur++;
        }else if(str.charAt(cur) =='+') cur++;
        while (cur <str.length()) {
            digit = charToDig(str.charAt(cur));
            if(digit <0) return sign*res;
            if(res > (Integer.MAX_VALUE -digit) /10) return sign == 1 ? Integer.MAX_VALUE: Integer.MIN_VALUE;
            res = 10*res+digit;
            cur++;
        }
        return sign*res;
    }
    
public int charToDig(char c){
    int res = c - '0';
    return res >= 0 && res <=9 ? res : -1;
}
}
