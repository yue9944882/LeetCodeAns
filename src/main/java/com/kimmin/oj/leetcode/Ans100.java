package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */
public class Ans100 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null || q == null){
                if(p == null && q == null) return true;
                else return false;
            }else return recEqualTree(p, q);
        }

        public boolean recEqualTree(TreeNode p, TreeNode q){
            if(p.val != q.val) return false;
            if((p.left == null && q.left != null) || (p.left != null && q.left == null)) return false;
            else if((p.right == null && q.right != null) || (p.right != null && q.right == null)) return false;
            else{
                boolean b1 = true, b2 = true;
                if(p.left != null) b1 = recEqualTree(p.left, q.left);
                if(p.right != null) b2 = recEqualTree(p.right, q.right);
                return b1 && b2;
            }

            //return true;
        }

    }
}
