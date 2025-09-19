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

// 002. Add Binary Strings -> 19 Sep 2025

import java.math.BigInteger;
class Solution {
    public String addBinary(String s1, String s2) {
        // Convert binary strings to BigInteger
        BigInteger num1 = new BigInteger(s1, 2);
        BigInteger num2 = new BigInteger(s2, 2);

        // Add them
        BigInteger sum = num1.add(num2);

        // Convert back to binary string
        return sum.toString(2);
        
    }
}
