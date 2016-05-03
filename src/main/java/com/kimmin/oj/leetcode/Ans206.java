package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/3/16.
 */
public class Ans206 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public class ListNode {
            public int val;
            public ListNode next;
            public ListNode(int val){
                this.val = val;
            }
        }
        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode newList = null;
            while(current != null){
                ListNode newNode = new ListNode(current.val);
                newNode.next = newList;
                newList = newNode;
                current = current.next;
            }
            return newList;
        }
    }
}
