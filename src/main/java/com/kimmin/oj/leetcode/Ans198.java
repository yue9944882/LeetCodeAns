package com.kimmin.oj.leetcode;

import java.util.Arrays;

/**
 * Created by kimmin on 5/5/16.
 */
public class Ans198 {
    public class Solution {
        public int rob(int[] nums) {
            int[] money = new int[nums.length];
            Arrays.fill(money, 0);
            if(nums.length == 0) return 0;
            if(nums.length == 1) return nums[0];
            if(nums.length == 2) return Math.max(nums[0], nums[1]);
            money[0] = nums[0];
            money[1] = Math.max(nums[0], nums[1]);
            if(nums.length == 3) return Math.max(money[0] + nums[2], money[1]);
            money[2] = Math.max(money[0] + nums[2], money[1]);
            for(int i=3; i<nums.length; i++){
                money[i] = Math.max(money[i - 2] + nums[i], money[i - 1]);
            }
            return Math.max(money[nums.length - 1], money[nums.length - 2]);
        }
    }
}
