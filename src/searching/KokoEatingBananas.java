package searching;

public class KokoEatingBananas {
	// https://leetcode.com/problems/koko-eating-bananas/description/
	// 875. Koko Eating Bananas
	
	public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = maxBanana(piles);
        while(start < end){
            int mid = start + (end - start) / 2;
            if(getHoursToEat(piles,mid) <= h)
                end = mid;
            else
                start = mid + 1;    
        }
        return end;
    }

    int getHoursToEat(int[] piles, int h){
        int sum = 0;
        for(int i = 0; i < piles.length; i++){
            sum += Math.ceil((double)piles[i] / h);
        }
        return sum;
    }

    int maxBanana(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > max)
                max = piles[i];
        }
        return max;
    }

}
