package searching;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArraysII {
	// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
	// 350. Intersection of Two Arrays II

	public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int pointer1 = 0;
        int pointer2 = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(pointer1 < nums1.length && pointer2 < nums2.length){
            if(nums1[pointer1] > nums2[pointer2]){
                pointer2++;
            }
            else if(nums1[pointer1] < nums2[pointer2]) {
                    pointer1++;
            }
            else{
                list.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
