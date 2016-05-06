package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/6/16.
 */
public class Ans337 {
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
            public int val;
            public TreeNode left;
            public TreeNode right;
            public TreeNode(int val){
                this.val = val;
            }
        }

        public int sum = 0;

        public int rob(TreeNode root) {
            if(root == null) return 0;
            recRob(root, true);
            int sum1 = this.sum;
            this.sum = 0;
            recRob(root, false);
            int sum2 = this.sum;
            return sum1 > sum2 ? sum1 : sum2;
        }

        public void recRob(TreeNode parent, boolean b){
            if(!b){
                int tmp = this.sum;
                int leftSum = 0;
                int rightSum = 0;
                if(parent.left != null){
                    recRob(parent.left, true);
                    int sum1 = this.sum;
                    this.sum = tmp;
                    recRob(parent.left, false);
                    int sum2 = this.sum;
                    leftSum = sum1 > sum2 ? sum1 : sum2;
                    leftSum -= tmp;
                    this.sum = tmp;
                }
                if(parent.right != null){
                    recRob(parent.right, true);
                    int sum1 = this.sum;
                    this.sum = tmp;
                    recRob(parent.right, false);
                    int sum2 = this.sum;
                    rightSum = sum1 > sum2 ? sum1 : sum2;
                    rightSum -= tmp;
                    this.sum = tmp;
                }
                this.sum = leftSum + rightSum + tmp;
                return;
            }else{
                if(parent.left != null) recRob(parent.left, false);
                if(parent.right != null) recRob(parent.right, false);
                sum += parent.val;
                return;
            }
        }
    }
}
