package bitWiseQuestions;

public class ReverseBits {
	
	// https://leetcode.com/problems/reverse-bits/description/
	// 190. Reverse Bits

	// solution 1
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
    
    // solution 2
    /*
    public int reverseBits(int n) {
        int f = 31;
        int l = 0;
        int reverse = 0; 
        while(f > l){
            if((n & (1 << f)) != 0)
                 reverse = reverse | (1<<l);
            if((n & (1 << l)) != 0)
                 reverse = reverse | (1<<f);
            f--;
            l++;          
        }
        return reverse;
     }
     */
}
