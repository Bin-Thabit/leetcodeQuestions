package Recursion;

import java.util.Arrays;

public class FindMinimumandMaximum {

	// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
	// Recursive Programs to find Minimum and Maximum elements of array
	public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int min = min1(arr);
        int max = max1(arr,0);
        System.out.println("Min = " + min + ", Max = " + max);

    }

	// Find minimum 1
    static int min1(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        int n = arr.length;
        if(arr[n-1] <= arr[n-2]){
            int temp = arr[n-1];
            arr[n-1] = arr[n-2];
            arr[n-2] = temp;
        }
        return min1(Arrays.copyOfRange(arr,0,arr.length-1));
    }

    // Find maximum 1
    static int max1(int[] arr , int n){
        if(n == arr.length-1){
            return arr[n];
        }
        if(arr[n] > arr[n+1]){
            int temp = arr[n];
            arr[n] = arr[n+1];
            arr[n+1] = temp;
        }
        return max1(arr,n+1);
    }

    // Find minimum 1
    static int min2(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }

        return Math.min(arr[n-1] , min2(arr,n-1));
    }

    // Find maximum 2
    static int max2(int[] arr , int n){
        if(n == arr.length-1){
            return arr[n];
        }

        return Math.max(arr[n], max2(arr,n+1));
    }
}
