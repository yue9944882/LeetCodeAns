package com.kimmin.oj.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans230 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    public class Solution {
        public class TreeNode {
              int val;
              TreeNode left;
              TreeNode right;
              TreeNode(int x) { val = x; }
        }

        public PriorityQueue<Integer> pq = null;

        public int kthSmallest(TreeNode root, int k) {
            if(root == null) return 0;
            Comparator<Integer> comp = new Comparator<Integer>(){
                public int compare(Integer i1, Integer i2){
                    if(i1 > i2) return -1;
                    else if(i1 < i2) return 1;
                    else return 0;
                }
            };

            pq = new PriorityQueue<Integer>(comp);
            recFindKSmallest(root, k);
            return pq.poll();
        }

        public void recFindKSmallest(TreeNode parent, int k){
            if(parent.left != null) recFindKSmallest(parent.left, k);
            if(parent.right != null) recFindKSmallest(parent.right, k);
            if(pq.size() >= k){
                pq.offer(parent.val);
                pq.poll();
            }else pq.offer(parent.val);
            Stack<Integer> stack = new Stack<Integer>();
            
        }


    }
}
