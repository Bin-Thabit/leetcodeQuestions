package Recursion;

public class Reverse_String {

	// Solution 1
	// Iteration
	public void reverseString(char[] s) {
        int loops = s.length / 2;
        for(int i = 0; i < loops; i++){
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
	
	// Solution 2
	// Recursion
	
	/*
	public void reverseString(char[] s) {
        helper(s,0);
    }

    public void helper(char[] s, int count){
       if(count == s.length / 2){
           return;
       }
       char temp = s[count];
       s[count] = s[s.length - count - 1];
       s[s.length - count - 1] = temp;

       helper(s,count+1);
   }
   */
	
	// Solution 3
	// 2 Pointers
	/*
	public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
     }
     
     */
	
}
