//***********************************************************************************************
//	CS111B (MW) - K2
//	Due Date: 2/11/2013
//	LabelDemo2.java
//	Author: Alan Chan, Nanthana Thanonklin, Wesley Febrian
//
//	Demonstrates the use of image icons in labels.
//
//	Algorithm:
//	1. Create frame
//	2. Create label (graphical component)
//	3. Create panel
//	4. Add label to panel
//	5. Add panel to frame
//***********************************************************************************************

import java.awt.*;
import javax.swing.*;

public class LabelDemo2
{
   //-----------------------------------------------------------------------
   //  Creates and displays the primary application frame.
   //-----------------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Label Demo 2");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      ImageIcon icon = new ImageIcon ("apple.jpg");

      JLabel label1, label2, label3, label4;

      label1 = new JLabel ("Apple Left", icon, SwingConstants.CENTER);

      label2 = new JLabel ("Apple Right", icon, SwingConstants.CENTER);
      label2.setHorizontalTextPosition (SwingConstants.LEFT);
      label2.setVerticalTextPosition (SwingConstants.BOTTOM);

      label3 = new JLabel ("Apple Above", icon, SwingConstants.CENTER);
      label3.setHorizontalTextPosition (SwingConstants.CENTER);
      label3.setVerticalTextPosition (SwingConstants.BOTTOM);

      label4 = new JLabel ("Apple Below", icon, SwingConstants.CENTER);
      label4.setHorizontalTextPosition (SwingConstants.CENTER);
      label4.setVerticalTextPosition (SwingConstants.TOP);

      JPanel panel = new JPanel();
      panel.setBackground (Color.yellow);
      panel.setPreferredSize (new Dimension (200, 250));
      panel.add (label1);
      panel.add (label2);
      panel.add (label3);
      panel.add (label4);

      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}