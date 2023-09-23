package searching;

import java.util.HashSet;

public class IntersectionofTwoArrays {

	// https://leetcode.com/problems/intersection-of-two-arrays/description/
	// 349. Intersection of Two Arrays
	
	// Solution 1
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
    
    // Solution 2
    /*
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        // Thus counter to know the size of the array
        int counter = 0;
        for(int i = 0; i < nums1.length; i++){
            // Here every elements you found temp[nums1[i]] = 1
            temp[nums1[i]] = 1;
        }

        for(int i = 0; i < nums2.length; i++){
            // Here every elements you found which is exist in nums1 temp[nums2[i]] = 2
            // and add the counter by 1
           if(temp[nums2[i]] == 1){
               temp[nums2[i]] = 2;
               counter++; 
           }
        }
        
        int[] ans = new int[counter];
        for(int i = 0 , j = 0; i < temp.length && j < counter; i++){
            // If you found any element = 2, then add it to the ans array
            if(temp[i] == 2){
                ans[j] = i;
                j++;
            }
        }

        return ans;

    }
    */
}
