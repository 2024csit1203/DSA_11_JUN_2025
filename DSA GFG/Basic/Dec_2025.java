// 126. Find sum of even factors of a number -> 01 Dec 2025

class Solution {
    static int evenFactors(int N) {
        int sum = 0;
        
        for(int i = 2; i <= N; i++){
            if(N % i == 0){
                sum += i;
            }
            i++;
        }
        
        return sum;
    }
}

// 127. Parity of unsigned integer -> 02 Dec 2025

class Solution {
    static String computeParity(int N) {
        // code here
        String str = Integer.toBinaryString(N);
        
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        
        if(count % 2 == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }
}

// 128. Check if divisible by 5 -> 04 Dec 2025

class Solution {
    static int divisibleBy5(String N) {
        // code here
        char lastDigit = N.charAt(N.length() - 1);

    // Check if the last digit is 0 or 5
    if (lastDigit == '0' || lastDigit == '5') {
        return 1;
    }
    
    return 0;
    }
}

// 129. Disarium Number -> 05 Dec 2025

class Solution {
    static int isDisarium(int N) {
        int numDigits = String.valueOf(N).length();

        int sum = 0;
        int temp = N;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            numDigits--;
            temp /= 10;
        }

        
        if (sum == N) {
            return 1;
        } else {
            return 0;
        }
    }
};

// 131. Common Divisors -> 05 Dec 2025

class Solution {
    static long commDiv(long a, long b) {
        // code here
        int count = 0;
        long num = 1;
        
        while(num <= a){
            if(a % num == 0 && b % num == 0){
                count++;
            }
            num++;
        }
        
        return count;
    }
}

// 132. Sum of divisors -> 05 Dec 2025

class Solution {
    static long divSum(long n) {
        // code here
        long num = 1;
        long ans = 0;
        
        while(num <= n / 2){
            if(n % num == 0){
                ans += num;
            }
            
            num++;
        }
        
        return ans;
    }
}

// 135. Count numbers divisible by M -> 05 Dec 2025

class Solution {
    static int countDivisibles(int A, int B, int M) {
        // code here
        int num = M;
        int count = 0;
        while(num <= B){
            if(num>=A && num<=B){
                count++;
            }
            num = num + M;
        }
        return count;
    }
}

// 136. Krishnamurthy number ->  05 Dec 2025

class Solution {
    static String isKrishnamurthy(int N) {
        int ans = 0;
        int M = N;
        
        while(N > 0){
            int num = N % 10;
            int num2 = 1;
            
            for(int i = 1; i <= num; i++){
                num2 = num2 * i;   // FIXED factorial calculation
            }
            
            ans += num2;
            N = N / 10;
        }
        
        return ans == M ? "YES" : "NO";
    }
};

// 137. Sum of Digits Divisibility -> 08 Dec 2025

class Solution {
    int isDivisible(int N) {
        // code here
        int M = N;
        int sum = 0;
        
        
        while(M > 0){
            sum += M % 10;
            M = M / 10;
        }
        
        if(N % sum == 0){
            return 1;
        }
        
        return 0;
    }
};

// 138. 12 hour clock addition -> 08 Dec 2025

class Solution {
    static int clockSum(int num1, int num2) {
        // code here
        int sum = num1 + num2;
        
        int ans = sum % 12;
        
        return ans;
    }
}

// 139. Celsius to Fahrenheit Conversion -> 08 Dec 2025

class Solution {
    static double celciusToFahrenheit(int C) {
        // code here
        double F =((double)(9 * C)/5) + 32;
        
        return F;
    }
}

// 140. Check perfect square -> 08 Dec 2025

class Solution {
    static long isPerfectSquare(long n) {
        // code here
        int square = (int) Math.sqrt(n);
        
        if(square * square == n){
            return 1;
        }
        
        return 0;
    }
}

// 141. Strong Numbers -> 08 Dec 2025

class Solution {
    public int is_StrongNumber(int n) {
        int ans = 0;
        int M = n;
        while(M > 0){
            
            int x = M % 10;
            
           ans = ans + factorial(x);
            
            M = M / 10;
        }
        
        if(ans == n){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    
    public static int factorial(int x){
        int sum = 1;
        for(int i = 1; i <= x; i++){
            sum = sum * i;
        }
        return sum;
    
    }
}

// 142. Message Spreading -> 08 Dec 2025

class Solution {
    static int minimumMessages(int N) {
        // code here
         if(N == 1){
            
            return 0;
        }
        
        if(N == 2){
            return 2;
        }
        
        
        return N * 2 - 2;
    }
}

// 145. Mind Game -> 10 Dec 2025

class Solution {
    static int mindGame(int K) {
        int ChosenNum = 5;
        int ans = (((ChosenNum * 2) + K)/2)-ChosenNum;
        return ans;
    }
};

// 146. Perfect Squares in a Range -> 13 Dec 2025

class Solution {
    static int numOfPerfectSquares(int a, int b) {
    int start = (int) Math.ceil(Math.sqrt(a)); 
    int end = (int) Math.floor(Math.sqrt(b));
    if (start > end) {
        return 0;
    }
    return (end - start + 1);
    }
};

// 147. Doctors Clinic -> 13 Dec 2025

class Solution {
    static int waitingTime(int N, int X) {
        
        int Y = 10;
    
        int total_time = Y * (N - 1);
        
        int take_time = X * (N - 1);
        
        if(total_time > take_time){
            return total_time - take_time;
        }
        
        return 0;
    }
}

