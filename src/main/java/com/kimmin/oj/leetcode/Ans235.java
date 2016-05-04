package com.kimmin.oj.leetcode;

import java.util.Stack;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans235 {
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
            public TreeNode(int val){
                this.val = val;
            }
            public int val;
            public TreeNode left;
            public TreeNode right;
        }

        public Stack<TreeNode> stack = new Stack<TreeNode>();

        public Stack<TreeNode> pStack = new Stack<TreeNode>();

        public Stack<TreeNode> qStack = new Stack<TreeNode>();

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            stack.push(root);
            recLCA(root, p, q);
            int index = 0;
            while(index < pStack.size() && index < qStack.size() &&
                    pStack.elementAt(index) == qStack.elementAt(index)) index++;
            return pStack.elementAt(index - 1);
        }

        public void recLCA(TreeNode parent, TreeNode p, TreeNode q){
            if(parent.left != null){
                stack.push(parent.left);
                recLCA(parent.left, p, q);
                stack.pop();
            }
            if(parent.right != null){
                stack.push(parent.right);
                recLCA(parent.right, p, q);
                stack.pop();
            }
            if(parent == p){
                pStack = (Stack<TreeNode>) stack.clone();
            }
            if(parent == q){
                qStack = (Stack<TreeNode>) stack.clone();
            }
        }

    }
}
