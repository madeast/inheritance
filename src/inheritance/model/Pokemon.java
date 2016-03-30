package inheritance.model;

public abstract class Pokemon implements Battle
{

	//Three Dad Members
	private String Type;
	private String Nature;
	private long ID;
	
	
	
	
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
