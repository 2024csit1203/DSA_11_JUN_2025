//  Factorial -> 01 Sep 2025

class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        int fact = 1;
        
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        
        return fact;
    }
}

//  Sum of Natural Numbers -> 01 Sep 2025

class Solution {
    public static int findSum(int n) {
        // code here
        
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        
        return sum;
    }
}

// Sum of first n terms -> 01 Sep 2025

class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum  = n * (n + 1) / 2;
        return sum * sum;
    }
}

// Odd or Even  -> 02 Sep 2025

class Solution {
    static boolean isEven(int n) {
        // code here
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
 
// Count Squares  -> 02 Sep 2025

class Solution {
    static int countSquares(int n) {
        // code here
        
        int count = 0;
        
        int num = 1;
        
        int squre = 1;
        
        while(squre < n){
            count++;
            num++;
            squre = num * num;
        }
        
        return count;
    }
}

// Addition of Two Numbers  -> 02 Sep 2025

class Solution {
    static int addition(int a, int b) {
        // code here
        
        int ans = a + b;
        
        return ans;
    }
}
