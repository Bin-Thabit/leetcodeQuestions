package Recursion;

public class Program_for_length_of_a_string_using_recursion {

	public static void main(String[] args) {

        int ans1 = count1("GEEKSFORGEEKS",0);
        int ans2 = count2("GEEKSFORGEEKS");
        System.out.println(ans1);
        System.out.println(ans2);
    }

    // Solution 1
    // With 2 arguments
    static int count1(String s , int c){
        if(c == s.length()){
            return c;
        }

        return count1(s,c+1);
    }

    // Solution 1
    // With 1 arguments
    static int count2(String s){
        if(s.length() == 0){
            return 0;
        }

        return 1 + count2(s.substring(1));
    }
}
