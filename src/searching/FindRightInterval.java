package searching;

public class FindRightInterval {
	// https://leetcode.com/problems/find-right-interval/description/
	// 436. Find Right Interval
	
	public int[] findRightInterval(int[][] intervals) {
        int[] rightInterval = new int[intervals.length];
        if(intervals.length == 1)
            forLoopForAsc(intervals,rightInterval);
        else if(intervals[0][0] < intervals[intervals.length - 1][0])
            forLoopForAsc(intervals,rightInterval);
        else
            forLoopFordes(intervals,rightInterval);

        return rightInterval;          
    }
    // This is  for loop if starti  was in ascending order
    void forLoopForAsc(int[][] intervals, int[] rightInterval){
        for(int i = 0; i < intervals.length; i++){
            int target = intervals[i][1];
            rightInterval[i] = binarySearchAsc(intervals, target);
        }
    }
    // This is  for loop if starti  was in descending order
    void forLoopFordes(int[][] intervals, int[] rightInterval ){
        for(int i = 0; i < intervals.length; i++){
            int target = intervals[i][1];
            rightInterval[i] = binarySearchDes(intervals, target);
        }
    }
    // This is binary search for starti if it was in ascending order
    int binarySearchAsc(int[][] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid][0] >= target)
                end = mid - 1;
            else
                start = mid + 1;    
        }
        if(start == arr.length)
            return -1;
        else    
            return start;
    }
    // This is binary search for starti if it was in descending order
    int binarySearchDes(int[][] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid][0] >= target)
                start = mid + 1;
            else
               end = mid - 1;    
        }
            return end;
    }

}
