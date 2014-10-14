//-----------------------------
//this class stores the link to the next node
//and an instance of magazine
//----------------------------------------------------
public class MagazineNode
{
      MagazineNode nextAddr;//holds the next node address
      MagazineRack data;//object that hold Zine name
//--------------------------------
   MagazineNode (MagazineNode n_null)//this constructor not needed
	{
	   nextAddr = n_null;
   }

//------------------------------------
//this constructor bring in a new object 
//------------------------------------
   MagazineNode ( MagazineRack  _data)
	{
	   nextAddr = null;
	   data = _data;
	
	}
//------------------------------------
//this meathod returns the name of the Zine 	
	public String getData()
	{
	    return(data.name);
	
	}

}