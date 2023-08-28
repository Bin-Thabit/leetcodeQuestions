package leetCode;

public class ArrangingCoins {

	// https://leetcode.com/problems/arranging-coins/description/
	// 441. Arranging Coins
	 public int arrangeCoins(int n) {
	       long start = 1;
	       long end = n;
	       while(start <= end){
	           long mid = start + (end - start) / 2;
	           long completeCoins = (mid * (mid+1)) / 2;
	           if(completeCoins <= n)
	            start = mid + 1;
	           else
	            end = mid - 1;  
	       } 
	       return (int)start - 1;
	    }
}
