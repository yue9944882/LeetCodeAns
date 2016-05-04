package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans319 {
    public class Solution {
        public int bulbSwitch(int n) {
            if(n == 0) return 0;
            return (new Double(Math.sqrt(n)).intValue());
            //return -1;
        }
    }
}
