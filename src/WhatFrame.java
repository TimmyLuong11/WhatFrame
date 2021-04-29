import javax.swing.JFrame;

public class WhatFrame extends JFrame 
{
	public WhatFrame()
	{
		super("Boring Frame");
		setSize(310, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		buildPannel();
		add(panel);
	}
	private void buildPannel()
	{
		
	}
	
}
