package leetCode;

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
public class FindinMountainArray {
	// https://leetcode.com/problems/find-in-mountain-array/description/
	// 1095. Find in Mountain Array
	// Binary search
	
	
public int findInMountainArray(int target, MountainArray mountainArr) {
	int peak = findThePeak(mountainArr);
	// here i replace the end argument with the peak
	int ascAns = ascendingOrder(mountainArr,target ,0, peak);
	// here i replace the start argument with the peak
	int desAns = desscendingOrder(mountainArr,target , peak ,mountainArr.length() - 1);
	// if the ascAns = -1 return the desAns
	if(ascAns == -1)
		return desAns;
	// Otherwise return the ascAns
	else
		return ascAns;
		
}
// Here in this method i return the peak of the array 
// to separate between the ascending part and descending part 
public int findThePeak(MountainArray mountainArr){
	int start = 0;
	int end = mountainArr.length() - 1;
	while(start < end) {
		int mid = start + (end - start) / 2;
		if(mountainArr.get(mid) > mountainArr.get(mid+1))
			end = mid;
		else
			start = mid + 1;
	}
	return end;
}
// Binary search in the ascending order part
public int ascendingOrder(MountainArray mountainArr, int target , int s, int e) {
	int start = s;
	int end = e;
	while(start <= end) {
		int mid = start + (end - start) / 2;
		if(target == mountainArr.get(mid))
			return mid;
		else if(target < mountainArr.get(mid))
			end = mid - 1;
		else
			start = mid + 1;
	}
	return -1;
}
//Binary search in the descending order part
public int desscendingOrder(MountainArray mountainArr, int target , int s, int e) {
	int start = s;
	int end = e;
	while(start <= end) {
		int mid = start + (end - start) / 2;
		if(target == mountainArr.get(mid))
			return mid;
		else if(target > mountainArr.get(mid))
			end = mid - 1;
		else
			start = mid + 1;
	}
	return -1;

  }
}