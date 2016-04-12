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
		int HP = 0;
		
		return HP;
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
		
	}

	@Override
	public void pokeWinner(String Trainer)
	{
	
	}
}
