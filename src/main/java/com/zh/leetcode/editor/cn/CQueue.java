package com.zh.leetcode.editor.cn;

import java.util.Stack;

/**
 * @ClassName CQueue
 * @Description: TODO
 * @Author zhiHao
 * @Date 2020/11/19
 * @Version V1.0
 **/
public class CQueue {
    Stack<Integer> stack1 = null;
    Stack<Integer> stack2 = null;

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    /*public void appendTail(int value) {
        stack1.push(value);
        int i = 0;
        while (!stack2.empty()) {
            int tmp = stack2.pop();
            i++;
            stack1.push(tmp);
        }
        stack2.push(value);
        while (i > 0) {
            int tmp = stack1.pop();
            stack2.push(value);
            i--;
        }
    }

    public int deleteHead() {
        if (stack2.empty()) {
            return -1;
        }
        int result = stack2.pop();
        int i = 0;
        while (stack1.size() > 1) {
            int tmp = stack1.pop();
            i++;
            stack2.push(tmp);
        }
        stack1.pop();
        while (i > 0) {
            int tmp = stack2.pop();
            stack1.push(tmp);
            i--;
        }
        return result;
    }*/

    public void appendTail(int value) {
        stack1.push(value);
    }
    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }

    }
}


class mainClass {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        int i = cQueue.deleteHead();
        System.out.println(i);
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        int i1 = cQueue.deleteHead();
        System.out.println(i1);
        int i2 = cQueue.deleteHead();
        System.out.println(i2);
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */