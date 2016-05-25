package com.kimmin.oj.leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by kimmin on 5/18/16.
 */
public class Ans27 {
    public class Solution {
        public int removeElement(int[] nums, int val) {
            if(nums.length == 0) return 0;
            int len = nums.length;
            int prev = 0;
            for(int i=1; i<nums.length; i++){
                if(nums[i - 1] == val){
                    len --;
                    prev ++;
                }
                nums[i - prev] = nums[i];
            }
            if(nums[nums.length - 1] == val){
                //nums.length --;
                len --;
            }
            return len;

        }
    }
}
