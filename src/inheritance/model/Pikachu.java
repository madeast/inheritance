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
		int HP = 0;
		
		return HP;
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
		
	}

	@Override
	public void pokeWinner(String Trainer)
	{
		
	}
	
}
