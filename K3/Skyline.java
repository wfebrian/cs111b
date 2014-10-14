//********************************************************************
//  Skyline.java      
//  Author: Alan Chan, Nanthana Thanonklin and Wesley Febrian
//  CS 111B Assignment K3 due date: Feb 27, 2013    
//
/*  Demonstrate your ability to ability to use Java classes including
    the use of correct scope for instance data; the structure of method
    definitions including parameters and return values; and, the correct
    structure and purpose of a constructor.
*/
//  Algorithm:
//  1. Create JFrame
//  2. Add Panel
//  3. Display
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class Skyline
{
   //-----------------------------------------------------------------
   //  Presents a collection of buildings.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Skyline");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new SkylinePanel());

      frame.pack();
      frame.setVisible(true);
   }
}
