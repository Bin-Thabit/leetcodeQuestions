package Recursion;

public class NumberofStepstoReduceaNumbertoZero {

	// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
	// 1342. Number of Steps to Reduce a Number to Zero
	
	public int numberOfSteps(int num) {
        return helper(num , 0);
    }

    int helper(int num , int count){
        if(num == 0)
            return count;
        if(num % 2 == 0)
            return helper(num / 2 , count + 1);
        else
            return helper(num - 1 , count + 1);        
    }
}
