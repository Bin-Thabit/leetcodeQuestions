package Sorting;

public class SortArrayByParityII {

	// https://leetcode.com/problems/sort-array-by-parity-ii/description/
	// 922. Sort Array By Parity II
	public  int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        // p1 for even number
        int p1 = 0;
        // p2 for odd number
        int p2 = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                ans[p1] = nums[i];
                p1 += 2;
            }
            else{
                ans[p2] = nums[i];
                p2 += 2;
            }
        }
        return ans;
    }
}
