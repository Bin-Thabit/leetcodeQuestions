package leetCode;

public class SearchinRotatedSortedArray {
	
	public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int firstHalf = binarySearch(nums , target , 0 , pivot);
        int secondHalf = binarySearch(nums , target , pivot+1 , nums.length - 1);
        if(firstHalf == -1)
            return secondHalf;
        else
            return firstHalf;  
    }
	// Here this method returned the pivot
	// pivot: the largest element in the array
    public int findPivot(int [] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1])
                return mid;
            else if(mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            else if(nums[mid] <= nums[start])
                end = mid - 1;
            else
                start = mid + 1;                    
        }
        return end;
    }
    // Normal binary search
    int binarySearch(int [] nums, int target , int s, int e){
        int start = s;
        int end = e;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid])
                return mid;
            else if (target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;        
        }
        return -1;
    }
}
