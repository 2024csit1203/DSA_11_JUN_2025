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

// 066. Plus One -> 13 Oct 2025

public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;  // set to 0 and carry 1
        }

        // If all digits were 9 (e.g. 999 → 1000)
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}

// 136. Single Number -> 14 Oct 2025

class Solution {
    public int singleNumber(int[] nums) {
       Arrays.sort(nums);

    for (int i = 0; i < nums.length - 1; i += 2) {
        if (nums[i] != nums[i + 1]) {
            return nums[i];
        }
    }
    return nums[nums.length - 1]; 
    }
}
