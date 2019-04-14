/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 *
 * https://leetcode-cn.com/problems/length-of-last-word/description/
 *
 * algorithms
 * Easy (29.42%)
 * Total Accepted:    23.3K
 * Total Submissions: 79.3K
 * Testcase Example:  '"Hello World"'
 *
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 
 * 如果不存在最后一个单词，请返回 0 。
 * 
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 
 * 示例:
 * 
 * 输入: "Hello World" 
 * 输出: 5
 * 
 * 
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int lastIndex = s.lastIndexOf(" ");
        int len = s.length();
        if (len == 0) return 0;
        if (lastIndex < 0) return len;
        if (lastIndex == len -1 ){
            return lengthOfLastWord(s.substring(0, len - 1));
        }
        return len - lastIndex - 1;
    }
}

