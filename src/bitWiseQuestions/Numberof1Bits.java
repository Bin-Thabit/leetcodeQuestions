package bitWiseQuestions;

public class Numberof1Bits {
	
	// https://leetcode.com/problems/number-of-1-bits/description/
	// 191. Number of 1 Bits
	
	// Solution 1
	 public int hammingWeight(int n) {
	        int count = 0;
	        while(n != 0){
	            n = n & (n-1);
	            count++;
	        }
	        return count;
	   }
	 // Solution 2
	 /*
	 public int hammingWeight(int n) {
	        int i = 0;
	        int count = 0;
	        while(i < 32){
	            if((n & 1) > 0)
	                count++;
	            n = n>>1;    
	            i++;
	        }
	        return count;
	    }
	    */
}
