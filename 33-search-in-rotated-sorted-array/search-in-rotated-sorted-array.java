class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while(low <= high){

            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;

            if(nums[low] <= nums[mid]){ // checking left side is sorted or not
                if(nums[low] <= target && target <= nums[mid]){ 
                    //checking target is lying in this part or not
                    high = mid -1;

                } else {
                    low = mid + 1;
                }

            } else {
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                } else {
                    high = mid -1;
                }

            }
        }

        return -1;
    }
}