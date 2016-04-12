package inheritance.model;

public class Charizard extends Pokemon
{
	
	public Charizard()
	{
		this.setType("Fire");
		this.setNature("Jolley");
		this.setID(006);
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
		String pokeName = "Charizard";
		
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
