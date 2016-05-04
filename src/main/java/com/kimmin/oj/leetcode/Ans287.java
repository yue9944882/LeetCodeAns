package com.kimmin.oj.leetcode;

import java.util.Arrays;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans287 {
    public class Solution {
        public int findDuplicate(int[] nums) {
            int num = 0;
            Arrays.sort(nums);
            for(int i=0; i<nums.length - 1; i++){
                if(nums[i] == nums[i + 1]) return nums[i];
            }
            return -1;
        }
    }
}
