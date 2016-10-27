package array;
/**
 * 121.Best Time to Buy and Sell Stock
 * You have an array for which the i-th element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction,design an algorithm to
 * find the maximum profit.
 * 动态规划
 * 2016.10.27
 * */

public class Solution121 {
	public int maxProfit(int[] prices){
		if (prices.length==0) return 0;
		int buy=prices[0];
		int max=0;
		for(int i=0;i<prices.length;i++){
			if(prices[i]<buy){
				buy=prices[i];
			}
			prices[i]=prices[i]-buy;//将原数组转换成利润数组[0,0,4,2,5,3]
			if(max<prices[i]){
				max=prices[i];
			}
			
		}
		return max;
		
	}
	public static void main(String args[]){
		int[] input={7,1,5,3,6,4};
		System.out.println(new Solution121().maxProfit(input));
	}

}
