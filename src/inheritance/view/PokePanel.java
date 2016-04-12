package inheritance.view;

import java.awt.Color;

import inheritance.runner.InheritanceController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PokePanel extends JPanel
{
	private InheritanceController baseController;
	private JButton attackButton;
	private JTextField battleTextField;
	private SpringLayout baseLayout;
	
	public PokePanel(InheritanceController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		attackButton = new JButton("Attack");
		battleTextField = new JTextField();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(attackButton);
		this.add(battleTextField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
