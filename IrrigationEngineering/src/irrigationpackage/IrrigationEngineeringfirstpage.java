package irrigationpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IrrigationEngineeringfirstpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IrrigationEngineeringfirstpage window = new IrrigationEngineeringfirstpage();
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
	public IrrigationEngineeringfirstpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 503, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIrrigationEngineeringCalculations = new JLabel("IRRIGATION ENGINEERING  CALCULATIONS");
		lblIrrigationEngineeringCalculations.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblIrrigationEngineeringCalculations.setBounds(10, 11, 443, 42);
		frame.getContentPane().add(lblIrrigationEngineeringCalculations);
		
		JLabel lblContents = new JLabel("Contents:");
		lblContents.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContents.setBounds(10, 77, 84, 14);
		frame.getContentPane().add(lblContents);
		
		JButton btnIrrigationWaterRequirements = new JButton("IRRIGATION WATER REQUIREMENTS");
		btnIrrigationWaterRequirements.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frame.dispose();
					Irrigationwaterrequirement c=new Irrigationwaterrequirement();
					c.setVisible(true);
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnIrrigationWaterRequirements.setBounds(10, 102, 279, 23);
		frame.getContentPane().add(btnIrrigationWaterRequirements);
		
		JButton btnDesignOfCanals = new JButton("DESIGN OF CANALS");
		btnDesignOfCanals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frame.dispose();
			Designofcanals c=new Designofcanals();
					c.setVisible(true);
					
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnDesignOfCanals.setBounds(10, 136, 279, 23);
		frame.getContentPane().add(btnDesignOfCanals);
		
		JButton btnDiversionHeadworkCalculations = new JButton("DIVERSION HEADWORK CALCULATIONS");
		btnDiversionHeadworkCalculations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frame.dispose();
					Diversionheadworks c=new Diversionheadworks();
					c.setVisible(true);
					
				}catch(Exception e3){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnDiversionHeadworkCalculations.setBounds(10, 170, 279, 23);
		frame.getContentPane().add(btnDiversionHeadworkCalculations);
		
		JButton btnRiverTrainingWorks = new JButton("RIVER TRAINING WORKS");
		btnRiverTrainingWorks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frame.dispose();
					Rivertrainingworks c=new Rivertrainingworks();
					c.setVisible(true);
					
				}catch(Exception e4){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnRiverTrainingWorks.setBounds(10, 205, 279, 23);
		frame.getContentPane().add(btnRiverTrainingWorks);
		
		JButton btnNewButton = new JButton("REGULATING STRUCTURES ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frame.dispose();
					Regulatingstructures c=new Regulatingstructures();
					c.setVisible(true);
					
				}catch(Exception e5){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnNewButton.setBounds(10, 244, 279, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCrossDrainageStructures = new JButton("CROSS DRAINAGE STRUCTURES");
		btnCrossDrainageStructures.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frame.dispose();
					Crossdrainagestructures c=new Crossdrainagestructures();
					c.setVisible(true);
					
				}catch(Exception e6){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnCrossDrainageStructures.setBounds(10, 277, 279, 23);
		frame.getContentPane().add(btnCrossDrainageStructures);
		
		JButton btnWaterLoggingAnd = new JButton("WATER LOGGING AND DRIANAGE");
		btnWaterLoggingAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					frame.dispose();
					Waterlogging c=new Waterlogging();
					c.setVisible(true);
					
				}catch(Exception e7){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
}
		});
		btnWaterLoggingAnd.setBounds(10, 313, 279, 23);
		frame.getContentPane().add(btnWaterLoggingAnd);
	}
}
