package sewerDesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SewerDesign {

	private JFrame frmSewage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SewerDesign window = new SewerDesign();
					window.frmSewage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SewerDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSewage = new JFrame();
		frmSewage.setTitle("sewage");
		frmSewage.setBounds(100, 100, 450, 300);
		frmSewage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSewage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(73, 46, 135, 14);
		frmSewage.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frmSewage.dispose();
					NewActivity c=new NewActivity();
					c.setVisible(true);
					
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,"error");
				}
				
			}
		});
		btnNewButton.setBounds(44, 114, 164, 23);
		frmSewage.getContentPane().add(btnNewButton);
		
		JButton btnNewOne = new JButton("new one");
		btnNewOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frmSewage.dispose();
					Newone c=new Newone();
					c.setVisible(true);
					
				}catch(Exception e5){
					JOptionPane.showMessageDialog(null, "error man");
					
				}
			}
		});
		btnNewOne.setBounds(62, 161, 89, 23);
		frmSewage.getContentPane().add(btnNewOne);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
