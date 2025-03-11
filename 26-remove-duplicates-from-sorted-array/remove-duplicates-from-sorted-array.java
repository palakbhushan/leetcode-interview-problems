class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1, left= 0,right=1;

        if(nums.length == 1) return 1;
        for(int i=0;i<nums.length;i++){
            if(nums[left] == nums[right]){
                right++;
            } else {
                nums[left + 1] = nums[right];
                left++;
                right++;
                count++;
            }
            if(right == nums.length) return count;
        }

        return count;
    }
}