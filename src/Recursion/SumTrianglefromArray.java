package Recursion;

import java.util.Arrays;

public class SumTrianglefromArray {

	// https://www.geeksforgeeks.org/sum-triangle-from-array/
	// Sum triangle from array
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		printArray(arr);
	}
	
	static void printArray(int[] nums) {
		if(nums.length == 0)
			return;
		
		int[] temp = new int[nums.length - 1];
		for (int i = 0; i < temp.length; i++) {
			int sum = nums[i] + nums[i+1];
			temp[i] = sum;
		}
		
		printArray(temp);
		System.out.println(Arrays.toString(nums));
	}
}
