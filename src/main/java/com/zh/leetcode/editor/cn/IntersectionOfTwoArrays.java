//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4] 
//
// 
//
// 说明： 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 数组 哈希表 双指针 二分查找 排序 
// 👍 386 👎 0

  
package com.zh.leetcode.editor.cn;

import java.util.*;

public class IntersectionOfTwoArrays{
  public static void main(String[] args) {
       Solution solution = new IntersectionOfTwoArrays().new Solution();
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int target = 5;
        if (nums1 == null || nums1.length == 0){
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if(count>target){
                set.add(num);
            }
        }
        Integer[] temp = set.toArray(new Integer[] {});
        int[] resArray = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            resArray[i] = temp[i].intValue();
        }
        return resArray;

    }



      public int[] intersection(int[] nums1, int[] nums2) {
          // 但凡存在一个为空
          if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
              return new int[0];
          }

          Set<Integer> set1 = new HashSet<>();
          Set<Integer> set2 = new HashSet<>();

          for (int num : nums1) {
              set1.add(num);
          }
          for (int num : nums2) {
              if (set1.contains(num)) {
                  set2.add(num);
              }
          }

          int[] resArr = new int[set2.size()];
          int i = 0;
          for (int value : set2) {
              resArr[i++] = value;
          }
          return resArr;
      }
}
//leetcode submit region end(Prohibit modification and deletion)

}