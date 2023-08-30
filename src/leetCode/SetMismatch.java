package leetCode;

public class SetMismatch {
	// https://leetcode.com/problems/set-mismatch/description/
	// 645. Set Mismatch
	 public int[] findErrorNums(int[] nums) {
	        int i = 0;
	        while(i < nums.length){
	                int correct = nums[i] - 1;
	                if(nums[i] != nums[correct])
	                    swap(nums,i,correct);
	                else
	                   i++;        
	            }
	            for(int j = 0; j < nums.length; j++){
	                if(nums[j] != j+1)
	                     return new int[]{nums[j], j+1};
	            }
	            return new int[]{0, 0};
	         }

	  public void swap(int[] nums, int first, int second){
	       int temp = nums[first];
	       nums[first] = nums[second];
	       nums[second] = temp;
	   }
}
