package searching;

public class SpecialArrayWithXElementsGreaterThanorEqualX {
	// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
	// 1608. Special Array With X Elements Greater Than or Equal X
	
	// Binary search
	public int specialArray(int[] nums) {
        int start = 0;
        int end = nums.length;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int target = count(nums,mid);
            if(target == mid)
                return mid;
            else if(target < mid)
                end = mid - 1;
            else
                start = mid + 1;        
        }
        return -1;
    }
    // here to check if the mid is greater or equal the 
    int count(int[] arr, int num){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(num <= arr[i])
                count++;
        } 
        return count; 
    }
}
