package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */

public class Ans226 {
    public class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root == null) return null;
            recInverseTree(root);
            return root;
        }

        private void recInverseTree(TreeNode parent){
            if(parent.left == null && parent.right == null){
                return;
            }else{
                if(parent.left != null) recInverseTree(parent.left);
                if(parent.right != null) recInverseTree(parent.right);
                if(parent.left == null && parent.right != null){
                    parent.left = parent.right;
                    parent.right = null;
                }else if(parent.right == null && parent.left != null){
                    parent.right = parent.left;
                    parent.left = null;
                }else{
                    TreeNode tmp = parent.left;
                    parent.left = parent.right;
                    parent.right = tmp;
                }
            }
        }
    }
}
