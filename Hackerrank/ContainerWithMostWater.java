//https://leetcode.com/problems/container-with-most-water
class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        if(n<=1) return 0;
        int i=0, j=n-1;
        int maxarea= 0;
        
        while(i<j){
            maxarea= Integer.max((j-i) * Integer.min(height[i], height[j]), maxarea);
            
            if(height[i] <height[j]){
                int temp= i+1;
                while(temp< j && height[temp] <= height[i]){
                    temp++;
                }
                i= temp;
                
            }else{
                int temp= j-1;
                while(temp < i && height[temp] <= height[j]){
                    temp--;
                }
                j= temp;
            };
        }
        return maxarea;
    }
}

// int i =0 ,j = height.length -1;
//         int max= 0;
//         while (i< j){
//             max= Math.max(max, (j-1) * Math.min(height[i], height[j]));
            
//             if(height[i]< height[j]){
//                 i++;
//             }else{
//                 j--;
//             }
//         }
//         return max;
//     }
        
// }
