package com.kimmin.oj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimmin on 5/29/16.
 */
public class Ans118 {

    public static void main(String[] args){
        Ans118 ans = new Ans118();
        ans.sol.generate(3);
    }

    public Solution sol = new Solution();

    public class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ret = new ArrayList<List<Integer>>();
            if(numRows == 0) return ret;
            List<Integer> prev = new ArrayList<Integer>();
            prev.add(1);
            ret.add(prev);
            if(numRows == 1){
                return ret;
            }
            for(int i=0; i<numRows - 1; i++){
                List<Integer> curr = new ArrayList<Integer>();
                //for(int j=0; j<=i; j++){
                curr.add(1);
                for(int m=0; m<prev.size() - 1; m++){
                    curr.add(prev.get(m) + prev.get(m + 1));
                }
                curr.add(1);
                //}
                prev = curr;
                ret.add(prev);
            }
            return ret;
        }
    }
}
