package inheritance.runner;

import inheritance.model.Battle;
import inheritance.model.Charizard;
import inheritance.model.Pikachu;
import inheritance.model.Squirtle;

import java.util.ArrayList;

public class InheritanceController
{
	public InheritanceController()
	{
		//build all model components
		makeBattleList();
		//build view
	}
	
	private ArrayList<Battle> battleList;
	
	public String showBattleLevels()
	{
		String battleLevels = "";
		
		return battleLevels;
	}
	
	private void makeBattleList()
	{
		battleList.add(new Squirtle());
		battleList.add(new Charizard());
		battleList.add(new Pikachu());
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
}
