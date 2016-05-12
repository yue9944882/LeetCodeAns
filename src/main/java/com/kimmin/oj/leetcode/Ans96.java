package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/12/16.
 */
public class Ans96 {
    public class Solution {
        public int numTrees(int n) {
            if(n == 0) return 0;
            if(n == 1) return 1;
            if(n == 2) return 2;

            int[] count = new int[n + 1];
            count[0] = 1;
            count[1] = 1;
            count[2] = 2;

            for(int i=3; i<=n; i++){
                count[i] = 0;
                int tmp = count[i];
                for(int j=0; j<i; j++){
                    count[i] += (count[j] * count[i - j - 1]);
                }
            }
            return count[n];
        }
    }

}
