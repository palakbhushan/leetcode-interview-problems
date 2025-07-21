class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        k = k % n;


        for (int i = 0; i < n; i++) {
            map.put((i + k) % n, nums[i]);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = map.get(i);
        }

        // for(int i=0; i<n; i++){
        //     int indexToUpdate = i + k + 1;
        //     if(indexToUpdate >= n){
        //         indexToUpdate = indexToUpdate - n;
        //     }

        //     map.put(i, nums[i]);
        //     nums[i] = map.get(indexToUpdate) != null ? map.get(indexToUpdate) : nums[indexToUpdate];

            
        // }
    }
}