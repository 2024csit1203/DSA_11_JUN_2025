// 001. Two Sum -> 11 Oct 2025
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;

                    break;
                }
            }
        }

        return ans;
    }
}
// 35. Search Insert Position -> 12 Oct 2025

class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                ans = i;
                break;
            }

        }
        
        if(ans == -1){
            ans = nums.length;
        }

        return ans;

    }
}
