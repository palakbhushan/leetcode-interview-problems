class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int currWinSum = 0;
        int left = 0;

        for(int i=0; i<nums.length; i++){

            currWinSum+=nums[i];

            while(currWinSum >= target){
                minLen = Math.min(minLen,(i-left+1));
                currWinSum-=nums[left];
                left++;
            }

            if(currWinSum == target){
                minLen = Math.min(minLen,(i-left+1));
            }

        }
        return minLen > nums.length ?0:minLen;
    }
}