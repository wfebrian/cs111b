// Exception class for the Magazine program

public class MagazineException extends Exception
{
    String message = null;
	
    MagazineException(String message)
	{ 
	    super(message);
		this.message = message;
	}
	
	public String toString()
	{
	   return message;
	}
	
	public String getMessage()
	{
	   return message;
	}
}