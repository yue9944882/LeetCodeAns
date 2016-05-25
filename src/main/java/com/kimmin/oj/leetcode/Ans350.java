package com.kimmin.oj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kimmin on 5/25/16.
 */
public class Ans350 {
    public class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
            Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
            for(int i=0; i<nums1.length; i++){
                if(map1.containsKey(nums1[i])){
                    int val = map1.get(nums1[i]);
                    map1.put(nums1[i], val + 1);
                    map2.put(nums1[i], val + 1);
                }else{
                    map1.put(nums1[i], 1);
                    map2.put(nums1[i], 1);
                }
            }
            for(int i=0; i<nums2.length; i++){
                if(map2.containsKey(nums2[i])){
                    if(map2.get(nums2[i]) <= 1){
                        map2.remove(nums2[i]);
                    }else{
                        int val = map2.get(nums2[i]);
                        map2.put(nums2[i], val - 1);
                    }
                }else{
                    continue;
                }
            }
            List<Integer> list = new ArrayList<Integer>();
            for(Integer i : map1.keySet()){
                Integer v2 = map2.get(i);
                if(v2 != null){
                    Integer v1 = map1.get(i);
                    for(int k=0; k<(v1-v2); k++){
                        list.add(i);
                    }
                }else{
                    Integer v1 = map1.get(i);
                    for(int k=0; k<v1; k++){
                        list.add(i);
                    }
                }
            }
            int[] ret = new int[list.size()];
            for(int i=0; i<ret.length; i++){
                ret[i] = list.get(i);
            }
            return ret;

        }
    }
}
