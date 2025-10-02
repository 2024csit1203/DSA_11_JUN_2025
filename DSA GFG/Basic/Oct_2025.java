// Sum of Array -> 01 Oct 2025
class Solution {
    int arraySum(int arr[]) {
        // code here
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        return sum;
        
    }
}

// Count of smaller elements -> 02 Oct 2025

class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int count = 0;
        
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) <= x){
                count++;
            }
        }
        
        return count;
    }
}
