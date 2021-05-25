//输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。 
//
// 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 
//
// 
//
// 示例 1： 
//
// 输入：target = 9
//输出：[[2,3,4],[4,5]]
// 
//
// 示例 2： 
//
// 输入：target = 15
//输出：[[1,2,3,4,5],[4,5,6],[7,8]]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= target <= 10^5 
// 
//
// 
// 👍 267 👎 0

  
package com.zh.leetcode.editor.cn;

import java.util.ArrayList;

public class HeWeiSdeLianXuZhengShuXuLieLcof{
  public static void main(String[] args) {
       Solution solution = new HeWeiSdeLianXuZhengShuXuLieLcof().new Solution();
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] findContinuousSequence(int target) {
        /*ArrayList<int[]> objects = new ArrayList<>();
        int i = 1;
        double j = 2.0;
        while(i<j){
            j = (-1+Math.sqrt(1+(long)4*i*i-4*i+8*target))/2;
            if(j>i && (int)j == j){
                int[] ints = new int[(int)j - i + 1];
                for(int k=i;k<=j;k++){
                    ints[k-i] = k;
                }
                objects.add(ints);
            }
            i++;
        }
        return objects.toArray(new int[0][]);*/

        ArrayList<int[]> objects = new ArrayList<>();
        int i = 1,j = 2,s = 3;
        while(i<j){
            if(s == target){
                int[] ints = new int[j - i + 1];
                for(int k=i;k<=j;k++){
                    ints[k-i] = k;
                }
                objects.add(ints);
            }
            if(s>=target){
                s-=i;
                i++;
            }else{
                j++;
                s+=j;
            }
        }
        return objects.toArray(new int[0][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}