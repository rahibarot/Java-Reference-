//https://leetcode.com/problems/generate-parentheses
class Solution {
public:
    vector<string> str;
      void combinations(int left, int right, int n, string cur){
          if(right > left || left > n ) return;
          if(right == left && right == n){
              str.push_back(cur);
              return;
          }
          combinations(left+1, right, n, cur+"(");
          combinations(left, right+1, n, cur+")");
      }  
    vector<string> generateParenthesis(int n){
        combinations(0,0,n,"");
        return str;
    }
    
};
