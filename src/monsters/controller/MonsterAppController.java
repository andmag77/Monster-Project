package monsters.controller;

import model.view.MonsterView;
import monsters.model.MarshmallowMonster;

public class MonsterAppController
{

	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;
	
	public MonsterAppController()
	{
		myAppView=new MonsterView(this);
		myMonster = new MarshmallowMonster("Bob", //Name
													4.0,// Legs
													3.0, // Hair
													5, // Eye
													2, // Nose
													3, // Arms
													true); // Belly button
		otherMonster=new MarshmallowMonster("Derf",0.001, .2, 5, 0, 0, true);
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
	public void start()
	{
		myAppView.displayInformation();
	}
}
