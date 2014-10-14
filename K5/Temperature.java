//////////////////////////////////////////////////////////////
//This Temperature Assignment (K5) is made by:
//Abner Pinto, Alan Chan, Nanthana Thanonlin, Wesley Febrian
//////////////////////////////////////////////////////////////

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperature
{
	private double degrees;
	private char type;
	
	Scanner input = new Scanner(System.in);
	
	//constructor for both parameters
	public Temperature(double degrees,char type)
	{
		this.degrees = degrees;
		this.type = type;
	}

	//constructor for type
	public Temperature(char type)
	{
		this.type = type;
		degrees = 0.0;
	}

	//constructor for degrees
	public Temperature(double degrees)
	{
		this.type = 'C';
		this.degrees = degrees;		  
	}

	public String toString()
	{
		return "Temperature " + degrees + "F" ;
	}

	// default constructor
	public Temperature()
	{
		degrees = 0;
		type = 'C';
	
	}
	
	//write output of parameters
	public void writeOutput()
	{   DecimalFormat df = new DecimalFormat("#.#");
		System.out.println("Temperature = " + df.format(degrees) + " degrees "+ type +".");
	}

	//write methods
	public void writeC()
	{
		DecimalFormat df = new DecimalFormat("#.#");
		if ( type == 'F' || type == 'f' )
		{
			degrees = ((degrees-32.0)*5.0/9.0);
			type = 'C';
		}
		System.out.println(df.format(degrees) + "C");
	}
	
	public void writeF()
	{
		DecimalFormat df = new DecimalFormat("#.#####");

		if ( type == 'C' || type == 'c' )
		{
			degrees = degrees*9.0/5.0+32.0;
			type = 'F';
		}
		System.out.println(df.format(degrees) + "F");
	}

	//getters
	public double getC()
	{
		if ( type == 'F' || type == 'f' )
		{
			degrees = ((degrees-32)*5/9);
			type = 'C';
		}
		
		return Math.round(degrees*10)/10.0;	
	}
	
	public double getF()
	{
		if ( type == 'C' || type == 'c' )
		{
			degrees = degrees*9/5+32;
			type = 'F';
		}
		return degrees;
	}
	
	//setters
	public void set(double degrees)
	{
		this.degrees = degrees;
	}

	public void set(char type)
	{
		this.type = type;
	}

	public void set(double degrees, char type)
	{
		this.degrees = degrees;
		this.type = type;
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temperature other = (Temperature) obj;
		if (Double.doubleToLongBits(degrees) != Double.doubleToLongBits(other.degrees))
		return false;
		return true;
	}

	public void readInput()
	{
		String input2;
		System.out.println("Please Enter a number for degrees");
		degrees = input.nextDouble();
		System.out.println("Please Enter type");
		input2 = input.nextLine();
		input2 = input.nextLine();
		type = input2.charAt(0);
	}

}