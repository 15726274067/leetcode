import java.math.BigInteger;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 *
 * https://leetcode-cn.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (38.23%)
 * Total Accepted:    46.3K
 * Total Submissions: 121.2K
 * Testcase Example:  '[1,2,3]'
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 
 * 
 * 示例 2:
 * 
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * 
 * [9]
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int idx = len -1;
        digits[idx] += 1;
        while (digits[idx] > 9) {
            digits[idx --] -= 10;
            if (idx == -1){
                // 数组首位插入 1
                int[] ret = new int[len + 1];
                ret[0] = 1;
                for (int i = 1; i < len + 1; i++) {
                    ret[i] = digits[i - 1];
                }
                return ret;
            }
            digits[idx] += 1;
        }
        return digits;
    }
}

