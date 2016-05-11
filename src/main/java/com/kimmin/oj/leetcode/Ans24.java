package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/11/16.
 */
public class Ans24 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode curr = head;
            ListNode newListHead = null;
            ListNode newList = null;
            if(curr == null) return null;
            if(curr.next == null) return new ListNode(curr.val);
            while(true){
                if(newListHead == null){
                    newListHead = new ListNode(curr.next.val);
                    newListHead.next = new ListNode(curr.val);
                    newList = newListHead.next;
                    curr = curr.next.next;
                    continue;
                }
                if(curr == null){
                    return newListHead;
                }
                if(curr.next == null){
                    newList.next = new ListNode(curr.val);
                    return newListHead;
                }
                newList.next = new ListNode(curr.next.val);
                newList.next.next = new ListNode(curr.val);
                newList = newList.next.next;
                curr = curr.next.next;
            }
        }
    }
}
