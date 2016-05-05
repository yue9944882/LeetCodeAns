package com.kimmin.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kimmin on 5/5/16.
 */
public class Ans202 {
    public class Solution {
        public boolean isHappy(int n) {
            if(n == 0) return false;
            int num = n;
            Set<Integer> set = new HashSet<Integer>();
            while(num != 1){
                if(set.contains(num)) return false;
                set.add(num);
                int next = 0;
                while(num != 0){
                    int rest = num % 10;
                    num = num / 10;
                    next += (rest * rest);
                }
                num = next;
            }
            return true;
        }
    }
}
