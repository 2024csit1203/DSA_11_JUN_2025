// 001. Missing And Repeating -> 16 Sep 2025

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        
        long sumN = (long) n * (n + 1) / 2;
        long sumNSq = (long) n * (n + 1) * (2L * n + 1) / 6;

        long sum = 0, sumSq = 0;
        for (int num : arr) {
            sum += num;
            sumSq += (long) num * num;
        }

        long diff = sum - sumN;       // (repeating - missing)
        long diffSq = sumSq - sumNSq; // (repeating^2 - missing^2)

        long sumRM = diffSq / diff;   // (repeating + missing)

        long repeating = (diff + sumRM) / 2;
        long missing = repeating - diff;

        
        result.add((int) repeating);
        result.add((int) missing);
        return result;
        
        
    }
}

// 002. Prime Number -> 16 Sep 2025

class Solution {
    static boolean isPrime(int n) {
        // code here
        int mid = n/2;
        
        if(n == 1){
            return false;
        }
        
        if(n == 2){
            return true;
        }
        
        for(int i = 2; i <= mid; i++){
            if(n % i == 0){
                return false;
            }
        }
        
        return true;
    }
}

// 003. Nth Fibonacci Number -> 17 Sep 2025

class Solution {
    public int nthFibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        int arr[] = new int[n + 1];
        arr[0] = 0; // 1st Fibonacci
        arr[1] = 1; // 2nd Fibonacci

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
        
    }
}

// 004. Square Root -> 17 Sep 2025

class Solution {
    int floorSqrt(int n) {
        // use Math.sqrt and floor it
        int ans = (int) Math.floor(Math.sqrt(n));
        return ans;
    }
}

// 005. Armstrong Numbers -> 19 Sep 2025

class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int m = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            n = n/10;
            
            sum = sum + (int) Math.pow(digit, 3);
        }
        
        if(sum == m){
            return true;
        }
        
        return false;
    }
}

// 006. Largest number possible -> 19 Sep 2025

class Solution {
    static String findLargest(int n, int s) {
       // अगर sum possible नहीं है
    if (s > 9 * n || s <= 0 && n > 1) {
        return "-1";
    }

    StringBuilder ans = new StringBuilder();

    for (int i = 0; i < n; i++) {
        int digit = 9;

        while (digit >= 0) {
            if (s - digit >= 0) {
                ans.append(digit);  // digit डाल दो
                s -= digit;         // sum कम कर दो
                break;              // अगले digit पर जाओ
            }
            digit--;
        }
    }

    return ans.toString();
        
    }
}

// 007. Sum of First N Natural Numbers -> 19 Sep 2025

class Solution {
    static int sumOfNaturals(int n) {
        // code here
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        
        return sum;
    }
}

// 008. Form a number divisible by 3 using array digits -> 19 Sep 2025

class Solution {
    static int isPossible(int N, int arr[]) {
        // code here
        
         long sum = 0;

    // Loop through the array to calculate the sum
    for (int i = 0; i < N; i++) {
        sum += arr[i];
    }

    // Return 1 if the sum is divisible by 3, else return 0
    return (sum % 3 == 0) ? 1 : 0;
    }
}

// 009. Missing in Array -> 29 Sep 2025

class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int ans = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                ans = i+1;
                break;
            }
        }
        
        if(ans == -1){
            ans = arr.length+1;
        }
        
        return ans;
    }
}

// 010. Second Largest -> 29 Sep 2025

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int ans = -1;
        
        int max = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                max = arr[i];
            }
            
            if(arr[i] > max){
                ans = max;
                max = arr[i];
            }
            
            else if(arr[i] > ans && arr[i] < max){
                ans = arr[i];
            }
        }
        
        return ans;
    }
}

// 011. Array Leaders -> 29 Sep 2025

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        
        // The rightmost element is always a leader
        list.add(maxFromRight);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }
        
        // Leaders are collected in reverse order, so reverse the list
        Collections.reverse(list);
        
        return list;
    }
}

