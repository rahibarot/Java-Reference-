//https://leetcode.com/problems/letter-combinations-of-a-phone-number
class Solution {
public:
    vector<string> letterCombinations(string digits) {
        vector<string> res;
        if(digits.length()== 0) return res;
        
        string map[10]={
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        myltrcomb(digits, res, map, 0, "");
        return res;
    }
    void myltrcomb(string digits, vector<string> &res, string map[], int i, string s){
        if (i==digits.length()){
            res.push_back(s);
            return;
        }
        string val= map[digits[i]-'0'];
            for(int j=0; j<val.length(); j++){
               myltrcomb(digits, res, map, i+1, s+val[j]);  
            }
    }
};
