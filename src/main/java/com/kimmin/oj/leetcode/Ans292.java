package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */
public class Ans292 {
    public class Solution {
        public boolean canWinNim(int n) {
            if(n==0)return false;
            else if(n<=3)return true;
            else if(n%4==0)return false;
            else return true;
        }
    }
}
