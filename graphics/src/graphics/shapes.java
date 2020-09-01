package graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class shapes extends JPanel {
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.setColor(Color.BLUE);
		g.drawLine(0,0,50,50);
		g.setColor(new Color(192,25,30));
		g.drawRect(250,250,250,250);
		g.setColor(Color.CYAN);
		g.drawString("this is string",400,500);
		
	
	
	
		
	}
	
	

}
