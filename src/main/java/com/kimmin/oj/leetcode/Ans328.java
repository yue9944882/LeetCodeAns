package com.kimmin.oj.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans328 {
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
            public ListNode(int val){
                this.val = val;
            }
            public int val;
            public ListNode next;
        }
        public ListNode oddEvenList(ListNode head) {
            if(head == null) return null;
            ListNode oddList = null;
            ListNode oddListHead = null;
            ListNode evenList = null;
            ListNode evenListHead = null;
            ListNode current = head;
            //boolean b = true;
            int idx = 0;
            while(current != null){
                if(idx % 2 == 0){
                    if(evenList == null){
                        evenList = new ListNode(current.val);
                        evenList.next = null;
                        evenListHead = evenList;
                    }else{
                        evenList.next = new ListNode(current.val);
                        evenList = evenList.next;
                        evenList.next = null;
                    }
                }else{
                    if(oddList == null){
                        oddList = new ListNode(current.val);
                        oddList.next = null;
                        oddListHead = oddList;
                    }else{
                        oddList.next = new ListNode(current.val);
                        oddList = oddList.next;
                        oddList.next = null;
                    }
                }
                current = current.next;
                idx ++;
            }
            evenList.next = oddListHead;
            return evenListHead;
        }
    }
}
