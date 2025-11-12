class Solution {

    public int wayToClimbSteps(int n){
        // if(n==1) return 1;
        if(n==0 || n==1) return 1;

        return this.wayToClimbSteps(n-1) + this.wayToClimbSteps(n-2);
    }

    // public int climbStairs(int n) {
    //     int ways = 0;

    //     return this.wayToClimbSteps(n);
    // }

    public int climbStairs(int n) {
        int prevOne = 1;
        int prevTwo = 2;

        if(n <= 2){
            return n;
        }

        for(int i=3; i<=n; i++){
            int current = prevOne + prevTwo;
            prevOne = prevTwo;
            prevTwo = current;
        }

        return prevTwo;
    }
}
// 4 
// 1+1+1+1
// 2+1+1
// 1+2+1
// 1+1+2
// 2+2
