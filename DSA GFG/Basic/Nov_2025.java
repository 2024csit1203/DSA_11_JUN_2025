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

// 088. Segregate Even and Odd numbers -> 10 Nov 2025

class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        //ArayList<Integer> list = new ArrayList<>();
        
        ArrayList<Integer> even = new ArrayList<>();
        
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        
        int index = 0;
        
        for(int j = 0; j < even.size(); j++){
            arr[index] = even.get(j);
            index++;
        }
        
        for(int k = 0; k < odd.size(); k++){
            arr[index] = odd.get(k);
            index++;
        }
    }
}

// 089. Reverse sub array -> 10 Nov 2025

class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) {
        // Convert l, r to 0-based indices (if they are 1-based)
    l--; 
    r--;

    // Reverse the subarray in-place
    while (l < r) {
        int temp = arr.get(l);
        arr.set(l, arr.get(r));
        arr.set(r, temp);
        l++;
        r--;
    }

    return arr;
    }
}

// 090. Type of array -> 11 Nov 2025

class Solution {
    int maxNtype(int arr[]) {
         // code here
        int ascendingCount = 0;
    int descendingCount = 0;
    

    // Count ascending and descending transitions
    for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] < arr[i]) {
            ascendingCount++;
           
            
        } else if (arr[i - 1] > arr[i]) {
            descendingCount++;
            
        }
    }

    // Check for strictly ascending
    if (ascendingCount == arr.length - 1) {
        return 1; // Strictly ascending
    }
    // Check for strictly descending
    else if (descendingCount == arr.length - 1) {
        return 2; // Strictly descending
    }
    // Mixed sequence starting with ascending if first transition is upward
    else if (ascendingCount > descendingCount) {
        return 4;
    }
    // Mixed sequence starting with descending if first transition is downward
    return 3;
        
    }
}

// 091. Positive and negative elements -> 12 Nov 2025

// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) >= 0){
                pos.add(arr.get(i));
            }
            else{
                neg.add(arr.get(i));
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = arr.size();
        int posindex = 0;
        int negindex = 0;
        
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                ans.add(pos.get(posindex));
                posindex++;
            }
            else{
                ans.add(neg.get(negindex));
                negindex++;
            }
        }
        
        return ans;
        
    }
}

// 092. Java 1-d and 2-d Array -> 13 Nov 2025

class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        int sum = 0;
        int num = 0;
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i == j){
                    sum += a[i][j];
                }
            }
        }
        
        for(int i = 0; i < b.length; i++){
            if(num < b[i]){
                num = b[i];
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(sum);
        ans.add(num);
        
        return ans;
        
    }
}

// 093. Absolute Difference of 1 -> 14 Nov 2025

class Solution {
    public ArrayList<Integer> getDigitDiff1AndLessK(int[] arr, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            
            if (num < k) {
                // Check adjacent digit differences
                int temp = num;
                boolean valid = true;
                
                while (temp >= 10) {
                    int d1 = temp % 10;       // last digit
                    int d2 = (temp / 10) % 10; // next digit
                    
                    if (Math.abs(d1 - d2) != 1) {
                        valid = false;
                        break;
                    }
                    temp /= 10;   // move left
                }
                
                if (valid && num >= 10) {
                    list.add(num);
                }
            }
        }
        
        return list;
        
    }
}

// 094. Make a Distinct Digit Array -> 15 Nov 2025

class Solution {
    public int[] common_digits(int[] nums) {
         ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            while (num > 0) {
                int digit = num % 10;

                // contains() spelling fix
                if (!list.contains(digit)) {
                    list.add(digit);
                }

                num = num / 10;
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        Arrays.sort(arr);

        return arr;
        
    }
}

// 095. The problem of identical arrays -> 16 Nov 2025

class Solution {
    public boolean isIdentical(List<Integer> a, List<Integer> b) {
        // Your code goes here.
        Collections.sort(a);
        
        Collections.sort(b);
        
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) != b.get(i)){
                return false;
            }
        }
        
        return true;
    }
}

// 096. Last duplicate element in a sorted array -> 17 Nov 2025

class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        Arrays.sort(arr);
        int ans[] = {-1, -1};
        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i] == arr[i-1]){
                ans[0] = i;
                ans[1] = arr[i];
                break;
            }
        }
        
        return ans;
    }
}

// 097. Sum Array Puzzle -> 18 Nov 2025

class Solution {
    public void sumArray(List<Integer> arr) {
        int totalSum = 0;

    // Step 1: Calculate total sum
    for (int x : arr) {
        totalSum += x;
    }

    // Step 2: Replace each element with sum of others
    for (int i = 0; i < arr.size(); i++) {
        arr.set(i, totalSum - arr.get(i));
       }
    }
}
