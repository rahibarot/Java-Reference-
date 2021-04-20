//https://leetcode.com/problems/3sum-closest
class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int size = nums.size(), ans= INT_MAX, sum=0;
        sort(begin(nums), end(nums));
             for (int i=0; i<size; i++)
             {
                 int l=i+1, h=size-1;
                 while(l<h){
                     int val = nums[i]+nums[l]+nums[h];
                     if(abs(target-val)< abs(ans)){
                         ans= target-val;
                         sum=val;
                     }
                     if(val<target) l++;
                     else h--;
                 }
             }
             return sum;
    }
};
