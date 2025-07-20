class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                //single element idhar exists krta hai
                low = mid + 2;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}