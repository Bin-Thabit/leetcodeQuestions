package bitWiseQuestions;

public class FlippinganImage {
	// https://leetcode.com/problems/flipping-an-image/description/
	// 832. Flipping an Image
	
	// Solution 1
	public int[][] flipAndInvertImage(int[][] image) {

        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < (image[0].length +1) / 2; j++){
               // Swap and invert at the same time 
               int temp = image[i][j] ^ 1;
               image[i][j] = image[i][image[0].length - j - 1] ^ 1;
               image[i][image[0].length - j - 1]  = temp; 
               
            }
        }
        return image;
    }
	
	// Solution 2
	/*
	 public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col =image[0].length;
        int [][] newImage = new int[image.length][image[0].length];
        for(int i = 0; i < row; i++){
            int newIndex = 0;
            for(int j = col - 1; j >= 0; j--){
            	// flip 
                newImage[i][newIndex] += image[i][j];
                // invert
                if(newImage[i][newIndex] == 0)
                    newImage[i][newIndex] = 1;
                else
                    newImage[i][newIndex] = 0;
                newIndex++;         
            }
        }
        return newImage;
        
    }
	    */
}
