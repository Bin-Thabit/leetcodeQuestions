package LinkedList;

public class Happy_Number {

	// https://leetcode.com/problems/happy-number/description/
	// 202. Happy Number
	
	// Fast and slow Approach
	public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);
        if(slow == 1)
            return true;

        return false;
        
    }

    int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int mod = num % 10;
            ans += mod * mod;
            num /= 10;
        }
        return ans;
    }     


}
