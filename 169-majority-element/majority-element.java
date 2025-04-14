class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int cond = (int)Math.ceil(nums.length / 2.0);
        int maxElem = Integer.MIN_VALUE;
        System.out.println(nums.length / 2);

        for(Map.Entry<Integer, Integer> ent: map.entrySet()){
            System.out.println("Value: " + ent.getValue() + ", Key: " + ent.getKey());
        }

        for(Map.Entry<Integer, Integer> ent: map.entrySet()){
            if (ent.getValue() >= cond && maxElem < ent.getKey()){
                maxElem = ent.getKey();
            }
        }

        return maxElem;

    }
}