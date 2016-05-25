package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/25/16.
 */
public class Ans342 {
    public class Solution {
        public boolean isPowerOfFour(int num) {
            if(num == 1) return true;
            int mask = 4;
            for(int i=0; i<15; i++){
                if((num ^ (mask << i * 2)) == 0){
                    return true;
                }
            }
            return false;
        }
    }
}
