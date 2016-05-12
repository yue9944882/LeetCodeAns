package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/12/16.
 */
public class Ans53 {
    public class Solution {
        public int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            int tmp = 0;

            for(int i=0; i<nums.length; i++){
                tmp += nums[i];
                if(tmp > max) max = tmp;
                if(tmp < 0) tmp = 0;
            }
            return max;
        }
    }
}
