package searching;

import java.util.HashSet;

public class CheckIfNandItsDoubleExist {
	// https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
	// 1346. Check If N and Its Double Exist
	
	// Solution 1
	// HashSet
	public boolean checkIfExist(int[] arr) {
	       HashSet<Integer> set = new HashSet<Integer>();
	       for(int num : arr){
	           if(set.contains(num * 2) || (num%2 == 0 && set.contains(num/2)))
	                return true;
	           set.add(num); 
	       }
	       return false;
	     }
	
	/*
	// Solution 2
	// nested loop
	public boolean checkIfExist(int[] arr) {
	       for(int i = 0; i < arr.length; i++){
	           for(int j = 0; j < arr.length; j++){
	               if(arr[i] == arr[j] * 2 && i != j)
	                return true;
	           }
	       }
	       return false;
	    }
	   */
	/*
	// Solution 3
	// Binary Search
	 public boolean checkIfExist(int[] arr) {
	        Arrays.sort(arr);
	        for(int i = 0; i < arr.length; i++){
	            int target = arr[i] * 2;
	            if(binarySearch(arr, target, i))
	                return true;
	        }
	        return false;
	    }

	     boolean binarySearch(int[] arr, int target , int index){
	         int start = 0;
	         int end = arr.length - 1;
	         while(start <= end){
	             int mid = start + (end - start) / 2;
	             if(target == arr[mid] && mid != index )
	                 return true;
	             else if(target < arr[mid])
	                 end = mid - 1;
	             else
	               start = mid + 1;        
	         }
	         return false;
	     }
	     */
}
