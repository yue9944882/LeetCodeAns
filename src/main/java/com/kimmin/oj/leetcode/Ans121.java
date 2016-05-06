package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/6/16.
 */
public class Ans121 {
    public Solution solution = new Solution();
    public class Solution {
        public int maxProfit(int[] prices) {
            if(prices.length <= 1) return 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int maxProfit = 0;
            for(int i=0; i<prices.length; i++){
                if(prices[i] > max){
                    if(min != Integer.MAX_VALUE){
                        max = prices[i];
                        if(max != Integer.MIN_VALUE && max >= min) maxProfit = maxProfit > (max - min)? maxProfit : (max - min);
                    }
                }
                if(prices[i] < min){
                    if(max != Integer.MIN_VALUE && min != Integer.MAX_VALUE){
                        maxProfit = maxProfit > (max - min) ? maxProfit : (max - min);
                    }
                    min = prices[i];
                    max = Integer.MIN_VALUE;
                }
            }
            return maxProfit;
        }
    }
    public static void main(String[] args){
        Ans121 ans = new Ans121();
        int[] arr = new int[] {3,2,6,1};
        int ret = ans.solution.maxProfit(arr);
        System.out.println(ret);
//        return ret;
    }
}
