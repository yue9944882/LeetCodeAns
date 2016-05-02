package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */
public class Ans283 {
    public class Solution {
        public void moveZeroes(int[] nums) {
            int pos = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] != 0) nums[pos ++] = nums[i];
            }
            for(int i=pos; i<nums.length; i++){
                nums[i] = 0;
            }
        }
    }
}
