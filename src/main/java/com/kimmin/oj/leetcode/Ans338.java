package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */
public class Ans338 {
    public class Solution {
        public int[] countBits(int num) {
            int ret[] = new int[num + 1];
            for(int i=0; i<=num; i++){
                if(i == 0){
                    ret[0] = 0;
                    continue;
                }
                if(i == 1){
                    ret[1] = 1;
                    continue;
                }
                int rest = i % 2;
                int quot = i / 2;
                if(rest == 0){
                    ret[i] = ret[quot];
                }else{
                    ret[i] = ret[quot] + 1;
                }
            }
            return ret;
        }
    }
}
