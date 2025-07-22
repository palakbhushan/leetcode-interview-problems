class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }
        }

        return count<=1;
    }
}

// 1,2,3,4,5

// 1- 2,3,4,5,1
// 2- 3,4,5,1,2

// // new array
// // 0 arr[0] = nums[3] == 1
// // 1 arr[1] = nums[4] == 2
// // 2 arr[2] = nums[5 % 5] = nums[0] = 3
// // 3 arr[3] = nums[6 % 5] = nums[1] = 4
// // 4 arr[4] = nums[7 % 5] = nums[2] = 5


// l,r
// 3,4,5,1,2

// (l>r)count = 0 , 1
// 1 no 3,4
// 2 no 4,5
// 3 yes 5,1
// 4 no 1,2
// 5 no 2,3

// true



// l,r
// 2,1,3,4
// (l>r)count = 0 ,1 ,2
// 1 2,1  yes
// 2 1,3  no
// 3 3,4  no
// 4 4,2. yes


// 1,2,3

// 1,2. no
// 2,3. no
// 3,1  yes