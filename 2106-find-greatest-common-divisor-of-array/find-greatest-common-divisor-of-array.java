class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];

        while(min >0 && max >0){
            if(max > min){
                max = max % min;
            } else {
                min = min % max;
            }
        }

        if(min == 0){
            return max;
        }

        return min;
        
    }
}