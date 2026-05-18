class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0;
        int profit = 0; 
        int cp = prices[0];
        for(int i = 0; i < prices.length;i++){
            if (prices[i] < cp){
                cp =prices[i];
            }
            else {
                profit = prices[i] - cp;
                maxi = Math.max(profit , maxi);
            }
        }
        return maxi;
    }
}