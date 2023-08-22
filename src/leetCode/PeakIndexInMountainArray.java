package leetCode;

public class PeakIndexInMountainArray {
	// https://leetcode.com/problems/peak-index-in-a-mountain-array/
	// 852. Peak Index in a Mountain Array
	// Using binary search
	// Solution 1
	public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end ) {
			int mid = start + (end - start) / 2;
			// You are in ascending order
			// This may be the answer, but look at the left
			// that why end != mid - 1 
			if(arr[mid] > arr[mid+1])
				end = mid;
			// You are in descending part, look at the right
			else if(arr[mid] < arr[mid+1] )
				start = mid + 1;
	   }
        // At the end, the start and the end are pointing to the largest element
        // because of the 2 checks
		return end;
    }
	// Solution 2
	/*
	public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end ) {
			int mid = start + (end - start) / 2;
			if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
				return mid;
			else if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1])
				end = mid - 1;
			else
				start = mid + 1;
	   }
		return -1;
    }
    */
}
