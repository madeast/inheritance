package inheritance.runner;

import inheritance.model.Battle;
import inheritance.model.Charizard;
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
	}
	
	public void start()
	{
		
	}
}
