package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/3/16.
 */
public class Ans268 {
    public class Solution {
        public int missingNumber(int[] nums) {
            int len = nums.length;
            int n = 0;
            for(int i=0; i<=len; i++){
                n = n ^ i;
            }
            for(int i=0; i<nums.length; i++){
                n = n ^ nums[i];
            }
            return n;
        }
    }
}
