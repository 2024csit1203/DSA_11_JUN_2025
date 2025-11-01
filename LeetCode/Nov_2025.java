// 485. Max Consecutive Ones -> 01 Nov 2025

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > ans){
                    ans = count;
                }
            }
            else{
                count = 0;
            }
        }

        return ans;
    }
}
