package bitWiseQuestions;

public class AddBinary {
	// https://leetcode.com/problems/add-binary/description/
	// 67. Add Binary

	public static String addBinary(String a, String b) {
	       StringBuilder string = new StringBuilder();
				 int carry = 0;
				 int aLength = a.length() - 1;
				 int bLength = b.length() - 1;
				 while(aLength >= 0 || bLength >= 0 || carry != 0){
					 int digitA = aLength >= 0 ? a.charAt(aLength) - '0' : 0;
					 int digitB = bLength >= 0 ? b.charAt(bLength) - '0': 0;
					 int currentSum = digitA + digitB + carry;
					 string.append(currentSum % 2);
					 carry = 	currentSum / 2;
					  aLength--;
					  bLength--;
				 }
				 return string.reverse().toString();
	    }
}
