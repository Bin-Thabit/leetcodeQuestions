package searching;

public class SearchinRotatedSortedArray {
	 // https://leetcode.com/problems/search-in-rotated-sorted-array/description/
		// 33. Search in Rotated Sorted Array
	    static int search(int[] array, int target) {
			int pivot =  findPivot(array);
			if(pivot == -1)
				return binarySearch(array, target, 0 , array.length - 1 );
			else if(array[pivot] == target)
				return pivot;
			else if(array[0] > target)
				return binarySearch(array, target, pivot + 1 , array.length - 1 );
			else
				return binarySearch(array, target, 0 ,pivot );
		}
		// Here this method returned the pivot
		// pivot: the largest element in the array
		static int findPivot(int []array) {
			int start = 0;
			int end = array.length - 1;
			while(start <= end) {
				int mid = start + (end - start) / 2;
				if(mid < end && array[mid] > array[mid + 1])
					return mid;
				else if(mid > start && array[mid] < array[mid - 1])
					return mid - 1;
				else if(array[start] >= array[mid])
					end = mid - 1;
				else
					start = mid + 1;
			}
			return -1;
		}
		// Binary search
		static int binarySearch(int [] nums, int target , int s, int e) {
			int start = s;
			int end = e;
			
			while(start <= end) {
				int mid = start + (end - start) /2;
				if(nums[mid] == target)
					return mid;
				else if(target < nums[mid])
					end = mid - 1;
				else
					start = mid + 1; 
			}
			// return -1 if it doesn't exist
			return -1;
		}
}
