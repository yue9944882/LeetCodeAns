package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/10/16.
 */
public class Ans21 {
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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode newListHead = null;
            ListNode newList = null;
            ListNode list1 = l1;
            ListNode list2 = l2;
            while(list1 != null || list2 != null){
                if(newListHead == null){
                    if(list1 == null){
                        newListHead = new ListNode(list2.val);
                        newList = newListHead;
                        list2 = list2.next;
                        continue;
                    }
                    if(list2 == null){
                        newListHead = new ListNode(list1.val);
                        newList = newListHead;
                        list1 = list1.next;
                        continue;
                    }
                    if(list1.val <= list2.val){
                        newListHead = new ListNode(list1.val);
                        newList = newListHead;
                        list1 = list1.next;
                        continue;
                    }else{
                        newListHead = new ListNode(list2.val);
                        newList = newListHead;
                        list2 = list2.next;
                        continue;
                    }
                }
                if(list1 == null){
                    newList.next = new ListNode(list2.val);
                    newList = newList.next;
                    list2 = list2.next;
                }else if(list2 == null){
                    newList.next = new ListNode(list1.val);
                    newList = newList.next;
                    list1 = list1.next;
                }else{
                    if(list1.val <= list2.val){
                        newList.next = new ListNode(list1.val);
                        newList = newList.next;
                        list1 = list1.next;
                    }else{
                        newList.next = new ListNode(list2.val);
                        newList = newList.next;
                        list2 = list2.next;
                    }
                }
            }
            return newListHead;
        }
    }
}
