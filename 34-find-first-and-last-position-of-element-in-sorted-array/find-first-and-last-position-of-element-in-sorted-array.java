class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        arr[0] = lowerAndUpperBound(nums, target, true);
        arr[1] = lowerAndUpperBound(nums, target, false);

        return arr;

    }

    static int lowerAndUpperBound(int nums[], int target, boolean isLowerBound){
        int low = 0, high = nums.length - 1, ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
    
            if(nums[mid] > target) {
                high = mid -1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                ans = mid;

                if(isLowerBound) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return ans;
    }
}