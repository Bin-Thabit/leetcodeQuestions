package StringQuestions;

public class CheckIfTwoStringArraysareEquivalent {

	// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
	// 1662. Check If Two String Arrays are Equivalent

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return combineString(word1).equals(combineString(word2));
    }

    public String combineString(String[] word){
         StringBuilder w1 = new StringBuilder();
       for(int i = 0; i < word.length; i++){
            w1.append(word[i]);
        } 
        return w1.toString();
    }
}
