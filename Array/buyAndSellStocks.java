import java.util.*;

//you are given an array prices where prices[i] is the price of a given stock on the ith day.you want to maximize your profit by choosing a singleday to buy one stock and choosing a different day in future to sell that stocks. Return the maximum profit you can achieve from this transaction.if you cannot achieve any profit, return  0.

//prices=[7,1,5,3,6,4]
public class buyAndSellStocks {
    public static int buyAndSell(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSell(prices));
    }

}
