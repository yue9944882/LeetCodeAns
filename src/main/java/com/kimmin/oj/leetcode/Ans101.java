package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/30/16.
 */
public class Ans101 {
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


        public boolean isSymmetric(Ans100.TreeNode root) {
            if(root == null) return true;
            else{
                recIsSymmetric(root, root);
                return b;
            }
        }

        private boolean b = true;

        public void recIsSymmetric(Ans100.TreeNode left, Ans100.TreeNode right){
            if(left.val != right.val) b = false;
            if(left.left != null && right.right != null){
                recIsSymmetric(left.left, right.right);
            }else if(left.left == null && right.right == null){
                //
            }else{
                b = false;
            }
            if(left.right != null && right.left != null){
                recIsSymmetric(left.right, right.left);
            }else if(left.right == null && right.left == null){
                //
            }else{
                b = false;
            }
        }
    }

}
