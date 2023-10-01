package Recursion;

public class First_uppercase_letter_in_a_string {

	// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
	// First uppercase letter in a string (Iterative and Recursive)
	public static void main(String[] args) {

        String text = "geekfoRgeeks";
        char iterative_Answer = firstUpperCase1(text);
        char recursion_Answer = firstUpperCase2(text);
        System.out.println(iterative_Answer);
        System.out.println(recursion_Answer);
    }
	
	// Iteration 
	static char firstUpperCase1(String text){
    	while(!text.isEmpty()) {
    		char check = text.charAt(0);
    		if(check >= 65 && check <= 90)
                return check;
    		text = text.substring(1);
    	}
    	
    	return '-';
    }

	// Using recursion
    static char firstUpperCase2(String text){
        // Base case
        // If the string is empty that means there is no uppercase letter in the text
        // So return -
        if(text.isEmpty()){
            return '-';
        }
        char check = text.charAt(0);
        // Here i choose these specific number because the capital alphabetic starts A to Z
        // to convert A to int = 65 , to convert Z to int = 90
        if(check >= 65 && check <= 90){
            return check;
        }
        // Using substring method to remove the previus letter in the next call
        return firstUpperCase2(text.substring(1));

    }
    
}
