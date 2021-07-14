package testproject;

public class Findmaxprofit {
	public static int maxprofit(int[]prices) {
		int n = prices.length; 
		int cost =0; 
		int maxcost =0; 
		
		if(n==0) {
			return 0;
		}
		// store the first elements of array in a variable 
		int min_price = prices[0];
		for (int i =0; i < n; i++) {
			// now compare first element with all the element of array and find the min element 
			min_price = Math.min(min_price, prices[i]);
			// since min_price is smallest element of the array 
			// so subtract with every elements of the array and return the maxcost 
			cost = prices[i]-min_price;
			maxcost = Math.max(maxcost, cost);
			
		}
		return maxcost;
	}
	// driver code 
	public static void main(String []args) {
		// stock prices on consecutive days 
		int prices[] = {7,1,5,3,6,4};
		System.out.println(maxprofit(prices));
	}

}
