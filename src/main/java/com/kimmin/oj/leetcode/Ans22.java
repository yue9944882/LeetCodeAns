package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/5/16.
 */
public class Ans22 {
    public class Solution {

        public List<String> ret = new ArrayList<String>();

        public char[] parentheses = null;

        public int pos = 0;

        public List<String> generateParenthesis(int n) {
            this.parentheses = new char[n * 2];
            //parentheses[n * 2] = '\0';
            recGenerate(0, n);
            return ret;
        }

        public void recGenerate(int count, int n) {
            if (pos == parentheses.length) {
                /** Result into ret **/
                if (count == 0) ret.add(new String(parentheses));
                return;
            }
            if (count < n) {
                parentheses[pos++] = '(';
                recGenerate(count + 1, n);
                pos--;
            }
            if (count >= 1) {
                parentheses[pos++] = ')';
                recGenerate(count - 1, n);
                pos--;
            }

        }
    }
}
