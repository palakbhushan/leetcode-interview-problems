class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 1){
                nums[i] = 0;
                count=0;
            } else{
                arr.add(++count);
            }
            
        }
        count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>count){
                count = arr.get(i);
            }
        }

        return count;
    }
}