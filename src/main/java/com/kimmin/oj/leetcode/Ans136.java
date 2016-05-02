package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */
public class Ans136 {
    public class Solution {
        public int singleNumber(int[] nums) {
            int num = 0;
            for(int i=0; i<nums.length; i++){
                num = num ^ nums[i];
            }
            return num;
        }
    }
}
