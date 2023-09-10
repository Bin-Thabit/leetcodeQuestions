package bitWiseQuestions;

public class CountingBits {
	// https://leetcode.com/problems/counting-bits/description/
	// 338. Counting Bits
	
	// Both of the solutions have the same time complexity = O(n)
	// Solution 1
	public int[] countBits(int n) {
        int [] countingBits = new int[n+1];
        for(int i = 1; i <= n; i++){
           countingBits[i] = countingBits[i >> 1] + i % 2;
        }
        return countingBits;
    }
	
	// Solution 2
	/*
	public int[] countBits(int n) {
        int [] countingBits = new int[n+1];
        for(int i = 0; i <= n; i++){
           if(i%2 == 0)	
        	   countingBits[i] = countingBits[i / 2];
           else
        	   countingBits[i] = countingBits[i / 2] + 1;
        }
        return countingBits;
    }
    */

}
