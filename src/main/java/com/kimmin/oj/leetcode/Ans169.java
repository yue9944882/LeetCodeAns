package com.kimmin.oj.leetcode;
import java.util.*;
/**
 * Created by kimmin on 5/3/16.
 */
public class Ans169 {
    public class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i=0; i<nums.length; i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i], 1);
                }else{
                    int val = map.get(nums[i]);
                    map.put(nums[i], val + 1);
                }
            }
            for(Integer i: map.keySet()){
                if(map.get(i) > (nums.length / 2)) return i;
            }
            return -1;
        }

    }
}
