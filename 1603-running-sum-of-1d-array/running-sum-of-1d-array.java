class Solution {
    public int[] runningSum(int[] nums) {
        
        int n = nums.length;
        int[] arr = new int[n];

        for(int i=0;i<nums.length;i++){

            if(i==0){
                arr[i] = nums[i];
                continue;
            }

            arr[i]=nums[i] + arr[i-1];


        }

        return arr;
    }
}