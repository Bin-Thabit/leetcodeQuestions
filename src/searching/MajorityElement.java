package searching;

import java.util.Arrays;

public class MajorityElement {

	// https://leetcode.com/problems/majority-element/description/
	// 169. Majority Element
	
	// Solution 1
	// Moore's Voting Algorithm
	public int majorityElement(int[] nums) {
	      int el = 0;
	      int count = 0;
	      for(int i = 0; i < nums.length; i++){
	          if(count == 0){
	              el = nums[i];
	              count++;
	          }
	          else if(nums[i] == el){
	              count++;
	          }
	          else
	              count--;
	      }
	      return el;  
	 }
	
	// Solution 2
	// First, sort the array ,The majority number will appear in the middle
	/*
	public int majorityElement(int[] nums) {
	      Arrays.sort(nums);
	      int n = nums.length;
	      return nums[n / 2];
	 }
	 */
}
