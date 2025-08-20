class Solution {
    public int countDigits(int num) {

        int count = 0, backup = num;

        while(num !=0){
            int temp = num %10;
            if(backup % temp == 0 ) count ++;
            num/=10;
        }

        return count;
        
    }
}