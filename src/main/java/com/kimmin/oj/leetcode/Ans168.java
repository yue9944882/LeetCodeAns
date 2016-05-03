package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/3/16.
 */
public class Ans168 {
    public class Solution {
        public String convertToTitle(int n) {
            n --;
            StringBuilder sb = new StringBuilder();
            while(true){
                int rest = n % 26;
                char a = 'A';
                a = (char) (a + rest);
                sb.insert(0, a);
                n = n / 26;
                if(n == 0) break;
                n --;
            }
            return sb.toString();
        }
    }
}
