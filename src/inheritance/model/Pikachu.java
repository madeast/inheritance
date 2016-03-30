package inheritance.model;

public class Pikachu extends Pokemon
{

	public Pikachu()
	{
		this.setType("Electric");
		this.setNature("Playful");
		this.setID(025);
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
		String pokeName = "Pikachu";
		
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
