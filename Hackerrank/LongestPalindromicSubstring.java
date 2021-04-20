//https://leetcode.com/problems/longest-palindromic-substring
class Solution {
    public String longestPalindrome(String s) {
       if (s.length() <=1) return s;
        
        String res="";
        for (int i=0; i<s.length(); i++){
            String odd=expRange(s,i,i);
            
            if (odd.length() > res.length()){
                res=odd;
            }
            
            String even = expRange(s,i,i+1);
            
            if(even.length() > res.length()) {
                res= even;
            }
        }
        return res;
    }
    
    private String expRange(String s, int left, int right) { 
    String str=s;
        
    while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
        left--;
        right++;
    }
        return str.substring(left +1, right);
    }
}
