// 075. Array insert at index -> 01 Nov 2025

import java.util.*;

class Solution {
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        arr.add(index, val);
    }
}

// 076. Who has the majority? -> 02 Nov 2025

class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                num1++;
            }
            
            else if(arr.get(i) == y){
                num2++;
            }
        }
        
        if(num1 == num2){
            if(x < y){
                return x;
            }
            else{
                return y;
            }
        }
        
        else if(num1 > num2){
            return x;
        }
        else{
            return y;
        }
    }
}
