package inheritance.view;

import inheritance.controller.InheritanceController;

import javax.swing.JFrame;

public class PokeFrame extends JFrame
{
	private InheritanceController baseController;
	private PokePanel basePanel;
	
	public PokeFrame(InheritanceController baseController)
	{
		this.baseController = baseController;
		basePanel = new PokePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setTitle("Youngster Joey wants to batte!");
		this.setResizable(false);
		this.setVisible(true);
	}
}
