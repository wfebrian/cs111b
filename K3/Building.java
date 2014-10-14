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

import java.awt.*;

public class Building
{
   private int width,height, x, y, windows;
   private Color color;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this building with the specified values.
   //-----------------------------------------------------------------
   public Building (int upperX,int upperY,int nHeight,int nWidth, int nWindows, Color shade)
   {
      height = nHeight;
      width = nWidth;
      color = shade;
      windows = nWindows;
      x = upperX;
      y = upperY;
   }
   //-----------------------------------------------------------------
   //  Draws this building with windows and line in the specified graphics context.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      int storex = x;
      int storey = y;
      page.setColor (color);
      page.fillRect (x, y, width, height);
      for (int i = 0; i < windows; i++)
      {

          if ( x < width +storex && y < height + storey)
	  {    
	       page.setColor (color.yellow);
               page.fillRect (x+5, y+5, 5,5);
               x = x + 10;
          }  
      }
   }
   
    

   //-----------------------------------------------------------------
   //  Height mutator.
   //-----------------------------------------------------------------
   public void setHeight (int nHeight)
   {
      height = nHeight;
   }
   //-----------------------------------------------------------------
   //  Width mutator.
   //-----------------------------------------------------------------
   public void setWidth (int nWidth)
   {
      width = nWidth;
   }
   //-----------------------------------------------------------------
   // Window mutator.
   //-----------------------------------------------------------------
   public void setWindows (int nWindows)
   {
       windows = nWindows;
   }
   //-----------------------------------------------------------------
   //  Color mutator.
   //-----------------------------------------------------------------
   public void setColor (Color shade)
   {
      color = shade;
   }

   //-----------------------------------------------------------------
   //  X mutator.
   //-----------------------------------------------------------------
   public void setX (int upperX)
   {
      x = upperX;
   }


   //-----------------------------------------------------------------
   //  Y mutator.
   //-----------------------------------------------------------------
   public void setY (int upperY)
   {
      y = upperY;
   }

   //-----------------------------------------------------------------
   //  Height accessor.
   //-----------------------------------------------------------------
   public int getHeight ()
   {
      return height;
   }
    //  Width accessor.
   public int getWidth ()
   {
      return width;
   }

   //-----------------------------------------------------------------
   // Windows accessor.
   //-----------------------------------------------------------------
   public int getWindows()
   {
      return windows;
   }
	
   //-----------------------------------------------------------------
   //  Color accessor.
   //-----------------------------------------------------------------
   public Color getColor ()
   {
      return color;
   }

   //-----------------------------------------------------------------
   //  X accessor.
   //-----------------------------------------------------------------
   public int getX ()
   {
      return x;
   }

   //-----------------------------------------------------------------
   //  Y accessor.
   //-----------------------------------------------------------------
   public int getY ()
   {
      return y;
   }
}
