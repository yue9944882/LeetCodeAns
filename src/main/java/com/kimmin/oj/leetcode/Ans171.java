package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/3/16.
 */
public class Ans171 {
    public class Solution {
        public int titleToNumber(String s) {
            int val = 0;
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                int diff = (int) (c - 'A');
                val = val * 26 + (diff + 1);
            }
            return val;
        }
    }
}
