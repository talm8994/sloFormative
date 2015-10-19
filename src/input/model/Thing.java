package input.model;

public class Thing
{
	private String mom;
	private int age;
	private double weight;
	
	public Thing()
	{
		age = -99;
		weight = -.00005;
		mom = "";
	}
	
	
	public Thing(String mom, int age, double weight)
	{
		this.age = age;
		this.mom = mom;
		this.weight = weight;
	}
	
	public String getName()
	{
		return mom;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setName(String name)
	{
		this.mom = name;
	}
	
	public void setName(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	/**
	 * returns all the veriablefrom the object and retuns it as a string.
	 */
 	public String toString()
	{
		String thingInfo = " mom " + mom + " age " + age + " weight " + weight;
		return thingInfo;
	}
	
	

}
