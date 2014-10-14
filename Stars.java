import java.io.*;
import java.util.Scanner;

/* 	
	Create an 80x20 two-dimensional array of integers. It will be visualized as a low-resolution image of a night sky, one pixel per cell of the matrix, and should fit in your terminal window.
	Choose 100 pixels at random to be stars, marking those cells in the array.
	Print out the whole sky using spaces for empty cells and +s for the stars.
*/

public class HW11
{
	public static void main(String[] args) throws IOException
	{
		
		//create the grid
		int row = 20; //set the row to 20
		int col = 80; //set the column to 80
		String [][] sky = new String [row][col]; //create a 2D array. 20 by 80

		//fill the grid
		for (int k = 0; k<100; k++){ //iterate 100 times, making 100 random array to be filled
			sky[(int)(Math.random()*20)][(int)(Math.random()*80)]= "+"; //Assigning + to random array index
		}

		//Go through every value
                for (int i =0; i < 20; i++) {
                        for (int j = 0; j < 80; j++) {
                                if(sky[i][j]==null){ //if the array that is checked is null,
					sky[i][j]=" "; // replace it with a space " "
				}
                        }
                }

		//Print array in rectangular form
		for (int i =0; i < 20; i++) {
			for (int j = 0; j < 80; j++) {
				System.out.print(sky[i][j]);
			}
		System.out.println("");
		}
		
	}
}
