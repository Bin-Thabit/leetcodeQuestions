package leetCode;

public class Sqrtx {
	// https://leetcode.com/problems/sqrtx/
	// 69. Sqrt(x)
	 public int mySqrt(int x) {
	    long start = 1L;
	    long end = x;
	    while(start <= end){
	    // here my date type i put it long because may the user enter a value greater than what 
	    // int can take
	    	long mid = (start + (end - start) / 2);
	        long check = (mid * mid);
	        if(check == x)
	        	return (int) mid;
	        else if(check > x)
	            end = mid - 1;
	        else
	            start = mid + 1;        
	        }
	      // here i cast the return value to int because my method return int value 
	      return (int) end;
	    }

}
