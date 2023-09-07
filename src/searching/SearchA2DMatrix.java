package searching;

public class SearchA2DMatrix {
	// https://leetcode.com/problems/search-a-2d-matrix/description/
	// 74. Search a 2D Matrix
	
	 public boolean searchMatrix(int[][] matrix, int target) {
	        int row = matrix.length;
	        int col = matrix[0].length;
	        if(row == 1)
	            return binarySearch(matrix, 0, 0, col - 1, target);
	        // Run the loop till 2 rows are remaining
	        int rowStart = 0;
	        int rowEnd = row - 1;
	        int colMid = col / 2;
	        // While this true it will have more than 2 rows
	        while(rowStart < rowEnd - 1){
	            int mid = rowStart + (rowEnd - rowStart) / 2;
	            if(target == matrix[mid][colMid])
	                return true;
	            else if(target < matrix[mid][colMid])  
	                rowEnd = mid;
	            else
	                rowStart = mid;      
	        }
	        // Now we have two rows
	        if(target == matrix[rowStart][colMid])
	            return true;
	        else if(target == matrix[rowEnd][colMid]) 
	            return true;
	        // Search in 1st half
	        if(colMid > 0 && target <= matrix[rowStart][colMid - 1]  )
	            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
	        // Search in 2nd half
	        else if(colMid < col - 1 && target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][col - 1]) 
	              return binarySearch(matrix, rowStart, colMid + 1, col - 1, target);
	        // Search in 3rd half      
	        else if(colMid > 0 && target <= matrix[rowEnd][colMid - 1])
	             return binarySearch(matrix, rowEnd, 0, colMid - 1, target);
	        // Search in 4th half     
	        else
	             return binarySearch(matrix, rowEnd, colMid + 1, col - 1, target);                   
	    }

	    boolean binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
	        while(colStart <= colEnd){
	            int mid = colStart + (colEnd - colStart) / 2;
	            if(target == matrix[row][mid])
	                return true;
	            else if(target < matrix[row][mid])  
	                 colEnd = mid - 1;
	            else
	                colStart = mid + 1;      
	        }
	        return false;
	    }
}
