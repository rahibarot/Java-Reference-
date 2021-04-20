//https://leetcode.com/problems/median-of-two-sorted-arrays
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size(), n = nums2.size();
        int size = m + n;
        
        int even = 0, mid;
        if(size % 2 == 0){
            even = 1;
            mid = size / 2;
        }
        else
            mid = size / 2 + 1;
        
        int i = 0, j = 0, k = 0, ans = 0;
		
        while(k < mid && i < m && j < n){
            if(nums1[i] <= nums2[j])
                ans = nums1[i++];
            else
                ans = nums2[j++];

            k++;
        }

        // If while traversing one of the vector runs out of bounds
        while(k < mid){
            if(i < m)
                ans = nums1[i++];
            else
                ans = nums2[j++];
          
            k++;
        }
        
		// If the total number of elements are even, then median will be average
        if(!even)
            return (double)ans;
        else{
            double x = ans, y;
			
            if(i < m && j == n)      // one of the vector doesn't have any element to traverse
                y = nums1[i];
            else if(j < n && i == m)
                y = nums2[j];
            else if(nums1[i] <= nums2[j])   // If both vectors have elements left to traverse
                y = nums1[i];
            else
                y = nums2[j];
            
            return (x + y) / 2;
        }
    }
};
