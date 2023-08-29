package leetCode;

public class CountNegativeNumbersinaSortedMatrix {
	// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
	// 1351. Count Negative Numbers in a Sorted Matrix
	
	public int countNegatives(int[][] grid) {
        int negativeNumber = 0;
        // Here it passed for each row 
        for(int i = 0; i < grid.length; i++){
           int count = negativeCount(grid , i);
           negativeNumber += count;
        }
        return negativeNumber;
    }

    // Here this method to find the counter of negative numbers in each row
    int negativeCount(int [][] grid ,int row){
        int counter = 0;
        int start = 0;
        int end = grid[row].length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(grid[row][mid] < 0){
                end = mid - 1;
                counter = grid[row].length - mid;
            }
            else
                start = mid + 1;
        }
        return counter;
    }
}
