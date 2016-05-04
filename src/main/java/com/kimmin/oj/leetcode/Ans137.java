package com.kimmin.oj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans137 {
    public class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i=0; i<nums.length; i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i], 1);
                }else{
                    int val = map.get(nums[i]);
                    map.put(nums[i], val + 1);
                }
            }
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() != 3){
                    return entry.getKey();
                }
            }
            return -1;
        }
    }
}
