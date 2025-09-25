class Solution {
    public void moveZeroes(int[] num) {
        int idx = 0;
        
        for(int i =0;i<num.length;i++){
            if(num[i] != 0){
               int temp = num[i];
                num[i] = num[idx];
                num[idx] = temp;
                idx++;
            }
                
        }
    }
}

