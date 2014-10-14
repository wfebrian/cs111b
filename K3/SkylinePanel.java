//********************************************************************
//  SkylinePanel.java      
//  Author: Alan Chan, Nanthana Thanonklin and Wesley Febrian
//  CS 111B Assignment K3 due date: Feb 27, 2013   
//  Demonstrates the use of graphical objects.
//  Algorithm:
//  1. Constructor: Creates five building objects and a line.
//  2. Draws this panel by requesting that each building draw itself.
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class SkylinePanel extends JPanel
{
   private Building building1, building2, building3, building4, building5, line;

   //-----------------------------------------------------------------
   //  Constructor: Creates five building objects and a line.
   //-----------------------------------------------------------------
   public SkylinePanel()
   {
   // building = new Building (int upperX,int upperY,int nHeight,int nWidth,int nWindows,Color shade)
      building1 = new Building (60,220,140,60,2,Color.black);
      building2 = new Building (140,160,200,50,2,Color.black);
      building3 = new Building (200,180,180,60,4,Color.black);
      building4 = new Building (300,260,100,60,3,Color.black);
      building5 = new Building (400,220,140,60,4,Color.black);
      line = new Building (0,360,1,600,0,Color.black);
      
	//write our names to the panel.
      setFont (new Font("Arial", Font.BOLD, 12));
      setPreferredSize (new Dimension(600, 400));
      setBackground (Color.cyan);
   }

   //-----------------------------------------------------------------
   //  Draws this panel by requesting that each building draw itself.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);

      building1.draw(page);
      building2.draw(page);
      building3.draw(page);
      building4.draw(page);
      building5.draw(page);
      line.draw(page);
      page.drawString ("Alan, Nanthana, Wesley's Skyline with Windows.",15,25);
   }
}