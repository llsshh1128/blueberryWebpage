public class Solution { 
	public int bestTimeStock(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        
        int result = 0;
        int curMin = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > curMin) {
                result = Math.max(result, prices[i] - curMin);
            } else {
                curMin = prices[i];
            }
        }
        
        return result;
	}
}