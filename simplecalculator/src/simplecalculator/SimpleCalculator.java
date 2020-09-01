package simplecalculator;



import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.ImageIcon;

public class SimpleCalculator {

	private JFrame frmGuideBondDesign;
	private JTextField TFdischarge;
	private JTextField TFhfl;
	private JTextField TFbl;
	private JTextField TFdiam;
	private JLabel TVww;
	private JLabel TVlus;
	private JLabel TVlds;
	private JLabel TVrus;
	private JLabel TVrds;
	
	private JLabel TVusan;
	private JLabel TVdsan;
	private JLabel TVimgww;
	private JLabel TVimglus;
	private JLabel TVimgrus;
	private JLabel TVimglds;
	private JLabel TVimgrds;
	private JLabel lblDesignedBy;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frmGuideBondDesign.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGuideBondDesign = new JFrame();
		frmGuideBondDesign.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmGuideBondDesign.setTitle("Guide Bank Design");
		frmGuideBondDesign.setBounds(100, 100, 878, 669);
		frmGuideBondDesign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuideBondDesign.getContentPane().setLayout(null);
		
		JLabel lblEnterFollowingData = new JLabel("ENTER FOLLOWING DATA:");
		lblEnterFollowingData.setFont(new Font("Sitka Subheading", Font.PLAIN, 25));
		lblEnterFollowingData.setBounds(44, 26, 504, 42);
		frmGuideBondDesign.getContentPane().add(lblEnterFollowingData);
		
		JLabel lblEnterDischarge = new JLabel("ENTER DISCHARGE(in cumecs):");
		lblEnterDischarge.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblEnterDischarge.setBounds(44, 82, 232, 30);
		frmGuideBondDesign.getContentPane().add(lblEnterDischarge);
		
		TFdischarge = new JTextField();
		TFdischarge.setToolTipText("");
		TFdischarge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TFdischarge.setBounds(287, 83, 164, 30);
		frmGuideBondDesign.getContentPane().add(TFdischarge);
		TFdischarge.setColumns(10);
		
		JLabel lblEnterHighFlood = new JLabel("Enter High Flood Level(in meter):");
		lblEnterHighFlood.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblEnterHighFlood.setBounds(44, 126, 232, 20);
		frmGuideBondDesign.getContentPane().add(lblEnterHighFlood);
		
		JLabel lblEnterRiverBed = new JLabel("Enter River Bed Level(in meter):");
		lblEnterRiverBed.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblEnterRiverBed.setBounds(34, 157, 232, 30);
		frmGuideBondDesign.getContentPane().add(lblEnterRiverBed);
		
		JLabel lblEnterDiameterOf = new JLabel("Enter diameter of Silt Particles(in mm):");
		lblEnterDiameterOf.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblEnterDiameterOf.setBounds(34, 198, 274, 30);
		frmGuideBondDesign.getContentPane().add(lblEnterDiameterOf);
		
		TFhfl = new JTextField();
		TFhfl.setBounds(287, 125, 164, 30);
		frmGuideBondDesign.getContentPane().add(TFhfl);
		TFhfl.setColumns(10);
		
		TFbl = new JTextField();
		TFbl.setBounds(287, 161, 164, 30);
		frmGuideBondDesign.getContentPane().add(TFbl);
		TFbl.setColumns(10);
		
		TFdiam = new JTextField();
		TFdiam.setBounds(287, 200, 164, 30);
		frmGuideBondDesign.getContentPane().add(TFdiam);
		TFdiam.setColumns(10);
		
		JButton Bcalculate = new JButton("CALCULATE");
		Bcalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double Q=Double.parseDouble(TFdischarge.getText());
					
				
					
					double ww,lus,lds,rus,rds;
					double uangle=135,langle=60;
					ww=1.2*4.75*Math.pow(Q,0.5);
					lus=1.25*ww;
					lds=0.25*ww;
					rus=0.45*ww;
					rds=0.225*ww;
					String wws=String.format("%.3f",ww);
					String luss=String.format("%.3f",lus);
					String ldss=String.format("%.3f",lds);
					String russ=String.format("%.3f",rus);
					String rdss=String.format("%.3f",rds);
					String uangles=String.format("%.1f",uangle);
					String langles=String.format("%.1f",langle);
					
					TVww.setText(wws+"m");
					TVlus.setText(luss+"m");
					TVlds.setText(ldss+"m");
					TVrus.setText(russ+"m");
					TVrds.setText(rdss+"m");
					TVusan.setText(uangles+"degree");
					TVdsan.setText(langles+"degree");
					TVimgww.setText(wws+"m");
					TVimglus.setText(luss+"m");
					TVimglds.setText(ldss+"m");
					TVimgrus.setText(russ+"m");
					TVimgrds.setText(rdss+"m");
					
					
					
					
					
					
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid data");
				}
			}
			
		});
		Bcalculate.setBounds(187, 267, 104, 42);
		frmGuideBondDesign.getContentPane().add(Bcalculate);
		
		JLabel label = new JLabel("");
		label.setBounds(35, 336, 46, 14);
		frmGuideBondDesign.getContentPane().add(label);
		
		JLabel lblResults = new JLabel("RESULTS:");
		lblResults.setFont(new Font("Sitka Subheading", Font.PLAIN, 25));
		lblResults.setBounds(34, 320, 257, 42);
		frmGuideBondDesign.getContentPane().add(lblResults);
		
		JLabel lblPlan = new JLabel("PLAN");
		lblPlan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPlan.setBounds(204, 354, 104, 47);
		frmGuideBondDesign.getContentPane().add(lblPlan);
		
		JLabel lblOverallWaterWay = new JLabel("Overall Water Way=");
		lblOverallWaterWay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOverallWaterWay.setBounds(34, 408, 135, 30);
		frmGuideBondDesign.getContentPane().add(lblOverallWaterWay);
		
		JLabel lblLengthOfGuide = new JLabel("Length Of Guide Bank u/s=");
		lblLengthOfGuide.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLengthOfGuide.setBounds(34, 437, 181, 30);
		frmGuideBondDesign.getContentPane().add(lblLengthOfGuide);
		
		JLabel lblLengthOfGuide_1 = new JLabel("Length Of Guide Bank D/S=");
		lblLengthOfGuide_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLengthOfGuide_1.setBounds(34, 471, 196, 20);
		frmGuideBondDesign.getContentPane().add(lblLengthOfGuide_1);
		
		JLabel lblRadiusOfUs = new JLabel("Radius Of U/S curve head=");
		lblRadiusOfUs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRadiusOfUs.setBounds(34, 502, 181, 20);
		frmGuideBondDesign.getContentPane().add(lblRadiusOfUs);
		
		JLabel lblAngleOfSweep = new JLabel("Angle Of Sweep at u/s head=");
		lblAngleOfSweep.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAngleOfSweep.setBounds(34, 564, 196, 20);
		frmGuideBondDesign.getContentPane().add(lblAngleOfSweep);
		
		JLabel lblNewLabel = new JLabel("Angle Of Sweep At d/s head=");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(34, 595, 196, 20);
		frmGuideBondDesign.getContentPane().add(lblNewLabel);
		
		TVww = new JLabel("0.0m");
		TVww.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TVww.setBounds(176, 418, 100, 14);
		frmGuideBondDesign.getContentPane().add(TVww);
		
		TVlus = new JLabel("0.0m");
		TVlus.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TVlus.setBounds(220, 447, 135, 14);
		frmGuideBondDesign.getContentPane().add(TVlus);
		
		TVlds = new JLabel("0.0m");
		TVlds.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TVlds.setBounds(250, 475, 146, 14);
		frmGuideBondDesign.getContentPane().add(TVlds);
		
		TVrus = new JLabel("0.0m");
		TVrus.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TVrus.setBounds(220, 507, 135, 14);
		frmGuideBondDesign.getContentPane().add(TVrus);
		
		TVusan = new JLabel("0 degree");
		TVusan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TVusan.setBounds(245, 569, 76, 15);
		frmGuideBondDesign.getContentPane().add(TVusan);
		
		TVdsan = new JLabel("0 degree");
		TVdsan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TVdsan.setBounds(240, 600, 68, 15);
		frmGuideBondDesign.getContentPane().add(TVdsan);
		
		JLabel lblRadiusOfDs = new JLabel("Radius Of D/S Curve Head=");
		lblRadiusOfDs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRadiusOfDs.setBounds(34, 533, 188, 20);
		frmGuideBondDesign.getContentPane().add(lblRadiusOfDs);
		
		TVrds = new JLabel("0.0m");
		TVrds.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TVrds.setBounds(230, 532, 125, 14);
		frmGuideBondDesign.getContentPane().add(TVrds);
		
		TVimgww = new JLabel("0.0m");
		TVimgww.setBounds(647, 232, 110, 14);
		frmGuideBondDesign.getContentPane().add(TVimgww);
		
		TVimglus = new JLabel("0.0m");
		TVimglus.setBounds(526, 255, 104, 14);
		frmGuideBondDesign.getContentPane().add(TVimglus);
		
		TVimglds = new JLabel("0.0m");
		TVimglds.setBounds(547, 387, 104, 14);
		frmGuideBondDesign.getContentPane().add(TVimglds);
		
		TVimgrus = new JLabel("Radius us=0.0m");
		TVimgrus.setBounds(622, 80, 135, 14);
		frmGuideBondDesign.getContentPane().add(TVimgrus);
		
		TVimgrds = new JLabel("Radius of DS=0.0m");
		TVimgrds.setBounds(727, 387, 125, 14);
		frmGuideBondDesign.getContentPane().add(TVimgrds);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\plan.png"));
		lblNewLabel_1.setBounds(451, 0, 411, 467);
		frmGuideBondDesign.getContentPane().add(lblNewLabel_1);
		
		lblDesignedBy = new JLabel("Designed By : Bishal Pokharel ");
		lblDesignedBy.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblDesignedBy.setBounds(451, 538, 306, 60);
		frmGuideBondDesign.getContentPane().add(lblDesignedBy);
	}
}
