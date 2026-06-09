class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer>set = new HashSet<>();
        long maxSum = 0;
        long currSum = 0;
        int left = 0;

        // for(int i=0; i<k; i++){
        //     if(set.contains(nums[i])){
        //         set.remove(nums[i]);
        //         currSum
        //     }
        //     set.add(nums[i]);
        //     currSum+=nums[i];
        // }

        // maxSum = currSum;

        for(int i=0; i<nums.length; i++){

            while(set.contains(nums[i])){
                set.remove(nums[left]);
                currSum-=nums[left];
                left++;
            }

            set.add(nums[i]);
            currSum+=nums[i];

            while( i -left + 1 > k)    {
                set.remove(nums[left]);
                currSum-=nums[left];
                left++;
            }

            if(i -left + 1 == k){
                maxSum = Math.max(maxSum, currSum);
            }
    
        }

        return maxSum;


    }
}