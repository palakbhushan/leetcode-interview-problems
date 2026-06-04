class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;
        double totalSum = 0;

        int left = 0, right = 0;

        for(int i=0; i<k; i++){
            totalSum+=nums[i];
        }
        
        maxAvg = totalSum/k;

        for(int i = k; i< nums.length; i++){
            totalSum+=nums[i] - nums[ i - k ];
            maxAvg = Math.max(maxAvg,(totalSum /k));
        }

        return maxAvg;
    }
}