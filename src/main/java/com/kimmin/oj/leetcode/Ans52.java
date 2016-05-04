package com.kimmin.oj.leetcode;

import java.util.Arrays;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans52 {
    public static void main(String[] args){
        Ans52 ans = new Ans52();
        int i = ans.solution.totalNQueens(8);
        System.out.println(i);
    }

    public Solution solution = new Solution();

    public class Solution {

        public boolean[] posiDiag = null;
        public boolean[] negaDiag = null;
        public boolean[] row = null;
        public boolean[] col = null;

        public int count = 0;

        public int totalNQueens(int n) {
            posiDiag = new boolean[n * 2];
            negaDiag = new boolean[n * 2];
            row = new boolean[n];
            col = new boolean[n];
            Arrays.fill(posiDiag, false);
            Arrays.fill(negaDiag, false);
            Arrays.fill(row, false);
            Arrays.fill(col, false);
            recNQueen(0, n);
            return count;
        }

        public void recNQueen(int depth, int n){
            if(depth >= n){
                count ++;
            }else{
                for(int i=0; i<n; i++){
                    if(posiDiag[(depth - i + n)]) continue;
                    if(negaDiag[(depth + i)]) continue;
                    if(row[i]) continue;
                    if(col[depth]) continue;

                    posiDiag[(depth - i + n)] = true;
                    negaDiag[(depth + i)] = true;
                    row[i] = true;
                    col[depth] = true;
                    recNQueen(depth + 1, n);
                    posiDiag[(depth - i + n)] = false;
                    negaDiag[(depth + i)] = false;
                    row[i] = false;
                    col[depth] = false;
                }
            }
        }
    }
}
