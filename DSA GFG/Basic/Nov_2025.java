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

// 077. Print Elements of Array -> 03 Nov 2025

class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        //   code here
         for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// 078. Display longest name -> 04 Nov 2025

class Solution {
    public String longest(List<String> arr) {
        // code here
        String ans = "";

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > ans.length()) {
                ans = arr.get(i);
            }
        }
        return ans;
    }
}

// 079. Swap kth elements -> 06 Nov 2025

class Solution {
    public void swapKth(List<Integer> arr, int k) {
        int n = arr.size();
        
        // swap kth element from start and end
        int temp = arr.get(k - 1);
        arr.set(k - 1, arr.get(n - k));
        arr.set(n - k, temp);
    }
}

// 080. Quick Left Rotation -> 07 Nov 2025

class Solution {
    void leftRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // handle if k > n
        
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse remaining n-k elements
        reverse(arr, k, n - 1);
        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }
    
    void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// 081. Game with nos -> 08 Nov 2025

class Complete {

    // Function for finding maximum and value pair
    public static int[] game_with_number(int arr[], int n) {
        // Complete the function
        int result[] = new int[arr.length];
        
        for(int i = 0; i < arr.length-1; i++){
            result[i] = arr[i] ^ arr[i+1];
        }
        
        result[arr.length -1] = arr[arr.length -1];
        
        return result;
    }
}

// 082. Triplet Family -> 09 Nov 2025

class Solution {
    public boolean findTriplet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            set.add(num);
        }
        
        int n = arr.length;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i+1; j < n; j++){
                int sum = arr[i] + arr[j];
                
                if(set.contains(sum)){
                    return true;
                }
            }
        }
        return false;
    }
}

// 083. Alternative Sorting -> 10 Nov 2025

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = arr.length -1;
        
        while(start < end){
            list.add(arr[end]);
            list.add(arr[start]);
            
            end--;
            start++;
        }
        
        if(start == end){
            list.add(arr[start]);
        }
        
         return list;
        
    }
}

// 084. Fighting the darkness -> 10 Nov 2025

class Solution {
    long maxDays(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        return arr[arr.length-1];
        
    }
}

// 087. Remove Duplicates from unsorted array -> 10 Nov 2025

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
         // Using LinkedHashSet to preserve insertion order
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num); // Duplicate values automatically ignored
        }

        return new ArrayList<>(set);
    }
}

