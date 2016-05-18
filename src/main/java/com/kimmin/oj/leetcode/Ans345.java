package com.kimmin.oj.leetcode;

import java.util.*;

/**
 * Created by kimmin on 5/13/16.
 */
public class Ans345 {
    public class Solution {

        private Set<Character> set = new HashSet<Character>();

        public String reverseVowels(String s) {
            set.add('a');
            set.add('e');
            set.add('o');
            set.add('i');
            set.add('u');
            set.add('A');
            set.add('E');
            set.add('O');
            set.add('I');
            set.add('U');
            int pre = 0;
            int suf = s.length() - 1;
            StringBuilder sb = new StringBuilder(s);
            while(pre < suf){
                char cpre = s.charAt(pre);
                char csuf = s.charAt(suf);
                if(set.contains(cpre) && set.contains(csuf)){
                    sb.setCharAt(pre, csuf);
                    sb.setCharAt(suf, cpre);
                    pre ++;
                    suf --;
                }else if(set.contains(cpre) && !set.contains(csuf)){
                    suf --;
                }else if(set.contains(csuf) && !set.contains(cpre)){
                    pre ++;
                }else{
                    suf --;
                    pre ++;
                }
            }
            return sb.toString();
            Deque<Integer> deque = new ArrayDeque<Integer>();
            deque
        }
    }
}
