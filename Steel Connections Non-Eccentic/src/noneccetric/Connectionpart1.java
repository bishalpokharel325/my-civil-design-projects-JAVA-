package noneccetric;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class Connectionpart1 {

	private JFrame frmDesignOfSimple;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField TFgrade;
	private JTextField TFtgusset;
	private JTextField TFtmember;
	private JTextField TFsize;
	private JTextField TFwidth;
	private JTextField TFload;
	private JTextField TFlw;
	private JLabel TVresult;
	private JLabel TVlimit;
	private JTextField TFcxx;
	private JTextField TFtoe;
	private JTextField TFangle;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connectionpart1 window = new Connectionpart1();
					window.frmDesignOfSimple.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Connectionpart1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDesignOfSimple = new JFrame();
		frmDesignOfSimple.getContentPane().setBackground(Color.BLACK);
		frmDesignOfSimple.getContentPane().setLayout(null);
		
		JLabel lblAnalysisAndDesign = new JLabel("Analysis and Design Of Simple Steel Connections");
		lblAnalysisAndDesign.setForeground(Color.WHITE);
		lblAnalysisAndDesign.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAnalysisAndDesign.setBounds(145, 11, 358, 28);
		frmDesignOfSimple.getContentPane().add(lblAnalysisAndDesign);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 44, 765, 657);
		frmDesignOfSimple.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 51));
		tabbedPane.addTab("Welded Connections", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblChooseTheConnection = new JLabel("Choose the Connection Type:");
		lblChooseTheConnection.setForeground(Color.BLACK);
		lblChooseTheConnection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChooseTheConnection.setBounds(10, 11, 192, 26);
		panel.add(lblChooseTheConnection);
		
		JRadioButton rdbtnPlateAndGusset = new JRadioButton("Plate and Gusset plate");
		rdbtnPlateAndGusset.setSelected(true);
		buttonGroup.add(rdbtnPlateAndGusset);
		rdbtnPlateAndGusset.setBounds(10, 201, 173, 23);
		panel.add(rdbtnPlateAndGusset);
		
		JRadioButton rdbtnChannelAndGusset = new JRadioButton("Channel and Gusset Plate");
		buttonGroup.add(rdbtnChannelAndGusset);
		rdbtnChannelAndGusset.setBounds(185, 201, 234, 23);
		panel.add(rdbtnChannelAndGusset);
		
		JRadioButton rdbtnAngleAndGusset = new JRadioButton("Angle and Gusset Plate");
		buttonGroup.add(rdbtnAngleAndGusset);
		rdbtnAngleAndGusset.setBounds(441, 201, 186, 23);
		panel.add(rdbtnAngleAndGusset);
		
		JLabel lblEnterGradeOf = new JLabel("Enter Grade OF Steel:");
		lblEnterGradeOf.setForeground(Color.BLACK);
		lblEnterGradeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterGradeOf.setBounds(20, 231, 130, 26);
		panel.add(lblEnterGradeOf);
		
		JLabel lblFe = new JLabel("Fe");
		lblFe.setForeground(Color.BLACK);
		lblFe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFe.setBounds(153, 231, 21, 26);
		panel.add(lblFe);
		
		TFgrade = new JTextField();
		TFgrade.setText("410");
		TFgrade.setBounds(170, 235, 41, 20);
		panel.add(TFgrade);
		TFgrade.setColumns(10);
		
		JLabel lblThicknessOfGusset = new JLabel("Thickness Of Gusset plate(mm):");
		lblThicknessOfGusset.setForeground(Color.BLACK);
		lblThicknessOfGusset.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblThicknessOfGusset.setBounds(19, 268, 192, 26);
		panel.add(lblThicknessOfGusset);
		
		TFtgusset = new JTextField();
		TFtgusset.setText("12");
		TFtgusset.setBounds(221, 272, 86, 20);
		panel.add(TFtgusset);
		TFtgusset.setColumns(10);
		
		JLabel lblThicknessOfMembermm = new JLabel("Thickness Of member(mm):");
		lblThicknessOfMembermm.setForeground(Color.BLACK);
		lblThicknessOfMembermm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblThicknessOfMembermm.setBounds(10, 305, 192, 26);
		panel.add(lblThicknessOfMembermm);
		
		TFtmember = new JTextField();
		TFtmember.setText("8");
		TFtmember.setBounds(212, 309, 86, 20);
		panel.add(TFtmember);
		TFtmember.setColumns(10);
		
		JLabel lblelseChooseAngle = new JLabel("(Else Choose Angle Or Channel):");
		lblelseChooseAngle.setForeground(Color.BLACK);
		lblelseChooseAngle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblelseChooseAngle.setBounds(312, 305, 206, 26);
		panel.add(lblelseChooseAngle);
		
		JLabel lblEnterSizeOf = new JLabel("Enter Size Of Weld:");
		lblEnterSizeOf.setForeground(Color.BLACK);
		lblEnterSizeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterSizeOf.setBounds(10, 448, 130, 26);
		panel.add(lblEnterSizeOf);
		
		JButton btnGenerateSizeLimit = new JButton("Generate size limit for weld connection");
		btnGenerateSizeLimit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double tgusset=Double.parseDouble(TFtgusset.getText());
					double tmember=Double.parseDouble(TFtmember.getText());
					double size=Double.parseDouble(TFsize.getText());
					double toe=Double.parseDouble(TFtoe.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double tmin = 3,tmax,tmaxangle,tminangle=3.00;
					tmax=tmember-1.5;
					tmaxangle=0.75*tmember;
					if(tgusset<=10)tmin=3;
					if(tgusset>10&&tgusset<=20)tmin=5;
					if(tgusset>20&&tgusset<=32)tmin=6;
					if(tgusset>32&&tgusset<=50)tmin=8;
					String tmins=String.format("%.2f",tmin);
					String tmaxangles=String.format("%.2f",tmaxangle);
					String tminangles=String.format("%.2f",tminangle);
					String tmaxs=String.format("%.2f",tmax);
				  
					if(a=="Angle and Gusset Plate"){
						
						
						TVlimit.setText("The size of weld for rounded toe end should be between "+tminangles+" to "+tmaxangles+" and other end="+tmins+" to "+tmaxs);
						
						
					}
					else
					{
						TVlimit.setText("The size of weld should be between "+tmins+" to "+tmaxs);
					}
					if(size<tmin)TFsize.setText(tmins);
					if(size>tmin)TFsize.setText(tmaxs);
					if(toe<tmin)TFtoe.setText(tminangles);
					if(toe>tmin)TFtoe.setText(tmaxangles);
					
						
					
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			
			}
		});
		btnGenerateSizeLimit.setBounds(127, 377, 226, 23);
		panel.add(btnGenerateSizeLimit);
		
		TVlimit = new JLabel("..");
		TVlimit.setForeground(new Color(0, 0, 102));
		TVlimit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		TVlimit.setBounds(23, 411, 671, 26);
		panel.add(TVlimit);
		
		TFsize = new JTextField();
		TFsize.setText("6");
		TFsize.setBounds(144, 452, 86, 20);
		panel.add(TFsize);
		TFsize.setColumns(10);
		
		JLabel lblMemberWidthmm = new JLabel("Member width(mm):");
		lblMemberWidthmm.setForeground(Color.BLACK);
		lblMemberWidthmm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMemberWidthmm.setBounds(10, 340, 138, 26);
		panel.add(lblMemberWidthmm);
		
		TFwidth = new JTextField();
		TFwidth.setText("60");
		TFwidth.setBounds(175, 346, 86, 20);
		panel.add(TFwidth);
		TFwidth.setColumns(10);
		
		JLabel lblAxialForceTo = new JLabel("Axial Force(factored) to be Resisted/Force Resisted by Connections(KN):");
		lblAxialForceTo.setForeground(Color.BLACK);
		lblAxialForceTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAxialForceTo.setBounds(10, 481, 463, 26);
		panel.add(lblAxialForceTo);
		
		TFload = new JTextField();
		TFload.setText("150");
		TFload.setBounds(490, 485, 86, 20);
		panel.add(TFload);
		TFload.setColumns(10);
		
		JButton btnDesign = new JButton("Design");
		btnDesign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double load=Double.parseDouble(TFload.getText());
					
					double angle=Double.parseDouble(TFangle.getText());
					double size=Double.parseDouble(TFsize.getText());
					double Cxx=Double.parseDouble(TFcxx.getText());

					double tmember=Double.parseDouble(TFtmember.getText());
					double toe=Double.parseDouble(TFtoe.getText());
					double width=Double.parseDouble(TFwidth.getText());
						
					double grade=Double.parseDouble(TFgrade.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup_1.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double fs=0;
				if(a=="Shop Weld")fs=1.25;
				if(a=="field weld")fs=1.5;

				
				Enumeration<AbstractButton> bg1=buttonGroup.getElements();
				while(bg1.hasMoreElements()){
					JRadioButton jrd=(JRadioButton) bg1.nextElement();
					
					if(jrd.isSelected())
					a=jrd.getText();
					
						
				}
				
				if(angle<60){
					
					angle=60;
				}
				if(angle>120){
					
					angle=120;
				}
				String angles=String.format("%.3f",angle);
				TFangle.setText(angles);
				double k=0.7;
				if(angle>60&&angle<=90)k=0.7;
				if(angle>90&&angle<=100)k=0.65;
				if(angle>100&&angle<=106)k=0.6;
				if(angle>106&&angle<=113)k=0.55;
				if(angle>113&&angle<=120)k=0.5;
				double lw=0,lr=0,lo=0;
				lw=load*1.732*fs*1000/(grade*k*size);
				if(a=="Angle and Gusset Plate"){
					double any=k*grade*(toe+(100-Cxx)/Cxx*size);				
					lr=load*1000*1.732*fs/any;
					lo=lw-lr;
					String los=String.format("%.3f",lo);
					String lws=String.format("%.3f",lw);
					String lrs=String.format("%.3f",lr);
					TVresult.setText("Total length of weld required="+lws+" provide "+lrs+"mm at rounded end and "+los+"mm at other end of weld");
				}
				else
				{
					String lws=String.format("%.3f",lw);
					double overlap=(lw-width)/2;
					if(overlap<Math.max(tmember*0.4,40)){
						overlap=Math.max(tmember*0.4,40);
						lw=width+2*overlap;
					}
					String overlaps=String.format("%.3f",overlap);
					
					TVresult.setText("Total legth of weld required(min)="+lws+"mm"+" and minimum Overlap="+overlaps+"mm");
					
				}
				
					
				}catch(Exception e11){
					JOptionPane.showMessageDialog(null,e11);
				}
			}
		});
		btnDesign.setBounds(586, 484, 89, 23);
		panel.add(btnDesign);
		
		JLabel lblMinimumLengthOf = new JLabel("Length Of Weld(mm):");
		lblMinimumLengthOf.setForeground(Color.BLACK);
		lblMinimumLengthOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMinimumLengthOf.setBounds(64, 518, 138, 26);
		panel.add(lblMinimumLengthOf);
		
		TFlw = new JTextField();
		TFlw.setText("377");
		TFlw.setBounds(212, 522, 86, 20);
		panel.add(TFlw);
		TFlw.setColumns(10);
		
		JButton btnAnalyse = new JButton("Analyse");
		btnAnalyse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double size=Double.parseDouble(TFsize.getText());
					double lw=Double.parseDouble(TFlw.getText());
					double angle=Double.parseDouble(TFangle.getText());
					double grade=Double.parseDouble(TFgrade.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup_1.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double fs=0;
				if(a=="Shop Weld")fs=1.25;
				if(a=="field weld")fs=1.5;

				
				Enumeration<AbstractButton> bg1=buttonGroup.getElements();
				while(bg1.hasMoreElements()){
					JRadioButton jrd=(JRadioButton) bg1.nextElement();
					
					if(jrd.isSelected())
					a=jrd.getText();
					
						
				}
				
				if(angle<60){
					
					angle=60;
				}
				if(angle>120){
					
					angle=120;
				}
				String angles=String.format("%.3f",angle);
				TFangle.setText(angles);
				double k=0.7;
				if(angle>60&&angle<=90)k=0.7;
				if(angle>90&&angle<=100)k=0.65;
				if(angle>100&&angle<=106)k=0.6;
				if(angle>106&&angle<=113)k=0.55;
				if(angle>113&&angle<=120)k=0.5;
				double load=grade/1.732*lw*k*0.001*size/fs;
				String amcs=String.format("%.3f",load);
				TVresult.setText("It can resist force of "+amcs+"KN");
				
					
					
					
					
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null,e2);
				}
			}
		});
		btnAnalyse.setBounds(312, 518, 89, 23);
		panel.add(btnAnalyse);
		
		JLabel lblDesignanalyseResult = new JLabel("Design/Analyse Result:");
		lblDesignanalyseResult.setForeground(new Color(51, 0, 102));
		lblDesignanalyseResult.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblDesignanalyseResult.setBounds(10, 555, 192, 26);
		panel.add(lblDesignanalyseResult);
		
		JLabel lblforAnglecxxmm = new JLabel("(For Angle)Cxx(mm):");
		lblforAnglecxxmm.setForeground(Color.BLACK);
		lblforAnglecxxmm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblforAnglecxxmm.setBounds(281, 340, 138, 26);
		panel.add(lblforAnglecxxmm);
		
		TFcxx = new JTextField();
		TFcxx.setText("31");
		TFcxx.setBounds(412, 344, 86, 20);
		panel.add(TFcxx);
		TFcxx.setColumns(10);
		
		TVresult = new JLabel("..");
		TVresult.setForeground(new Color(0, 0, 102));
		TVresult.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		TVresult.setBounds(10, 592, 740, 26);
		panel.add(TVresult);
		
		JLabel lblangleenterSizeOf = new JLabel("(Angle)Enter Size Of Weld(for rounded toe end):");
		lblangleenterSizeOf.setForeground(Color.BLACK);
		lblangleenterSizeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblangleenterSizeOf.setBounds(253, 448, 298, 26);
		panel.add(lblangleenterSizeOf);
		
		TFtoe = new JTextField();
		TFtoe.setText("6");
		TFtoe.setBounds(561, 452, 86, 20);
		panel.add(TFtoe);
		TFtoe.setColumns(10);
		
		JLabel lblFusionAngledegree = new JLabel("Fusion Angle(degree):");
		lblFusionAngledegree.setForeground(Color.BLACK);
		lblFusionAngledegree.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFusionAngledegree.setBounds(221, 231, 149, 26);
		panel.add(lblFusionAngledegree);
		
		TFangle = new JTextField();
		TFangle.setText("90");
		TFangle.setBounds(362, 235, 86, 20);
		panel.add(TFangle);
		TFangle.setColumns(10);
		
		JRadioButton rdbtnShopWeld = new JRadioButton("Shop Weld");
		rdbtnShopWeld.setSelected(true);
		buttonGroup_1.add(rdbtnShopWeld);
		rdbtnShopWeld.setBounds(468, 234, 86, 23);
		panel.add(rdbtnShopWeld);
		
		JRadioButton rdbtnFieldWeld = new JRadioButton("field weld");
		buttonGroup_1.add(rdbtnFieldWeld);
		rdbtnFieldWeld.setBounds(570, 234, 77, 23);
		panel.add(rdbtnFieldWeld);
		
		JLabel plate = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/plate.png")).getImage();
		plate.setIcon(new ImageIcon(img));
		plate.setBounds(10, 34, 173, 160);
		panel.add(plate);
		
		JLabel channel = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/channel.png")).getImage();
		channel.setIcon(new ImageIcon(img1));
		channel.setBounds(193, 48, 226, 146);
		panel.add(channel);
		
		JLabel angle = new JLabel("");
		Image img11=new ImageIcon(this.getClass().getResource("/angle.png")).getImage();
		angle.setIcon(new ImageIcon(img11));
		angle.setBounds(431, 34, 186, 160);
		panel.add(angle);
		frmDesignOfSimple.setTitle("Design Of Simple Steel Connections");
		frmDesignOfSimple.setBounds(100, 100, 801, 762);
		frmDesignOfSimple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
