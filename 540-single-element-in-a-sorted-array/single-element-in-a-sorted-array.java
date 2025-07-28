class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;


        while(low<high){

            int mid = low + (high - low)/2;

            if(mid % 2 == 1){
                mid --;
            }

            if(nums[mid] == nums[mid+1]){
                low = mid + 2;
            } else {
                high = mid;
            }

        }

        return nums[low];
    }
}

// [1,1,2,3,3,4,4,8,8]

// low = 0
// high = n-1 = 8

// mid = (0+8)/2 == 4

// arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1] // arr[mid] is a single element in an array

// if(arr[mid] != arr[mid -1]){
//     high = mid - 1;
// } else {
//     high = mid + 1;
// }

// [1,1,2,3,3,4,4,8,8]
// [0,1,2,3,4,5,6,7,8]


