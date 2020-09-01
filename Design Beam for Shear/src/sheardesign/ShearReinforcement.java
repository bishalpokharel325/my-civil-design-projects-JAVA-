package sheardesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class ShearReinforcement {

	private JFrame frmDesignOfBeam;
	private JTextField TFdepth;
	private JTextField TFwidth;
	private JTextField TFLno1;
	private JTextField TFLd1;
	private JTextField t;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField TFVn1;
	private JTextField TFVd1;
	private JTextField TFdeg1;
	private JTextField TFLno2;
	private JTextField TFLd2;
	private JTextField TFLno3;
	private JTextField TFLd3;
	private JTextField TFVn2;
	private JTextField TFVd2;
	private JTextField TFdeg2;
	private JTextField TFVn3;
	private JTextField TFVd3;
	private JTextField TFdeg3;
	private JTextField TFleg;
	private JTextField TFshear;
	private JLabel TVresult;

	/**
	 * Launch the application.
	 */
	private JTextField TFvalue;
	static String xstrPath;
	static double[][] myarray;
	private JTextField TFlocation;
	
	static void setupmycsvarray(String location)
	{
		myarray=new double[20][20];
		Scanner scanIn=null;
		int rowc=0;
		int row=0;
		int colc=0;
		int col=0;
		String InputLine="";
		double xnum=0;
		
		String xfilelocation=location;
		
		try{
			File file=new File(xfilelocation);
			scanIn=new Scanner(file);
			while(scanIn.hasNextLine()){
				InputLine=scanIn.nextLine();
				String[] InArray=InputLine.split(",");
				for(int x=0;x<InArray.length;x++)
				{
					myarray[rowc][x]=Double.parseDouble(InArray[x]);
				}
				rowc++;
				
			}
			
			
		}catch(Exception e0){
			JOptionPane.showMessageDialog(null,e0);
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShearReinforcement window = new ShearReinforcement();
					window.frmDesignOfBeam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShearReinforcement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDesignOfBeam = new JFrame();
		frmDesignOfBeam.setTitle("Design Of Beam For Shear");
		frmDesignOfBeam.getContentPane().setBackground(Color.BLACK);
		frmDesignOfBeam.setBounds(100, 100, 899, 775);
		frmDesignOfBeam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDesignOfBeam.getContentPane().setLayout(null);
		
		JLabel lblAnalysisAndDesign = new JLabel("Analysis and Design Of Beams for Shear Reinforcement(Verticle stirrups and bend up bars)");
		lblAnalysisAndDesign.setForeground(Color.WHITE);
		lblAnalysisAndDesign.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAnalysisAndDesign.setBounds(77, 11, 611, 28);
		frmDesignOfBeam.getContentPane().add(lblAnalysisAndDesign);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(36, 57, 848, 677);
		frmDesignOfBeam.getContentPane().add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 102, 102));
		tabbedPane.addTab("Design Section For Shear Reinforcement", null, panel_1, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		panel_1.setLayout(null);
		
		JLabel lblEnterGradeOf = new JLabel("Enter grade of Steel for stirrups(fy):");
		lblEnterGradeOf.setForeground(Color.BLACK);
		lblEnterGradeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterGradeOf.setBounds(10, 11, 240, 26);
		panel_1.add(lblEnterGradeOf);
		
		JRadioButton radioButton = new JRadioButton("250");
		buttonGroup.add(radioButton);
		radioButton.setBounds(6, 44, 80, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("415");
		buttonGroup.add(radioButton_1);
		radioButton_1.setSelected(true);
		radioButton_1.setBounds(88, 44, 80, 23);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("500");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(170, 44, 80, 23);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("600");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(88, 70, 80, 23);
		panel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("550");
		buttonGroup.add(radioButton_4);
		radioButton_4.setBounds(6, 70, 80, 23);
		panel_1.add(radioButton_4);
		
		JLabel label_1 = new JLabel("Enter grade of Concrete(fck):");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(10, 106, 183, 26);
		panel_1.add(label_1);
		
		JRadioButton radioButton_5 = new JRadioButton("20");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setSelected(true);
		radioButton_5.setBounds(10, 139, 109, 23);
		panel_1.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("25");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setBounds(123, 139, 109, 23);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("35");
		buttonGroup_1.add(radioButton_7);
		radioButton_7.setBounds(123, 165, 109, 23);
		panel_1.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("30");
		buttonGroup_1.add(radioButton_8);
		radioButton_8.setBounds(10, 165, 109, 23);
		panel_1.add(radioButton_8);
		
		JLabel label_2 = new JLabel("Fill Necessary Data:");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_2.setBounds(10, 241, 183, 26);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Effective Depth(mm):");
		label_3.setFont(new Font("SansSerif", Font.BOLD, 11));
		label_3.setBounds(10, 278, 126, 26);
		panel_1.add(label_3);
		
		TFdepth = new JTextField();
		TFdepth.setText("500");
		TFdepth.setColumns(10);
		TFdepth.setBounds(146, 282, 86, 20);
		panel_1.add(TFdepth);
		
		TFwidth = new JTextField();
		TFwidth.setText("300");
		TFwidth.setColumns(10);
		TFwidth.setBounds(146, 321, 86, 20);
		panel_1.add(TFwidth);
		
		JLabel label_4 = new JLabel("Width(mm):");
		label_4.setFont(new Font("SansSerif", Font.BOLD, 11));
		label_4.setBounds(10, 315, 126, 26);
		panel_1.add(label_4);
		
		JLabel lblEnterDesignedShear = new JLabel("Enter Designed Shear Force (KN):");
		lblEnterDesignedShear.setForeground(Color.BLACK);
		lblEnterDesignedShear.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDesignedShear.setBounds(10, 206, 212, 26);
		panel_1.add(lblEnterDesignedShear);
		
		JLabel lblFillDetailsFor = new JLabel("Fill Details For Longitudinal Bar:");
		lblFillDetailsFor.setForeground(Color.BLACK);
		lblFillDetailsFor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblFillDetailsFor.setBounds(312, 241, 201, 26);
		panel_1.add(lblFillDetailsFor);
		
		JLabel lblBarDiameterUsedmm = new JLabel("Bar Diameter Used(mm):");
		lblBarDiameterUsedmm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBarDiameterUsedmm.setBounds(281, 310, 157, 14);
		panel_1.add(lblBarDiameterUsedmm);
		
		JLabel lblNoOfBars = new JLabel("No of Bars:");
		lblNoOfBars.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoOfBars.setBounds(358, 281, 80, 20);
		panel_1.add(lblNoOfBars);
		
		TFLno1 = new JTextField();
		TFLno1.setText("4");
		TFLno1.setBounds(457, 278, 86, 20);
		panel_1.add(TFLno1);
		TFLno1.setColumns(10);
		
		TFLd1 = new JTextField();
		TFLd1.setText("20");
		TFLd1.setColumns(10);
		TFLd1.setBounds(457, 308, 86, 20);
		panel_1.add(TFLd1);
		
		JLabel lblChooseVerticleStirrups = new JLabel("Choose Vertical Stirrups Diameter:");
		lblChooseVerticleStirrups.setForeground(Color.BLACK);
		lblChooseVerticleStirrups.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblChooseVerticleStirrups.setBounds(10, 352, 240, 26);
		panel_1.add(lblChooseVerticleStirrups);
		
		JRadioButton radioButton_9 = new JRadioButton("6");
		buttonGroup_2.add(radioButton_9);
		radioButton_9.setSelected(true);
		radioButton_9.setBounds(10, 385, 80, 23);
		panel_1.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("7");
		buttonGroup_2.add(radioButton_10);
		radioButton_10.setBounds(100, 385, 80, 23);
		panel_1.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("8");
		buttonGroup_2.add(radioButton_11);
		radioButton_11.setSelected(true);
		radioButton_11.setBounds(190, 385, 80, 23);
		panel_1.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("10");
		buttonGroup_2.add(radioButton_12);
		radioButton_12.setBounds(283, 385, 80, 23);
		panel_1.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("12");
		buttonGroup_2.add(radioButton_13);
		radioButton_13.setBounds(380, 385, 80, 23);
		panel_1.add(radioButton_13);
		
		JLabel lblFillDetailsFor_1 = new JLabel("Fill Details For Bent up Bar:");
		lblFillDetailsFor_1.setForeground(Color.BLACK);
		lblFillDetailsFor_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblFillDetailsFor_1.setBounds(41, 415, 201, 26);
		panel_1.add(lblFillDetailsFor_1);
		
		JLabel label_5 = new JLabel("No of Bars:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(87, 455, 80, 20);
		panel_1.add(label_5);
		
		TFVn1 = new JTextField();
		TFVn1.setText("2");
		TFVn1.setColumns(10);
		TFVn1.setBounds(186, 452, 86, 20);
		panel_1.add(TFVn1);
		
		JLabel label_6 = new JLabel("Bar Diameter Used(mm):");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(10, 484, 157, 14);
		panel_1.add(label_6);
		
		TFVd1 = new JTextField();
		TFVd1.setText("20");
		TFVd1.setColumns(10);
		TFVd1.setBounds(186, 482, 86, 20);
		panel_1.add(TFVd1);
		
		JLabel lblAngleOfBentdegree = new JLabel("Angle of Bent(degree):");
		lblAngleOfBentdegree.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAngleOfBentdegree.setBounds(10, 515, 157, 14);
		panel_1.add(lblAngleOfBentdegree);
		
		TFdeg1 = new JTextField();
		TFdeg1.setText("45");
		TFdeg1.setColumns(10);
		TFdeg1.setBounds(184, 513, 86, 20);
		panel_1.add(TFdeg1);
		
		TFLno2 = new JTextField();
		TFLno2.setText("0");
		TFLno2.setColumns(10);
		TFLno2.setBounds(553, 278, 86, 20);
		panel_1.add(TFLno2);
		
		TFLd2 = new JTextField();
		TFLd2.setText("0");
		TFLd2.setColumns(10);
		TFLd2.setBounds(553, 308, 86, 20);
		panel_1.add(TFLd2);
		
		TFLno3 = new JTextField();
		TFLno3.setText("0");
		TFLno3.setColumns(10);
		TFLno3.setBounds(649, 278, 86, 20);
		panel_1.add(TFLno3);
		
		TFLd3 = new JTextField();
		TFLd3.setText("0");
		TFLd3.setColumns(10);
		TFLd3.setBounds(649, 308, 86, 20);
		panel_1.add(TFLd3);
		
		TFVn2 = new JTextField();
		TFVn2.setText("0");
		TFVn2.setColumns(10);
		TFVn2.setBounds(283, 452, 86, 20);
		panel_1.add(TFVn2);
		
		TFVd2 = new JTextField();
		TFVd2.setText("0");
		TFVd2.setColumns(10);
		TFVd2.setBounds(283, 482, 86, 20);
		panel_1.add(TFVd2);
		
		TFdeg2 = new JTextField();
		TFdeg2.setText("0");
		TFdeg2.setColumns(10);
		TFdeg2.setBounds(281, 513, 86, 20);
		panel_1.add(TFdeg2);
		
		TFVn3 = new JTextField();
		TFVn3.setText("0");
		TFVn3.setColumns(10);
		TFVn3.setBounds(382, 452, 86, 20);
		panel_1.add(TFVn3);
		
		TFVd3 = new JTextField();
		TFVd3.setText("0");
		TFVd3.setColumns(10);
		TFVd3.setBounds(382, 482, 86, 20);
		panel_1.add(TFVd3);
		
		TFdeg3 = new JTextField();
		TFdeg3.setText("0");
		TFdeg3.setColumns(10);
		TFdeg3.setBounds(380, 513, 86, 20);
		panel_1.add(TFdeg3);
		
		JLabel lblLegs = new JLabel("Legs:");
		lblLegs.setForeground(Color.BLACK);
		lblLegs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblLegs.setBounds(466, 385, 43, 26);
		panel_1.add(lblLegs);
		
		TFleg = new JTextField();
		TFleg.setText("2");
		TFleg.setColumns(10);
		TFleg.setBounds(502, 386, 86, 20);
		panel_1.add(TFleg);
		
		JLabel lblifYouDont = new JLabel("(If You Dont wanna use just put zero)");
		lblifYouDont.setForeground(Color.BLACK);
		lblifYouDont.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblifYouDont.setBounds(212, 415, 318, 26);
		panel_1.add(lblifYouDont);
		
		JButton btnDesignResult = new JButton("Design Result");
		btnDesignResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double depth=Double.parseDouble(TFdepth.getText());
					double width=Double.parseDouble(TFwidth.getText());
					double leg=Double.parseDouble(TFleg.getText());
					double Lno1=Double.parseDouble(TFLno1.getText());
					double Lno2=Double.parseDouble(TFLno2.getText());
					double Lno3=Double.parseDouble(TFLno3.getText());
					double dno1=Double.parseDouble(TFLd1.getText());
					double dno2=Double.parseDouble(TFLd2.getText());
					double dno3=Double.parseDouble(TFLd3.getText());
					double shear=Double.parseDouble(TFshear.getText());
					double Vno1=Double.parseDouble(TFLno1.getText());
					double Vno2=Double.parseDouble(TFLno1.getText());
					double Vno3=Double.parseDouble(TFLno1.getText());
					double Vd1=Double.parseDouble(TFVn1.getText());
					double Vd2=Double.parseDouble(TFVn2.getText());
					double Vd3=Double.parseDouble(TFVn3.getText());
					double angle1=Double.parseDouble(TFdeg1.getText());
					double angle2=Double.parseDouble(TFdeg2.getText());
					double angle3=Double.parseDouble(TFdeg3.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double steel=Double.parseDouble(a);
					
					
					Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
					while(bg1.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg1.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double concrete=Double.parseDouble(a);
					
					
					Enumeration<AbstractButton> bg11=buttonGroup_2.getElements();
					while(bg11.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg11.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double diam=Double.parseDouble(a);
					double tumax = 0;
					int ind=0;
					if(concrete==20){
						tumax=2.8;
						ind=1;
					}
					
					if(concrete==25){
						tumax=3.1;
						ind=2;
					}
					if(concrete==30){
						tumax=3.5;
						ind=3;
					}
					if(concrete==35){
						tumax=3.7;
						ind=4;
					}
					if(concrete>40){
						tumax=4;
						ind=4;
					}
					setupmycsvarray(TFlocation.getText());
					double tuc=0;
					double percent=3.14/4*(Lno1*dno1*dno1+Lno2*dno2*dno2+Lno3*dno3*dno3)/(depth*width)*100;
					for(int i=0;i<13;i++){
						if(percent>myarray[i][0]&&percent<myarray[i+1][0])
						tuc = myarray[i][ind]+(percent-myarray[i][0])/(myarray[i+1][0]-myarray[i][0])*(myarray[i+1][ind]-myarray[i][ind]);
					}
					double tuv=shear/(depth*width)*1000;
					double sv=0;
					double vuc=0;
					double vbb=0;
					if(tuv<tuc&&tuv<tumax)
					{
						sv=0.87*steel*3.14*leg/4*diam*diam/(0.4*width);
						if(sv>Math.min(300,0.75*depth))
							sv=Math.min(300,0.75*depth);
						if(sv>100){
							
						
						 String amcs=String.format("%.3f",sv);
						 TVresult.setText("Providing minimum reinforcement with spacing slightly less than:"+amcs+"mm");
						}
						else
						{
							 TVresult.setText("Spacing required is Less than 100mm please increase the no of legs");
						}
					}
					else if(tuv>tuc&&tuv<tumax){
						vuc=tuc*depth*width;
						vbb=0.87*steel*(Vno1*Vd1*Math.sin(3.14/180*angle1)+Vno2*Vd2*Math.sin(3.14/180*angle2)+Vno3*Vd3*Math.sin(3.14/180*angle3));
						if(vbb>0.5*(shear*1000-vuc)){
							vbb=0.5*(shear*1000-vuc);
						}
						
						sv=(0.87*steel*3.14*leg/4*diam*diam*depth)/(shear*1000-vuc-vbb);
						if(sv>Math.min(300,0.75*depth))
							sv=Math.min(300,0.75*depth);
						if(sv>100){
							
						String str="and bentup bar is not used.";
						if(vbb!=0)
						str="and bent up bar is used";
						
						 String amcs=String.format("%.3f",sv);
						 TVresult.setText("Providing reinforcement with spacing slightly less than:"+amcs+"mm "+str);
						}
						else
						{
							 TVresult.setText("Spacing required is Less than 100mm please increase the no of legs");
						}
						
						

					}
					else
					{
						 TVresult.setText("The Section experience punching failure please increase depth and try again..");
					}
					
					
					
					
					
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnDesignResult.setBounds(483, 512, 186, 23);
		panel_1.add(btnDesignResult);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setForeground(new Color(0, 0, 102));
		lblResult.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		lblResult.setBounds(10, 569, 62, 38);
		panel_1.add(lblResult);
		
		TVresult = new JLabel("...");
		TVresult.setForeground(new Color(0, 0, 102));
		TVresult.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		TVresult.setBounds(93, 569, 740, 38);
		panel_1.add(TVresult);
		
		TFshear = new JTextField();
		TFshear.setText("75");
		TFshear.setBounds(232, 210, 86, 20);
		panel_1.add(TFshear);
		TFshear.setColumns(10);
		
		JLabel lblEnterLocationFor = new JLabel("Enter Location for table 19(.csv):");
		lblEnterLocationFor.setForeground(Color.BLACK);
		lblEnterLocationFor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterLocationFor.setBounds(281, 11, 240, 26);
		panel_1.add(lblEnterLocationFor);
		
		TFlocation = new JTextField();
		TFlocation.setBounds(502, 15, 302, 20);
		panel_1.add(TFlocation);
		TFlocation.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFlocation.setText(filename);
			}
		});
		btnBrowse.setBounds(715, 44, 89, 23);
		panel_1.add(btnBrowse);
	}
}
