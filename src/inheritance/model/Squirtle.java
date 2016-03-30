package inheritance.model;

public class Squirtle extends Pokemon
{

	public Squirtle()
	{
		this.setType("Water");
		this.setNature("Adament");
		this.setID(007);
	}

	@Override
	public int pokeHealth()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String pokeName()
	{
		String pokeName = "Squirtle";
		
		return pokeName;
	}

	@Override
	public void pokeAttack(String Type, int damage)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pokeWinner(String Trainer)
	{
		// TODO Auto-generated method stub
		
	}
	
}
