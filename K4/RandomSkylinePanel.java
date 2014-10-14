//********************************************************************
//  RandomSkylinePanel.java      
//  Author: Alan Chan, Nanthana Thanonklin and Wesley Febrian
//  CS 111B Assignment K3 due date: Feb 27, 2013   
//  Demonstrates the use of graphical objects.
//  Algorithm:
//  1. Constructor: Creates five building objects and a line.
//  2. Draws this panel by requesting that each building draw itself.
//********************************************************************

import javax.swing.*;
import java.awt.*;

import java.util.*;

public class RandomSkylinePanel extends JPanel
{
   private Building building, line;
   int myArray[] = new int[600];

      public RandomSkylinePanel() 
      {
         setPreferredSize (new Dimension(600, 400)); 
         setBackground (Color.cyan); 
         line = new Building (0,360,1,600,0,Color.black);
      }

      public void paintComponent (Graphics page) 
      {
         super.paintComponent(page);
         int random = (int)(Math.random()*500+1);
         line.draw(page);
         int x = 10;

         for( int i = 0; i < random; i++ ) 
         { 
            int width = (int)(Math.random()*600+1);	
            int height = (int)(Math.random()*360+1);
            int y = 360 - height;
            int gap = (int)(Math.random()*400+1);
            myArray[i] = i;
            building = new Building(x, y, height, width, (int)(Math.random()*600), Color.black);
            building.draw(page);
            x = x + gap + width;
         }

      page.drawString ("Alan, Nanthana, Wesley's Random Skyline with Windows.",15,25);

      }
}