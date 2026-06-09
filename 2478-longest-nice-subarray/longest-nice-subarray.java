class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLen = 0;
        int current = 0;
        int left = 0;

        for(int i=0; i<nums.length; i++){
            
            while((current & nums[i]) !=0){
                current = current ^ nums[left];
                left++;
            }

            current = current | nums[i];

            maxLen = Math.max(maxLen, i - left + 1);

        }

        return maxLen;
    }
}