package leetCode;

public class SplitArrayLargestSum {
	 // https://leetcode.com/problems/split-array-largest-sum/
	 // 410. Split Array Largest Sum
	
	 int splitArray(int [] array , int m) {
		int low = 0;
		int high = 0;
		for(int i = 0; i < array.length; i++) {
			low = Math.max(low, array[i]);
			high += array[i];  
		}
		// Binary search
		while(low < high) {
			// Try for the middile as a potential answer
			int mid = low + (high - low) / 2;
			
			// calculate how many peaces you can divided it with the max sum
			int sum = 0;
			int pieces = 1;
			for(int num: array) {
				if(sum + num > mid) {
					// You cannot add this in this subarray, make new one
					// say you add this num in new subarray, sum = num
					sum = num;
					pieces++;
				}
				else
					sum += num;	
			}
			// If the pieces > m then low = mid + 1
			// Otherwise high = mid
			if(pieces > m) 
				low = mid + 1;
			else
				high = mid;
		}
		return high; // here low == high
	}
}
