//https://leetcode.com/problems/zigzag-conversion
class Solution {
public:
    string convert(string s, int nRows) {
            string apt;
            int tie1= (nRows-1)*2;
            int n = s.size();
            
            if(nRows >= n || nRows <=1){
                return s;
            }
        for(int i=0; i<nRows; ++i){
            int cur =i;
            while(cur <n){
                apt.push_back(s[cur]);
                if(i >0 && i< nRows-1){
                    int tie2 = (nRows -i- 1)*2;
                    if(cur +tie2 <n){
                        apt.push_back(s[cur+tie2]);
                    }
                }
                cur +=tie1;
            }
        }
        return apt;
    }
};
