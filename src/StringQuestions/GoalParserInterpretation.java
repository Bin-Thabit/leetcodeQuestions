package StringQuestions;

public class GoalParserInterpretation {
	// https://leetcode.com/problems/goal-parser-interpretation/description/
	// 1678. Goal Parser Interpretation

	public String interpret(String command) {
        StringBuilder goal = new StringBuilder();
		for(int i = 0; i < command.length(); i++) {
			if(command.charAt(i) == 'G')
				goal.append("G");
			else if(command.charAt(i) == '(') {
				// Here if the next char is ) add "o" to the String and increment i by 1 to ignore the second brackets in the second loop 
				if(command.charAt(i+1) == ')') {
					goal.append("o");
					i += 1;
				}
				// Here if the next char is not ) add "al" to the String and increment i by 2 to ignore "al)" in the second loop 
				else {
					goal.append("al");
					i += 2; 
				}
			}
		}
		return goal.toString();
    }
}
