//  Largest Element in Array -> 15 Aug 2025 -> 001

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

// Searching in an Array -> 002

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

// Array Search -> 003

class Solution {
    public int search(int arr[], int x) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        
        return -1;
    }
}

// Rotate Array by One -> 004

class Solution {
    public void rotate(int[] arr) {
       int n = arr.length;
        if (n <= 1) return; // No rotation needed for empty or 1-element array

        int last = arr[n - 1]; // Store last element

        // Shift elements right by 1 position
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // Put last element at first position
    }
}

// Value equal to index value -> 005

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        ArrayList<Integer> Newlist = new ArrayList<>();
        
        for(int i = 1; i <= nums.size(); i++){
            if(i == nums.get(i-1)){
                Newlist.add(i);
            }
        }
        
        return Newlist;
    }
}
