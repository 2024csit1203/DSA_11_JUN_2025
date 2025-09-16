// 001. Power Of Numbers -> 16 Sep 2025

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        
        if (n == 1) return 1;

        if (n < 10) {
            int ans = 1;
            for (int i = 0; i < n; i++) {
                ans *= n;
            }
            return ans;  // n^n
        }

        return n;
        
    }
}
