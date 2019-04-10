/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 *
 * https://leetcode-cn.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (32.22%)
 * Total Accepted:    108.3K
 * Total Submissions: 336.1K
 * Testcase Example:  '123'
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123 
 * 输出: 321
 * 
 * 
 * 
 * 示例 2:
 * 
 * 输入: -123
 * 输出: -321
 * 
 * 
 * 示例 3:
 * 
 * 输入: 120
 * 输出: 21
 * 
 * 
 * 注意:
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * 
 */
class Solution {
    /**
     * 
     * @param x
     * @return
     */
    public int reverse(int x) {
        try {
            boolean gt = x > 0;
            String str = gt ? Integer.toString(x) : Integer.toString(x).substring(1);
            String reverseStr = new StringBuffer(str).reverse().toString();
            return gt ? Integer.parseInt(reverseStr) : Integer.parseInt("-" + reverseStr);
        } catch (Exception e) {
            return 0;
        }
    }
}
