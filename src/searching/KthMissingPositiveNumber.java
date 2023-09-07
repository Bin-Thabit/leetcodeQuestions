package searching;

public class KthMissingPositiveNumber {
	// https://leetcode.com/problems/kth-missing-positive-number/description/
	// 1539. Kth Missing Positive Number

	public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int count = 0;
        int check = 1;
        while(i < arr.length){
            if(count == k)
               return check - 1;
            if(arr[i] != check){
                count++;
                check++;
            }
            else{
                i++;
                check++;
            }
        }
       
        return arr.length + k;
    }
}
