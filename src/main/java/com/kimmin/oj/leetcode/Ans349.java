package com.kimmin.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kimmin on 5/22/16.
 */
public class Ans349 {
    public class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<Integer>();
            for(int i=0; i<nums1.length; i++){
                set.add(nums1[i]);
            }
            Set<Integer> rset = new HashSet<Integer>();
            for(int i=0; i<nums2.length; i++){
                rset.add(nums2[i]);
            }
            Set<Integer> sset = new HashSet<Integer>();
            for(Integer i: set){
                sset.add(i);
            }
            set.removeAll(rset);
            sset.removeAll(set);
            int[] ret = new int[sset.size()];
            int pos = 0;
            for(Integer i: sset){
                ret[pos ++] = i;
            }
            return ret;
        }
    }
}
