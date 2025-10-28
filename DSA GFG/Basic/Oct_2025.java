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

// Check Arithmetic Progression -> 11 Oct 2025

class Solution {
    // Function to check if the given array forms an arithmetic progression
    public boolean checkIsAP(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        
        int d = arr[1] - arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] != d){
                return false;
            }
        }
        
        return true;
    }
}

// Longest Increasing Subarray -> 12 Oct 2025

class Solution {
    public int lenOfLongIncSubArr(List<Integer> arr) {
    if (arr == null || arr.isEmpty()) return 0;

    int ans = 1;
    int num = 1;

    for (int i = 1; i < arr.size(); i++) {
        if (arr.get(i) > arr.get(i - 1)) {
            num++;
        } else {
            ans = Math.max(ans, num);
            num = 1;
        }
    }

    ans = Math.max(ans, num); // In case the longest subarray is at the end
    return ans;
    }
}

// Multiply Array -> 13 Oct 2025

class Solution {

    public static int product(int arr[], int n) {
        int ans = 1;

    for (int i = 0; i < n; i++) {
        ans *= arr[i];   // multiply cumulatively
    }

    return ans;
    }
}

// Count number of elements between two given elements in array -> 14 Oct 2025

class Solution {
    // Function to get the count of elements between num1 and num2 in array arr.
    public int getCount(ArrayList<Integer> arr, int num1, int num2) {
        int start = -1;
    int end = -1;

    // Find the first occurrence of num1
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) == num1) {
            start = i;
            break;
        }
    }

    // If num1 not found, return 0
    if (start == -1) {
        return 0;
    }

    // Find the first occurrence of num2 after num1
    for (int i = start + 1; i < arr.size(); i++) {
        if (arr.get(i) == num2) {
            end = i;
           
        }
    }

    // If num2 not found after num1, return 0
    if (end == -1) {
        return 0;
    }

    // Count elements between num1 and num2
    return end - start - 1;
    }
}

// Sum of distinct elements -> 15 Oct 2025

class Solution {
    int findSum(int arr[]) {
        // code here
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                sum = arr[i];
            }
            else if(arr[i] != arr[i-1]){
                sum += arr[i];
            }
        }
        
        return sum;
    }
}

// Count pair sum -> 16 Oct 2025

class Solution {
    static int countPairs(int arr1[], int arr2[], int x) {
        // code here.
        int count = 0;
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] + arr2[j] == x){
                    count++;
                }
            }
        }     
        return count;
    }
}

// Maximum product of two numbers -> 17 Oct 2025

class Solution {
    public static int maxProduct(int[] arr) {
       if (arr.length < 2)
            return 0; // not enough elements

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            // update largest
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // update smallest
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // best product among both cases
        return Math.max(max1 * max2, min1 * min2);
    }
}

// Max and Min Product from 2 Arrays -> 18 Oct 2025

class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        // code here
        int max = Integer.MIN_VALUE;
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr1.length; i++){
            if(max < arr1[i]){
                max = arr1[i];
            }
        }
        
        for(int j = 0; j < arr2.length; j++){
            if(min > arr2[j]){
                min = arr2[j];
            }
        }
        
        long ans = min * max;
        
        return ans;
    }
}

// Balanced Array -> 19 Oct 2025

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n = arr.size();
        int leftsum = 0;
        
        int rightsum = 0;
        
        for(int i = 0; i < n; i++){
            if(i < n/2){
                leftsum += arr.get(i);
            }
            
            else{
                rightsum += arr.get(i);
            }
        }
        
        int ans = Math.abs(leftsum - rightsum);
        
        return ans;
    }
}

// 064. First 1 in a Sorted Binary Array -> 20 Oct 2025

class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
        long ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}

// 065. Multiply left and right array sum -> 21 Oct 2025

class Solution {
    public int multiply(int[] arr) {
        // code here
         // code here
        int ans = 1;
        int n = arr.length/2;
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 0; i < n; i++){
            num1 += arr[i];
        }
        
        for(int i = n; i < arr.length; i++){
            num2 += arr[i];
        }
        
        ans = num1 * num2;
        
        return ans;
    }
}

// 066. At least two greater elements -> 22 Oct 2025

class Solution {
    public long[] findElements(long arr[]) {
        // If array has less than 3 elements, return empty array
        if (arr.length <= 2) {
            return new long[0];
        }

        long ans[] = new long[arr.length - 2];
        

        // Corrected sorting syntax
        Arrays.sort(arr);
        

        for (int i = 0; i < arr.length-2; i++) {
            
            ans[i] = arr[i];
        }

        return ans;
    }
}

// 067. Ishaan Loves Chocolates -> 23 Oct 2025

class Solution {
    public static int chocolates(int n, int[] arr) {
        // code here
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        
        return ans;
    }
}

// 068. Array insert at end -> 25 Oct 2025

class Solution {
    public void insertAtEnd(ArrayList<Integer> arr, int val) {
        // code here
        
        arr.add(val);
        
    }
}

// 069. Elements in the Range -> 26 Oct 2025

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        HashSet<Integer> set = new HashSet<>();

        // Add all numbers within range [A, B] to set
        for (int i = 0; i < n; i++) {
            if (arr[i] >= A && arr[i] <= B) {
                set.add(arr[i]);
            }
        }

        // Number of elements expected in [A, B] is (B - A + 1)
        int expectedCount = B - A + 1;

        // If set size matches expectedCount → all elements are present
        return set.size() == expectedCount;
    }
}

// 070. Palindrome Array -> 27 Oct 2025

class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        // code here
        int n = arr.length;
        int Arr1[] = new int[n];
        int j = 0;
        for(int i = n-1; i >=0; i--){
            Arr1[j] = arr[i];
            j++;
        }
        String ans = "PERFECT";
        for(int i = 0; i < n; i++){
            if(Arr1[i] != arr[i]){
                ans = "NOTPERFECT";
                break;
            }
        }
        if(ans == "PERFECT"){
            return true;
        }
        else{
            return false;
        }
        
    }
}

// 071. One odd Occuring -> 28 Oct 2025

class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        // code here
        int result = 0;
        
        // XOR all the elements
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        
        return result;
        
    }
}


