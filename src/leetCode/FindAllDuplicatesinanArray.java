package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
	// https://leetcode.com/problems/find-all-duplicates-in-an-array/
	// 442. Find All Duplicates in an Array
	
	public List<Integer> findDuplicates(int[] nums) {
	    
        List<Integer> duplicateNums = new ArrayList<Integer>();
        int i = 0;
        while(i < nums.length){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct])
                    swap(nums,i,correct);
                else
                   i++;          
            }

            for(int j = 0; j < nums.length; j++ ){
                if(nums[j] != j+1)
                    duplicateNums.add(nums[j]);
            }

            return duplicateNums;
        }
        public void swap(int[] nums, int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }

}
