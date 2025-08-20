class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0, temp = num;
        num--;
        while(num !=0){
            if(temp % num == 0){
                sum+=num;
            }
            num--;
        }

        return sum==temp;
    }
}