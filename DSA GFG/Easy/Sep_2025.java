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

