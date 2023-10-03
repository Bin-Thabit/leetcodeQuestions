package Recursion;

public class Sum_of_digit {
	
	// https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
	// Sum of digit of a number using recursion
	public static void main (String[] args) {

        System.out.println(sumOfDigit(45632));

    }

    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }

        return n % 10 + sumOfDigit(n / 10);
    }
}
