package searching;

public class RotationCountinRotatedSortedarray {
	// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
	// Q ) Find the Rotation Count in Rotated Sorted array
	
	/* Given an array arr[] of size N having distinct numbers sorted in increasing
	order and the array has been right rotated (i.e, the last element will be cyclically 
	shifted to the starting position of the array) k number of times,
	the task is to find the value of k.
	*/
	public static void main(String[] args) {
		int [] array = {15, 18, 2, 3, 6, 12};
		int pivot = findPivot(array);
		// Here adding the index of the pivot with 1 to find the number of rotations
		// if the pivot = -1, that means this is a normal ascending array
		// and when we add this with 1, we will get 0 that means
		// the number of rotation is 0
		int numberOfRotations = pivot + 1;
		System.out.println("Number of rotations = " + numberOfRotations);
	}
	
	// This method is to find the pivot in the array
	public static int findPivot(int [] array) {
		int start = 0;
		int end = array.length - 1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(mid < end && array[mid] > array[mid + 1])
				return mid;
			else if(mid > start && array[mid] < array[mid -1])
				return mid - 1;
			else if(array[start] >= array[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		// if the pivot is not there in the array that means this is a normal ascending array
		// which will return -1 
		return -1;
	}
}
