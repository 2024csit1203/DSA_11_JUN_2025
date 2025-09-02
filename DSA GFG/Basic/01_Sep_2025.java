//  Factorial

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

//  Sum of Natural Numbers

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

// Sum of first n terms

class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum  = n * (n + 1) / 2;
        return sum * sum;
    }
}
