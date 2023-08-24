package leetCode;

public class SearchInsertPosition {

	// https://leetcode.com/problems/search-insert-position/
	// 35. Search Insert Position
	// Using binary search
	 public int searchInsert(int[] nums, int target) {
	        int start = 0;
	        int end = nums.length - 1;
	        while(start <= end){
	            int mid = start + (end - start) / 2;
	            // If the target was found then return the index of it
	            if(nums[mid] == target)
	                return mid;
	            else if(nums[mid] > target)
	                end = mid - 1;
	            else
	                start = mid + 1;        
	        }
	        // if the target was not found then return the start
	        // which means that will be the index of target if it was found
	        return start;
	    }
}
