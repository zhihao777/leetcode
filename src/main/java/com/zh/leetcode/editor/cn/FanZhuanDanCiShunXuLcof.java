//输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，
//则输出"student. a am I"。 
//
// 
//
// 示例 1： 
//
// 输入: "the sky is blue"
//输出: "blue is sky the"
// 
//
// 示例 2： 
//
// 输入: "  hello world!  "
//输出: "world! hello"
//解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
// 
//
// 示例 3： 
//
// 输入: "a good   example"
//输出: "example good a"
//解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
// 
//
// 
//
// 说明： 
//
// 
// 无空格字符构成一个单词。 
// 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。 
// 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。 
// 
//
// 注意：本题与主站 151 题相同：https://leetcode-cn.com/problems/reverse-words-in-a-string/ 
//
//
// 注意：此题对比原题有改动 
// Related Topics 字符串 
// 👍 101 👎 0

  
package com.zh.leetcode.editor.cn;
public class FanZhuanDanCiShunXuLcof{
  public static void main(String[] args) {
       Solution solution = new FanZhuanDanCiShunXuLcof().new Solution();
      String uuhu = solution.reverseWords("the sky is blue");
      System.out.println(uuhu);
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {

        int i = s.length()-1;
        int j = s.length()-1;
        StringBuilder stringBuilder = new StringBuilder();
        s.trim();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            stringBuilder.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }

        return stringBuilder.toString().trim();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}