package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/30/16.
 */
public class Ans1 {
    public class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums.length; j++){
                    if(i != j){
                        if(nums[i] + nums[j] == target){
                            int[] ret = new int[2];
                            ret[0] = i;
                            ret[1] = j;
                            return ret;
                        }
                    }
                }
            }
            return null;
        }
    }
}
