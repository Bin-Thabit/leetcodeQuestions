package searching;

import java.util.Arrays;

public class AssignCookies {

	 public int findContentChildren(int[] g, int[] s) {
	        // First Sort the two arrays
	        Arrays.sort(g);
	        Arrays.sort(s);
	        // Initialize two pointer
	        int i = 0;
	        int j = 0;
	    
	        int max = 0;
	        while(i < g.length && j < s.length){
	            // If g[i] <= s[j], increment max by 1, and increment the two pointers
	            if(g[i] <= s[j]){
	                max++;
	                i++;
	                j++;
	            }
	            // Otherwise, increment the second pointer
	            else
	                j++; 
	        }

	        return max;
	    }
}
