package bitWiseQuestions;

public class SingleNumber {
	// https://leetcode.com/problems/single-number/description/
	// 136. Single Number
	
	// XOR Bitwise operator
	public int singleNumber(int[] nums) {
        int unique = 0;
        for(int i = 0; i < nums.length; i++){
            unique ^= nums[i];
        }
        return unique;
    }
}
