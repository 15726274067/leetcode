import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        int left = 0, len = nums.length, right = len -1;
        int[] ret = new int[2];

        while (left <= right) {
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                start = mid;
                end = mid;
                while (end + 1 < len && nums[end + 1] == target) {
                    end++;
                }
                while (start - 1 >= 0 && nums[start -1] == target) {
                    start--;
                }
                ret[0] = start;
                ret[1] = end;
                return ret;
            } else if (nums[mid] < target) {
                left = mid +1;
            } else {
                right = mid -1;
            }
        }
        ret[0] = start;
        ret[1] = end;
        return ret;
    }
}
// @lc code=end

