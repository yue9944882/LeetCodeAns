package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/5/16.
 */
public class Ans231 {
    public static void main(String[] args){
        Ans231 ans231 = new Ans231();
        ans231.solution.isPowerOfTwo(3);
    }
    public Solution solution = new Solution();
    public class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n <= 0) return false;
            int i = 2;
            for(; i<=32; i++){
                if(((n >> (32 - i)) & 1) == 1) break;
            }
            //int k = n >> ;
            i ++;
            for(; i<=32; i++){
                if(((n >> (32 - i)) & 1) == 1) return false;
            }
            return true;
        }
    }
}
