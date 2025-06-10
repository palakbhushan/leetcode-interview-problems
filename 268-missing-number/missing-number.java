class Solution {
    public int missingNumber(int[] nums) {
        
        int left = 0;

        for(int i=1;i<nums.length+1;i++){
            left = left -i + nums[i-1];
        }

        // revision note is: adding all elements - index(starting from 1),left abs(negative) value  would be the answer

        return Math.abs(left);
    }
}