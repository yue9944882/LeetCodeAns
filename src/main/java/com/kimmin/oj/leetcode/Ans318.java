package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/3/16.
 */
public class Ans318 {
    public class Solution {
        public int maxProduct(String[] words) {
            if(words.length < 2) return 0;
            int max = 0;
            int[] length = new int[words.length];
            int[] masks = new int[words.length];
            for(int i=0; i<words.length; i++){
                String s = words[i];
                length[i] = words[i].length();
                int mask = 0;
                for(int j=0; j<s.length(); j++){
                    char c = s.charAt(j);
                    mask |= 1 << (c - 'a');
                }
                masks[i] = mask;
            }
            for(int i=0; i<words.length; i++){
                for(int j=0; j<words.length; j++){
                    if((masks[i] & masks[j]) == 0){
                        max = max > (length[i] * length[j])? max : (length[i] * length[j]);
                    }
                }
            }
            return max;
        }
    }
}
