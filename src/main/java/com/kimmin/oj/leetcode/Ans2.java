package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/30/16.
 */
public class Ans2 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public class ListNode{
        int val;
        public ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    public class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode n1 = l1;
            ListNode n2 = l2;
            ListNode n = null;
            ListNode head = null;
            int carry = 0;
            while(n1 != null && n2 != null){
                if(head == null){
                    int a = n1.val + n2.val;
                    if(a > 9){
                        carry = 1;
                        a -= 10;
                    }
                    n = new ListNode(a);
                    head = n;
                }else{
                    int a = n1.val + n2.val;
                    int c = 0;
                    if(a + carry > 9){
                        c = 1;
                        a -= 10;
                    }else{
                        c = 0;
                    }
                    n.next = new ListNode(a + carry);
                    carry = c;
                    n = n.next;
                }
                n2 = n2.next;
                n1 = n1.next;
            }
            ListNode cont = null;
            if(n1 != null){
                cont = n1;
            }
            if(n2 != null){
                cont = n2;
            }
            while(cont != null){
                int a = cont.val + carry;
                if(a > 9){
                    a -= 10;
                    n.next = new ListNode(a);
                    carry = 1;
                    n = n.next;
                    cont = cont.next;
                    continue;
                }else{
                    n.next = new ListNode(a);
                    n = n.next;
                    carry = 0;
                    cont = cont.next;
                }
            }
            if(carry == 1){
                n.next = new ListNode(1);
            }
            return head;
        }
    }
}
