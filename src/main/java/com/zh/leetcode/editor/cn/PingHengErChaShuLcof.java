//输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。 
//
// 
//
// 示例 1: 
//
// 给定二叉树 [3,9,20,null,null,15,7] 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回 true 。 
// 
//示例 2: 
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4] 
//
// 
//       1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
// 
//
// 返回 false 。 
//
// 
//
// 限制： 
//
// 
// 0 <= 树的结点个数 <= 10000 
// 
//
// 注意：本题与主站 110 题相同：https://leetcode-cn.com/problems/balanced-binary-tree/ 
//
// 
// Related Topics 树 深度优先搜索 
// 👍 152 👎 0

  
package com.zh.leetcode.editor.cn;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_ja;
import com.zh.TreeNode;

public class PingHengErChaShuLcof{
  public static void main(String[] args) {
       Solution solution = new PingHengErChaShuLcof().new Solution();
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(deepTree(root) == -1){
            return false;
        }
        return true;
    }
    int deepTree(TreeNode root){
        if(null == root){
            return 0;
        }
        int left = deepTree(root.left);
        int right = deepTree(root.right);
        if(left == -1 || right == -1){
            return -1;
        }
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}