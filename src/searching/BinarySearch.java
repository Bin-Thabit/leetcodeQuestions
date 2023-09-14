package searching;

public class BinarySearch {
	// https://leetcode.com/problems/binary-search/description/
	// 704. Binary Search
	
	public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid])
                return mid;
            else if(target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;        
        }
        return -1;
    }
	
	// Using recursion
	/*
	 public int search(int[] nums, int target) {
	       int ans = binarySearch(nums, target, 0, nums.length - 1);
	       return ans;
	    }

	    static int binarySearch(int[] arr, int target, int start, int end){
	        if(start > end)
	            return -1;
	        int mid = start + (end - start) / 2;
	        if(arr[mid] == target)
	            return mid;
	        else if(target < arr[mid])
	            return binarySearch(arr, target, start, mid - 1);
	        else
	            return binarySearch(arr, target, mid + 1, end);            
	    }
	 */

}
