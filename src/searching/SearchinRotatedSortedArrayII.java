package searching;

public class SearchinRotatedSortedArrayII {
	// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
	// 81. Search in Rotated Sorted Array II
	//
	public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        boolean firstHalf = binarySearch(nums, target , 0, pivot);
        boolean secondHalf = binarySearch(nums, target , pivot + 1, nums.length - 1);
        if(pivot == -1)
            return binarySearch(nums, target , 0, nums.length - 1);
        else{
            if(firstHalf)
                return firstHalf;
            else
                return secondHalf;   
        }    

    }
	// here to find the pivot with duplicate elements
    int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1] )
                return mid;
            else if(mid > start && nums[mid] < nums[mid - 1] )
                return mid - 1;
            else if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                if(nums[start] > nums[start + 1])
                    return start;
                else if( nums[end] < nums[end - 1])
                    return end - 1;
                start++;
                end--;        
            }

            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) 
                start = mid + 1;  
            else
                end = mid;    

        }
        return -1;
    }

    boolean binarySearch(int [] nums, int target, int s, int e){
        int start = s;
        int end = e;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid])
                return true;
            if(target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;    
    }
    return false;
 }
}
