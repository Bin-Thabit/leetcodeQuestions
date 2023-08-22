package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char [] letters = {'c', 'f', 'j'};
		System.out.println(Arrays.toString(letters));
		System.out.println("Enter a letter to find the smallest letter greater than the target");
		char target = in.next().charAt(0);;
		char ans = nextGreatestLetter(letters,target);
		System.out.println("smallest letter greater than the " + target + " = " + ans);
	}
	
	static char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;
		if(target >= letters[end])
			return letters[0];
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < letters[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		
		return letters[start];
	}

}
