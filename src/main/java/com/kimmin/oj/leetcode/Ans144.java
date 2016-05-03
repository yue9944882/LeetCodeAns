package com.kimmin.oj.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by kimmin on 5/3/16.
 */
public class Ans144 {
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
        public List<Integer> preorderTraversal(Ans100.TreeNode root) {
            if(root == null) return new LinkedList<Integer>();
            List<Integer> list = new LinkedList<>();
            recPreorderTraversal(root, list);
            return list;
        }
        public void recPreorderTraversal(Ans100.TreeNode parent, List<Integer> list){
            list.add(parent.val);
            if(parent.left != null) recPreorderTraversal(parent.left, list);
            if(parent.right != null) recPreorderTraversal(parent.right, list);
        }
    }
}
