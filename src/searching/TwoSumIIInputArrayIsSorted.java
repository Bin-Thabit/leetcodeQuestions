package searching;

public class TwoSumIIInputArrayIsSorted {

	// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
	// 167. Two Sum II - Input Array Is Sorted
	// Using Brute Force Approach
	 public int[] twoSum(int[] numbers, int target) {
	       
	        int start = 0;
	        int end = numbers.length - 1;
	        while(start < end) {
	        	int sum = numbers[start] + numbers[end];
	        	if(sum == target && start != end)
	        		return new int[] {start + 1 , end + 1};
	        	else if(sum > target)
	        		end--;
	        	else
	        		start++;
	        }
	        return new int [] {-1,-1};
	        
	    }
}
