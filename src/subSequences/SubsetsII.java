package subSequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
	
	// https://leetcode.com/problems/subsets-ii/description/
	// 90. Subsets II
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        // Sort the array first
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList();
        outer.add(new ArrayList());

        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            start = 0;
            // Check if the element is equal to the previous element
            if(i > 0 && nums[i] == nums[i - 1]){
                start = end;
            }
            int n = outer.size();
            end = n;
            for(int j = start; j < n; j++){
                List<Integer> internal = new ArrayList(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
