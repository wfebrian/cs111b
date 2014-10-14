//this class manages the adding  and subtracting of nodes

public class MagazineList
{  
	 	MagazineNode lastNode;//last node in the series
		MagazineNode current = null;//veriable that holds the first node in the series
//------------------------------------------------    
   MagazineList ()
   {
		lastNode =(null);//constructor creates an empty node   
	}
//-------------------------------------------
//this meathod add a node at the beginning of the list
//----------------------------------------------------
   public void addNode(MagazineRack nodeData)
   {
    if (lastNode == null)//test to see if lastnode has data
	 {							 //only happens once per series
	   lastNode = new MagazineNode(nodeData);//if it has no data put data in
      current = lastNode;//set lastnode as the first node in the series
	 }
	 else 
	 { 
	   MagazineNode temp = new MagazineNode(nodeData);//creates a new node and put it in temp
      temp.nextAddr = current;//put the address of current in temp's variable: nextAddr
	   current = temp;//object temp now becomes the first node in the series		 
	 }
   }
//---------------------------------------------------
//this meathod get the Zine name in each node and returns it
//---------------------------------------------------
   public String printData()
   {
	    String str = " ";

       MagazineNode temp = current;//put the first node of the series into temp
	  
	  while (current.nextAddr != null)
     {
	    str += current.getData();//get the Zine name of the current node
		 str +="\n";					//add a line break
		 current = current.nextAddr;//get the nest node in the series
     }
       str += current.getData();//get the Zine name of the last node in current series
										//who's nextaddr was set to null
		 current = temp;//put the firstnode address back into current			
       return (str);//return all the names in the series
   } 
//-------------------------------------------------------
//this meathod deletes one node in the series
//----------------------------------------------------
   public void deleteNode(String forDelection)
   {
      MagazineNode temp, hold;//variables to hold objects
	  if (forDelection.equals(current.getData()))//test to see if name to delete  
	  {														//matches any in the nodes
	    current =current.nextAddr;//if it finds a match it replaces  the first node 
	    return ;						//with the second node-fal out of meathod
     }
 
       hold = current.nextAddr;//saves first node address in series 
	    temp = current; //save first node in series i
	 while (hold.nextAddr != null)//check for last node
	 {  
	  if (forDelection.equals(hold.getData()))//check match for name to be deleted
	  {
		 temp.nextAddr = hold.nextAddr;//put matching node nextaddr into privious node nextaddr 
		 return;
	  }
		 temp = hold;//eleminates the last nodein the series
		 hold = hold.nextAddr;
     }
		 temp.nextAddr = null;//put null in next address of the new last node
   }
  
 //---------------------------------------------------- 
 //the meathod elemenates all the nodes by breaking the first link
 //in the series
    public void deleteAll()
    {
       //lastNode.nextAddr = null;
		 lastNode = null;
    }

}