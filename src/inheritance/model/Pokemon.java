package inheritance.model;

public abstract class Pokemon implements Battle
{

	//Three Dad Members
	private String Type;
	private String Nature;
	private long ID;
	
	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " and is named: " + pokeName();
		
		return description;
	}
	
	public int compareTo(Object compared)
	{
	int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof Pokemon)
		{
			if(this.pokeHealth() > ((Pokemon) compared).pokeHealth())
			{
				comparedValue = 1;
			}
			else if(this.pokeHealth() < ((Pokemon) compared).pokeHealth())
			{
				comparedValue = -1;
			}
		}
		return comparedValue;
	}
	
	public String getType()
	{
		return Type;
	}
	public void setType(String type)
	{
		Type = type;
	}
	public String getNature()
	{
		return Nature;
	}
	public void setNature(String nature)
	{
		Nature = nature;
	}
	public long getID()
	{
		return ID;
	}
	public void setID(long iD)
	{
		ID = iD;
	}
}
