package leetCode;

public class ValidPerfectSquare {
	// https://leetcode.com/problems/valid-perfect-square/description/
	// 367. Valid Perfect Square
	// Using binary search
	public boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long power = mid * mid;
            if(power == num)
                return true;
            else if(power > num)
                end = mid - 1;
            else
                start = mid + 1;        
        }
        return false;
    }
}
