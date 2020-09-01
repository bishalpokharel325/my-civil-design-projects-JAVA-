import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Frame1 {

	private JFrame frmMessage;
	private JFrame frame;
	private JLabel TVlabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmMessage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMessage = new JFrame();
		frmMessage.setTitle("MESSAGE");
		frmMessage.setBounds(100, 100, 450, 300);
		frmMessage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMessage.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Show Message");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TVlabel.setText("kasto ramailo");
			
			}
		});
		btnNewButton.setBounds(150, 171, 151, 23);
		frmMessage.getContentPane().add(btnNewButton);
		
		TVlabel = new JLabel("Message");
		TVlabel.setBounds(150, 130, 231, 14);
		frmMessage.getContentPane().add(TVlabel);
	}
}
