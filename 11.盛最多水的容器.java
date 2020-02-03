/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int idx1 = 0, idx2 = height.length - 1;
        int ans = 0;
        while(idx1 < idx2) {
            ans = Math.max(ans, (idx2 - idx1) * Math.min(height[idx1], height[idx2]));
            if (height[idx1] < height[idx2]) {
                idx1++;
            } else {
                idx2--;
            }
        }
        return ans;
    }
}
// @lc code=end

