package com.kimmin.oj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kimmin on 5/4/16.
 */
public class Ans51 {
    public static void main(String[] args){
        Ans51 ans = new Ans51();
        List<List<String>> list = ans.solution.solveNQueens(4);
        for(List<String> l: list){
            System.out.println("\n");
            for(String s: l){
                System.out.println(s);
            }
        }
    }

    public Solution solution = new Solution();

    public class Solution {

        public List<List<String>> ret = new ArrayList<List<String>>();

        public boolean[] posiDiag = null;
        public boolean[] negaDiag = null;
        public boolean[] row = null;
        public boolean[] col = null;

        public boolean[][] mat = null;

        public List<List<String>> solveNQueens(int n) {
            posiDiag = new boolean[n * 2];
            negaDiag = new boolean[n * 2];
            row = new boolean[n];
            col = new boolean[n];
            mat = new boolean[n][n];
            Arrays.fill(posiDiag, false);
            Arrays.fill(negaDiag, false);
            Arrays.fill(row, false);
            Arrays.fill(col, false);
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    mat[i][j] = false;
                }
            }
            recNQueen(0, n);
            return ret;
        }

        public void recNQueen(int depth, int n){
            if(depth >= n){
                List<String> list = new ArrayList<String>();
                for(int i=0; i<n; i++){
                    StringBuilder sb = new StringBuilder();
                    for(int j=0; j<n; j++){
                        if(mat[i][j]) sb.append('Q');
                        else sb.append('.');
                    }
                    list.add(sb.toString());                }
                ret.add(list);
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
                    mat[i][depth] = true;
                    recNQueen(depth + 1, n);
                    mat[i][depth] = false;
                    posiDiag[(depth - i + n)] = false;
                    negaDiag[(depth + i)] = false;
                    row[i] = false;
                    col[depth] = false;
                }
            }
        }
    }
}
