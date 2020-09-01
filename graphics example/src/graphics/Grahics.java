package graphics;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

public class Grahics {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public class SimpleDrawingTool{
	super("Simple Drawing Tools");
	this.setSize(400,400);
	this.setVisible(true);
		}
	
		public static void main(String[] args) {
			SimpleDrawingTool simpleDrawingTool=new SimpleDrawingTool();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grahics window = new Grahics();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Grahics() {
		initialize();
			
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
		});
		btnNewButton.setBounds(107, 27, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
