package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/2/16.
 */
public class Ans334 {
    public class Solution {
        public String reverseString(String s) {
            //String cpyS = new String(s);
            StringBuilder sb = new StringBuilder();
            int len = s.length();
            for(int i=0; i<len; i++){
                sb.append(s.charAt(len - i -1));
            }
            return sb.toString();
        }
    }
}
