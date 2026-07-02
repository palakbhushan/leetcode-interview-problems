class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int targetSum = 0;
        int left = 0;

        for(int i=0; i<nums.length; i++){
            targetSum+=nums[i];
            while(targetSum>=target){
                minLen = Math.min(minLen, (i-left+1));
                targetSum-=nums[left];
                left++;
            }

            
        }
        return minLen > nums.length ?0:minLen;
    }
}