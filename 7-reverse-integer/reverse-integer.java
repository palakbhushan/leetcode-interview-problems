class Solution {
    public int reverse(int x) {

        long ans = 0;
        
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        
        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
        
    }
}

// 123

// 3
// ans = 0*10 + 3 = 3
// x = 12

// 2
// ans - 3*10 + 2 = 32
// x= 1

// rem = 1
// ans = 32*10 + 1 = 321
// x = 0
