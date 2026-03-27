class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int n = prices.length;
        int mini = prices[0];
        int maxiprofit = Integer.MIN_VALUE;
        for(int i =0 ;i < n;i++){
            if(prices[i] < mini){
                mini = prices[i];
            }
            maxiprofit = Math.max(maxiprofit , prices[i]-mini);
        }
        return maxiprofit;
        
    }
}