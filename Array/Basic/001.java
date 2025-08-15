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

// Searching in an Array

class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        int ans = -1;
        
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == k){
                ans = i+1;
                
                break;
            }
        }
        
        return ans;
    }
}
