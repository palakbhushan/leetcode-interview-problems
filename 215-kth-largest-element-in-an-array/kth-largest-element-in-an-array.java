class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        
        for(int i=0;i<nums.length;i++){
            maxHeap.add(nums[i]);
        }

        int ans = 0;
        while(k !=0){
            ans = maxHeap.poll();
            k--;
        }

        return ans;
    }
}