class Solution {
    public int maxProfit(int[] prices) {
        int currmin = Integer.MAX_VALUE;
        int maxprofit = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            currmin = Math.min(currmin,prices[i]);
            maxprofit = Math.max(maxprofit,prices[i]-currmin);
        }
        return maxprofit;
    }
}