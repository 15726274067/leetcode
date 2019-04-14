import java.sql.Array;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 *
 * https://leetcode-cn.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (44.10%)
 * Total Accepted:    49.2K
 * Total Submissions: 111.6K
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 示例:
 * 
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 
 * 
 * 进阶:
 * 
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * 
 */
class Solution {
    // 动态规划
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len ==0) return 0;
        // 定义状态 dp[i]是以nums[i]为结尾的连续子数组的最大和
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = nums[i];
        }

        // 状态转移方程 dp[k] = max(dp[k], dp[k-1] + dp[k])
        // 最大和要么是dp[k](nums[k]), 要么是第k个元素与以第k-1个元素结尾的子序列和的和
        for (int k = 1; k < len; k++) {
            dp[k] = Math.max(dp[k], dp[k-1] + dp[k]);
        }

        Arrays.sort(dp);
        return dp[len-1];
    }
}

