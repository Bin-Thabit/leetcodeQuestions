package StringQuestions;

public class ShuffleString {
	
	// https://leetcode.com/problems/shuffle-string/description/
	// 1528. Shuffle String
	 public String restoreString(String s, int[] indices) {
	        char [] letter = new char[indices.length];
	        for(int i= 0; i < letter.length; i++){
	            int letterIndex = indices[i];
	            letter[letterIndex] = s.charAt(i); 
	        }
	        String correctString = String.valueOf(letter);
	        return correctString;
	    }
}
