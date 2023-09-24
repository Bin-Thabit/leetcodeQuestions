package Sorting;

public class MergeSortedArray {

	// https://leetcode.com/problems/merge-sorted-array/description/
	// 88. Merge Sorted Array
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
	       int p1 = m - 1;
	       int p2 = n - 1;
	       int pMerge = nums1.length - 1;

	       while(p2 >= 0){
	           if(p1 >= 0 && nums1[p1] > nums2[p2]){
	               nums1[pMerge] = nums1[p1];
	               pMerge--;
	               p1--;
	           }
	           else{
	               nums1[pMerge] = nums2[p2];
	               pMerge--;
	               p2--;
	           }
	       }
	    }


}
