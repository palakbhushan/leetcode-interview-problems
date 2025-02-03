class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> track = new HashMap<>();
        int[] ans = new int[k];
        for(int i=0; i<nums.length; i++){
            track.putIfAbsent(nums[i], 0);
            track.put(nums[i], track.get(nums[i])+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> track.get(a) - track.get(b)
            );

        for(int n:track.keySet()){
            heap.add(n);
            if(heap.size() > k) {
                heap.poll();
            }
        }

        for(int i=0;i<k;i++){
            ans[i] = heap.poll();
        }
        
        return ans;
    }
}