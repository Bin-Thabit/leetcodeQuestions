package leetCode;

public class FirstBadVersion {
	// https://leetcode.com/problems/first-bad-version/description/
	// 278. First Bad Version
	// Using binary search
	/*
	 public int firstBadVersion(int n) {
	      int start = 1;
	      int end = n;
	     
	      while(start < end){
	          int mid = start + (end - start) / 2;
	          boolean isBad = isBadVersion(mid);
	          if(isBad == true)
	            end = mid;
	          else
	            start = mid + 1;  
	        }
	      return end;
	    }
	*/
}
