package StringQuestions;

import java.util.List;

public class CountItemsMatchingaRule {
	// https://leetcode.com/problems/count-items-matching-a-rule/description/
	// 1773. Count Items Matching a Rule
	
	 public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	        int count = 0;
	        int searchIndex = 0;
	        if(ruleKey.equals("color"))
	            searchIndex = 1;
	        else if(ruleKey.equals("name"))
	            searchIndex = 2;
	        for(int i = 0; i < items.size(); i++){
	            if(items.get(i).get(searchIndex).equals(ruleValue))
	                count++;
	        } 
	        return count;       
	    }

}
