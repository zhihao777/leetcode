//给你一个整数数组 nums，请你将该数组升序排列。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：nums = [5,2,3,1]
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 输入：nums = [5,1,1,2,0,0]
//输出：[0,0,1,1,2,5]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50000 
// -50000 <= nums[i] <= 50000 
// 
// 👍 286 👎 0

  
package com.zh.leetcode.editor.cn;
public class SortAnArray{
  public static void main(String[] args) {
       Solution solution = new SortAnArray().new Solution();
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArray(int[] nums) {
        fastSort(nums, 0, nums.length-1);
        return nums;
    }
      void fastSort(int[] arr,int l,int r){
          if(l<r){
              int mid = handle(arr, l, r);
              fastSort(arr,l,mid-1);
              fastSort(arr,mid+1,r);
          }
      }

      int handle(int[] arr,int l,int r){
          int pivot = arr[l];
          int i = l;
          int j = r;
          while(i<j){
              while(i<j&&pivot<=arr[j]){
                  j--;
              }
              while(i<j&&pivot>=arr[i]){
                  i++;
              }
              swap(arr,i,j);
          }
          swap(arr,l,i);
          return i;
      }

      void swap(int[] arr,int l,int r){
          int temp = arr[l];
          arr[l] = arr[r];
          arr[r] = temp;
      }
}
//leetcode submit region end(Prohibit modification and deletion)

}