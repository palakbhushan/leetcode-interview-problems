class Solution {
    public boolean isPalindrome(int x) {

        long ans  = 0;
        int temp = x;

        if(x < 0){
            return false;
        }

        while(x !=0){

            ans = (ans * 10) + (x % 10);
            x = x / 10;
        }

        return ans == temp;
        
    }
}