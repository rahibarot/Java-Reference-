//https://leetcode.com/problems/4sum
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        
        vector<vector<int>> res; //vector of vectors which stores all the integer
        
        int size = nums.size();  //get the size
        if(size < 4) return res;  // validator
        sort(nums.begin(), nums.end()); 
        
        
        for(int i=0; i<size-3; i++){   //keep one number const and check rest of the numbers
            if(i==0 || nums[i] != nums[i-1]){   // if there is no repeating numbers proceed
                for(int j=i+1; j<size-2; j++){   // keep 2 number const and check the rest of numbers 
                    if(j == i+1|| nums[j] != nums[j-1]){ // if number not repeating then proceed
                        
                        int k = j+1, l= size-1;   // two pointers 
                        while(k<l){
                            int sum = nums[i]+nums[j]+nums[k]+nums[l];  
                            if(sum >target) l--;   //if sum is larger then reduce the size
                            else if(sum<target) k++; //if sume is smaller move the intial
                            else{
                                res.push_back({nums[i], nums[j], nums[k], nums[l]}); //get the numbers and push it to the the vector res
                                //if the remaining number are repeating number then follwoing while statements will take care of it
                                while(k<l && nums[k] == nums[k+1]) k++;  
                                while(k<l && nums[l]== nums[l-1])l--;
                                k++;
                                l--;
                            }
                        }
                    }
                }
            }
        }
        
        
        return res;   
        
        
        
    }
};
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        
        vector<vector<int>> res; //vector of vectors which stores all the integer
        
        int size = nums.size();  //get the size
        if(size < 4) return res;  // validator
        sort(nums.begin(), nums.end()); 
        
        
        for(int i=0; i<size-3; i++){   //keep one number const and check rest of the numbers
            if(i==0 || nums[i] != nums[i-1]){   // if there is no repeating numbers proceed
                for(int j=i+1; j<size-2; j++){   // keep 2 number const and check the rest of numbers 
                    if(j == i+1|| nums[j] != nums[j-1]){ // if number not repeating then proceed
                        
                        int k = j+1, l= size-1;   // two pointers 
                        while(k<l){
                            int sum = nums[i]+nums[j]+nums[k]+nums[l];  
                            if(sum >target) l--;   //if sum is larger then reduce the size
                            else if(sum<target) k++; //if sume is smaller move the intial
                            else{
                                res.push_back({nums[i], nums[j], nums[k], nums[l]}); //get the numbers and push it to the the vector res
                                //if the remaining number are repeating number then follwoing while statements will take care of it
                                while(k<l && nums[k] == nums[k+1]) k++;  
                                while(k<l && nums[l]== nums[l-1])l--;
                                k++;
                                l--;
                            }
                        }
                    }
                }
            }
        }
        
        
        return res;   
        
        
        
    }
};
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        
        vector<vector<int>> res; //vector of vectors which stores all the integer
        
        int size = nums.size();  //get the size
        if(size < 4) return res;  // validator
        sort(nums.begin(), nums.end()); 
        
        
        for(int i=0; i<size-3; i++){   //keep one number const and check rest of the numbers
            if(i==0 || nums[i] != nums[i-1]){   // if there is no repeating numbers proceed
                for(int j=i+1; j<size-2; j++){   // keep 2 number const and check the rest of numbers 
                    if(j == i+1|| nums[j] != nums[j-1]){ // if number not repeating then proceed
                        
                        int k = j+1, l= size-1;   // two pointers 
                        while(k<l){
                            int sum = nums[i]+nums[j]+nums[k]+nums[l];  
                            if(sum >target) l--;   //if sum is larger then reduce the size
                            else if(sum<target) k++; //if sume is smaller move the intial
                            else{
                                res.push_back({nums[i], nums[j], nums[k], nums[l]}); //get the numbers and push it to the the vector res
                                //if the remaining number are repeating number then follwoing while statements will take care of it
                                while(k<l && nums[k] == nums[k+1]) k++;  
                                while(k<l && nums[l]== nums[l-1])l--;
                                k++;
                                l--;
                            }
                        }
                    }
                }
            }
        }
        
        
        return res;   
        
        
        
    }
};
