package Maths;

public class FindGreatestCommonDivisorofArray {

	public int findGCD(int[] nums) {
        int min = nums[0];
		int max = nums[0];
       for(int i = 1; i < nums.length; i++){
            int checkMin = Math.min(min, nums[i]);
            min = checkMin;
            int checkMax = Math.max(max, nums[i]);
            max = checkMax;
        }
        int ans = gcd(max, min);
        return ans;
    }

    // Using Euclidean algorithm
	int gcd(int x, int y) {
		int gcd = y;
		if(x == y)
			return x;
		while((x % y) != 0) {
			gcd = x % y;
			x = y;
			y = gcd;
		}
		
		return gcd;
	}
}
