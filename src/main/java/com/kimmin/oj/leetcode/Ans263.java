package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/5/16.
 */
public class Ans263 {
    public class Solution {
        public boolean isUgly(int num) {
            if(num == 0) return false;
            if(num == 1) return true;
            int i = num;
            while(true){
                if(i % 2 == 0){
                    i /= 2;
                    if(i == 1) return true;
                    continue;
                }
                if(i % 3 == 0){
                    i /= 3;
                    if(i == 1) return true;
                    continue;
                }
                if(i % 5 == 0){
                    i /= 5;
                    if(i == 1) return true;
                    continue;
                }
                if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0) return false;
            }
        }
    }
}
