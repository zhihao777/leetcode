//输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [3,2,1], k = 2
//输出：[1,2] 或者 [2,1]
// 
//
// 示例 2： 
//
// 输入：arr = [0,1,2,1], k = 1
//输出：[0] 
//
// 
//
// 限制： 
//
// 
// 0 <= k <= arr.length <= 10000 
// 0 <= arr[i] <= 10000 
// 
// Related Topics 堆 分治算法 
// 👍 237 👎 0

  
package com.zh.leetcode.editor.cn;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ZuiXiaoDeKgeShuLcof{
  public static void main(String[] args) {
       Solution solution = new ZuiXiaoDeKgeShuLcof().new Solution();
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        /*fastSort(arr, 0, arr.length-1,k-1);
        int[] vec = new int[k];
        for (int i = 0; i < k; ++i) {
            vec[i] = arr[i];
        }
        return vec;*/

        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 默认是小根堆，实现大根堆需要重写一下比较器。
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num: arr) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num < pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }

        // 返回堆中的元素
        int[] res = new int[pq.size()];
        int idx = 0;
        for(int num: pq) {
            res[idx++] = num;
        }
        return res;

    }

    /*void fastSort(int[] arr,int l,int r,int  k){
        if(l<r){
            int mid = handle(arr, l, r);
            // 否则根据下标j与k的大小关系来决定继续切分左段还是右段。
            if(mid ==k){
                return;
            }
            if (mid > k) {
                fastSort(arr, l, mid - 1, k);
            } else {
                fastSort(arr, mid + 1, r, k);
            }

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
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}