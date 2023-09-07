package searching;

public class SearchA2DMatrixII {
	// https://leetcode.com/problems/search-a-2d-matrix-ii/description/
	// 240. Search a 2D Matrix II
	  public boolean searchMatrix(int[][] matrix, int target) {
	        int row = 0;
	        int col = matrix[0].length - 1;
	        if(matrix.length == 1)
	            return binarySearch(matrix, 0, col, target);
	        while(row < matrix.length && col >= 0){
	            if(matrix[row][col] == target)
	                return true;
	            else if(target < matrix[row][col])  
	                col--;
	            else
	                row++;    
	        }
	        return false;
	    }

	    boolean binarySearch(int[][] matrix , int start, int end, int target){
	        while(start <= end){
	            int mid = start + (end - start) / 2;
	            if(matrix[0][mid] == target)
	                return true;
	            else if(matrix[0][mid] > target) 
	                end = mid - 1;
	            else
	                start = mid + 1;       
	        }
	        return false;
	    }
}
