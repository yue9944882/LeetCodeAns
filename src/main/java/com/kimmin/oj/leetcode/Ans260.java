package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */

import java.util.*;

public class Ans260 {
    public class Solution {
        public int[] singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i=0; i<nums.length; i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i], 1);
                }else{
                    int val = map.get(nums[i]);
                    map.put(nums[i], val + 1);
                }
            }
            int ret[] = new int[2];
            int pos = 0;
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() != 2){
                    ret[pos ++] = entry.getKey();
                }
            }
            return ret;
        }
    }
}
