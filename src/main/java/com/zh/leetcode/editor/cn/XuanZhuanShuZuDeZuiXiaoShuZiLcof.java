//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2
//] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。 
//
// 示例 1： 
//
// 输入：[3,4,5,1,2]
//输出：1
// 
//
// 示例 2： 
//
// 输入：[2,2,2,0,1]
//输出：0
// 
//
// 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-sor
//ted-array-ii/ 
// Related Topics 二分查找 
// 👍 187 👎 0

  
package com.zh.leetcode.editor.cn;
public class XuanZhuanShuZuDeZuiXiaoShuZiLcof{
  public static void main(String[] args) {
       Solution solution = new XuanZhuanShuZuDeZuiXiaoShuZiLcof().new Solution();
       int[] a = {2,1,2};
       solution.minArray(a);
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minArray(int[] numbers) {
        //使用遍历方法，时间复杂度 0(n)

        //再次使用二分法 logN的时间复杂度
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            int m = (i+j)/2;
            if(numbers[m]<numbers[j]){
                j = m;
            } else if(numbers[m]>numbers[j]){
                i = m+1;
            }else{
                j = j-1;
            }
        }
        return numbers[i];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}