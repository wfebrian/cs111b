//***********************************************************************
//  Fish.java (K1)
//  Wesley Febrian
//  CS 111B - Constance Conner, Section 001
//  Create a basic fish graphic!
//************************************************************************

import javax.swing.*;
import java.awt.*;

public class Fish extends JApplet
{
	//-----------------------------------------------------------------
	//  Draws a fish.
	//-----------------------------------------------------------------

	public void paint (Graphics page)
	{
		setBackground (Color.cyan);
		
		//---------------------------------------------------------
		//	First Fish
		//---------------------------------------------------------

		//Fish Body
		page.setColor (Color.black); //Black outline for the fish
		page.drawArc (90,120,110,60,0,360); //Fish Body (Oval)
		page.setColor (Color.yellow); //Set the Color to yellow
		page.fillArc (90,120,110,60,0,360); //Fill the fish yellow

		//Fish Tail
		page.setColor (Color.black); //Set Color to black
		page.drawArc (200,120,60,60,90,180); //Outline of the tail
		page.setColor (Color.orange); //Set the color to orange
		page.fillArc (200,120,60,60,90,180); //fill the arc

		//Smile on the fish face
		page.setColor (Color.black);
		page.drawArc (90,130,40,40,270,90);

		//fish eye
		page.fillOval (110,140,10,10);
	
		//-------------------------------------------------------
		//	Bubbles and My Name
		//-------------------------------------------------------		

		//Bubbles!
		page.setColor (Color.blue); //set the color to blue
		page.fillOval (70,100,10,10); //the first bubble - small
		page.fillOval (50,80,20,20); // the second bubble - bigger
		page.fillOval (60,70,10,10); //the third bubble - small
		page.fillOval (40,40,260,40); //big bubble for NAME

		//Name
		page.setColor (Color.yellow); //set text color to be yellow
		page.drawString ("Hello! We are made by Wesley Febrian!",50,65); //Displaying name

		//-------------------------------------------------------
		//	Second Fish
		//-------------------------------------------------------

		//Fish Body
		page.setColor (Color.black); //Black outline for the fish
		page.drawArc (150,220,110,60,0,360); //Fish Body (Oval)
		page.setColor (Color.orange); //Set the Color to orange
		page.fillArc (150,220,110,60,0,360); //Fill the fish orange

		//Fish Tail
		page.setColor (Color.black); //Set Color to black
		page.drawArc (260,220,60,60,90,180); //Outline of the tail
		page.setColor (Color.yellow); //Set the color to yellow
		page.fillArc (260,220,60,60,90,180); //fill the arc

		//Smile on the fish face
		page.setColor (Color.black);
		page.drawArc (150,230,40,40,270,90);

		//fish eye
		page.fillOval (170,240,10,10);
	}
}
