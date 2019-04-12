/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 *
 * https://leetcode-cn.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (43.22%)
 * Total Accepted:    39.4K
 * Total Submissions: 91.2K
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 
 * 你可以假设数组中无重复元素。
 * 
 * 示例 1:
 * 
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 
 * 
 * 示例 2:
 * 
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 
 * 
 * 示例 3:
 * 
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 
 * 
 * 示例 4:
 * 
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * 
 * 
 * [1 ,2, 3, 5, 8] 6
 * round    i   j   mid
 * 1        0   4   2
 * 2        3   4   3
 * 3        4   4   4
 * 
 * [5] 6 -> 1
 * 
 * [5] 2 -> 0
 * 
 * [1 , 3, 5, 6] 5
 * r    i   j   mid
 * 0    0   3   1
 * 1    2   3   2
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0; 
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j-i)/2;
            if (nums[mid] > target){
                j = mid - 1;
            } else if (nums[mid] < target){
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return i;
    }
}

