package activitymavaluetransfer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Valuetransfer {

	private JFrame frame;
	protected static String amcs;
	public static JTextField TFvalue;
	protected static Object a;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Valuetransfer window = new Valuetransfer();
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
	public Valuetransfer() {
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
		
		JLabel lblValueToBe = new JLabel("value to be transfered:");
		lblValueToBe.setBounds(66, 44, 140, 14);
		frame.getContentPane().add(lblValueToBe);
		
		TFvalue = new JTextField();
		TFvalue.setBounds(76, 69, 206, 20);
		frame.getContentPane().add(TFvalue);
		TFvalue.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				try{
					double amcs=Double.parseDouble(TFvalue.getText());
					frame.dispose();
					Newframe c=new Newframe();
					

					 
					
					Newframe.var=amcs;
					c.setVisible(true);
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnNewButton.setBounds(66, 115, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
