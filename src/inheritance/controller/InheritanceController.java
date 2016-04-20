package inheritance.controller;

import inheritance.model.Battle;
import inheritance.model.Charizard;
import inheritance.model.Pikachu;
import inheritance.model.Squirtle;
import inheritance.view.PokeFrame;

import java.util.ArrayList;

public class InheritanceController
{	

	private ArrayList<Battle> battleList;
	private PokeFrame baseFrame;
	
	public String showBattleLevels()
	{
		String battleLevels = "";
		for(Battle currentBattle : battleList)
		{
			battleLevels.concat("This is a " + currentBattle.toString()
					+ " and has a Pokemon named " + currentBattle.pokeName() + "\n");
		}
		
		return battleLevels;
	}
	
	private void makeBattleList()
	{
		battleList.add(new Squirtle());
		battleList.add(new Charizard());
		battleList.add(new Pikachu());
	}
	
	public InheritanceController()
	{
		//build all model components
		battleList = new ArrayList<Battle>();
		makeBattleList();
		baseFrame = new PokeFrame(this);
		//build view
		
	}
	
	public void start()
	{

	}
	
	public void swap(int firstLocation, int secondLocation)
	{
		Battle temp = battleList.get(firstLocation);
		battleList.set(firstLocation, battleList.get(secondLocation));
		battleList.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < battleList.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (battleList.get(innerLoop - 1).compareTo(battleList.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop - 1);
				innerLoop--;
			}
		}
	}
	
	public void quickSort(int low, int high)
	{
		if(low< high)
		{
			int midPoint = partition(low, high);
			quickSort(low, midPoint-1);
			quickSort(midPoint+1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int paritionPoint = 0;
		Battle pivot = battleList.get(high);
		int position = low;
		for(int spot = low; spot < high-1; spot++)
		{
			if(battleList.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		
		return position;
	}

}
