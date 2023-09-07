package searching;

public class FindMinimuminRotatedSortedArray {
	// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
	// 153. Find Minimum in Rotated Sorted Array
	public int findMin(int[] nums) {
        int peak = findPeak(nums);
        // the minimum element is equal peak + 1
        // peak is the largest element in the array so it is obvious the min will be after it
        // but if there is no peak so it will be the first element , -1 + 1 = 0
        int min = nums[peak + 1];
        return min;
    }
	// This method is to find the peak in the array
    public int findPeak(int[]nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1])
                return mid;
            else if(mid > start && nums[mid] < nums[mid-1])
                return mid - 1;
            else if(nums[start] >= nums[mid])
                end = mid - 1;
            else
                start = mid + 1;           
        }
        //If there is no peak that means it is normal sorted array, so return -1
        return -1;
    }
}
