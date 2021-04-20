//https://leetcode.com/problems/3sum
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if(nums.size()<=1) return {};
        
        vector<vector<int>>ans;
        set<vector<int>>check;
        
        sort(nums.begin(), nums.end());
        
        for(int i=0; i<nums.size(); i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int j=i+1, k=nums.size()-1;
            
            while(j<k){
                if(nums[i]+nums[j]+nums[k]>0) k--;
                else if(nums[i]+nums[j]+nums[k]<0) j++;
                else{
                    vector<int> v1;
                    
                    v1.push_back(nums[i]);
                    v1.push_back(nums[j]);
                    v1.push_back(nums[k]);
                    
                    auto pos=check.find(v1);
                    
                    if(pos == check.end()){
                        check.insert(v1);
                        ans.push_back(v1);
                    }
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
};
