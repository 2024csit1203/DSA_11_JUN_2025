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
