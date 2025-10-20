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

// 217. Contains Duplicate -> 15 Oct 2025

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
    }
}

// 268. Missing Number -> 16 Oct 2025

class Solution {
    public int missingNumber(int[] nums) {
        int ans = -1;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }

        ans = nums.length;

        return ans;
    }
}

// 283. Move Zeroes -> 17 Oct 2025

class Solution {
    public void moveZeroes(int[] nums) {
         int index = 0; // position to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        while (index < nums.length) {
            nums[index++] = 0;
    }
}
}

// 414. Third Maximum Number -> 19 Oct 2025

class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
        int distinctCount = 1; // start with 1st distinct number

        // Traverse from right (largest) to left (smallest)
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                distinctCount++;
                if (distinctCount == 3) {
                    return nums[i - 1]; // third distinct max found
                }
            }
        }

        // If less than 3 distinct numbers, return the largest
        return nums[nums.length - 1];
    }
}

// 448. Find All Numbers Disappeared in an Array -> 20 Oct 2025

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        // Check for missing numbers from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}
