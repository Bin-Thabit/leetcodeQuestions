package leetCode;

import java.util.HashSet;

public class IntersectionofTwoArrays {

	// https://leetcode.com/problems/intersection-of-two-arrays/description/
	// 349. Intersection of Two Arrays
	
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        createSet(set1,nums1);
        HashSet<Integer> set2 = new HashSet<Integer>();
        createSet(set2,nums2);
        // Here to find the intersection
        set1.retainAll(set2);
        int[] arr = new int[set1.size()];
        int i = 0;
        for(int element : set1){
            arr[i] = element;
            i++;
        }
       return arr;    
    }
	// This method to convert array to hashset
    static void createSet(HashSet<Integer> set, int[] array){
        for(int num : array)
            set.add(num);
    }
}
