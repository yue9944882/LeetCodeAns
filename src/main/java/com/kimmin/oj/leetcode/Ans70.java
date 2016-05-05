package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/5/16.
 */
public class Ans70 {
    public class Solution {
        public int climbStairs(int n) {
            if(n == 0) return 0;
            if(n == 1) return 1;
            if(n == 2) return 2;
            int[] count = new int[n + 1];
            count[1] = 1;
            count[2] = 2;
            for(int i=3; i<=n; i++){
                count[i] = count[i - 1] + count[i - 2];
            }
            return count[n];
        }
    }
}
