package Recursion;

public class Print_1_To_N_Without_Loop {
	
	// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
	// Print 1 To N Without Loop
	public void printNos(int N)
    {
        if(N == 0){
            return;
        }
        
        printNos(N-1);
        System.out.print(N + " ");
        
    }
}
