package graphicsheru;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class shapes extends JPanel {
public void paintComponent(Graphics g)
	{
	super.paintComponent(g);
	this.setBackground(Color.black);
	g.setColor(Color.gray);
	g.drawLine(0,0,100,100);
	}

}