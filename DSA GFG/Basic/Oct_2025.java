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
