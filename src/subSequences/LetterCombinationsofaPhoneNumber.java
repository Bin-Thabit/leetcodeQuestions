package subSequences;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

	// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
	// 17. Letter Combinations of a Phone Number

	public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList();
        if(digits.isEmpty())
            return ans;
        ans = sub("", digits); 
        return ans; 
    }

     List <String> sub(String p , String up){
            if(up.isEmpty()){
               ArrayList<String> list = new ArrayList();
               list.add(p);
                return list;
            }
            // Convert a string number to integer
            int digit = up.charAt(0) - '0';
            int start = (digit - 2) * 3;
            int end = (digit - 1) * 3;

            if(digit == 7){
                end += 1;
            }
            else if(digit == 8){
                start += 1;
                end += 1;
            }
            else if(digit == 9){
                start += 1;
                end += 2;
            }
           List<String> comb = new ArrayList();
           for(int i = start; i < end; i++){
               char c = (char)('a' + i);
               comb.addAll(sub(p + c , up.substring(1)));
           }

           return comb;
        }
}
