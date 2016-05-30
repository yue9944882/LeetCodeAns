package com.kimmin.oj.leetcode;

import java.util.Arrays;

/**
 * Created by kimmin on 5/30/16.
 */
public class Ans66 {
    public class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 0;
            if(digits[digits.length - 1] == 9){

                int pos = digits.length - 1;
                carry = 1;
                digits[pos] = 0;
                pos --;

                while(carry != 0){
                    if(pos < 0){
                        int[] ret = new int[digits.length + 1];
                        Arrays.fill(ret, 0);
                        ret[0] = 1;
                        return ret;
                    }
                    if(carry + digits[pos] > 9){
                        carry = 1;
                        digits[pos] = 0;
                    }else{
                        carry = 0;
                        digits[pos] += 1;
                    }
                    pos --;
                }
            }else{
                digits[digits.length - 1] += 1;
            }
            return digits;
        }
    }
}
