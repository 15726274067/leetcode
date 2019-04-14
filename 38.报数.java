import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 *
 * https://leetcode-cn.com/problems/count-and-say/description/
 *
 * algorithms
 * Easy (48.97%)
 * Total Accepted:    26.8K
 * Total Submissions: 54.6K
 * Testcase Example:  '1'
 *
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * 
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 
 * 注意：整数顺序将表示为一个字符串。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: 1
 * 输出: "1"
 * 
 * 
 * 示例 2:
 * 
 * 输入: 4
 * 输出: "1211"
 * 
 * 1211 -> 111221 -> 312211 -> 13112221 -> 1113213211
 * 
 * 1211     
 * i    curr   cout ret
 * 0    1      1    11
 * 1    2       1   12
 * 2    1       2   21
 */
class Solution {
    public String countAndSay(int n) {
        if (n <= 1) {
            return "1";
        }
        String count = countAndSay(n-1);
        char target = count.charAt(0);
        int countNum = 1;
        StringBuffer result = new StringBuffer();
        for(int i=1; i<count.length(); i++) {
            char temp = count.charAt(i);
            if (target == temp) {
                countNum++;
            } else {
                result.append(countNum).append(target);
                target = temp;
                countNum = 1;
            }
        }
        result.append(countNum).append(target);
        return result.toString();
    }
}

