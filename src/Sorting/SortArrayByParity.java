package Sorting;

public class SortArrayByParity {
	// https://leetcode.com/problems/sort-array-by-parity/description/
	// 905. Sort Array By Parity
	
	
	// Solution 1
	public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
           if(nums[start] % 2 == 1 && nums[end] % 2 == 0){
               swap(nums, start , end);
               start++;
               end--;
           } 
           else if(nums[start] % 2 == 1 && nums[end] % 2 == 1){
               end--;
           }
           else {
               start++;
           }    
        }
        return nums;
    }
    public void swap(int[] nums , int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    // Solution 2
    /*
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int p1 = 0;
        int p2 = nums.length - 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] %2 == 0)
                ans[p1++] = nums[i];
            else
                ans[p2--] = nums[i];
        } 

        return ans;
    }
    */

}
