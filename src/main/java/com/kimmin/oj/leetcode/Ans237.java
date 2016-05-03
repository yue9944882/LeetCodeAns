package com.kimmin.oj.leetcode;

import java.util.*;

/**
 * Created by kimmin on 5/2/16.
 */
public class Ans237 {
    public class ListNode {
        public ListNode(int val){
            this.val = val;
        }
        public ListNode next;
        public int val;
    }
    public void deleteNode(ListNode node) {
        ListNode curNode = node;
        ListNode nextNode = node.next;
        if(nextNode == null){
            /** This is impossible! **/
        }
        while(true){
            curNode.val = nextNode.val;
            if(nextNode.next == null){
                curNode.next = null;
                break;
            }
            curNode = nextNode;
            nextNode = nextNode.next;

        }
        curNode.next = null;
    }
}
