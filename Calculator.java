package cse360assign3;
/**
*	@author Ryan Cost - ID 356
*	@description A simple calculator
*	Assignment 2
*/
public class Calculator 
{
	// Global total value
	private int total;
	private String history = "";
	private boolean used; // tells when the calculator is used for formatting
	/**
	* @param none
	* @return none
	* @description Constructor
	*/
	public Calculator () 
	{
		total = 0; 
	}
	/**
	* @param none
	* @return updated total
	* @description returns the total
	*/	
	public int getTotal () 
	{
		return total;
	}
	/**
	* @param value to add
	* @return none
	* @description adds the parameter to the total
	*/	
	public void add (int value) 
	{
		total = total + value;
		history += " + " + value;
		used = true;
	}
	/**
	* @param value to subtract
	* @return none
	* @description subtracts value from total
	*/	
	public void subtract (int value) 
	{
		total = total - value;
		history += " - " + value;
		used = true;
	}
	/**
	* @param value to multiply
	* @return none
	* @description multiplies total by parameter
	*/	
	public void multiply (int value) 
	{
		total = total * value;
		history += " * " + value;
		used = true;
	}
	/**
	* @param value to divide the total by
	* @return none
	* @description Divides total by value 
	* Integer division, if value = 0,
	* returns 0
	*/	
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
		}
		
		total = total / value;
		history += " / " + value;
		used = true;
	}
	/**
	* @param none
	* @return String of history
	*
	* @description gives updates
	* and calculator history
	*/	
	public String getHistory()
	{
		System.out.println();
		if( used )
		{
		    return "0" + history;
		}
		else
		{
		    return "0 ";
		}
	}
	
}

