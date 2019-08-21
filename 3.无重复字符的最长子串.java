/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 * "qwasda1234s5678qa"
 * qwasd->sda1234->da1234s5678q->1234s5678qa
 * 遍历,遇到重复的char,将重复位及其前面的清零,与当前最大长度比较
 * abcabcbb abc->bca->cab->abc->bc->
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        String curStr = "";
         for (int i = 0; i < s.length(); i++) {
             // 判断当前串中是否存在s[i]
             char curChar = s.charAt(i);
             if (curStr.indexOf(curChar) > -1){
                if (curStr.length() > count) {
                    count = curStr.length();
                }
                // 存在
                int repeatIdx = curStr.indexOf(curChar);
                if (repeatIdx != curStr.length()) {
                    curStr = curStr.substring(repeatIdx + 1).concat(Character.toString(curChar));
                } else {
                    curStr = Character.toString(curChar);
                }
            } else {
                // 不存在,将当前curChar放到curStr的最后面
                curStr = curStr.concat(Character.toString(curChar));
                // 处理遍历到最后一位
                if (i == s.length()-1) {
                    if (curStr.length() > count) {
                        count = curStr.length();
                    }
                }
             }
         }
        return count;
    }
}

