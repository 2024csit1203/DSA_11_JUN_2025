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

// Multiplication Table -> 03 Sep 2025

class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= 10; i++){
            list.add(n*i);
        }
        
        return list;
    }
}

// The dice problem  -> 03 Sep 2025

class Solution {
    static int oppositeFaceOfDice(int n) {
        // code here
        int ans = 0;
        if(n == 1){
            ans = 6;
        }
        
        else if(n == 2){
            ans = 5;
        }
        
        else if(n == 3){
            ans = 4;
        }
        
        else if(n == 4){
            ans = 3;
        }
        
        else if ( n == 5){
            ans = 2;
        }
        
        else if (n == 6){
            ans = 1;
        }
        
        return ans;
    }
}

// Greatest of three numbers  -> 03 Sep 2025

class Solution {
    public int greatestOfThree(int a, int b, int c) {
        // code here
        
        if(a >= b && a >= c){
            return a;
        }
        else if(b >= c && b >= a){
            return b;
        }
        
        else{
            return c;
        }
    }
}

// Simple Interest -> 05 Sep 2025

class Solution {
    double simpleInterest(int P, int R, int T) {
        // code here
        double ans = (P * R * T) / 100.0;  // Ensure division happens in double
        return ans;
    }
}

// Sum of AP series -> 05 Sep 2025

class Solution {
    public long sum_of_ap(long n, long a, long d) {
         // Code here
        long ans = (n * (2 * a + (n - 1) * d)) / 2;
        
        return ans;
        
    }
}

// Sum of an AP -> 05 Sep 2025

class Solution {
    public int sum_of_ap(int n, int a, int d) {
        // Code here
        int sum = (n * (2 * a + (n - 1) * d)) / 2;
        return sum;
    }
}

// 016. First n Fibonacci -> 16 Sep 2025

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int arr[] = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                arr[i] = 0;
            }
            else if (i == 1){
                arr[i] = 1;
            }
            
            else{
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        
        return arr;
        
        
        
    }
}


// 017. LCM And GCD -> 16 Sep 2025

class Solution {
    
    // GCD Function
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
        
    public static int[] lcmAndGcd(int a, int b) {
        
        int g = gcd(a, b);
        int l = (a * b) / g;
        return new int[]{l, g};
        
    }
}


