// 001. Missing in Array -> 01 Jan 2026

class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int ans = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                ans = i+1;
                break;
            }
        }
        
        if(ans == -1){
            ans = arr.length+1;
        }
        
        return ans;
    }
}

// 002. Second Largest -> 01 Jan 2026

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int ans = -1;
        
        int max = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                max = arr[i];
            }
            
            else if(arr[i] > max){
                ans = max;
                max = arr[i];
            }
            
            else if(arr[i] > ans && arr[i] < max){
                ans = arr[i];
            }
        }
        
        return ans;
    }
}

// 003. Array Leaders -> 01 Jan 2026

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = arr.length;
        int max = -1;
        
        for(int i = n-1; i >= 0; i--){
            if(arr[i] >= max){
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}
