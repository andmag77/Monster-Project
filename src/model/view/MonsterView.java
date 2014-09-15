package model.view;

import javax.swing.JOptionPane;

import monsters.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
		
}
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "I made a Monster :)");
		JOptionPane.showMessageDialog(null, "It's name is" + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null,"It had 3 gummy worm arms, and 4 Red VIne Legs");
		JOptionPane.showMessageDialog(null,"It had 5 eye's and 2 noses");
		
	}
}
