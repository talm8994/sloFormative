package input.controller;

import input.view.SloDisplay;
import input.model.Thing;
public class SloController
{
	private SloDisplay myDisplay;
	private Thing myThing;
	public SloController()
	{
		myDisplay = new SloDisplay();
	}
	
	public void start()
	{
		String name = myDisplay.getAnswer("type your moms name ");
		
		myDisplay.displayResponce( " you said " + name);
		
		int grade;
		String tempAge = myDisplay.getAnswer(" type my grade ");
		
		while(!isInteger(tempAge))
		{
			tempAge = myDisplay.getAnswer("type in a integer value!!!!!");
		}
		
		myDisplay.displayResponce(" you typed grade ");
		if(isInteger(tempAge))
		{
			grade = Integer.parseInt(tempAge);
		}
		else
		{
			grade = 50;
		}
		
		myDisplay.displayResponce(" my grade is " + grade );
		
		double weight;
		String tempWeight = myDisplay.getAnswer("type in our weight");
		myDisplay.displayResponce("you typed in weight");
		while(!isDouble(tempWeight))
		{
			tempWeight = myDisplay.getAnswer("Give me valid double value!");
		}
		
		if(isDouble(tempWeight))
		{
			weight =Double.parseDouble(tempWeight);
		}
		else
		{
			weight = 120;
		}
		myDisplay.displayResponce(" you typed " + weight);
		
		myThing = new Thing(name, grade, weight);
		
		myDisplay.displayResponce(myThing.toString());
	}

	private boolean isInteger(String input)
	{
			boolean isInt = false;
				
			try
			{
				int validInteger = Integer.parseInt(input);
				isInt = true;
			}
			catch(NumberFormatException error)
			{
				myDisplay.displayResponce("you did not typle in a valid int");
			}
			return isInt;
	}
		
	
/**
 * it 
 * @param input
 * @return
 */
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
			}
			catch(NumberFormatException error)
			{
				myDisplay.displayResponce("you did not tipe valid number.");
		}
		return isDouble;
		}
	

	}
	
 
