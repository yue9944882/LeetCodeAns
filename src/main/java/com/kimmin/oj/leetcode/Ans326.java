package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/5/16.
 */
public class Ans326 {
    public class Solution {
        public boolean isPowerOfThree(int n) {
            if(n == 0) return false;
            if(n == 1) return true;
            while(n % 3 == 0){
                n = n / 3;
                if(n == 1) return true;
            }
            return false;
        }
    }
}
