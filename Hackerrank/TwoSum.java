//https://leetcode.com/submissions/detail/386784656/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums== null || nums.length ==0 ) return null;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int c= target-nums[i];
            if(map.containsKey(c)) return new int[] {i, map.get(c)};
            map.put(nums[i],i);
        }
        return null;
    }
}
