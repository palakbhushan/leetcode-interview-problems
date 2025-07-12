class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int lb = 0 , ub = n-1;

        if(n == 0){
            return new int[] {-1, -1};
        } else if(n == 1){
            if(nums[0] == target){
                return new int[] {0, 0};
            }
        }


        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= target){
                lb = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = n-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] <= target){
                ub = mid;
                low = mid  + 1;
            } else {
                high = mid - 1;
            }
        }

        if(nums[lb] != target){
            lb = -1;
        }

        if(nums[ub] != target){
            ub = -1;
        }

        return new int[] {lb, ub};

    }
}