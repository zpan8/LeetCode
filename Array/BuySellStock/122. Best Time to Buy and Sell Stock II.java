/*Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time 
(ie, you must sell the stock before you buy again).*/

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        for (int i = 0; i < n - 1; i++){
            if (prices[i + 1] > prices[i])//As long as the next day's price is larger, we should buy today and sell tomorrow, 
            //since there is no penalty for buy and sell.
                maxProfit += prices[i + 1] - prices[i];
        }
        return maxProfit;
    }
}
