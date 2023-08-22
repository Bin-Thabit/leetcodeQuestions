package leetCode;

public class FindPeakElement {
	// https://leetcode.com/problems/find-peak-element/description/
	// 162. Find Peak Element
	// Using binary search
	// it is the same answer of the [ 852. Peak Index in a Mountain Array ]
	// i already solve it 
	public int findPeakElement(int[] nums) {
        int start = 0;
       int end = nums.length - 1;
       while(start < end ) {
			int mid = start + (end - start) / 2;
			// You are in ascending order
			// This may be the answer, but look at the left
			// that why end != mid - 1 
			if(nums[mid] > nums[mid+1])
				end = mid;
			// You are in descending part, look at the right
			else if(nums[mid] < nums[mid+1] )
				start = mid + 1;
	   }
       // At the end, the start and the end are pointing to the largest element
       // because of the 2 checks
		return end;
   }
}
