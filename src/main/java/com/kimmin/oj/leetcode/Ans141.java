package com.kimmin.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kimmin on 5/5/16.
 */
public class Ans141 {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
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
        public boolean hasCycle(ListNode head) {
            if(head == null) return false;
            Set<Integer> set = new HashSet<Integer>();
            ListNode curr = head;
            while(curr != null){
                if(set.contains(curr.hashCode())) return true;
                set.add(curr.hashCode());
                curr = curr.next;
            }
            return false;
        }
    }
}
