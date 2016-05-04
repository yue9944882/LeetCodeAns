package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans35 {
    public class Solution {
        public int searchInsert(int[] nums, int target) {
            for(int i=0; i<nums.length - 1; i++){
                if(nums[i] < target && target <= nums[i + 1]){
                    return i + 1;
                }
            }
            if(nums[0] < target) return nums.length;
            else return 0;
        }
    }
}
