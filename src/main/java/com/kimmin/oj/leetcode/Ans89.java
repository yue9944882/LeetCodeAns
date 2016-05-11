package com.kimmin.oj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimmin on 5/11/16.
 */
public class Ans89 {
    public class Solution {

        public int num = 0;
        public List<Integer> list = new ArrayList<Integer>();

        public List<Integer> grayCode(int n) {
            list.add(num);
            if(n == 0) return list;
            recGrayCode(0, n);
            return list;
        }

        public void recGrayCode(int depth, int len){
            if(depth >= len) return;
            for(int i=list.size() - 1; i>=0; i--){
                list.add(list.get(i) + (1 << depth));
            }
            recGrayCode(depth + 1, len);
        }

    }

}
