import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TractiveForceApproach extends JFrame {

	private JPanel contentPane;
	private JTextField TFdischarge;
	private JTextField TFslope;
	private JTextField TFangle;
	private JTextField TFgrain;
	private JTextField TFss;
	private JLabel TVwidth;
	private JLabel TVheight;
	private JLabel TVss;
	private JLabel TVls;
	private JLabel TVimgss;
	private JLabel TVimgheight;
	private JLabel TVimgwidth;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TractiveForceApproach frame = new TractiveForceApproach();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TractiveForceApproach() {
		setTitle("TRACTIVE FORCE APPROACH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblTractiveForceApproach = new JLabel("Tractive Force Approach:");
		lblTractiveForceApproach.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTractiveForceApproach.setBounds(10, 11, 203, 26);
		contentPane.add(lblTractiveForceApproach);
		
		JLabel lblEnterFollowingData = new JLabel("Enter following Data");
		lblEnterFollowingData.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnterFollowingData.setBounds(10, 36, 180, 31);
		contentPane.add(lblEnterFollowingData);
		
		JLabel lblEnterDischargeinCumecs = new JLabel("Enter Discharge(in Cumecs):");
		lblEnterDischargeinCumecs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterDischargeinCumecs.setBounds(10, 70, 192, 26);
		contentPane.add(lblEnterDischargeinCumecs);
		
		JLabel lblNewLabel = new JLabel("Enter Slope:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 107, 83, 19);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("1:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(101, 109, 46, 14);
		contentPane.add(label);
		
		JLabel lblEnterGrainSizein = new JLabel("Enter Grain Size(in mm):");
		lblEnterGrainSizein.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterGrainSizein.setBounds(10, 137, 167, 14);
		contentPane.add(lblEnterGrainSizein);
		
		JLabel lblNewLabel_1 = new JLabel("\u03A6 Angle:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 162, 60, 19);
		contentPane.add(lblNewLabel_1);
		
		TFdischarge = new JTextField();
		TFdischarge.setBounds(198, 75, 86, 20);
		contentPane.add(TFdischarge);
		TFdischarge.setColumns(10);
		
		TFslope = new JTextField();
		TFslope.setBounds(127, 107, 86, 20);
		contentPane.add(TFslope);
		TFslope.setColumns(10);
		
		TFangle = new JTextField();
		TFangle.setBounds(80, 163, 86, 20);
		contentPane.add(TFangle);
		TFangle.setColumns(10);
		
		TFgrain = new JTextField();
		TFgrain.setBounds(187, 136, 86, 20);
		contentPane.add(TFgrain);
		TFgrain.setColumns(10);
		
		JButton Bcalculate = new JButton("Calculate");
		Bcalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double discharge=Double.parseDouble(TFdischarge.getText());
					double ls=Double.parseDouble(TFslope.getText());
					double phi=Double.parseDouble(TFangle.getText());
					double ss=Double.parseDouble(TFss.getText());
					double dmm=Double.parseDouble(TFgrain.getText());
					double y,c,tansssq,tanphisq,sqrtt,z,b=0.5,A,q,P,n,R;
					tansssq=Math.tan(ss*3.14/180)*Math.tan(ss*3.14/180);
					tanphisq=Math.tan(phi*3.14/180)*Math.tan(phi*3.14/180);
					sqrtt=Math.sqrt(1-tansssq/tanphisq);					
					c=Math.cos(ss*3.14/180)*sqrtt;
					y=0.8*c*dmm/1000*ls*1/(0.75*11);
					n=Math.pow(dmm/1000,0.16667)/24;
					z=1/Math.tan(ss*3.14/180);
					do
					{
						b=b+0.01;
					A=b*y+z*y*y;
					P=b+2*y*Math.sqrt((1+z*z));
					R=A/P;
					q=Math.pow(R,0.6667)*A*Math.sqrt(1/ls)/n;
					}while(Math.abs(q-discharge)>0.01);
					
					
					
					 String widths=String.format("%.3f",b);
					 String heights=String.format("%.3f",y);
					 String sss=String.format("%.1f",ss);
					 String lsss=String.format("%.1f",ls);
					 String imgwidth=String.format("%.3f",b);
					 String imgheight=String.format("%.3f",y);
					 String imgsss=String.format("%.1f",ss);
					 
					 TVwidth.setText(widths+"m");
					 TVheight.setText(heights+"m");
					 TVss.setText(sss+"degree");
					 TVls.setText("1:"+lsss);
					 TVimgwidth.setText(imgwidth+"m");
					 TVimgheight.setText(imgheight+"m");
					 TVimgss.setText(imgsss+"degree");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
				
				
			}
		});
		Bcalculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Bcalculate.setBounds(10, 226, 99, 26);
		contentPane.add(Bcalculate);
		
		JLabel lblResult = new JLabel("RESULT:");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResult.setBounds(10, 263, 99, 26);
		contentPane.add(lblResult);
		
		JLabel lblSideSlopeAngle = new JLabel("Side Slope Angle(degree):");
		lblSideSlopeAngle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSideSlopeAngle.setBounds(10, 192, 180, 23);
		contentPane.add(lblSideSlopeAngle);
		
		TFss = new JTextField();
		TFss.setBounds(198, 195, 86, 20);
		contentPane.add(TFss);
		TFss.setColumns(10);
		
		JLabel lblBottomWidthOf = new JLabel("Bottom Width Of Canal:");
		lblBottomWidthOf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBottomWidthOf.setBounds(10, 300, 156, 26);
		contentPane.add(lblBottomWidthOf);
		
		TVwidth = new JLabel("0.0m");
		TVwidth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TVwidth.setBounds(176, 308, 97, 14);
		contentPane.add(TVwidth);
		
		JLabel lblCanalHeight = new JLabel("Canal Height:");
		lblCanalHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCanalHeight.setBounds(10, 337, 99, 26);
		contentPane.add(lblCanalHeight);
		
		TVheight = new JLabel("0.0m");
		TVheight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TVheight.setBounds(131, 345, 82, 14);
		contentPane.add(TVheight);
		
		JLabel lblSideSlope = new JLabel("Side Slope:");
		lblSideSlope.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSideSlope.setBounds(10, 374, 121, 19);
		contentPane.add(lblSideSlope);
		
		TVss = new JLabel("0 degrees");
		TVss.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TVss.setBounds(113, 370, 75, 26);
		contentPane.add(TVss);
		
		JLabel lblLongitudinalSlope = new JLabel("Longitudinal Slope:");
		lblLongitudinalSlope.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLongitudinalSlope.setBounds(10, 404, 121, 26);
		contentPane.add(lblLongitudinalSlope);
		
		TVls = new JLabel("1:1 ");
		TVls.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TVls.setBounds(143, 410, 86, 14);
		contentPane.add(TVls);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\sideangle.png"));
		lblNewLabel_2.setBounds(322, 36, 238, 209);
		contentPane.add(lblNewLabel_2);
		
		TVimgwidth = new JLabel("0.0m");
		TVimgwidth.setBounds(506, 478, 46, 14);
		contentPane.add(TVimgwidth);
		
		TVimgheight = new JLabel("0.0m");
		TVimgheight.setBounds(482, 395, 46, 14);
		contentPane.add(TVimgheight);
		
		TVimgss = new JLabel("0 degree");
		TVimgss.setBounds(625, 358, 79, 14);
		contentPane.add(TVimgss);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\designcanal.png"));
		lblNewLabel_4.setBounds(322, 285, 382, 268);
		contentPane.add(lblNewLabel_4);
	}
}
