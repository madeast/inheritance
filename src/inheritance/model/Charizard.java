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
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pokeWinner(String Trainer)
	{
		// TODO Auto-generated method stub
		
	}
}
