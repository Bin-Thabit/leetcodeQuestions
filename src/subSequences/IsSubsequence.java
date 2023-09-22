package subSequences;

public class IsSubsequence {

	// https://leetcode.com/problems/is-subsequence/description/
	// 392. Is Subsequence

	public boolean isSubsequence(String s, String t) {
	       int pointer1 = 0;
	       int pointer2 = 0;

	       while(pointer1 < s.length() && pointer2 < t.length()){
	           if(s.charAt(pointer1) == t.charAt(pointer2)){
	               pointer1++;
	           }
	           pointer2++;
	       }

	       return pointer1 == s.length();
	    }
}
