//  Largest Element in Array -> 15 Aug 2025

class Solution {
    public static int largest(int[] arr) {
        // code here
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        
        return ans;
    }
}
