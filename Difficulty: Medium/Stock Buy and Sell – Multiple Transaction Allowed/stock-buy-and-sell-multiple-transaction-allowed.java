class Solution {
    public int maxProfit(int prices[]) {
        // code here
         int profitSum=0;
         for(int i =0;i <prices.length-1;i++){
             if(prices[i+1] > prices[i]){
                 profitSum  += prices[i+1]-prices[i];
         }
         }
         return profitSum;
    }
}