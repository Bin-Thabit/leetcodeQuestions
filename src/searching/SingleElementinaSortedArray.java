package searching;

public class SingleElementinaSortedArray {
	// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
	// 540. Single Element in a Sorted Array
	
		// Solution 1
		// 2 pointers
	public int singleNonDuplicate(int[] nums) {
		  int start = 0;
		  int end = nums.length - 1;
		// if the length is 1 then return the element
		  if(nums.length == 1)
		     return nums[0];
		  while(start <= end){
		    // If the element[start] is not equal the next element
		    // then return element[start]
		     if(nums[start] != nums[start + 1])
		          return nums[start];
		    // If the element[end] is not equal the previous element
		    // then return element[end]
		     else if(nums[end] != nums[end - 1])
		          return nums[end]; 
		    // Otherwise, increment start by 2 and decrement end by 2    
		     else{
		        start += 2;
		        end -= 2;
		        }      
		    }
		     return -1;        
	   }
	    		    
		// Solution 2
		// Binary Search 

	/*
	public int singleNonDuplicate(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
	
		  while(start < end){
		     int mid = start + (end - start) / 2;
		         if(mid % 2 == 1)
		              mid--;
		         if(nums[mid] != nums[mid+1])
		              end = mid;
		         else
		              start = mid + 2;        
		        }
		    return nums[end];

    }
    */
  }
