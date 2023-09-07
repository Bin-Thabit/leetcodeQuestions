package searching;

public class FindMinimuminRotatedSortedArrayII {

	// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
	// 154. Find Minimum in Rotated Sorted Array II
	public int findMin(int[] nums) {
        int peak = findPeak(nums);
        int min = nums[peak+1];
        return min;
    }

    // This method is to find the peak in the array with duplicates elements
    public int findPeak(int[]nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1])
                return mid;
            else if(mid > start && nums[mid] < nums[mid-1])
                return mid - 1;
           else if(nums[mid] == nums[start] && nums[mid] == nums[end]){
               if(nums[start] > nums[start+1])
                    return start;
               else if(nums[end] < nums[end-1])
                return end - 1;
              start++;
              end--;        
           }
           else if(nums[start] < nums[mid] || nums[mid] == nums[start] && nums[mid] > nums[end])
                start = mid + 1;
           else
                end = mid;             
        }
        //If there is no peak that means it is normal sorted array, so return -1
        return -1;
    }
}
