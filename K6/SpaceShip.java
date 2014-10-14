import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SpaceShip extends Applet 
{
	//declare private variables
	//space ship
	private Point point = null;
 	private Point shotPoint = null;

	//buttons
	private int count;
 	private Button reset;
 	private Button sound;
 	private Label label;
 	private boolean setShot;
 	private boolean soundOn;
 	private int check;
 
	//sound
	private AudioClip a;
 
	public void init()
	{
		addMouseListener (new MouseHandler());
		addMouseMotionListener (new MouseMotionHandler());

		sound = new Button ("Sound On/Off");
		sound.addActionListener (new ButtonListener());
		add(sound);
		soundOn = false; // initialize sound

		reset = new Button ("Reset");
		reset.addActionListener (new ButtonListener());
		add(reset);
		count = 0;
		setShot = false;
		check = 2;

		label = new Label ("Shots:   " + count);
		label.setBackground (Color.yellow);
		add(label);


		a = getAudioClip(getCodeBase(), "bonk.au");
		a.stop();

		setBackground (Color.black);  
	}

	public void paint (Graphics g)
 	{
		int xFinal = 0;
		int yFinal = 0;
		int xBeg = 0;
		int yBeg = 0;
             
 		if(setShot != false)
		{
			if(count%4 == 0) g.setColor(Color.red);
			else if(count%4 == 1) g.setColor(Color.blue);
			else if(count%4 == 2) g.setColor(Color.yellow);
			else if(count%4 == 3) g.setColor(Color.green);
			
			xFinal = (int) (300*Math.random() - 50); //laser points
			yFinal = (int) (300*Math.random()) - 50; //laser points
			xBeg = (int) (point.x + (30*Math.random()+ 20));
			yBeg = (int) (point.y +  (2*Math.random()));
   	 
			g.drawLine(xBeg, yBeg, xFinal, yFinal);
			
			if(soundOn == true)//play sound
			{
				a.play();
			}
			else if(soundOn == false)//turn off sound
			{
				a.stop();
			}
		
			count = count + 1;
			label.setText("Shots: " + count);
  		}
  	
		if(point != null)
		{
			g.setColor(Color.yellow);
			g.fillOval(point.x, point.y, 70, 30);
			g.fillOval(point.x+20, point.y-10, 30, 20);
   		} 

		sleep(300);
		g.setColor(Color.black);
		g.drawLine(xBeg, yBeg, xFinal, yFinal);
	}
 
	public void sleep(long msec)
	{
		try
		{
			Thread.sleep(msec);
		}

 		catch(InterruptedException e){}
	}
			
	private class MouseMotionHandler implements MouseMotionListener  
	{
		public void mouseDragged (MouseEvent event)
		{
			setShot = false;
			point = event.getPoint();
			repaint();
		}

		public void mouseMoved(MouseEvent event) 
		{
			setShot = false;
			point = event.getPoint();
			repaint();
		}
	}

	private class MouseHandler implements MouseListener 
	{
		public void mouseClicked (MouseEvent event)
		{
			shotPoint = event.getPoint();
			setShot = true;
			repaint();
		}

	public void mouseExited(MouseEvent event){} 
	public void mouseEntered(MouseEvent event){}
	public void mousePressed(MouseEvent event){} 
	public void mouseReleased(MouseEvent event){}

	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			String str = event.getActionCommand();

			if(str.equals("Reset"))
			{
				count = 0;
				label.setText("Shots:   " + count);
			}
			else if(str.equals("Sound On/Off"))
			{
				if(check%2 == 0)
				{
					soundOn = true;
					check += 1;
				}
				else if(check%2 != 0)
				{
					soundOn = false;
					check += 1;
					a.stop();
				}
			}
   		}
	}
}