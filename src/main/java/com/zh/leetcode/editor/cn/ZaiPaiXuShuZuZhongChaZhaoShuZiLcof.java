//统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 限制： 
//
// 0 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找 
// 👍 131 👎 0

  
package com.zh.leetcode.editor.cn;
public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof{
  public static void main(String[] args) {
       Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        int a = 0;
        int b = nums.length-1;
        int mid = 0;
        while(a<=b){
            mid = (a+b)/2;
            if(nums[mid] == target){
                break;
            }
            if(nums[mid] > target){
                b = mid-1;
            }
            if(nums[mid] < target){
                a = mid+1;
            }
        }
        if(nums[mid] == target){
            int t = mid;
            int ret = 0;
            while(t<nums.length && nums[t] == target){
                ret++;
                t++;
            }
            int g = mid;
            while(g>0 && nums[--g] == target){
                ret++;
                g--;
            }
            return ret;
        }else{
            return 0;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}