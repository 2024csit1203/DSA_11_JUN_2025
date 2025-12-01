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
