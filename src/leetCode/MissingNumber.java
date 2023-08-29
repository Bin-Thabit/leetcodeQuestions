package leetCode;

public class MissingNumber {
	// https://leetcode.com/problems/missing-number/description/
	//268. Missing Number
	
	
	// Solution 1
	// Calculate sum from 1-N by using arithmetic sequence :
	//S = (N * (N+1)) / 2 or you can use normal loop to calculate sum
	//Do the subtraction between sum with all the element of nums
	public int missingNumber(int[] nums) {
	       int n = nums.length;
	       int sum = 0;
	       int correctSum = (n * (n+1)) / 2;
	       for(int i = 0; i < nums.length; i++){
	           sum += nums[i];
	       }
	    
	    return correctSum - sum;
	    }
	
	
	// Solution 2 using cycling sort
	/*
	public int missingNumber(int[] nums) {
	       int i = 0;
	       // Sorting the array using cycling sort
	       while(i < nums.length){
	           int correct = nums[i];
	           if(nums[i] < nums.length && nums[i] != nums[correct])
	                 swap(nums,i,correct);
	           else
	                i++; 
	       }

	       // Search for the missing number
	       for(int index = 0; index < nums.length; index++){
	           if(nums[index] != index)
	              return index;
	       }

	       // If the number N doesn't exist, return N
	       return nums.length;
	    }

	    public void swap(int[] nums, int first, int second){
	        int temp = nums[first];
	        nums[first] = nums[second];
	        nums[second] = temp;
	    }
	*/
}
