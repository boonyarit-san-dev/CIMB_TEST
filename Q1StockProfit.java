public class Q1StockProfit {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Q1StockProfit solution = new Q1StockProfit();
        // Test Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Example 1: " + solution.maxProfit(prices1));
        // Test Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Example 2: " + solution.maxProfit(prices2));
    }
}