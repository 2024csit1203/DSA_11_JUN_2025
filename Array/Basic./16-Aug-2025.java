// Alternates in an Array -> 006

class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i += 2){
            list.add(arr[i]);
        }
        
        return list;
    }
}

// Sum of Array -> 007

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

// Count of smaller elements -> 008

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

// Count Odd and Even -> 009

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

// Print Elements of Array -> 010

class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        //   code here
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

