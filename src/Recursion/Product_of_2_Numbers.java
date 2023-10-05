package Recursion;

public class Product_of_2_Numbers {

	// https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
	// Product of 2 Numbers using Recursion
     public static void main(String[] args) {
    	int ans = product(5, 2);
    	System.out.println(ans);
		
	}
     
    static int product(int x , int y) {
 		if(x < y) 
 			return product(y, x);
 		else if(y != 0) 
 			return x + product(x, y-1);
 		else
 			return 0;
 	}
}
