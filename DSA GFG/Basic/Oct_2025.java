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

// Count Odd and Even -> 03 Oct 2025

class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int odd = 0;
    int even = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    }

    int ans[] = new int[] {odd, even};
    return ans;
    }
}

// Find element at a given Index -> 04 Oct 2025

class Solution {
    public static int findElementAtIndex(int key, int[] arr) {
        // code here
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(i == key){
                 ans =  arr[key];
                 break;
            }
        }
        
        return ans;
    }
}

// Smaller and Larger -> 05 Oct 2025

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int x = target;
        int count = 0;
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < x){
                count++;
            }
            else if (arr[i] == x){
                count++;
                ans++;
            }
            else{
                ans++;
            }
        }
        
        
        
        int Arr1[] = {count, ans};
        
        return Arr1;
    }
}


// Array Searching -> 06 Oct 2025

class Solution {

    static int search(int arr[], int x) {

        // Your code here
        int ans = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        
        return ans;
        
    }
}

// Maximum Element in Array -> 07 Oct 2025

class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1];
        
    }
}

// Sum of alternate product -> 08 Oct 2025

class Solution {
    public int altProduct(int[] arr) {
        Arrays.sort(arr);
        
        int start = 0;
        
        int end = arr.length-1;
        
        int ans = 0;
        
        while(start < end){
            
            ans += arr[start] * arr[end];
            
            start++;
            
            end--;
        }
        
        return ans;
    }
}

// Rearranging array -> 09 Oct 2025

class Solution {
    public static ArrayList<Integer> Rearrange(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        
        int startindex = 0;
        int endindex = arr.length - 1;
        
        while(startindex < endindex){
            list.add(arr[startindex]);
            list.add(arr[endindex]);
            startindex++;
            endindex--;
        }
        
        if(startindex == endindex){
            list.add(arr[startindex]);
        }
        
        return list;
    }
}

// Merge and Sort -> 10 Oct 2025

class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
         ArrayList<Integer> list = new ArrayList<>();
    
    // Add elements from the first array
    for (int i = 0; i < arr1.length; i++) {
        if (!list.contains(arr1[i])) {
            list.add(arr1[i]);
        }
    }
    
    // Add elements from the second array
    for (int j = 0; j < arr2.length; j++) {
        if (!list.contains(arr2[j])) {  // Corrected from brr[i] to brr[j]
            list.add(arr2[j]);
        }
    }
    
    // Sort the ArrayList
    Collections.sort(list);
    
    return list;
        
    }
}
