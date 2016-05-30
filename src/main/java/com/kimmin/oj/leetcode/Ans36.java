package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/30/16.
 */
public class Ans36 {
    public class Solution {
        public boolean isValidSudoku(char[][] board) {
            boolean b = true;
            //Read
            boolean[][] sub = new boolean[9][9];
            //Arrays.fill(sub, false);
            boolean[][] row = new boolean[9][9];
            //Arrays.fill(row, false);
            boolean[][] col = new boolean[9][9];
            //Arrays.fill(col, false);
            //Validate
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    //SubMatrix
                    int xstart = i * 3;
                    int ystart = j * 3;
                    for(int x=0; x<3; x++){
                        for(int y=0; y<3; y++){
                            if(board[x + xstart][y + ystart] != '.'){
                                int idx = board[xstart + x][ystart + y] - '1';
                                if(!sub[i * 3 + j][idx]){
                                    sub[i * 3 + j][idx] = true;
                                }else b = false;
                            }
                        }
                    }
                }
            }
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    if(board[i][j] != '.'){
                        int idx = board[i][j] - '1';
                        if(!row[i][idx]){
                            row[i][idx] = true;
                        }else b = false;
                    }
                    if(board[j][i] != '.'){
                        int idx = board[j][i] - '1';
                        if(!col[i][idx]){
                            col[i][idx] = true;
                        }else b = false;
                    }
                }
            }
            return b;
        }
    }

}
