package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans191 {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count = 0;
            for(int i=0; i<32; i++){
                int mask = 1;
                count += ((n >> i) & mask);
            }
            return count;
        }
    }
}
