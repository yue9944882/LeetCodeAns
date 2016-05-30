package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/30/16.
 */
public class Ans112 {
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
        public boolean hasPathSum(Ans100.TreeNode root, int sum) {
            if(root == null) return false;
            else{
                recPathSum(root, sum, 0);
                return b;
            }
        }

        private boolean b = false;
        public void recPathSum(Ans100.TreeNode parent, int sum, int curr){
            if(parent.left != null){
                recPathSum(parent.left, sum, curr + parent.val);
            }
            if(parent.right != null){
                recPathSum(parent.right, sum, curr + parent.val);
            }
            if(parent.left == null && parent.right == null){
                if((curr + parent.val) == sum) b = true;
            }
        }
    }
}
