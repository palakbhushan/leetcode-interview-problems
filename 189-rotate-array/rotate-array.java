class Solution {
    public void rotate(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        k = k % n;

        int[] arr = new int[n];


        // for (int i = 0; i < n; i++) {
        //     map.put((i + k) % n, nums[i]);
        // }

        // for (int i = 0; i < n; i++) {
        //     nums[i] = map.get(i);
        // }

        for (int i = 0; i < n; i++) {
            arr[(i+k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }

        
    }
}