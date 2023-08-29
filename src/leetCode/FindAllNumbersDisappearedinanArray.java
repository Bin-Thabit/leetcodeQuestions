package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
	// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
	// 448. Find All Numbers Disappeared in an Array
	 public List<Integer> findDisappearedNumbers(int[] nums) {
	        int i = 0;
	        while(i < nums.length){
	            int correct = nums[i] - 1;
	            if(nums[i] != nums[correct])
	                swap(nums,i,correct);
	            else
	                i++;  
	        }
	        List<Integer> missingNumbers = new ArrayList<Integer>();
	        for(int index = 0; index < nums.length; index++){
	            int check = index+1;
	            if(nums[index] != check)
	                missingNumbers.add(check);
	        }
	        return missingNumbers;
	    }

	    public void swap(int[] arr, int first, int second){
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }
}
