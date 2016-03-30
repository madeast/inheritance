package inheritance.model;

//@author Easton Madsen, Ashton Brown, Alex Huntsman 
public interface Battle
{
	public int pokeHealth();
	public String pokeName();
	public void pokeAttack(String Type, int damage);
	public void pokeWinner(String Trainer);
	
}

