/* Author: John Santos
           Anjan Shrest
		   Arpan Rai
		   
Algorithm:
1. create a constructor, set list to null
2. create insert method for a linked list, add new node to end
3. create a delete method for a linked list, delete a node that matches the passed string
4. create a delete all method, set list to null
5. create a tostring method
7. create isNull method, throw exception if null
6. create an inner Node class, include data and next node

*/

public class MagazineList
{
   private MagazineNode list;

   //----------------------------------------------------------------
   //  Sets up an initially empty list of magazines.
   //----------------------------------------------------------------
   public MagazineList()
   {
      list = null;
   }

   //----------------------------------------------------------------
   //  Creates a new MagazineNode object and adds it to the end of
   //  the linked list.
   //----------------------------------------------------------------
   public void insert (Magazine mag)
   {

      MagazineNode node = new MagazineNode (mag);
      MagazineNode current;

      if (list == null){
         list = node;
		 current = list;
	  }
      else
      {
         current = list;
         while (current.next != null)
            current = current.next;
         current.next = node;
      }
   }
   
   // delete a node that matches the argument that is passed to method
   // if list is null or cannot find argument value, throw an exception
   // 
   public void delete (Magazine mag) throws MagazineException
   {
	 MagazineNode current = list;
	 
	 
	 if(list == null)  //if list is empty throw exception
	 {
	   throw new MagazineException("List is empty!");    
	 } 
	 
     if  (current.magazine.toString().compareTo(mag.toString()) == 0)   // look for name on the list
	    list = current.next;
	 else 
	 {
	   // iterate through list looking for object
	   // BE CAREFUL WHEN USING == IN COMPARING. == COMPARES OBJECT REFERENCE NOT THE VALUE 
	   // USE .EQUALS OR .COMPARETO METHODS WHEN COMPARING STRINGS INSTEAD
	   while((current.next.magazine.toString().compareTo(mag.toString()) != 0))
	   {
	     current = current.next;
		 if (current.next == null)
		    throw new MagazineException("Title is not found! Please see the list again, click \"List Magazines\" button");
	   }
		current.next = current.next.next;
     }
	 
   } // end delete method
   
   
   // delete method sets list to null
   public void deleteAll () throws MagazineException
   {	   
	 if(list == null)
	 {
	   throw new MagazineException("There is no more magazine(s) to delete!");    // throw exception
	 }
	 list = null;
   }
   

   //----------------------------------------------------------------
   //  Returns this list of magazines as a string.
   //----------------------------------------------------------------
   public String toString ()
   {
      String result = "";

      MagazineNode current = list;
	  
	  if(current == null)
	    result = "";

      while (current != null)
      {
         result += current.magazine + "\n";
         current = current.next;
      }

      return result;
   }

   // return exception if null
   // to be called by the ListListener class
   public void isNull() throws MagazineException
   {
      if(list == null)
	     throw new MagazineException("There is no magazine in the list");
   }
   
   //*****************************************************************
   //  An inner class that represents a node in the magazine list.
   //  The public variables are accessed by the MagazineList class.
   //*****************************************************************
   private class MagazineNode
   {
      public Magazine magazine;
      public MagazineNode next;

      //--------------------------------------------------------------
      //  Sets up the node
      //--------------------------------------------------------------
      public MagazineNode (Magazine mag)
      {
         magazine = mag;
         next = null;
      }
   }
}
