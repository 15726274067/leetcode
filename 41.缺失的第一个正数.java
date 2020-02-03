import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        int[] arr = Arrays.copyOf(nums, len);
        for (int i = 0;i < len;i++) {
            if (nums[i] > 0 && nums[i] <= len && nums[i] != i+1) {
                int tmp = nums[i];
                arr[tmp-1] = tmp;
            }
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] != i+1) {
                return i+1;
            }
        }
        return len+1;
    }
}
// @lc code=end

