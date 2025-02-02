class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> track = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n; i++){
            int rem = target - nums[i];
            if(track.containsKey(rem)){
                return new int[] {i,track.get(rem)};
            }

            track.put(nums[i],i);
        }

        return new int[]{};
    }
}