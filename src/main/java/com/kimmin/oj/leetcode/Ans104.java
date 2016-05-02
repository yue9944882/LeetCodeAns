package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */
public class Ans104 {
    /** Cpp **/

    /**
     * Definition for a binary tree node.
     * struct TreeNode {
     *     int val;
     *     TreeNode *left;
     *     TreeNode *right;
     *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
     * };
     */

//    int recFindMax(TreeNode* parent){
//        int lmax = -1;
//        int rmax = -1;
//        if(parent->left == NULL && parent->right == NULL) return 1;
//        if(parent->left != NULL) lmax = recFindMax(parent->left);
//        if(parent->right != NULL) rmax = recFindMax(parent->right);
//        return (lmax > rmax? lmax:rmax) + 1;
//    }
//
//
//
//
//
//
//class Solution {
//    public:
//    int maxDepth(TreeNode* root) {
//        if(root == NULL) return 0;
//        return recFindMax(root);
//    }
//};

}