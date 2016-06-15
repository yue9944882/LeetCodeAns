package com.kimmin.oj.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by kimmin on 6/15/16.
 */
public class Ans216 {

    public static void main(String[] args){
        System.out.println((10)/(-3));
    }

    public class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            left = n;
            recCombSum(0, k, n);
            return ret;
        }


        private List<List<Integer>> ret = new ArrayList<List<Integer>>();

        private Stack<Integer> stack = new Stack<Integer>();

        private int base = 0;

        private int left = 0;

        private void recCombSum(int depth, int k, int n){
            if(depth >= k){
                if(left == 0){
                    List<Integer> tmp = new ArrayList<Integer>();
                    for(int i=0; i<k; i++){
                        tmp.add(stack.elementAt(i));
                    }
                    ret.add(tmp);
                }
                return;
            }
            if((base + 1) * (k - depth) > left){
                return;
            }
            for(int i=base + 1; i<n; i++){
                int prevBase = base;
                base = i;
                left -= i;
                stack.push(i);
                if(i < 10) recCombSum(depth + 1, k, n);
                stack.pop();
                left += i;
                base = prevBase;
            }
        }

    }
}
