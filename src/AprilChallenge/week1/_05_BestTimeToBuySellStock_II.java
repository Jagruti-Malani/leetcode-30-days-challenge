package AprilChallenge.week1;

public class _05_BestTimeToBuySellStock_II {
    /*
        Time Complexity : O(N)
        Space Complexity : O(1)
    */
    public static int maxProfit(int[] prices) {
        int max = 0;
        
        for(int i = 1; i < prices.length; i++)
            if(prices[i] > prices[i-1])
                max += prices[i] - prices[i-1];
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {1,2,3,4,5}));
    }
}