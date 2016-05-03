package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/3/16.
 */
public class Ans343 {
    public class Solution {
        public int integerBreak(int n) {
            int[] nums = new int[n + 1];
            if(n == 2) return 1;
            if(n == 3) return 2;
            if(n == 4) return 4;
            nums[2] = 1;
            nums[3] = 2;
            nums[4] = 4;
            nums[5] = 6;
            for(int i=6; i<=n; i++){
                if(nums[i - 2] % 4 == 0){
                    nums[i] = nums[i - 2] / 4 * 9;
                }else{
                    nums[i] = nums[i - 2] * 2;
                }
            }
            return nums[n];
        }
    }
}
