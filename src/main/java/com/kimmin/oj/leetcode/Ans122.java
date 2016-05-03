package com.kimmin.oj.leetcode;

/**
 * Created by kimmin on 5/3/16.
 */
public class Ans122 {
    public class Solution {
        public int maxProfit(int[] prices) {
            if(prices.length == 0) return 0;
            int profit = 0;
            // True means can only buy stock, on the contrary
            boolean b = true;
            int[] priceDiff = new int[prices.length - 1];
            for(int i=0; i<prices.length - 1; i++){
                priceDiff[i] = prices[i + 1] - prices[i];
            }
            for(int i=0; i<priceDiff.length; i++){
                if(priceDiff[i] > 0){
                    profit += priceDiff[i];
                }
            }
            return profit;

        }
    }
}
