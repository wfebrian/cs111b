//********************************************************************
//  Building.java       
//  Author: Alan Chan Nanthana Thanonklin and Wesley Febrian
//  CS 111B Assignment K3 due date: Feb 27, 2013   
//
//  Represents a building with a particular position, size, and color.
//  Algorithm:
//  1. Constructor: Sets up this building with the specified values.
//  2. Draws this building with windows and line in the specified graphics context.
//  3. Height mutator.
//  4. Width mutator.
//  5. Color mutator.
//  6. X mutator.
//  7. Y mutator.
//  8. Height accessor.
//  9. Color accessor.
//  10. X accessor.
//  11. Y accessor
//********************************************************************

import java.io.*;
import java.util.Scanner;
import java.awt.*;

public class Star
{

   //-----------------------------------------------------------------
   //  Constructor: Sets up star sky with the specified values.
   //-----------------------------------------------------------------
   public Star ()
   {
		int row = 20; //set the row to 20
		int col = 80; //set the column to 80
		String [][] sky = new String [row][col]; //create a 2D array. 20 by 80

		//fill the grid
		for (int k = 0; k<100; k++)
		{ //iterate 100 times, making 100 random array to be filled
			sky[(int)(Math.random()*20)][(int)(Math.random()*80)]= "+"; //Assigning + to random array index
		}

		//Go through every value
                for (int i =0; i < 20; i++)
		{
                        for (int j = 0; j < 80; j++)
			{
                                if(sky[i][j]==null) //if the array that is checked is null,
				{
					sky[i][j]=" "; // replace it with a space " "
				}
                        }
                }
		
		for (int i =0; i < 20; i++) {
			for (int j = 0; j < 80; j++) {
				System.out.println(sky[i][j]);
			}
		System.out.println("");
		}
   }
   //-----------------------------------------------------------------
   //  Draws this building with windows and line in the specified graphics context.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
	page.drawString("(Math.random())",0,0);
    }
}