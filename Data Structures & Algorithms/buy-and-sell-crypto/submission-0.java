class Solution {
    public int maxProfit(int[] prices) {
        
        int b_p = prices[0];
        int max_p = 0;


        for(int i = 0 ; i< prices.length ; i++)
        {

            b_p = Math.min(prices[i] , b_p);

            int profit = prices[i] - b_p;

            max_p = Math.max(profit , max_p);
        }

        return max_p;
    }
}
