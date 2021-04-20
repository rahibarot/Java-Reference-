//https://leetcode.com/problems/longest-substring-without-repeating-characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map <Character, Integer> seen = new HashMap<>();
        int l=0;
        int output =0;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(seen.containsKey(c)){
                int index = seen.get(c);
                if (index >=l){
                    l = index +1;
                }
             seen.put(c,i);   
            }
            seen.put(c,i);
            
            int cur_len =i-l+1;
            output =Math.max(output, cur_len);
        }
        return output;
    }
}
