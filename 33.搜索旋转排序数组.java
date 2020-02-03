/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 * 递增
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;
        while (left <= right) {
            mid = (left + right)/2 ;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] <= nums[mid]) {
                // 左半部分一定有序
                if (nums[left] <= target && nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // 右半部分一定有序
                if (nums[mid] < target && nums[right] >= target) {
                    left = mid +1;
                } else {
                    right = mid -1;
                }
            }       
        }
        return -1;
         
    }
}
// @lc code=end

