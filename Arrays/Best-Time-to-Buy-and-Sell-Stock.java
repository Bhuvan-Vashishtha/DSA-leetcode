1class Solution {
2    public int maxProfit(int[] prices) {
3        if(prices.length == 0) return 0;
4        int maxProfit = 0;
5        int buy = prices[0];
6        int n = prices.length;
7        
8        for(int i=1; i<n; i++){
9            int cost = prices[i]-buy;
10            maxProfit = Math.max(cost, maxProfit);
11            buy = Math.min(buy, prices[i]);
12        }
13        return maxProfit;
14    }
15}