package inheritance.view;

import inheritance.controller.InheritanceController;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PokePanel extends JPanel
{
	private InheritanceController baseController;
	private JButton sortButton;
	private JTextField battleTextField;
	private SpringLayout baseLayout;
	
	public PokePanel(InheritanceController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		sortButton = new JButton("Quick Sort");
		battleTextField = new JTextField();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(sortButton);
		this.add(battleTextField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, battleTextField, -185, SpringLayout.NORTH, sortButton);
		baseLayout.putConstraint(SpringLayout.WEST, battleTextField, 149, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, battleTextField, -58, SpringLayout.NORTH, sortButton);
		baseLayout.putConstraint(SpringLayout.EAST, battleTextField, 283, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortButton, 161, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortButton, -10, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				battleTextField.setText(baseController.showBattleLevels());
			}
		});
	}
}
