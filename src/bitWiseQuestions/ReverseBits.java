package bitWiseQuestions;

public class ReverseBits {
	
	// https://leetcode.com/problems/reverse-bits/description/
	// 190. Reverse Bits

    public int reverseBits(int n) {
        int count = 0;
        int num = 0;
        while(count < 32){
           num = num <<1;
           if((n & 1) > 0){
              num ++;
           }
            n = n >> 1; 
            count++;
        }
        return num;
    }
}
