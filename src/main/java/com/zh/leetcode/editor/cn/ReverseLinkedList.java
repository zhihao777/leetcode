//反转一个单链表。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
// Related Topics 链表 
// 👍 1315 👎 0

  
package com.zh.leetcode.editor.cn;

import com.zh.ListNode;

import java.util.Stack;

public class ReverseLinkedList{
  public static void main(String[] args) {
       Solution solution = new ReverseLinkedList().new Solution();
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /*public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        Stack stack = new Stack();
        while(head!=null){
            stack.push(head.val);
            head = head.next;
        }
        int pop = Integer.parseInt(stack.pop().toString());
        ListNode listNode = new ListNode(pop);
        ListNode cur = listNode;
        while(!stack.empty()){
            int pop1 = Integer.parseInt(stack.pop().toString());
            ListNode listNode1 = new ListNode(pop1);
            cur.next = listNode1;
            cur = cur.next;
        }
        return listNode;
    }*/


    public ListNode reverseList(ListNode head) {
        //上面是栈 这次试试迭代
        if(head == null){
            return head;
        }
        ListNode pre = null;
        while(head!=null){
             ListNode tmp = head.next;
             head.next = pre;
             pre = head;
             head = tmp;
        }
        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}