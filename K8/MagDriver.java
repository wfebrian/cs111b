//This applet creates a series of nodes, link to each other, that contains 
//related data
//-----------------------------------------------------------------
//-------------------algorithm--------------------
//set up class variables
//make component and place in panel, put panels in layout
//add listener to component 
//depending on which component recieves the actionevent
//depend on which action is taken


//-----------------------------------------
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//----------------------------------------
public class  MagDriver extends Applet implements ActionListener
{

			MagData myData;//holds name of magazines
	 		MagList myNode;//hold address of next node in series and objects
     		String str = "";
   		TextField userInput,userDele;//input add- delete  textfield
			TextArea outPut;//taxtarea out put
//---------------------------------------------------	
//this meathod set up the interface and add listeners
//-------------------------------------------------
	public void init()
   {     
			//set up layout and component for top panel
	 		myNode = new MagList();
			setLayout(new BorderLayout());
			setBackground(Color.red);
      	Label addLabel = new Label("Add");
			userInput = new TextField(30);
      	Button addMag = new Button("Show all");
			Panel addPanel = new Panel();
			addPanel.add(addLabel);addPanel.add(userInput);addPanel.add(addMag);	
	   	add(addPanel,BorderLayout.NORTH);
	   
//button shows all the mag in the list
		   addMag.addActionListener(new ActionListener()
		   { 	
			public void actionPerformed(ActionEvent ae)
 			{
         str = myNode.printData();//call function that returns all the name in the series
			outPut.setText(str);//output str to textarea
			}
			});
		
// add a magazine  to the list from textbox
			userInput.addActionListener(new ActionListener()
			{ 	
			public void actionPerformed(ActionEvent ae)
 			{
         String magName = userInput.getText();//get name from textfield
			myData = new MagData(magName);//makes new object with name inside
			myNode.addNode(myData);//sends name object to be put in node
			userInput.setText("");//clear textbox
	      }
			});
		 
// sets up output textArea in center
		   outPut = new TextArea();
		   Panel outPutPanel = new Panel();
			outPutPanel.setBackground(Color.white);
		   outPutPanel.add(outPut);
		   add(outPutPanel,BorderLayout.CENTER);
       
//sets up textbox, button and label at the bottom
		   Label deleLabel = new Label("DELETE");
		   userDele = new TextField(30);
         Button deleMag = new Button("DELETE ALL");
		   Panel deletePanel = new Panel();
		   deletePanel.add(deleLabel);deletePanel.add(userDele);deletePanel.add(deleMag);		
		
//takes name and delete in list
         userDele.addActionListener(new ActionListener()		
		   { 	
		   public void actionPerformed(ActionEvent ae)
 		   {
         str = userDele.getText();//get name to be deleted from textbox
		   myNode.deleteNode(str);//calls to function to delete name
			str = myNode.printData();//call to function for revised list
			outPut.setText(str);//set new list minus deleted name in textarea
			userDele.setText("");//clears delete textbox
		   }
		   });
		
//button delete all the Zines in the list
		   deleMag.addActionListener(new ActionListener()		
		   { 	
		   public void actionPerformed(ActionEvent ae)
 		   {
         myNode.deleteAll();//call to deleteall function
         outPut.setText("");//clears the textarea
		   }
		   });

		   add(deletePanel,BorderLayout.SOUTH);//put button & textbox at bottom
	     
	}
//----------------------------------------------------
//these functions not needed
//-------------------------------------------------------
   public void paint(Graphics g)
   {
   }
 
   public void actionPerformed(ActionEvent ae)
   {
          userInput.setText("purple cloud");
   }

}