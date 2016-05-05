package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/5/16.
 */
public class Ans83 {
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
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null) return null;
            if(head.next == null) return head;
            ListNode curr = head.next;
            ListNode pre = head;
            ListNode listHead = new ListNode(head.val);
            ListNode list = listHead;
            while(curr != null){
                if(pre.val != curr.val){
                    ListNode node = new ListNode(curr.val);
                    list.next = node;
                    list = node;
                }
                pre = curr;
                curr = curr.next;
            }
            return listHead;
        }
    }

}
