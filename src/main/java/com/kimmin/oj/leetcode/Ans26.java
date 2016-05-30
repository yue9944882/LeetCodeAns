package com.kimmin.oj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kimmin on 5/30/16.
 */
public class Ans26 {
    public class Solution {
        public int removeDuplicates(int[] nums) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int pos = 0;
            for(int i=0; i<nums.length; i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i], 90);
                    //pos ++;
                    nums[pos++] = nums[i];
                }
            }
            return map.keySet().size();
        }
    }
}
