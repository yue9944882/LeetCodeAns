package com.kimmin.oj.leetcode;
import java.util.*;
/**
 * Created by kimmin on 5/3/16.
 */
public class Ans217 {
    public class Solution {
        public boolean containsDuplicate(int[] nums) {
            if(nums.length == 0) return false;
            Set<Integer> set = new HashSet();
            for(int i=0; i<nums.length; i++){
                if(set.contains(nums[i])) return true;
                set.add(nums[i]);
            }
            return false;
        }
    }
}
