package leetCode;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class GuessNumberHigherorLower {
	// https://leetcode.com/problems/guess-number-higher-or-lower/description/
	// 374. Guess Number Higher or Lower
    
	// I commented the answer because there is a method which was implemented from other class
	// This class was hidden in the leetcode
	// So we used binary search
	/*
	public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int number = guess(mid);
            if(number == 0)
                return mid;
            else if(number == -1)
                end = mid - 1;
            
            else
                start = mid+1; 
                      
        }
        return -1;
    }
    */
}
