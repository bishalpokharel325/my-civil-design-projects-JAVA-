import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CanalDesign {

	private JFrame framefirst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CanalDesign window = new CanalDesign();
					window.framefirst.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CanalDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framefirst = new JFrame();
		framefirst.setTitle("Design Of Canals");
		framefirst.setBounds(100, 100, 437, 275);
		framefirst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framefirst.getContentPane().setLayout(null);
		
		JLabel lblChooseAnyOf = new JLabel("CHOOSE ANY OF THE APPROACH FOR CANAL DESIGN:");
		lblChooseAnyOf.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblChooseAnyOf.setBounds(10, 11, 441, 50);
		framefirst.getContentPane().add(lblChooseAnyOf);
		
		JButton btnTractiveForceApproach = new JButton("TRACTIVE FORCE APPROACH");
		btnTractiveForceApproach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					{			
					
					
					framefirst.dispose();
					TractiveForceApproach frametractive=new TractiveForceApproach();
					frametractive.setVisible(true);
					}
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnTractiveForceApproach.setBounds(10, 72, 222, 23);
		framefirst.getContentPane().add(btnTractiveForceApproach);
		
		JButton btnKennedyMethod = new JButton("KENNEDY METHOD");
		btnKennedyMethod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					{			
					
					
					framefirst.dispose();
					KennedyMethod framekennedy=new KennedyMethod();
					framekennedy.setVisible(true);
					}
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}
			
		});
		btnKennedyMethod.setBounds(10, 106, 222, 23);
		framefirst.getContentPane().add(btnKennedyMethod);
		
		JButton btnLaceysMethod = new JButton("LACEY'S METHOD");
		btnLaceysMethod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					{			
					
					
					framefirst.dispose();
					LaceysMethod framelacey=new LaceysMethod();
					framelacey.setVisible(true);
					}
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}
			
		});
		btnLaceysMethod.setBounds(10, 140, 222, 23);
		framefirst.getContentPane().add(btnLaceysMethod);
		
		JButton btnDesignOfEconomical = new JButton("DESIGN OF ECONOMICAL CANAL");
		btnDesignOfEconomical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					{			
					
					
					framefirst.dispose();
					EconomicalCanal framecanal=new EconomicalCanal();
					framecanal.setVisible(true);
					}
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			
			}
		});
		btnDesignOfEconomical.setBounds(10, 174, 222, 23);
		framefirst.getContentPane().add(btnDesignOfEconomical);
	}
}
