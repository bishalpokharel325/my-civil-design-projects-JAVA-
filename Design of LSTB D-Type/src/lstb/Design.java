package lstb;
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
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Design {

	private JFrame frmDesignOfSuspension;
	private JTextField TFrb;
	private JTextField TFlb;
	private JTextField TFsurveydistance;
	private JTextField TFer;
	private JTextField TFel;
	private JLabel TVelevation;
	private JLabel TVcableresult;
	private JLabel TVsag;
	private JLabel TVgi;
	private JLabel TVcheck1;
	private JLabel TVdiff;
	private JLabel TVtension;
	private JLabel TVdesign;
	private JLabel TVfs;
	private JLabel TVcheck2;
	private JLabel TVcheck3;
	private JLabel TVcheck4;
	private JLabel TVcheck5;
	private JLabel TVbd;
	private JLabel TVcableangle;
	private JLabel TVhsag;
	private JLabel TVhgi;
	private JLabel TVhdiff;
	private JLabel TVhtension;
	private JLabel TVhdesign;
	private JLabel TVhfs;
	private JLabel TVLd;
	private JLabel TVno;
	private JLabel TVmaxmain;
	private JLabel TVmaxhand;
	private JLabel TVactualmain;
	private JLabel TVactualhand;
	private JLabel TVgeometry;
	private JLabel TVh1;
	private JLabel TVh2;
	private JLabel TVl;
	private JLabel TVb;
	private JLabel TVcheck1low;
	private JLabel TVcheck2low;
	private JLabel TVcheck3low;
	private JLabel TVcheck4low;
	private JLabel TVcheck5low;
	private JLabel TVh1low;
	private JLabel TVh2low;
	private JLabel TVLlow;
	private JLabel TVBlow;
	
	public double k,e1,e2,Bangdead,elevation,tmhigh,thhigh,tmlow,thlow,Banghigh,Banglow,h1min,h1max,h2min,h2max,Bmin,Bmax,Lmin,Lmax,t;
	Formatter xf1;
	

	 
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JTextField TFgd;
	private JTextField TFbd;
	private JTextField TFinterval;
	private JTextField TFh1;
	private JTextField TFh2;
	private JTextField TFb;
	private JTextField TFl;
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private JTextField TFtwidth;
	private JTextField TFht;
	private JTextField TFbwidth;
	private JTextField TFlocation;
	private JTextField TFA;
	private JTextField TFadist;
	private JTextField TFpermissible;
	private JTextField TFfriction;
	private JTextField TFk;
	private JTextField TFrod;
	private JTextField TFdiam;
	private JTextField TFsoilbfangle;
	private JTextField TFsoilsswt;
	private JTextField TFsoilssangle;
	private JTextField TFsoildepth;
	private JTextField TFsoilbfwt;
	private JTextField TFsoilperm;
	private JTextField TFsoilemb;
	private JTextField TFfrontslope;
	private JTextField TFha;
	private JTextField TFfrontinclination;
	private JTextField TFbackinclination;
	private JTextField TFeb;
	private JTextField TFh1low;
	private JTextField TFh2low;
	private JTextField TFBlow;
	private JTextField TFLlow;
	private JTextField TFtwidthlow;
	private JTextField TFhtlow;
	private JTextField TFbwidthlow;
	private JTextField TFAlow;
	private JTextField TFadistlow;
	private JTextField TFpermissiblelow;
	private JTextField TFfrictionlow;
	private JTextField TFklow;
	private JTextField TFrodlow;
	private JTextField TFdiamlow;
	private JTextField TFsoildepthlow;
	private JTextField TFssanglelow;
	private JTextField TFsswtlow;
	private JTextField TFbfanglelow;
	private JTextField TFbfwtlow;
	private JTextField TFeblow;
	private JTextField TFbackinclinationlow;
	private JTextField TFfrontinclinationlow;
	private JTextField TFhalow;
	private JTextField TFfrontslopelow;
	private JTextField TFsoilemblow;
	private JTextField TFsoilpermlow;
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Design window = new Design();
					window.frmDesignOfSuspension.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Design() {
		initialize();
	}
	 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmDesignOfSuspension = new JFrame();
		frmDesignOfSuspension.getContentPane().setBackground(new Color(0, 0, 51));
		frmDesignOfSuspension.setTitle("Design of Suspension Bridges(D-Type)");
		frmDesignOfSuspension.setBounds(100, 100, 781, 712);
		frmDesignOfSuspension.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDesignOfSuspension.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("This Program Does Design Calculations for LSTB D-type Bridges Stepwise");
		lblNewLabel.setBounds(20, 11, 547, 24);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmDesignOfSuspension.getContentPane().add(lblNewLabel);
		
		JLabel lblPleaseInputRequired = new JLabel("**Please Input Required Data Step Wise and Program itself does calculations for you ;) **");
		lblPleaseInputRequired.setBounds(20, 36, 566, 24);
		lblPleaseInputRequired.setForeground(Color.WHITE);
		lblPleaseInputRequired.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmDesignOfSuspension.getContentPane().add(lblPleaseInputRequired);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 65, 745, 597);
		frmDesignOfSuspension.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		tabbedPane.addTab("Step-1", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblPlotCrossSectional = new JLabel("At first,Plot Cross Sectional profile and Fix Saddle according to topography");
		lblPlotCrossSectional.setForeground(Color.WHITE);
		lblPlotCrossSectional.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblPlotCrossSectional.setBounds(10, 11, 566, 24);
		panel.add(lblPlotCrossSectional);
		
		JLabel lblEnter = new JLabel("Right Bank Foundation Location from Bridge Axis point(m):");
		lblEnter.setForeground(Color.WHITE);
		lblEnter.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnter.setBounds(10, 125, 366, 24);
		panel.add(lblEnter);
		
		TFrb = new JTextField();
		TFrb.setText("7.75");
		TFrb.setBounds(386, 128, 86, 20);
		panel.add(TFrb);
		TFrb.setColumns(10);
		
		JLabel lblLeftBankFoundation = new JLabel("Left Bank Foundation Location from Bridge Axis point(m):");
		lblLeftBankFoundation.setForeground(Color.WHITE);
		lblLeftBankFoundation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLeftBankFoundation.setBounds(10, 160, 366, 24);
		panel.add(lblLeftBankFoundation);
		
		TFlb = new JTextField();
		TFlb.setText("16.59");
		TFlb.setColumns(10);
		TFlb.setBounds(386, 163, 86, 20);
		panel.add(TFlb);
		
		JLabel lblSurveyDistanceBetween = new JLabel("Survey Distance Between Axis Points(m):");
		lblSurveyDistanceBetween.setForeground(Color.WHITE);
		lblSurveyDistanceBetween.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSurveyDistanceBetween.setBounds(112, 195, 262, 24);
		panel.add(lblSurveyDistanceBetween);
		
		TFsurveydistance = new JTextField();
		TFsurveydistance.setText("107.76");
		TFsurveydistance.setColumns(10);
		TFsurveydistance.setBounds(386, 198, 86, 20);
		panel.add(TFsurveydistance);
		
		JLabel lblMainCableElevation = new JLabel("Main Cable Elevation of Right Bank(m):");
		lblMainCableElevation.setForeground(Color.WHITE);
		lblMainCableElevation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMainCableElevation.setBounds(127, 233, 249, 24);
		panel.add(lblMainCableElevation);
		JButton btnStartRecordingDesign = new JButton("Start Recording Design Calculation");
		btnStartRecordingDesign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					xf1=new Formatter(TFlocation.getText());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnStartRecordingDesign.setBounds(230, 100, 211, 23);
		panel.add(btnStartRecordingDesign);
		TFer = new JTextField();
		TFer.setText("110.85");
		TFer.setColumns(10);
		TFer.setBounds(386, 233, 86, 20);
		panel.add(TFer);
		
		JLabel lblMainCableElevation_1 = new JLabel("Main Cable Elevation of Left Bank(m):");
		lblMainCableElevation_1.setForeground(Color.WHITE);
		lblMainCableElevation_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMainCableElevation_1.setBounds(127, 268, 249, 24);
		panel.add(lblMainCableElevation_1);
		
		TFel = new JTextField();
		TFel.setText("105.85");
		TFel.setColumns(10);
		TFel.setBounds(386, 268, 86, 20);
		panel.add(TFel);
		
		JButton btnCheckDifferenceBetween = new JButton("Check difference between elevations");
		btnCheckDifferenceBetween.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					  double rb=Double.parseDouble(TFrb.getText());
						double lb=Double.parseDouble(TFlb.getText());
						double sd=Double.parseDouble(TFsurveydistance.getText());
						double er=Double.parseDouble(TFer.getText());
						double el=Double.parseDouble(TFel.getText());
						double er1=er-0.25;
						double el1=el-0.25;
						double S=sd+lb+rb;
						double l=S+0.5;
						double h=Math.abs(er1-el1);
						
						
					if(l/14>=h)
					{
						String hs=String.format("%.3f",h);
						String lims=String.format("%.3f",l/14);
						TVelevation.setText("l/14="+lims+" > "+"h="+hs+"(OK)");
                        
					}
					else
					{
						String hs=String.format("%.3f",h);
						String lims=String.format("%.3f",l/14);
						TVelevation.setText("l/14="+lims+" < "+"h="+hs+"(NOT OK please reduce h)");
					}
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnCheckDifferenceBetween.setBounds(10, 303, 263, 23);
		panel.add(btnCheckDifferenceBetween);
		
		TVelevation = new JLabel(".....");
		TVelevation.setForeground(new Color(51, 255, 204));
		TVelevation.setBounds(306, 307, 255, 14);
		panel.add(TVelevation);
		
		JLabel lblEnterMainCables = new JLabel("Enter Main Cables Diameter(mm):");
		lblEnterMainCables.setForeground(Color.WHITE);
		lblEnterMainCables.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterMainCables.setBounds(10, 337, 211, 24);
		panel.add(lblEnterMainCables);
		
		JRadioButton radioButton = new JRadioButton("13");
		buttonGroup.add(radioButton);
		radioButton.setBounds(227, 337, 46, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("26");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(275, 337, 44, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("32");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(323, 337, 46, 23);
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("36");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(371, 337, 54, 23);
		panel.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("40");
		radioButton_4.setSelected(true);
		buttonGroup.add(radioButton_4);
		radioButton_4.setBounds(426, 337, 46, 23);
		panel.add(radioButton_4);
		
		JLabel lblEnterNoOf = new JLabel("Enter no of Main Cable:");
		lblEnterNoOf.setForeground(Color.WHITE);
		lblEnterNoOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterNoOf.setBounds(65, 372, 156, 20);
		panel.add(lblEnterNoOf);
		
		JRadioButton radioButton_5 = new JRadioButton("2");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(227, 369, 46, 23);
		panel.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("4");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setSelected(true);
		radioButton_6.setBounds(275, 369, 44, 23);
		panel.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("6");
		buttonGroup_1.add(radioButton_7);
		radioButton_7.setBounds(323, 369, 46, 23);
		panel.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("8");
		buttonGroup_1.add(radioButton_8);
		radioButton_8.setBounds(371, 369, 54, 23);
		panel.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("10");
		buttonGroup_1.add(radioButton_9);
		radioButton_9.setBounds(426, 369, 46, 23);
		panel.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("12");
		buttonGroup_1.add(radioButton_10);
		radioButton_10.setBounds(474, 369, 54, 23);
		panel.add(radioButton_10);
		
		JLabel lblEnterHandRail = new JLabel("Enter Hand Rail Cables Diameter(mm):");
		lblEnterHandRail.setForeground(Color.WHITE);
		lblEnterHandRail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterHandRail.setBounds(10, 403, 259, 24);
		panel.add(lblEnterHandRail);
		
		JRadioButton radioButton_11 = new JRadioButton("13");
		buttonGroup_2.add(radioButton_11);
		radioButton_11.setBounds(275, 403, 46, 23);
		panel.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("26");
		buttonGroup_2.add(radioButton_12);
		radioButton_12.setSelected(true);
		radioButton_12.setBounds(323, 403, 44, 23);
		panel.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("32");
		buttonGroup_2.add(radioButton_13);
		radioButton_13.setBounds(371, 403, 46, 23);
		panel.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("36");
		buttonGroup_2.add(radioButton_14);
		radioButton_14.setBounds(419, 403, 54, 23);
		panel.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("40");
		buttonGroup_2.add(radioButton_15);
		radioButton_15.setBounds(474, 403, 46, 23);
		panel.add(radioButton_15);
		
		JRadioButton radioButton_16 = new JRadioButton("12");
		buttonGroup_3.add(radioButton_16);
		radioButton_16.setBounds(522, 435, 54, 23);
		panel.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("10");
		buttonGroup_3.add(radioButton_17);
		radioButton_17.setBounds(474, 435, 46, 23);
		panel.add(radioButton_17);
		
		JRadioButton radioButton_18 = new JRadioButton("8");
		buttonGroup_3.add(radioButton_18);
		radioButton_18.setBounds(419, 435, 54, 23);
		panel.add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("6");
		buttonGroup_3.add(radioButton_19);
		radioButton_19.setBounds(371, 435, 46, 23);
		panel.add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton("4");
		buttonGroup_3.add(radioButton_20);
		radioButton_20.setSelected(true);
		radioButton_20.setBounds(323, 435, 44, 23);
		panel.add(radioButton_20);
		
		JRadioButton radioButton_21 = new JRadioButton("2");
		buttonGroup_3.add(radioButton_21);
		radioButton_21.setSelected(true);
		radioButton_21.setBounds(275, 435, 46, 23);
		panel.add(radioButton_21);
		
		JLabel lblEnterNoOf_1 = new JLabel("Enter no of Hand Rail Cable:");
		lblEnterNoOf_1.setForeground(Color.WHITE);
		lblEnterNoOf_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterNoOf_1.setBounds(35, 438, 186, 20);
		panel.add(lblEnterNoOf_1);
		
		JButton btnCheckForTension = new JButton("Check for Tension");
		btnCheckForTension.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double rb=Double.parseDouble(TFrb.getText());
					double lb=Double.parseDouble(TFlb.getText());
					double sd=Double.parseDouble(TFsurveydistance.getText());
					double er=Double.parseDouble(TFer.getText());
					double el=Double.parseDouble(TFel.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double mcd=Double.parseDouble(a);
					a = null;
					
					Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
					while(bg1.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg1.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double mcn=Double.parseDouble(a);
					a = null;
					
					Enumeration<AbstractButton> bg2=buttonGroup_2.getElements();
					while(bg2.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg2.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double hcd=Double.parseDouble(a);
					a = null;
					
					Enumeration<AbstractButton> bg3=buttonGroup_3.getElements();
					while(bg3.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg3.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double hcn=Double.parseDouble(a);
					a = null;
					
					Enumeration<AbstractButton> bg5=buttonGroup.getElements();
					while(bg5.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg5.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double wd=Double.parseDouble(a);
					double er1=er-0.25;
					double el1=el-0.25;
					double S=sd+lb+rb;
					double l=S+0.5;
					double h=Math.abs(er1-el1);
					double Am,Ah,Tmax,Pm = 0,Ph = 0,P;
					if(mcd==13)
					{
						
						Pm=mcn*34;
						
					}
					if(mcd==26)
					{
						
						Pm=mcn*129;
						
					}
					if(mcd==32)
					{
						
						Pm=mcn*195;
						
					}
					if(mcd==36)
					{
						
						Pm=mcn*247;
						
					}
					if(mcd==40)
					{
						
						Pm=mcn*305;
						
					}
					if(hcd==13)
					{
						
						Ph=hcn*34;
						
					}
					if(hcd==26)
					{
						
						Ph=hcn*129;
						
					}
					if(hcd==32)
					{
						
						Ph=hcn*195;
						
					}
					if(hcd==36)
					{
						
						Ph=hcn*247;
						
					}
					if(hcd==40)
					{
						
						Ph=hcn*305;
						
					}
					P=Pm+Ph;
					Tmax=11*S;
					 xf1.format("%s%s%.3f%s","Maximum Tension(KN)=",",",Tmax,"\n");
					 xf1.format("%s%s%.3f%s","Permissible Tension(KN)=",",",P,"\n");
							
					String bdmaxs=String.format("%.3f",l/19-h/4);
					String bdmins=String.format("%.3f",l/23-h/4);
					TVbd.setText("between "+bdmins+"m to "+bdmaxs+"m");
					double bd=Double.parseDouble(TFbd.getText());
					if(bd>l/19-h/4)
						TFbd.setText(bdmaxs);
					if(bd<l/23-h/4)
						TFbd.setText(bdmins);
					
					if(Tmax<=P)
					{
						String Ps=String.format("%.1f",P);
						String Tmaxs=String.format("%.1f",Tmax);
						String mcds=String.format("%.1f",mcd);
						String mcns=String.format("%.0f",mcn);
						String hcds=String.format("%.1f",hcd);
						String hcns=String.format("%.0f",hcn);
						TVcableresult.setText("Tmax="+Tmaxs+"<"+Ps+"(ok)."+"Provide "+mcns+" - "+mcds+"mm dia main Cable"+" & "+hcns+" - "+hcds+"mm dia Hand Cable");
					}	
					if(Tmax>P)
					{
						String Ps=String.format("%.1f",P);
						String Tmaxs=String.format("%.1f",Tmax);
						String mcds=String.format("%.1f",mcd);
						String mcns=String.format("%.1f",mcn);
						String hcds=String.format("%.1f",hcd);
						String hcns=String.format("%.1f",hcn);
						TVcableresult.setText("Tmax="+Tmaxs+">"+Ps+"Not Ok.Please Revise the Design");
						
					}	
				}catch(Exception e10){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnCheckForTension.setBounds(172, 465, 147, 23);
		panel.add(btnCheckForTension);
		
		TVcableresult = new JLabel("RESULT");
		TVcableresult.setFont(new Font("SansSerif", Font.PLAIN, 13));
		TVcableresult.setForeground(new Color(255, 255, 0));
		TVcableresult.setBounds(10, 499, 551, 38);
		panel.add(TVcableresult);
		
		JLabel label_1 = new JLabel("For Calculation Details.....Make a CSV file and browse its Location.......");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		label_1.setBounds(10, 34, 566, 24);
		panel.add(label_1);
		
		JLabel label_3 = new JLabel("Enter Location of .csv file :");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(10, 69, 196, 24);
		panel.add(label_3);
		
		TFlocation = new JTextField();
		TFlocation.setText("C:\\Users\\Bishal\\Desktop\\cablegeometry.csv");
		TFlocation.setColumns(10);
		TFlocation.setBounds(210, 69, 249, 20);
		panel.add(TFlocation);
		
		JButton button = new JButton("Browse");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					JFileChooser chooser = new JFileChooser();
					chooser.showOpenDialog(null);
					File f=chooser.getSelectedFile();
					String filename=f.getAbsolutePath();
					TFlocation.setText(filename);
				}catch(Exception e1111){
					JOptionPane.showMessageDialog(null,e1111);
				}
				
			}
		});
		button.setBounds(469, 70, 89, 23);
		panel.add(button);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		tabbedPane.addTab("Step-2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblIterationForCable = new JLabel("Iteration For Cable & Calculation of Cable Tension");
		lblIterationForCable.setForeground(Color.LIGHT_GRAY);
		lblIterationForCable.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblIterationForCable.setBounds(10, 11, 566, 24);
		panel_1.add(lblIterationForCable);
		
		JLabel lblEnterDeadLoad = new JLabel("Enter Dead Load except cables(KN/m):");
		lblEnterDeadLoad.setForeground(Color.WHITE);
		lblEnterDeadLoad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDeadLoad.setBounds(10, 46, 249, 24);
		panel_1.add(lblEnterDeadLoad);
		
		TFgd = new JTextField();
		TFgd.setText("0.766");
		TFgd.setColumns(10);
		TFgd.setBounds(269, 46, 86, 20);
		panel_1.add(TFgd);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double rb=Double.parseDouble(TFrb.getText());
					double lb=Double.parseDouble(TFlb.getText());
					double sd=Double.parseDouble(TFsurveydistance.getText());
					double er=Double.parseDouble(TFer.getText());
					double el=Double.parseDouble(TFel.getText());
					double gd=Double.parseDouble(TFgd.getText());
					
					
					
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double mcd=Double.parseDouble(a);
					a = null;
					
					Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
					while(bg1.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg1.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double mcn=Double.parseDouble(a);
					a = null;
					
					Enumeration<AbstractButton> bg2=buttonGroup_2.getElements();
					while(bg2.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg2.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double hcd=Double.parseDouble(a);
					a = null;
					
					Enumeration<AbstractButton> bg3=buttonGroup_3.getElements();
					while(bg3.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg3.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double hcn=Double.parseDouble(a);
					a = null;
					
					Enumeration<AbstractButton> bg5=buttonGroup.getElements();
					while(bg5.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg5.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					
					double wd=Double.parseDouble(a);
					double er1=er-0.25;
					double el1=el-0.25;
					double highest=Math.max(er1,el1);
					double S=sd+lb+rb;
					double l=S+0.5;
					double h=Math.abs(er1-el1);
					double EA,bdmax,bfmax,bfrecom,bdrecom,A,LL,Ld,b,bi,gh,gf,gi,gdt,B,Am = 0,Ah=0,Tmax,Pm = 0,Ph = 0,P,Bm=0,Bh=0,gdm=0,gdh=0;
					double T=0,hf=0,tanb=0,FS=0,Bang;
					
					
					String bdmaxs=String.format("%.3f",l/19-h/4);
					String bdmins=String.format("%.3f",l/23-h/4);
					TVbd.setText("between "+bdmins+"m to "+bdmaxs+"m");
					double bdb=Double.parseDouble(TFbd.getText());
					if(bdb>l/19-h/4)
						TFbd.setText(bdmaxs);
					if(bdb<l/23-h/4)
						TFbd.setText(bdmins);
					double bd=Double.parseDouble(TFbd.getText());
					if(mcd==13)
					{
						
						Pm=mcn*34;
						Am=mcn*73;
						gdm=mcn*0.0064;
						Bm=mcn*103;
					}
					if(mcd==26)
					{
						
						Pm=mcn*129;
						Am=mcn*292;
						gdm=mcn*0.0251;
						Bm=mcn*386;
						
					}
					if(mcd==32)
					{
						
						Pm=mcn*195;
						Am=mcn*442;
						gdm=mcn*0.0380;
						Bm=mcn*585;
					}
					if(mcd==36)
					{
						
						Pm=mcn*247;
						Am=mcn*560;
						gdm=mcn*0.0481;
						Bm=mcn*740;
					}
					if(mcd==40)
					{
						
						Pm=mcn*305;
						Am=mcn*691;
						gdm=mcn*0.0594;
						Bm=mcn*914;
					}
					if(hcd==13)
					{
						
						Ph=hcn*34;
						Ah=hcn*73;
						gdh=hcn*0.0064;
						Bh=hcn*103;
					}
					if(hcd==26)
					{
						
						Ph=hcn*129;
						Ah=hcn*292;
						gdh=hcn*0.0251;
						Bh=hcn*386;
						
					}
					if(hcd==32)
					{
						
						Ph=hcn*195;
						Ah=hcn*442;
						gdh=hcn*0.0380;
						Bh=hcn*585;
					}
					if(hcd==36)
					{
						
						Ph=hcn*247;
						Ah=hcn*560;
						gdh=hcn*0.0481;
						Bh=hcn*740;
					}
					if(hcd==40)
					{
						
						Ph=hcn*305;
						Ah=hcn*691;
						gdh=hcn*0.0594;
						Bh=hcn*914;
					}
					P=Pm+Ph;
					A=Am+Ah;
					gh=gdh+gdm;
					B=Bh+Bm;
					gdt=gd+gh;
					gf=gdt+(3+50/l)*1;
					EA=110*A;
					
					xf1.format("%s%s","Full Load","\n");
					 xf1.format("%s%s%s%s%s%s%s%s","iteration",",","b",",","gi",",","bnew","\n");
					bi=1.22*bd;
					double hbyl,bdbyl,cons;
					
					hbyl=h/l;
					bdbyl=bd/l;
					Ld=l*(1+2.666666*bdbyl*bdbyl+0.5*hbyl*hbyl);
					cons=21.33*EA/(l*l*l*Ld);
					int i=0;
					do{
						b=bi;
						
						gi=cons*bi*(bi*bi-bd*bd)+(bi*gdt)/bd;
						bi=bd+(bi-bd)*((gf-gdt)/(gi-gdt));
						 xf1.format("%d%s%.3f%s%.3f%s%.3f%s",i,",",b,",",gi,",",bi,"\n");
						 i++;
					}while(Math.abs(gf-gi)>0.001);
					double tanb1,T1;
					hf=gf*l*l/(8*b);
					k=4*bd/(l*l);
					tanb=(4*b+h)/l;
					tanb1=(4*b-h)/l;
					e1=Math.sqrt(((4*bd+h)*(4*bd+h))/(16*bd*k));
					e2=l-e1;
					elevation=highest-k*e1*e1;
					T1=hf*Math.sqrt(1+tanb1*tanb1);
					T=hf*Math.sqrt(1+tanb*tanb);
					
					FS=B/T;
					
					
					Bang=180/3.14*Math.atan((4*b+h)/l);
					Bangdead=180/3.14*Math.atan((4*bd+h)/l);
					Banghigh=Bang;
					Banglow=180/3.14*Math.atan((4*b-h)/l);
					
					if(Bangdead>12)
					{
						String bangs=String.format("%.2f",Bangdead);
						TVcableangle.setText("Bmax="+bangs+">"+"12 NOT OK");
						
					}
					if(Bangdead<12)
					{
						String bangs=String.format("%.2f",Bangdead);
						TVcableangle.setText("Bmax="+bangs+"<"+"12 OK");
						
					}
					String lds=String.format("%.3f",Ld);
					TVLd.setText(lds+"m");
					
					String sags=String.format("%.3f",b);
					TVsag.setText(sags+"m");
					String diffs=String.format("%.5f",Math.abs(gf-gi));
					TVdiff.setText(diffs+"m");
					String dis=String.format("%.3f",gi);
					TVgi.setText(dis+"m");
					String tensions=String.format("%.3f",T);
					TVtension.setText(tensions+"KN");
					String fss=String.format("%.3f",FS);
					TVfs.setText(fss+"");
					String maxmains=String.format("%.3f",T*Am/A);
					TVmaxmain.setText(maxmains+"KN");
					tmhigh=T*Am/A;
					String maxhands=String.format("%.3f",T*Ah/A);
					TVmaxhand.setText(maxhands+"KN");
					thhigh=T*Ah/A;
					String actualmains=String.format("%.3f",T1*Am/A);
					TVactualmain.setText(actualmains+"KN");
					tmlow=T1*Am/A;
					String acutalhands=String.format("%.3f",T1*Ah/A);
					TVactualhand.setText(acutalhands+"KN");
					thlow=T1*Ah/A;
					if(FS<3)
						TVdesign.setText("not correct.");
					else
						TVdesign.setText("correct.");
					bi=0.93*bd;
					i=0;
					hbyl=h/l;
					bdbyl=bd/l;
					Ld=l*(1+2.666666*bdbyl*bdbyl+0.5*hbyl*hbyl);
					cons=21.33*EA/(l*l*l*Ld);
					xf1.format("%s%s","Hoisting Sag","\n");
					xf1.format("%s%s%s%s%s%s%s%s","iteration",",","b",",","gi",",","bnew","\n");
					do{
						
						b=bi;
						gi=cons*bi*(bi*bi-bd*bd)+bi/bd*gdt;
						bi=bd+(bi-bd)*((gh-gdt)/(gi-gdt));
						 xf1.format("%d%s%.3f%s%.3f%s%.3f%s",i,",",b,",",gi,",",bi,"\n");
						 i++;
					}while(Math.abs(gh-gi)>0.0001);
					
					hf=gh*l*l/(8*b);
					tanb=(4*b+h)/l;
					T=hf*Math.sqrt(1+tanb*tanb);
					FS=B/T;
					String saghs=String.format("%.3f",b);
					TVhsag.setText(saghs+"m");
					String diffhs=String.format("%.5f",Math.abs(gh-gi));
					TVhdiff.setText(diffhs+"m");
					String dish=String.format("%.3f",gdt);
					TVhgi.setText(dish+"m");
					String tensionhs=String.format("%.3f",T);
					TVhtension.setText(tensionhs+"KN");
					String fssh=String.format("%.3f",FS);
					TVhfs.setText(fssh+"");
					if(FS<3)
						TVhdesign.setText("not correct.");
					else
						TVhdesign.setText("correct.");
				
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnCheck.setBounds(198, 121, 89, 23);
		panel_1.add(btnCheck);
		
		JLabel lblFullLoadResult = new JLabel("Full Load Final Result:");
		lblFullLoadResult.setForeground(Color.GREEN);
		lblFullLoadResult.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblFullLoadResult.setBounds(10, 193, 157, 25);
		panel_1.add(lblFullLoadResult);
		
		JLabel lblFullLoadSagm = new JLabel("full load SAG(m):");
		lblFullLoadSagm.setForeground(new Color(204, 204, 0));
		lblFullLoadSagm.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblFullLoadSagm.setBounds(10, 226, 118, 20);
		panel_1.add(lblFullLoadSagm);
		
		TVsag = new JLabel("0.00");
		TVsag.setForeground(Color.WHITE);
		TVsag.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVsag.setBounds(128, 229, 68, 14);
		panel_1.add(TVsag);
		
		JLabel label_2 = new JLabel("Final Value of gi(m):");
		label_2.setForeground(new Color(204, 204, 0));
		label_2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_2.setBounds(10, 257, 142, 20);
		panel_1.add(label_2);
		
		TVgi = new JLabel("0.00");
		TVgi.setForeground(Color.WHITE);
		TVgi.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVgi.setBounds(150, 260, 107, 14);
		panel_1.add(TVgi);
		
		JLabel label_4 = new JLabel("gf-gi:");
		label_4.setForeground(new Color(204, 204, 0));
		label_4.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_4.setBounds(10, 288, 40, 20);
		panel_1.add(label_4);
		
		TVdiff = new JLabel("0.00");
		TVdiff.setForeground(Color.WHITE);
		TVdiff.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVdiff.setBounds(60, 292, 96, 14);
		panel_1.add(TVdiff);
		
		JLabel lblTensionInCablekn = new JLabel("Tension in cable(KN);");
		lblTensionInCablekn.setForeground(new Color(204, 204, 0));
		lblTensionInCablekn.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblTensionInCablekn.setBounds(10, 319, 142, 20);
		panel_1.add(lblTensionInCablekn);
		
		TVtension = new JLabel("0.00");
		TVtension.setForeground(Color.WHITE);
		TVtension.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVtension.setBounds(150, 322, 96, 14);
		panel_1.add(TVtension);
		
		JLabel label_8 = new JLabel("FS=");
		label_8.setForeground(new Color(204, 204, 0));
		label_8.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_8.setBounds(10, 350, 34, 20);
		panel_1.add(label_8);
		
		TVfs = new JLabel("0.00");
		TVfs.setForeground(Color.WHITE);
		TVfs.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVfs.setBounds(60, 353, 68, 14);
		panel_1.add(TVfs);
		
		JLabel label_10 = new JLabel("Design is:");
		label_10.setForeground(new Color(204, 204, 0));
		label_10.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_10.setBounds(10, 385, 91, 20);
		panel_1.add(label_10);
		
		TVdesign = new JLabel("....");
		TVdesign.setForeground(Color.GREEN);
		TVdesign.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TVdesign.setBackground(Color.GREEN);
		TVdesign.setBounds(103, 381, 143, 22);
		panel_1.add(TVdesign);
		
		TFbd = new JTextField();
		TFbd.setText("5.6");
		TFbd.setColumns(10);
		TFbd.setBounds(198, 81, 86, 20);
		panel_1.add(TFbd);
		
		JLabel lblEnterDeadLoad_1 = new JLabel("Enter Dead Load sag(m):");
		lblEnterDeadLoad_1.setForeground(Color.WHITE);
		lblEnterDeadLoad_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDeadLoad_1.setBounds(10, 81, 167, 24);
		panel_1.add(lblEnterDeadLoad_1);
		
	TVbd = new JLabel("....");
		TVbd.setForeground(Color.RED);
		TVbd.setBounds(306, 84, 157, 14);
		panel_1.add(TVbd);
		
		TVcableangle = new JLabel("cable angle check at upper shaddle");
		TVcableangle.setForeground(Color.ORANGE);
		TVcableangle.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVcableangle.setBounds(306, 124, 252, 14);
		panel_1.add(TVcableangle);
		
		JLabel lblHoistingLoadFinal = new JLabel("Hoisting Load Final Result:");
		lblHoistingLoadFinal.setForeground(Color.GREEN);
		lblHoistingLoadFinal.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblHoistingLoadFinal.setBounds(269, 193, 194, 25);
		panel_1.add(lblHoistingLoadFinal);
		
		JLabel lblHoistingLoadSagm = new JLabel("Hoisting load SAG(m):");
		lblHoistingLoadSagm.setForeground(new Color(204, 204, 0));
		lblHoistingLoadSagm.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblHoistingLoadSagm.setBounds(269, 226, 157, 20);
		panel_1.add(lblHoistingLoadSagm);
		
		TVhsag = new JLabel("0.00");
		TVhsag.setForeground(Color.WHITE);
		TVhsag.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVhsag.setBounds(448, 229, 68, 14);
		panel_1.add(TVhsag);
		
		JLabel label_5 = new JLabel("Final Value of gi(m):");
		label_5.setForeground(new Color(204, 204, 0));
		label_5.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_5.setBounds(269, 257, 142, 20);
		panel_1.add(label_5);
		
		TVhgi = new JLabel("0.00");
		TVhgi.setForeground(Color.WHITE);
		TVhgi.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVhgi.setBounds(409, 260, 107, 14);
		panel_1.add(TVhgi);
		
		JLabel lblGhgi = new JLabel("gh-gi:");
		lblGhgi.setForeground(new Color(204, 204, 0));
		lblGhgi.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblGhgi.setBounds(269, 288, 40, 20);
		panel_1.add(lblGhgi);
		
		TVhdiff = new JLabel("0.00");
		TVhdiff.setForeground(Color.WHITE);
		TVhdiff.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVhdiff.setBounds(319, 292, 96, 14);
		panel_1.add(TVhdiff);
		
		JLabel label_11 = new JLabel("Tension in cable(KN);");
		label_11.setForeground(new Color(204, 204, 0));
		label_11.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_11.setBounds(269, 319, 142, 20);
		panel_1.add(label_11);
		
	TVhtension = new JLabel("0.00");
		TVhtension.setForeground(Color.WHITE);
		TVhtension.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVhtension.setBounds(421, 322, 95, 14);
		panel_1.add(TVhtension);
		
		JLabel label_13 = new JLabel("FS=");
		label_13.setForeground(new Color(204, 204, 0));
		label_13.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_13.setBounds(269, 350, 34, 20);
		panel_1.add(label_13);
		
		TVhfs = new JLabel("0.00");
		TVhfs.setForeground(Color.WHITE);
		TVhfs.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVhfs.setBounds(319, 353, 68, 14);
		panel_1.add(TVhfs);
		
		JLabel label_15 = new JLabel("Design is:");
		label_15.setForeground(new Color(204, 204, 0));
		label_15.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_15.setBounds(269, 385, 91, 20);
		panel_1.add(label_15);
		
		TVhdesign = new JLabel("....");
		TVhdesign.setForeground(Color.GREEN);
		TVhdesign.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TVhdesign.setBackground(Color.GREEN);
		TVhdesign.setBounds(362, 381, 143, 22);
		panel_1.add(TVhdesign);
		
		JLabel lblDeadLoadCable = new JLabel("Dead Load Cable Length(m):");
		lblDeadLoadCable.setForeground(Color.ORANGE);
		lblDeadLoadCable.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		lblDeadLoadCable.setBounds(10, 168, 205, 14);
		panel_1.add(lblDeadLoadCable);
		
		TVLd = new JLabel("0.00");
		TVLd.setForeground(Color.WHITE);
		TVLd.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVLd.setBounds(211, 169, 118, 14);
		panel_1.add(TVLd);
		
		JLabel lblMaximumTensionIn = new JLabel("Maximum Tension in Hand Cable(KN):");
		lblMaximumTensionIn.setForeground(new Color(204, 204, 0));
		lblMaximumTensionIn.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblMaximumTensionIn.setBounds(10, 444, 249, 20);
		panel_1.add(lblMaximumTensionIn);
		
		JLabel lblActualTensionIn = new JLabel("Main cable Tension at other side(KN):");
		lblActualTensionIn.setForeground(new Color(204, 204, 0));
		lblActualTensionIn.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblActualTensionIn.setBounds(10, 477, 249, 20);
		panel_1.add(lblActualTensionIn);
		
		JLabel label_6 = new JLabel("Maximum Tension in Main Cable(KN):");
		label_6.setForeground(new Color(204, 204, 0));
		label_6.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_6.setBounds(10, 416, 249, 20);
		panel_1.add(label_6);
		
		JLabel lblActualTensionIn_1 = new JLabel("Hand Cable Tension at other side(KN):");
		lblActualTensionIn_1.setForeground(new Color(204, 204, 0));
		lblActualTensionIn_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblActualTensionIn_1.setBounds(10, 510, 274, 20);
		panel_1.add(lblActualTensionIn_1);
		
		TVmaxmain = new JLabel("0.00");
		TVmaxmain.setForeground(Color.WHITE);
		TVmaxmain.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVmaxmain.setBounds(291, 420, 96, 14);
		panel_1.add(TVmaxmain);
		
		TVmaxhand = new JLabel("0.00");
		TVmaxhand.setForeground(Color.WHITE);
		TVmaxhand.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVmaxhand.setBounds(291, 448, 96, 14);
		panel_1.add(TVmaxhand);
		
		TVactualmain = new JLabel("0.00");
		TVactualmain.setForeground(Color.WHITE);
		TVactualmain.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVactualmain.setBounds(291, 481, 96, 14);
		panel_1.add(TVactualmain);
		
		TVactualhand = new JLabel("0.00");
		TVactualhand.setForeground(Color.WHITE);
		TVactualhand.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVactualhand.setBounds(291, 514, 96, 14);
		panel_1.add(TVactualhand);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		tabbedPane.addTab("step-3", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblDeadLoadGeometry = new JLabel("Dead Load Geometry Calculations");
		lblDeadLoadGeometry.setForeground(Color.LIGHT_GRAY);
		lblDeadLoadGeometry.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDeadLoadGeometry.setBounds(10, 0, 566, 24);
		panel_2.add(lblDeadLoadGeometry);
		
		JLabel lblOriginAtLowest = new JLabel("Origin at lowest point of the cable......And .. ordinates at both sides symmetrically");
		lblOriginAtLowest.setForeground(Color.WHITE);
		lblOriginAtLowest.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblOriginAtLowest.setBounds(10, 30, 474, 24);
		panel_2.add(lblOriginAtLowest);
		
		JLabel lblEnterNoOf_2 = new JLabel("Enter intervals in X-direction(m):");
		lblEnterNoOf_2.setForeground(Color.WHITE);
		lblEnterNoOf_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterNoOf_2.setBounds(67, 65, 211, 24);
		panel_2.add(lblEnterNoOf_2);
		
		TFinterval = new JTextField();
		TFinterval.setText("10");
		TFinterval.setColumns(10);
		TFinterval.setBounds(288, 68, 86, 20);
		panel_2.add(TFinterval);
		
		JLabel lblOrEnterInterval = new JLabel("No of ordinates:");
		lblOrEnterInterval.setForeground(Color.WHITE);
		lblOrEnterInterval.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOrEnterInterval.setBounds(169, 100, 109, 24);
		panel_2.add(lblOrEnterInterval);
		
		JButton btnGenerateCoordinates = new JButton("Generate Coordinates");
		btnGenerateCoordinates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double interval=Double.parseDouble(TFinterval.getText());
					double y,x;
					int n1,n2,i;
					i=0;
					do
					{
						
							i++;
					}while(i<e1/interval);
					n1=i+1;
					i=0;
					do
					{
						
							i++;
					}while(i<e2/interval);
					n2=i+1;
					
					String amcs1=String.format("%d",n1);
					String amcs2=String.format("%d",n2);
					TVno.setText(amcs1+"at higher side & "+amcs2+"at lower side");
					
					 xf1.format("%s%.3f%s","Lowest elevation of Cables:",elevation,"\n");
					 xf1.format("%s%s","For higher Bank Side:","\n");
					 xf1.format("%s%s%s%s%s%s%s%s","SNO",",","x",",","y",",","Elevation","\n");	
					 
					double elevation1=elevation;
					double elevation2=elevation;
					double elevation3=elevation;
					
					 x=0;
					for(i=0;i<=n1-2;i++){
						y=k*x*x;
						elevation2=elevation+y;
						
						 xf1.format("%d%s%.3f%s%.3f%s%.3f%s",i,",",x,",",y,",",elevation2,"\n");
						x=x+interval;
					}
					
					y=k*e1*e1;
					elevation2=elevation+y;
					x=e1;
					
					 xf1.format("%d%s%.3f%s%.3f%s%.3f%s",i,",",x,",",y,",",elevation2,"\n");
					 xf1.format("%s%s","For lower Bank Side:","\n");
					 xf1.format("%s%s%s%s%s%s%s%s","SNO",",","x",",","y",",","Elevation","\n");
						
					 
					
					 x=0;
					for(i=0;i<=n2-2;i++){
						y=k*x*x;
						elevation3=elevation1+y;
						
						 xf1.format("%d%s%.3f%s%.3f%s%.3f%s",i,",",x,",",y,",",elevation3,"\n");
						x=x+interval;
					}
					
					y=k*e2*e2;
					elevation3=elevation1+y;
					x=e2;
					
					xf1.format("%d%s%.3f%s%.3f%s%.3f%s",i,",",x,",",y,",",elevation3,"\n");
					xf1.format("%s%s%.3f%s%s%s%s%s%.3f%s%s%s%s%.3f%s","e1=",",",e1,",","m",",","e2=",",",e2,"m",",","total Span=e1+e2=",",",e1+e2,"\n");
					xf1.format("%s%.3f%s%s%.3f%s","Higher f1=",k*e1*e1,",","Lower f2=",k*e2*e2,"\n");
					 
					 
					 TVgeometry.setText("DONE..for result visit: "+TFlocation.getText());
				}catch(Exception e15){
					JOptionPane.showMessageDialog(null,e15);
				}
			}
		});
		btnGenerateCoordinates.setBounds(200, 188, 139, 23);
		panel_2.add(btnGenerateCoordinates);
		
		TVno = new JLabel("0");
		TVno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TVno.setForeground(Color.CYAN);
		TVno.setBounds(298, 99, 255, 20);
		panel_2.add(TVno);
		
		TVgeometry = new JLabel("..");
		TVgeometry.setForeground(Color.GREEN);
		TVgeometry.setFont(new Font("SansSerif", Font.PLAIN, 14));
		TVgeometry.setBounds(10, 281, 561, 25);
		panel_2.add(TVgeometry);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setForeground(Color.MAGENTA);
		lblResult.setFont(new Font("SansSerif", Font.PLAIN, 16));
		lblResult.setBounds(18, 245, 543, 25);
		panel_2.add(lblResult);
		
		JPanel step4 = new JPanel();
		step4.setBackground(Color.BLACK);
		tabbedPane.addTab("step-4", null, step4, null);
		step4.setLayout(null);
		
		JLabel lblDesignOfFoundationhigher = new JLabel("Design of Foundation(Higher Elevation)");
		lblDesignOfFoundationhigher.setForeground(Color.LIGHT_GRAY);
		lblDesignOfFoundationhigher.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDesignOfFoundationhigher.setBounds(10, 11, 566, 24);
		step4.add(lblDesignOfFoundationhigher);
		
		JLabel lblEnterType = new JLabel("Bank Type:");
		lblEnterType.setForeground(Color.WHITE);
		lblEnterType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterType.setBounds(10, 46, 67, 24);
		step4.add(lblEnterType);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Rock");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup_5.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(90, 47, 55, 23);
		step4.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSoil = new JRadioButton("Soil");
		buttonGroup_5.add(rdbtnSoil);
		rdbtnSoil.setBounds(147, 47, 55, 23);
		step4.add(rdbtnSoil);
		
		JLabel lblEnterH = new JLabel("Enter trial H1(m):");
		lblEnterH.setForeground(Color.WHITE);
		lblEnterH.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterH.setBounds(10, 81, 107, 24);
		step4.add(lblEnterH);
		
		TFh1 = new JTextField();
		TFh1.setText("1.5");
		TFh1.setColumns(10);
		TFh1.setBounds(127, 84, 40, 20);
		step4.add(TFh1);
		
		TVh1 = new JLabel("..");
		TVh1.setForeground(Color.ORANGE);
		TVh1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVh1.setBounds(177, 87, 252, 14);
		step4.add(TVh1);
		
		JLabel lblEnterTrialHm = new JLabel("Enter trial H2(m):");
		lblEnterTrialHm.setForeground(Color.WHITE);
		lblEnterTrialHm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterTrialHm.setBounds(10, 116, 107, 24);
		step4.add(lblEnterTrialHm);
		
		TFh2 = new JTextField();
		TFh2.setText("0.8");
		TFh2.setColumns(10);
		TFh2.setBounds(127, 119, 40, 20);
		step4.add(TFh2);
		
		TVh2 = new JLabel("..");
		TVh2.setForeground(Color.ORANGE);
		TVh2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVh2.setBounds(177, 122, 252, 14);
		step4.add(TVh2);
		
		JLabel lblEnterTrialBm = new JLabel("Enter trial B(m):");
		lblEnterTrialBm.setForeground(Color.WHITE);
		lblEnterTrialBm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterTrialBm.setBounds(10, 151, 107, 24);
		step4.add(lblEnterTrialBm);
		
		TFb = new JTextField();
		TFb.setText("5");
		TFb.setColumns(10);
		TFb.setBounds(127, 154, 40, 20);
		step4.add(TFb);
		
		TVb = new JLabel("..");
		TVb.setForeground(Color.ORANGE);
		TVb.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVb.setBounds(177, 157, 252, 14);
		step4.add(TVb);
		
		JLabel lblEnterTrialLm = new JLabel("Enter trial L(m):");
		lblEnterTrialLm.setForeground(Color.WHITE);
		lblEnterTrialLm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterTrialLm.setBounds(10, 186, 107, 24);
		step4.add(lblEnterTrialLm);
		
		TFl = new JTextField();
		TFl.setText("2.9");
		TFl.setColumns(10);
		TFl.setBounds(127, 189, 40, 20);
		step4.add(TFl);
		
		TVl = new JLabel("..");
		TVl.setForeground(Color.ORANGE);
		TVl.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVl.setBounds(177, 192, 252, 14);
		step4.add(TVl);
		
		JButton btnGenerateDimensionLimit = new JButton("Generate Dimension limit");
		btnGenerateDimensionLimit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup_5.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
                      String a1 = null;
					
					Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
					while(bg1.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg1.nextElement();
						
						if(jrd.isSelected())
						a1=jrd.getText();
						
							
					}
					double mcn=Double.parseDouble(a1);
					
					if(a=="Rock")
					{
						if(mcn==2)
						{
							h1min=1.20;h1max=3.0;h2min=0.50;h2max=3.0;Bmin=3.60;Bmax=5.50;Lmin=2.90;Lmax=4.50;t=1;
						}
						if(mcn==4)
						{
							h1min=1.50;h1max=4;h2min=0.80;h2max=4;Bmin=5;Bmax=8.50;Lmin=2.90;Lmax=5;t=1;
						}
						if(mcn==6)
						{
							h1min=2;h1max=4.50;h2min=1;h2max=4.50;Bmin=6.70;Bmax=9.50;Lmin=3.30;Lmax=5.50;t=1.50;
						}
						if(mcn==8)
						{
							h1min=2.90;h1max=6.70;h2min=1.45;h2max=5.80;Bmin=9.50;Bmax=9.50;Lmin=4.80;Lmax=7.50;t=1.75;
						}
						if(mcn==10)
						{
							h1min=3.20;h1max=6.70;h2min=1.45;h2max=5.80;Bmin=11;Bmax=11;Lmin=5.40;Lmax=8;t=1.75;
						}
						if(mcn==12)
						{
							h1min=3.45;h1max=6.70;h2min=1.45;h2max=5.80;Bmin=12.5;Bmax=12.5;Lmin=5.40;Lmax=8;t=1.75;
						}
						
					}
					if(a=="Soil")
					{
						if(mcn==2)
						{
							h1min=1.20;h1max=3.5;h2min=1.20;h2max=3.5;Bmin=4.8;Bmax=6.50;Lmin=2.90;Lmax=5;
						}
						if(mcn==4)
						{
							h1min=1.50;h1max=4;h2min=1.20;h2max=4;Bmin=6.20;Bmax=9.50;Lmin=2.90;Lmax=5;
						}
						if(mcn==6)
						{
							h1min=2;h1max=4.50;h2min=1.20;h2max=4.50;Bmin=7.90;Bmax=11;Lmin=3.30;Lmax=6.50;
						}
						if(mcn==8)
						{
							h1min=3.70;h1max=6.70;h2min=2;h2max=5.80;Bmin=9.50;Bmax=9.50;Lmin=5;Lmax=7.50;
						}
						if(mcn==10)
						{
							h1min=3.70;h1max=6.70;h2min=2;h2max=5.80;Bmin=11;Bmax=11;Lmin=5.70;Lmax=8;
						}
						if(mcn==12)
						{
							h1min=3.7;h1max=6.70;h2min=2;h2max=5.80;Bmin=12.5;Bmax=12.5;Lmin=5.70;Lmax=8;
						}
					}
					String h1maxs=String.format("%.3f",h1max);
					String h1mins=String.format("%.3f",h1min);
					String h2maxs=String.format("%.3f",h2max);
					String h2mins=String.format("%.3f",h2min);
					String Bmaxs=String.format("%.3f",Bmax);
					String Bmins=String.format("%.3f",Bmin);
					String Lmaxs=String.format("%.3f",Lmax);
					String Lmins=String.format("%.3f",Lmin);
					String ts=String.format("%.3f",t);
					TVh1.setText("min="+h1mins+"m max="+h1maxs+"m");
					TVh2.setText("min="+h2mins+"m max="+h2maxs+"m");
					TVl.setText("min="+Lmins+"m max="+Lmaxs+"m");
					TVb.setText("min="+Bmins+"m max="+Bmaxs+"m");
					double h1=Double.parseDouble(TFh1.getText());
					double h2=Double.parseDouble(TFh2.getText());
					double l=Double.parseDouble(TFl.getText());
					double b=Double.parseDouble(TFb.getText());
					if(h1<h1min){
						h1=h1min;
						String h1s=String.format("%.3f",h1);
						TFh1.setText(h1s);
					}
					if(h1>h1max){
						h1=h1max;
						String h1s=String.format("%.3f",h1);
						TFh1.setText(h1s);
					}
					if(h2<h2min){
						h2=h2min;
						String h2s=String.format("%.3f",h2);
						TFh2.setText(h2s);
					}
					if(h2>h2max){
						h2=h2max;
						String h2s=String.format("%.3f",h2);
						TFh2.setText(h2s);
					}
					if(l<Lmin){
						l=Lmin;
						String ls=String.format("%.3f",l);
						TFl.setText(ls);
					}
					if(l>Lmax){
						l=Lmax;
						String ls=String.format("%.3f",l);
						TFl.setText(ls);
					}
					if(b<Bmin){
						b=Bmin;
						String bs=String.format("%.3f",b);
						TFb.setText(bs);
					}
					if(b>Bmax){
						b=Bmax;
						String bs=String.format("%.3f",b);
						TFb.setText(bs);
					}
					
						
					
					
				}catch(Exception e111){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnGenerateDimensionLimit.setBounds(208, 46, 169, 23);
		step4.add(btnGenerateDimensionLimit);
		
		JLabel lblEnterRetainingWall = new JLabel("Enter Retaining Wall Detail:");
		lblEnterRetainingWall.setForeground(Color.ORANGE);
		lblEnterRetainingWall.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterRetainingWall.setBounds(433, 12, 180, 24);
		step4.add(lblEnterRetainingWall);
		
		JLabel lblEnterTopWidthm = new JLabel("Enter top Width(m):");
		lblEnterTopWidthm.setForeground(Color.WHITE);
		lblEnterTopWidthm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterTopWidthm.setBounds(396, 46, 136, 24);
		step4.add(lblEnterTopWidthm);
		
		TFtwidth = new JTextField();
		TFtwidth.setText("0.7");
		TFtwidth.setColumns(10);
		TFtwidth.setBounds(542, 49, 40, 20);
		step4.add(TFtwidth);
		
		JLabel lblEnterHeightm = new JLabel("Enter height(m):");
		lblEnterHeightm.setForeground(Color.WHITE);
		lblEnterHeightm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterHeightm.setBounds(396, 81, 113, 24);
		step4.add(lblEnterHeightm);
		
		TFht = new JTextField();
		TFht.setText("0.9");
		TFht.setColumns(10);
		TFht.setBounds(519, 84, 40, 20);
		step4.add(TFht);
		
		JLabel lblEnterBottomWidthm = new JLabel("Enter bottom Width(m):");
		lblEnterBottomWidthm.setForeground(Color.WHITE);
		lblEnterBottomWidthm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterBottomWidthm.setBounds(395, 116, 150, 24);
		step4.add(lblEnterBottomWidthm);
		
		TFbwidth = new JTextField();
		TFbwidth.setText("2");
		TFbwidth.setColumns(10);
		TFbwidth.setBounds(555, 119, 40, 20);
		step4.add(TFbwidth);
		
		JButton btnCheck_1 = new JButton("Check...");
		btnCheck_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try{
					xf1.format("%s","\n\n\nDesign OF Foundation of Higher Elevation: \n");
					double h1=Double.parseDouble(TFh1.getText());
					double h2=Double.parseDouble(TFh2.getText());
					double l=Double.parseDouble(TFl.getText());
					double B=Double.parseDouble(TFb.getText());
					double ht=Double.parseDouble(TFht.getText());
					double twidth=Double.parseDouble(TFtwidth.getText());
					double bwidth=Double.parseDouble(TFbwidth.getText());
					double A=Double.parseDouble(TFA.getText());
					double permissible=Double.parseDouble(TFpermissible.getText());
					double rod=Double.parseDouble(TFrod.getText());
					double k=Double.parseDouble(TFk.getText());
					double friction=Double.parseDouble(TFfriction.getText());
					double a=Double.parseDouble(TFadist.getText());
					double diam=Double.parseDouble(TFdiam.getText());
					double ha=Double.parseDouble(TFha.getText());
		double fs=Double.parseDouble(TFfrontinclination.getText());
					double bs=Double.parseDouble(TFbackinclination.getText());
					
String a22 = null;
					
					Enumeration<AbstractButton> bg=buttonGroup_5.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a22=jrd.getText();
						
							
					}
					  String a11 = null;
					  double Fsl = 0;
						Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
						while(bg1.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg1.nextElement();
							
							if(jrd.isSelected())
							a11=jrd.getText();
							
								
						}
						double mcn=Double.parseDouble(a11);
					
					
					 xf1.format("%s%.3f%s%s","Total Area of Retaining Wall:",A,"sq.m","\n");
					 xf1.format("%s%.3f%s%s","Distance of resultant force:",a,"m","\n");
					 double Fblock1,Fblock2,ablock1,ablock2,totalmoment,totalvertical,maincableah,maincableav,handcableav,handcableah;
					 if(a22=="Rock")
					 {
					 Fblock1=0.5*l*B*(h1+h2)*22;
					 
					 ablock1=B/3*(2*h1+h2)/(h1+h2);
					 Fblock2=0.95*B*l*22;
					 ablock2=0.5*B;
					 maincableav=0.25;
					 handcableav=0.25;
					 maincableah=h2+0.7;
					 handcableah=h2+1.95;
					 double maincableTv=tmhigh*Math.sin(3.14/180*Banghigh);
					 double maincableTh=tmhigh*Math.cos(3.14/180*Banghigh);
					 double handcableTv=thhigh*Math.sin(3.14/180*Banghigh);
					 double handcableTh=thhigh*Math.cos(3.14/180*Banghigh);
					 double resistingmoment=Fblock1*ablock1+Fblock2*ablock2+a*A+maincableTv*maincableav+handcableTv*handcableav;
					 double overturningmoment=maincableTh*maincableah+handcableTh*handcableah;
					 totalmoment=resistingmoment-overturningmoment;
					 totalvertical=Fblock1+Fblock2+A+maincableTv+handcableTv;
					 double totalhorizontal=maincableTh+handcableTh;
					 xf1.format("%s%s","Moment Calculations:","\n");
					 xf1.format("%s%s%s%s%s%s%s%s%s%s","Force type",",","Vertical(KN)",",","Horizontal(KN)",",","distance from toe(m)",",","moment(KNm)","\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Block 1",",",Fblock1,",","-",",",ablock1,",",Fblock1*ablock1,"\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Block 2",",",Fblock2,",","-",",",ablock2,",",Fblock2*ablock2,"\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Retaining wall",",",A,",","-",",",a,",",A*a,"\n");
					 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Main Cable Horizontal",",","-",",",maincableTh,",",maincableah,",",maincableTh*maincableah,"\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Main Cable Vertical",",",maincableTv,",","-",",",maincableav,",",maincableTv*maincableav,"\n");
					 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Hand Cable Horizontal",",","-",",",handcableTh,",",handcableah,",",handcableTh*handcableah,"\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Hand Cable Vertical",",",handcableTv,",","-",",",handcableav,",",handcableTv*handcableav,"\n");
					 
					 xf1.format("%s%s%.3f%s%.3f%s%s%s%.3f%s","Total Vertical=",",",totalvertical,"KN,Total Horizontal=",totalhorizontal,",","Total Moment=",",",totalmoment,"KNm \n");
					 double volume=(Fblock1+Fblock2)/22;
					 double gammar=180/3.14*Math.atan(totalhorizontal/totalvertical);
					 double alpha=180/3.14*Math.atan((h1-h2)/B);
					 double bstarby2=totalmoment/(totalvertical*(1+Math.tan(3.14/180*alpha)*Math.tan(3.14/180*gammar)));
					 xf1.format("%s%.3f%s","Volume=",volume,"cu.m \n");
					 xf1.format("%s%.3f%s","gamma r=",gammar,"\n");
					 xf1.format("%s%.3f%s","bstarby2=:",bstarby2,"m \n");
					 double fsovertoppling=resistingmoment/overturningmoment;
					 if(fsovertoppling>=1.5)
					 {
						 xf1.format("%s%.3f%s","Factor of Safety Against Overtoppling=",fsovertoppling,">1.5 okay \n");
						 
					 }
					 else{
						 xf1.format("%s%.3f%s","Factor of Safety Against Overtoppling=",fsovertoppling,"<1.5 fails... please revise design \n");
					 }
					 
					 double rvdash=totalvertical*Math.cos(alpha*3.14/180)+totalhorizontal*Math.sin(alpha*3.14/180);
					 double Bdash=B/Math.cos(alpha*3.14/180);
					 double bstarby2dash=bstarby2/Math.cos(alpha*3.14/180);
					 double edash=Bdash/2-bstarby2dash;
					 double stressmax=rvdash/(Bdash*l)*(1+6*edash/Bdash);
					 double stressmin=rvdash/(Bdash*l)*(1-6*edash/Bdash);
					 double X,aten,bten,Ast,N,Nmin = 0;
					 xf1.format("%s%.3f%s","angle alpha=",alpha,"\n");
					 xf1.format("%s%.3f%s","rv dash=",rvdash,"KN \n");
					 xf1.format("%s%.3f%s","B dash=",Bdash,"m \n");
					 xf1.format("%s%.3f%s","bstarby2dash=",bstarby2dash,"m \n");
					 xf1.format("%s%.3f%s","edash=",edash,"m \n");
					 xf1.format("%s%.3f%s","Maximum Vertical Stress=",stressmax,"KN/sq.m \n");
					 xf1.format("%s%.3f%s","Minimum Vertical Stress=",stressmin,"KN/sq.m \n\n");
					 double ultimate,rhdash;
					if(stressmin<0)
					{
						xf1.format("%s%s","Since min stress is negative so Anchor Rods Are Necessary.....","\n");
						X=Bdash*stressmin/(stressmin-stressmax);
						aten=Bdash-bstarby2dash-X/3;
						bten=B-1-bstarby2dash;
						Ast=Math.abs(stressmin)*X*l*aten/(bten*2*rod)*100;
						N=k*4*Ast/(3.14*diam*diam);
						 xf1.format("%s%.3f%s","X dash=",X,"m \n");
						 xf1.format("%s%.3f%s","a=",aten,"m \n");
						 xf1.format("%s%.3f%s","b=",bten,"m \n");
						 xf1.format("%s%.3f%s","Ast=",Ast,"sq.mm \n");
						 int i=0;
						 while(i<N)
						 {
							 i++;
						 }
							 
						 N=i;
						 xf1.format("%s%d%s","Required No of anchor Rods=",i,"\n");
						 if(bstarby2<B/3){
							 xf1.format("%s%.3f%s","bstarby2<B/3=",B/3,"\n");
							 if(mcn==4)
								 Nmin=4;
							 if(mcn>4)
								 Nmin=6;
							 if(N>Nmin)
								 xf1.format("%s%.0f%s%.0f%s%.0f%s","N>Nmin=",Nmin,"(OK) provide ",N," rods of diameter=",diam,"mm \n");
							 else
							 xf1.format("%s%.0f%s%.0f%s%.0f%s","N<Nmin=",Nmin," provide ",Nmin," rods of diameter=",diam,"mm \n");
						 }
						 ultimate=4*rvdash/(3*2*bstarby2dash*l);
							rhdash=totalhorizontal*Math.cos(alpha*3.14/180)-totalvertical*Math.sin(alpha*3.14/180);
							 double as=N*3.14*diam*diam/4;
							 Fsl=(rvdash*Math.tan(3.14/180*friction)+as*0.075)/rhdash;
							 
							 if(Fsl>1.5)
								 xf1.format("%s","Check Factor of Safety for Sliding  \n");
							 xf1.format("%s","presence of Rod:  \n");
							 if(Fsl>=1.5)
								 xf1.format("%s%.3f%s%.3f%s","Fsl=",Fsl,">",1.5,"Okay \n");
							 if(Fsl<1.5)
								 xf1.format("%s%.3f%s%.3f%s","Fsl=",Fsl,"<",1.5,"Not Okay Please Revise Design \n");
					}
					rhdash=-totalvertical*Math.sin(alpha*3.14/180)+totalhorizontal*Math.cos(alpha*3.14/180);
					ultimate=4*rvdash/(3*2*bstarby2dash*l);
					 xf1.format("%s%.3f%s","Rhdash=",rhdash,"KN \n");
					if(ultimate<=permissible)
						 xf1.format("%s%.3f%s%.3f%s","ULTIMATE STRESS=",ultimate,"<",permissible,"Okay \n");
					 if(ultimate>permissible)
						 xf1.format("%s%.3f%s%.3f%s","ULTIMATE STRESS=",ultimate,">",permissible,"Not Okay Please Revise Design \n");
					rhdash=totalhorizontal*Math.cos(alpha*3.14/180)-totalvertical*Math.sin(alpha*3.14/180);
					if(stressmin>=0){
						xf1.format("%s","Tension is not produced so no rodS are required \n");
						 
						 
						
					}
					xf1.format("%s","Check Factor of Safety for Sliding(Rod are not Present)  \n");
					 double Fsl1=(rvdash*Math.tan(3.14/180*friction))/rhdash;
					 if(Fsl1>=1.3)
						 xf1.format("%s%.3f%s%.3f%s","Fsl=",Fsl1,">",1.3,"Okay \n");
					 if(Fsl1<1.3)
						 xf1.format("%s%.3f%s%.3f%s","Fsl=",Fsl1,"<",1.3,"Not Okay Please Revise Design \n");
					 String fsslide=String.format("%.3f",Fsl);
					 String fsslide1=String.format("%.3f",Fsl1);
					 String Ultimates=String.format("%.3f",ultimate);
					 String Permissibles=String.format("%.3f",permissible);
					 String bstarby2s=String.format("%.3f",bstarby2);
					 String bby4s=String.format("%.3f",B/3);
					 String fstopps=String.format("%.3f",fsovertoppling);
					 if(Fsl>=1.5)
						 TVcheck1.setText(fsslide+">"+"1.5 OK");
						if(Fsl<1.5)
							 TVcheck1.setText(fsslide+"<"+"1.5 Not OK");	
						if(bstarby2>=B/3)
							 TVcheck2.setText(bstarby2s+">"+bby4s+"1.5 OK");	
						if(bstarby2<B/3)
							 TVcheck2.setText(bstarby2s+"<"+bby4s+"1.5 NOT OK");	
						if(fsovertoppling>=1.5)
							 TVcheck3.setText(fstopps+">"+"1.5 OK");	
						if(fsovertoppling<1.5)
							 TVcheck3.setText(fstopps+"<"+"1.5 NOT OK");	
						if(Fsl1>=1.3)
							 TVcheck4.setText(fsslide1+">"+"1.3 OK");	
						if(Fsl1<1.3)
							 TVcheck4.setText(fsslide1+"<"+"1.3 not OK");	
						if(ultimate<=permissible)
							 TVcheck5.setText(Ultimates+"<"+Permissibles+"OK");	
						if(ultimate>permissible)
							 TVcheck5.setText(Ultimates+">"+Permissibles+"NOT OK");	
					 }
					 
					 if(a22=="Soil")
					 {
						 double frontslope=Double.parseDouble(TFfrontslope.getText());
						 double soildepth=Double.parseDouble(TFsoildepth.getText());
						 double ssangle=Double.parseDouble(TFsoilssangle.getText());
						 double sswt=Double.parseDouble(TFsoilsswt.getText());
						 double bfangle=Double.parseDouble(TFsoilbfangle.getText());
						 double bfwt=Double.parseDouble(TFsoilbfwt.getText());
						 double soilperm=Double.parseDouble(TFsoilperm.getText());
						 double soilemb=Double.parseDouble(TFsoilemb.getText());
						 String ass = null;
						 double nmc;
						 Enumeration<AbstractButton> bg3=buttonGroup_1.getElements();
							while(bg3.hasMoreElements()){
								JRadioButton jrd=(JRadioButton) bg3.nextElement();
								
								if(jrd.isSelected())
								ass=jrd.getText();
								
									
							}
							nmc=Double.parseDouble(ass);
						 xf1.format("%s","\n \n \nFoundation Characterstics:  \n");
						 xf1.format("%s","Type Of Bridge:Inclined Suspended  \n");
						 xf1.format("%s","River Bank:  \n");
						 xf1.format("%s","Cable Anchorage Type:Drum Anchorage  \n");
						 xf1.format("%s","Foundation:On Soil  \n");
						 xf1.format("%s","\n\nCable Structural Characterstics:  \n");
						 xf1.format("%s%.3f%s","No. Of Main Cable(Nm):     ",nmc," \n");
						 xf1.format("%s%.3f%s","Tension of Main Cable(Tm):    ",tmhigh,"KN \n");
						 xf1.format("%s%.3f%s","Tension of Hand Cable(Th):    ",thhigh,"KN \n");
						 xf1.format("%s%.3f%s","Cable Angle at FUll Load(Bf):    ",Banghigh,"degree \n");
						 xf1.format("%s%.3f%s","Front Slope of Rock(e1):    ",frontslope,"degree \n");
						 xf1.format("%s","\n\nSoil Parameters:  \n");
						 xf1.format("%s%.3f%s","Sub-Soil Depth:    ",soildepth,"m \n");
						 xf1.format("%s%.3f%s","Friction Angle of Sub-Soil:    ",ssangle,"degree \n");
						 xf1.format("%s%.3f%s","Unit weight of Sub-Soil:    ",sswt,"KN/sq. m \n");
						 xf1.format("%s%.3f%s","Friction Angle of Backfill SOil:    ",bfangle,"degree \n");
						 xf1.format("%s%.3f%s","Unit weight of Backfill Soil:    ",bfwt,"KN/sq. m \n");
						 
						 xf1.format("%s%.3f%s","Ground Bearing Pressure:    ",soilperm,"KN/sq. m \n");
						 xf1.format("%s%s%s","Ground Water Depth at:    ","Very Deep","degree \n");
						 xf1.format("%s%.3f%s","Minimum Embedded Depth:    ",soilemb,"m \n");
						 xf1.format("%s","\n\nFoundation Dimension:  \n");
						 xf1.format("%s%s%s%s%s%s","Foundation Dimensions(m)",",","Minimum",",","Maximum","\n");
						 xf1.format("%s%s%.3f%s%.3f%s","Front Height h1:",",",h1min,",",h1max,"\n");
						 xf1.format("%s%s%.3f%s%.3f%s","Back Height h2:",",",h2min,",",h2max,"\n");
						 xf1.format("%s%s%.3f%s%.3f%s","Breadth B:",",",Bmin,",",Bmax,"\n");
						 xf1.format("%s%s%.3f%s%.3f%s","Length L:",",",Lmin,",",Lmax,"\n");
						 xf1.format("%s","\n\nTrial Values of Dimension:  \n");
						 xf1.format("%s%s%s%s","Foundation Dimensions(m)",",","value","\n");
						 xf1.format("%s%s%.3f%s","Front Height h1:",",",h1,"\n");
						 xf1.format("%s%s%.3f%s","Back Height h2:",",",h2,"\n");
						 xf1.format("%s%s%.3f%s","Breadth B:",",",B,"\n");
						 xf1.format("%s%s%.3f%s","Length L:",",",l,"\n");
						 xf1.format("%s","Remark: \nThe dimension compiled were found by iteration with regard to economic design\n");
						 xf1.format("%s","\n\nActive Pressure:  \n");
						 xf1.format("%s%.3f%s","Active Pressure Height:   ",ha,"m \n");
						 xf1.format("%s%.3f%s","Embedded Depth:    ",soilemb,"m \n");
						 xf1.format("%s%.3f%s","Inclination of Front Slope:    ",fs,"degree \n");
						 xf1.format("%s%.3f%s","Inclination of Back Slope:    ",bs,"degree \n");
						 xf1.format("%s%.3f%s","Unit Weight of Dry Masonary:    ",17.0,"KN/cu.m \n");
						 
						 xf1.format("%s%.3f%s","Unit weight of Cement:     ",22.0,"KN/cu.m \n");
						 xf1.format("%s%.3f%s","Unit weight of Concrete:    ",22.0,"KN/cu.m \n");
						 xf1.format("%s%.3f%s%s","\n\nTotal Area of Retaining Wall:",A,"sq.m","\n");
						 xf1.format("%s%.3f%s%s","Distance of resultant force:",a,"m","\n");
						 double ah,sigma,rootvitra;
						 sigma=0.66667*bfangle;
						 double bfanglerad=3.14/180*bfangle;
						 double sigmarad=3.14/180*sigma;
						 double bsrad=3.14/180*bs;
						 rootvitra=Math.sin(bfanglerad+sigmarad)*Math.sin(bfanglerad-bsrad)/(Math.cos(sigmarad)*Math.cos(bsrad));
						 ah=Math.cos(bfanglerad)*Math.cos(bfanglerad)/((1+Math.sqrt(rootvitra))*(1+Math.sqrt(rootvitra)));
						 double alpha=180/3.14*Math.atan((h1-h2)/B);
						 xf1.format("%s","\n\nCofficient of Active Pressure:  \n");
						 xf1.format("%s%.3f%s","Inside Root=   ",rootvitra," \n");
						 xf1.format("%s%.3f%s","sigma:    ",sigma," \n");
						 xf1.format("%s%.3f%s","alpha ah:    ",ah," \n");
						 xf1.format("%s%s","\n\nBase Inclination:    "," \n");
						 xf1.format("%s%.3f%s","tanalpha(h1-h2)/B:    ",(h1-h2)/B," \n");
						 xf1.format("%s%.3f%s","alpha:    ",alpha,"degree \n");
						 if(alpha<=15)
							 xf1.format("%s","alpha < 15 degree ...........OK:  \n");
						 if(alpha>15)
							 xf1.format("%s","alpha > 15 degree ...........NOT OK Please Revise Design:  \n");
						 
						 
						 
						 
						
						 Fblock1=0.5*l*B*(h1+h2)*22;
						 
						 ablock1=B/3*(2*h1+h2)/(h1+h2);
						 Fblock2=0.95*(B-1.2)*l*22;
						 ablock2=0.5*B+0.6;
						 maincableav=1.45;
						 handcableav=1.45;
						 maincableah=h2+0.7;
						 handcableah=h2+1.95;
						 double activeh=0.5*ah*ha*ha*l*bfwt;
						 double activedisth=ha/3-h1+h2;
						 double activev=activeh*Math.tan(sigmarad);
						 double activedistv=B;
						 
						 double maincableTv=tmhigh*Math.sin(3.14/180*Banghigh);
						 double maincableTh=tmhigh*Math.cos(3.14/180*Banghigh);
						 double handcableTv=thhigh*Math.sin(3.14/180*Banghigh);
						 double handcableTh=thhigh*Math.cos(3.14/180*Banghigh);
						 double resistingmoment=Fblock1*ablock1+Fblock2*ablock2+a*A+maincableTv*maincableav+handcableTv*handcableav+activev*activedistv;
						 double overturningmoment=maincableTh*maincableah+handcableTh*handcableah+activeh*activedisth;
						 totalmoment=resistingmoment-overturningmoment;
						 totalvertical=Fblock1+Fblock2+A+maincableTv+handcableTv+activev;
						 double totalhorizontal=maincableTh+handcableTh+activeh;
						 xf1.format("%s%s","Moment Calculations:","\n");
						 xf1.format("%s%s%s%s%s%s%s%s%s%s","Force type",",","Vertical(KN)",",","Horizontal(KN)",",","distance from toe(m)",",","moment(KNm)","\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Block 1",",",Fblock1,",","-",",",ablock1,",",Fblock1*ablock1,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Block 2",",",Fblock2,",","-",",",ablock2,",",Fblock2*ablock2,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Retaining wall",",",A,",","-",",",a,",",A*a,"\n");
						 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Active Earth Pressure(Horizontal):",",","-",",",activeh,",",activedisth,",",activeh*activedisth,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Active Earth Pressure(Vertical)",",",activev,",","-",",",activedistv,",",activev*activedistv,"\n");
						 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Main Cable Horizontal",",","-",",",maincableTh,",",maincableah,",",maincableTh*maincableah,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Main Cable Vertical",",",maincableTv,",","-",",",maincableav,",",maincableTv*maincableav,"\n");
						 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Hand Cable Horizontal",",","-",",",handcableTh,",",handcableah,",",handcableTh*handcableah,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Hand Cable Vertical",",",handcableTv,",","-",",",handcableav,",",handcableTv*handcableav,"\n");
						 
						 xf1.format("%s%s%.3f%s%.3f%s%s%s%.3f%s","Total Vertical=",",",totalvertical,"KN,Total Horizontal=",totalhorizontal,",","Total Moment=",",",totalmoment,"KNm \n");
						 double volume=(Fblock1+Fblock2)/22;
						 double gammar=180/3.14*Math.atan(totalhorizontal/totalvertical);
						 alpha=180/3.14*Math.atan((h1-h2)/B);
						 double bstarby2=totalmoment/(totalvertical*(1+Math.tan(3.14/180*alpha)*Math.tan(3.14/180*gammar)));
						 xf1.format("%s%.3f%s","Volume=",volume,"cu.m \n");
						 xf1.format("%s%.3f%s","OverTurning Moment(M-)=",overturningmoment,"KNm \n");
						 xf1.format("%s%.3f%s","Resisting Moment(M+)=",resistingmoment,"KNm \n");
						 xf1.format("%s%.3f%s","gamma r=",gammar,"\n");
						 xf1.format("%s%.3f%s","bstarby2=:",bstarby2,"m \n");
						 if(bstarby2>=B/4)
						 {
							 xf1.format("%s%.3f%s","bstarby2>B/4=",B/4," Okay.. \n");
							 
						 }
						 if(bstarby2<B/4)
						 {
							 xf1.format("%s%.3f%s","bstarby2<B/4=",B/4,"Not Okay.. \n");
							 
						 }
						 double slide=Math.tan(ssangle*3.14/180)/(Math.tan(gammar*3.14/180-alpha*3.14/180));
						 xf1.format("%s%.3f%s","\n\nFactor of Safety Against Sliding(Fsl)=",slide," \n");
						 
						 double fsovertoppling=resistingmoment/overturningmoment;
						 if(fsovertoppling>=1.5)
						 {
							 xf1.format("%s%.3f%s","\n\nFactor of Safety Against Overtoppling=",fsovertoppling,">1.5 okay \n");
							 
						 }
						 else{
							 xf1.format("%s%.3f%s","\n\nFactor of Safety Against Overtoppling=",fsovertoppling,"<1.5 fails... please revise design \n");
						 }
						 xf1.format("%s%s","\n\nUltimate bearing Capacity and safety factor against shear failure of ground:","\n");
						 double ssanglerad=ssangle*3.14/180;
						 double eb=Double.parseDouble(TFeb.getText());
						 double lstarinfl=2*bstarby2*Math.tan(0.785+0.5*ssanglerad)*Math.exp(0.5*3.14*Math.tan(ssanglerad));
						 double surcharge=sswt*soilemb;
						 double Nq=Math.tan(0.785+0.5*ssanglerad)*Math.tan(0.785+0.5*ssanglerad)*Math.exp(3.14*Math.tan(ssanglerad));
						 double Ny=1.8*(Nq-1)*Math.tan(ssanglerad);
						 double Sq=1+bstarby2*2/l*Math.tan(ssanglerad);
						 double Sy=1-0.4*bstarby2*2/l;
						 double dq=1+0.035*Math.tan(ssanglerad)*(1-Math.sin(ssanglerad))*(1-Math.sin(ssanglerad))*180/3.14*Math.atan(0.5*soilemb/bstarby2);
						 double dy=1;
						 double nnn=Math.tan(3.14/180.00*gammar-3.14/180.00*alpha);
						 double iq=Math.pow((1-0.5*nnn),5.0);
						 double iy=Math.pow((1-(0.7-0.0022*alpha)*nnn),5);
						 double bq=Math.exp(-0.035*alpha*Math.tan(ssanglerad));
						 double by=Math.exp(-0.047*alpha*Math.tan(ssanglerad));
						 double g=Math.pow((1-0.5*Math.tan(eb*3.14/180)),5);
						 double pstar=bstarby2*2*l*(surcharge*Nq*Sq*dq*iq*bq+0.5*sswt*bstarby2*2*Ny*Sy*dy*iy*by)*g;
						 double fsbearing=pstar/totalvertical;
						 xf1.format("%s%.3f%s","Lstarinfl=",lstarinfl,"m \n");
						 xf1.format("%s","\nFrom General Arrangement: \n");
						 xf1.format("%s%.3f%s%.3f%s","At L*infl=",lstarinfl,"m e1=eb=",eb,"degree \n");
						 xf1.format("%s%.3f%s","Surcharge Load(q+gamma1*t=",surcharge,"KN/sq.m(q=0) \n");
						 xf1.format("%s","Bearing Capacity Factors: \n");
						 xf1.format("%s%.3f%s","Nq=",Nq," \n");
						 xf1.format("%s%.3f%s","Ny=",Ny," \n");
						 xf1.format("%s","Shape Correction Factors: \n");
						 xf1.format("%s%.3f%s","Sq=",Sq,"\n");
						 xf1.format("%s%.3f%s","Sy=",Sy,"\n");
						 xf1.format("%s","Inclination of Loads: \n");
						 xf1.format("%s%.3f%s","iq=",iq," \n");
						 xf1.format("%s%.3f%s","iy=",iy," \n");
						 xf1.format("%s","Depth Correction Factors: \n");
						 xf1.format("%s%.3f%s","dq=",dq," \n");
						 xf1.format("%s%.3f%s","dy=",dy," \n");
						 xf1.format("%s","Inclination of Foundation Base: \n");
						 xf1.format("%s%.3f%s","bq=",bq," \n");
						 xf1.format("%s%.3f%s","by=",by," \n");
						 xf1.format("%s","Inclination of Base Line:(assume eb=e \n");
						 xf1.format("%s%.3f%s","gq=",g," \n");
						 xf1.format("%s%.3f%s","gy=",g," \n");
						 xf1.format("%s","Shear Resistance of Ground: \n");
						 xf1.format("%s%.3f%s","Pstar=",pstar," \n");
						 if(fsbearing>=2)
						 xf1.format("%s%.3f%s","Factor of safety against shear=",fsbearing,">2 okay \n");
						 if(fsbearing<2)
							 xf1.format("%s%.3f%s","Factor of safety against shear=",fsbearing,"<2 Not okay... please revise design \n");
						 
						 double rvdash=totalvertical*Math.cos(alpha*3.14/180)+totalhorizontal*Math.sin(alpha*3.14/180);
						 double Bdash=B/Math.cos(alpha*3.14/180);
						 double bstarby2dash=bstarby2/Math.cos(alpha*3.14/180);
						 double edash=Bdash/2-bstarby2dash;
						 double stressmax=rvdash/(Bdash*l)*(1+6*edash/Bdash);
						 double stressmin=rvdash/(Bdash*l)*(1-6*edash/Bdash);
						 double X,aten,bten,Ast,N,Nmin = 0;
						 xf1.format("%s%.3f%s","angle alpha=",alpha,"\n");
						 xf1.format("%s%.3f%s","rv dash=",rvdash,"KN \n");
						 xf1.format("%s%.3f%s","B dash=",Bdash,"m \n");
						 xf1.format("%s%.3f%s","bstarby2dash=",bstarby2dash,"m \n");
						 xf1.format("%s%.3f%s","edash=",edash,"m \n");
						 xf1.format("%s%.3f%s","Maximum Vertical Stress=",stressmax,"KN/sq.m \n");
						 xf1.format("%s%.3f%s","Minimum Vertical Stress=",stressmin,"KN/sq.m \n\n");
						 if(stressmax<=soilperm)
						 {
							 xf1.format("%s%.3f%s","Max. Stress<",soilperm,"KN/sq.m OK.. \n\n"); 
						 }
						 if(stressmax>soilperm)
						 {
							 xf1.format("%s%.3f%s","Max. Stress>",soilperm,"KN/sq.m NOT OK..please revise design \n\n"); 
						 }
						 double ultimate,rhdash,alpharad=alpha*3.14/180;
						 Ast=stressmax*l/(0.414)*(1.2*Math.cos(alpharad)-h2*Math.sin(alpharad))*(1.2*Math.cos(alpharad)-h2*Math.sin(alpharad))/(h2*Math.cos(alpharad)+1.2*Math.sin(alpharad)-0.2);
						double astmin=0.02/100*h2*l*1000000;
						N=Math.max(Ast,astmin)*4.0/(3.14*diam*diam);
						 xf1.format("%s","\n\nReinforcement of Ground: \n");
						 xf1.format("%s%.3f%s","Ast=",Ast,"sq.mm \n");
						 xf1.format("%s%.3f%s","Ast min=",astmin,"sq.m \n\n");
							
							
							 int i=0;
							 while(i<N)
							 {
								 i++;
							 }
							 xf1.format("%s%d%s%.3f%s","No of Rods Required=",i,"-",diam,"mm ribbed tor steel rod \n");
							
						
							 String fsslide=String.format("%.2f",slide);
							 String bstarby2s=String.format("%.2f",bstarby2);
							 String fstopps=String.format("%.2f",fsovertoppling);
							 String fsshears=String.format("%.2f",fsbearing);
							 String fsbearings=String.format("%.2f",A);
							 String bby4s=String.format("%.2f",B/4);
							 String groundbearings=String.format("%.2f",soilperm);
							 String stressmaxs=String.format("%.2f",stressmax);
							if(slide>=1.5)
							 TVcheck1.setText(fsslide+">"+"1.5 OK");
							if(slide<1.5)
								 TVcheck1.setText(fsslide+"<"+"1.5 Not OK");	
							if(bstarby2>=B/4)
								 TVcheck2.setText(bstarby2s+">"+bby4s+"1.5 OK");	
							if(bstarby2<B/4)
								 TVcheck2.setText(bstarby2s+"<"+bby4s+"1.5 NOT OK");	
							if(fsovertoppling>=1.5)
								 TVcheck3.setText(fstopps+">"+"1.5 OK");	
							if(fsovertoppling<1.5)
								 TVcheck3.setText(fstopps+"<"+"1.5 NOT OK");	
							if(fsbearing>=2)
								 TVcheck4.setText(fsshears+">"+"2 OK");	
							if(fsbearing<2)
								 TVcheck4.setText(fsshears+"<"+"2 not OK");	
							if(stressmax<=soilperm)
								 TVcheck5.setText(stressmaxs+"<"+groundbearings+"OK");	
							if(stressmax>soilperm)
								 TVcheck5.setText(stressmaxs+">"+groundbearings+"NOT OK");	
							
							
					 }
					 
				}catch(Exception e110){
					JOptionPane.showMessageDialog(null,e110);
				}
			
			}
		});
		
		btnCheck_1.setBounds(127, 479, 89, 23);
		step4.add(btnCheck_1);
		
		TVcheck1 = new JLabel("..");
		TVcheck1.setForeground(Color.WHITE);
		TVcheck1.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck1.setBounds(10, 534, 118, 24);
		step4.add(TVcheck1);
		
		JLabel lblEnterRetainingForcekn = new JLabel("Enter Retaining Force(KN):");
		lblEnterRetainingForcekn.setForeground(Color.WHITE);
		lblEnterRetainingForcekn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterRetainingForcekn.setBounds(394, 186, 169, 24);
		step4.add(lblEnterRetainingForcekn);
		
		TFA = new JTextField();
		TFA.setText("83.16");
		TFA.setColumns(10);
		TFA.setBounds(573, 189, 40, 20);
		step4.add(TFA);
		
		JLabel lblEnterDistanceAm = new JLabel("Enter distance a(m):");
		lblEnterDistanceAm.setForeground(Color.WHITE);
		lblEnterDistanceAm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDistanceAm.setBounds(409, 217, 130, 24);
		step4.add(lblEnterDistanceAm);
		
		TFadist = new JTextField();
		TFadist.setText("5.17");
		TFadist.setColumns(10);
		TFadist.setBounds(549, 220, 40, 20);
		step4.add(TFadist);
		
		JButton btnCalculateAdditionalForce = new JButton("Calculate Additional Force and distance");
		btnCalculateAdditionalForce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ht=Double.parseDouble(TFht.getText());
				double twidth=Double.parseDouble(TFtwidth.getText());
				double bwidth=Double.parseDouble(TFbwidth.getText());
				double l=Double.parseDouble(TFl.getText());
				double B=Double.parseDouble(TFb.getText());
				double A,a1,a2,a0,a;
				  
				a1=twidth;
				a2=bwidth-twidth;
				A=22*ht*(a1+0.5*a2)*l;
				a0=(a1*a1+a1*a2+0.333*a2*a2)/(2*a1+a2);
				a=B-a0;
				 String amcs=String.format("%.3f",A);
				 String amcss=String.format("%.3f",a);
				 TFA.setText(amcs);
				 TFadist.setText(amcss);
			}
		});
		btnCalculateAdditionalForce.setBounds(409, 151, 269, 23);
		step4.add(btnCalculateAdditionalForce);
		
		JLabel lblEnterPermissibleStressnsq = new JLabel("Permissible Stress(KN/sq m):");
		lblEnterPermissibleStressnsq.setForeground(Color.WHITE);
		lblEnterPermissibleStressnsq.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterPermissibleStressnsq.setBounds(10, 250, 180, 24);
		step4.add(lblEnterPermissibleStressnsq);
		
		TFpermissible = new JTextField();
		TFpermissible.setText("450");
		TFpermissible.setColumns(10);
		TFpermissible.setBounds(194, 253, 40, 20);
		step4.add(TFpermissible);
		
		JLabel lblFrictionAngle = new JLabel("Friction angle:");
		lblFrictionAngle.setForeground(Color.WHITE);
		lblFrictionAngle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrictionAngle.setBounds(20, 277, 97, 24);
		step4.add(lblFrictionAngle);
		
		TFfriction = new JTextField();
		TFfriction.setText("35");
		TFfriction.setColumns(10);
		TFfriction.setBounds(127, 280, 40, 20);
		step4.add(TFfriction);
		
		JLabel lblRqd = new JLabel("RQD:");
		lblRqd.setForeground(Color.WHITE);
		lblRqd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRqd.setBounds(77, 313, 40, 24);
		step4.add(lblRqd);
		
		TFk = new JTextField();
		TFk.setText("1.75");
		TFk.setColumns(10);
		TFk.setBounds(127, 316, 40, 20);
		step4.add(TFk);
		
		JLabel lblEnterAnchorRod = new JLabel("Enter Anchor Rod Details:");
		lblEnterAnchorRod.setForeground(Color.ORANGE);
		lblEnterAnchorRod.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterAnchorRod.setBounds(20, 348, 180, 24);
		step4.add(lblEnterAnchorRod);
		
		JLabel lblStrengthnsqMm = new JLabel("Strength(N/sq mm):");
		lblStrengthnsqMm.setForeground(Color.WHITE);
		lblStrengthnsqMm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStrengthnsqMm.setBounds(20, 371, 130, 24);
		step4.add(lblStrengthnsqMm);
		
		TFrod = new JTextField();
		TFrod.setText("19");
		TFrod.setColumns(10);
		TFrod.setBounds(160, 374, 40, 20);
		step4.add(TFrod);
		
		JLabel lblEnterDiametermm = new JLabel("Enter diameter(mm):");
		lblEnterDiametermm.setForeground(Color.WHITE);
		lblEnterDiametermm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDiametermm.setBounds(20, 406, 130, 24);
		step4.add(lblEnterDiametermm);
		
		TFdiam = new JTextField();
		TFdiam.setText("25");
		TFdiam.setColumns(10);
		TFdiam.setBounds(160, 409, 40, 20);
		step4.add(TFdiam);
		
		JLabel lblIfFoundationIs = new JLabel("If Foundation is Rock then Enter Details Below:");
		lblIfFoundationIs.setForeground(Color.ORANGE);
		lblIfFoundationIs.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIfFoundationIs.setBounds(10, 221, 310, 24);
		step4.add(lblIfFoundationIs);
		
		JLabel lblIfFoundationIs_1 = new JLabel("If Foundation is Soil then Enter Details Below:");
		lblIfFoundationIs_1.setForeground(Color.ORANGE);
		lblIfFoundationIs_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIfFoundationIs_1.setBounds(288, 252, 310, 24);
		step4.add(lblIfFoundationIs_1);
		
		JLabel lblSubsoilDepthm = new JLabel("Sub-Soil Depth(m):");
		lblSubsoilDepthm.setForeground(Color.WHITE);
		lblSubsoilDepthm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubsoilDepthm.setBounds(277, 282, 118, 24);
		step4.add(lblSubsoilDepthm);
		
		JLabel lblFrictAngleOf = new JLabel("Frict. Angle of SS:");
		lblFrictAngleOf.setForeground(Color.WHITE);
		lblFrictAngleOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrictAngleOf.setBounds(277, 317, 118, 24);
		step4.add(lblFrictAngleOf);
		
		JLabel lblUnitWtOf = new JLabel("Unit Wt. of SS:");
		lblUnitWtOf.setForeground(Color.WHITE);
		lblUnitWtOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUnitWtOf.setBounds(288, 352, 107, 24);
		step4.add(lblUnitWtOf);
		
		JLabel lblFrictAngleOf_1 = new JLabel("Frict. Angle of Back Fill:");
		lblFrictAngleOf_1.setForeground(Color.WHITE);
		lblFrictAngleOf_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrictAngleOf_1.setBounds(245, 387, 150, 24);
		step4.add(lblFrictAngleOf_1);
		
		TFsoilbfangle = new JTextField();
		TFsoilbfangle.setText("22");
		TFsoilbfangle.setColumns(10);
		TFsoilbfangle.setBounds(405, 390, 40, 20);
		step4.add(TFsoilbfangle);
		
		TFsoilsswt = new JTextField();
		TFsoilsswt.setText("18");
		TFsoilsswt.setColumns(10);
		TFsoilsswt.setBounds(405, 355, 40, 20);
		step4.add(TFsoilsswt);
		
		TFsoilssangle = new JTextField();
		TFsoilssangle.setText("30");
		TFsoilssangle.setColumns(10);
		TFsoilssangle.setBounds(405, 320, 40, 20);
		step4.add(TFsoilssangle);
		
		TFsoildepth = new JTextField();
		TFsoildepth.setText("9");
		TFsoildepth.setColumns(10);
		TFsoildepth.setBounds(405, 285, 40, 20);
		step4.add(TFsoildepth);
		
		JLabel lblUnitWtOf_1 = new JLabel("Unit Wt. of Back Fill:");
		lblUnitWtOf_1.setForeground(Color.WHITE);
		lblUnitWtOf_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUnitWtOf_1.setBounds(255, 422, 140, 24);
		step4.add(lblUnitWtOf_1);
		
		TFsoilbfwt = new JTextField();
		TFsoilbfwt.setText("17");
		TFsoilbfwt.setColumns(10);
		TFsoilbfwt.setBounds(405, 425, 40, 20);
		step4.add(TFsoilbfwt);
		
		JLabel lblGroundBearingPressureperm = new JLabel("Ground Bearing Pressure(Perm.):");
		lblGroundBearingPressureperm.setForeground(Color.WHITE);
		lblGroundBearingPressureperm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGroundBearingPressureperm.setBounds(455, 282, 208, 24);
		step4.add(lblGroundBearingPressureperm);
		
		TFsoilperm = new JTextField();
		TFsoilperm.setText("300");
		TFsoilperm.setColumns(10);
		TFsoilperm.setBounds(662, 285, 40, 20);
		step4.add(TFsoilperm);
		
		JLabel lblMinEmbeddedDepthm = new JLabel("Embedded Depth(m):");
		lblMinEmbeddedDepthm.setForeground(Color.WHITE);
		lblMinEmbeddedDepthm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMinEmbeddedDepthm.setBounds(486, 313, 150, 24);
		step4.add(lblMinEmbeddedDepthm);
		
		TFsoilemb = new JTextField();
		TFsoilemb.setText("2.5");
		TFsoilemb.setColumns(10);
		TFsoilemb.setBounds(662, 316, 40, 20);
		step4.add(TFsoilemb);
		
		JLabel lblFrontSlopeOf = new JLabel("Front Slope of Rock:");
		lblFrontSlopeOf.setForeground(Color.WHITE);
		lblFrontSlopeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrontSlopeOf.setBounds(500, 348, 136, 24);
		step4.add(lblFrontSlopeOf);
		
		TFfrontslope = new JTextField();
		TFfrontslope.setText("9");
		TFfrontslope.setColumns(10);
		TFfrontslope.setBounds(662, 351, 40, 20);
		step4.add(TFfrontslope);
		
		JLabel lblActivePressureHeightha = new JLabel("Active pressure height(ha):");
		lblActivePressureHeightha.setForeground(Color.WHITE);
		lblActivePressureHeightha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblActivePressureHeightha.setBounds(467, 374, 169, 24);
		step4.add(lblActivePressureHeightha);
		
		TFha = new JTextField();
		TFha.setText("6");
		TFha.setColumns(10);
		TFha.setBounds(662, 377, 40, 20);
		step4.add(TFha);
		
		JLabel lblFrontSlopeInclination = new JLabel("Front Slope Inclination:");
		lblFrontSlopeInclination.setForeground(Color.WHITE);
		lblFrontSlopeInclination.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrontSlopeInclination.setBounds(477, 406, 159, 24);
		step4.add(lblFrontSlopeInclination);
		
		TFfrontinclination = new JTextField();
		TFfrontinclination.setText("20.5");
		TFfrontinclination.setColumns(10);
		TFfrontinclination.setBounds(662, 409, 40, 20);
		step4.add(TFfrontinclination);
		
		JLabel lblBackSlopeInclination = new JLabel("Back Slope Inclination:");
		lblBackSlopeInclination.setForeground(Color.WHITE);
		lblBackSlopeInclination.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBackSlopeInclination.setBounds(486, 441, 150, 24);
		step4.add(lblBackSlopeInclination);
		
		TFbackinclination = new JTextField();
		TFbackinclination.setText("11");
		TFbackinclination.setColumns(10);
		TFbackinclination.setBounds(662, 444, 40, 20);
		step4.add(TFbackinclination);
		
		JLabel lblInclinationEb = new JLabel("inclination eb=");
		lblInclinationEb.setForeground(Color.WHITE);
		lblInclinationEb.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInclinationEb.setBounds(298, 457, 97, 24);
		step4.add(lblInclinationEb);
		
		TFeb = new JTextField();
		TFeb.setText("20.7");
		TFeb.setColumns(10);
		TFeb.setBounds(405, 460, 40, 20);
		step4.add(TFeb);
		
		TVcheck2 = new JLabel("..");
		TVcheck2.setForeground(Color.WHITE);
		TVcheck2.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck2.setBounds(160, 534, 130, 24);
		step4.add(TVcheck2);
		
		TVcheck3 = new JLabel("..");
		TVcheck3.setForeground(Color.WHITE);
		TVcheck3.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck3.setBounds(298, 534, 140, 24);
		step4.add(TVcheck3);
		
		TVcheck4 = new JLabel("..");
		TVcheck4.setForeground(Color.WHITE);
		TVcheck4.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck4.setBounds(455, 534, 140, 24);
		step4.add(TVcheck4);
		
		TVcheck5 = new JLabel("..");
		TVcheck5.setForeground(Color.WHITE);
		TVcheck5.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck5.setBounds(594, 534, 136, 24);
		step4.add(TVcheck5);
		
		JLabel lblSliding = new JLabel("sliding:");
		lblSliding.setForeground(Color.CYAN);
		lblSliding.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSliding.setBounds(10, 514, 89, 20);
		step4.add(lblSliding);
		
		JLabel lblBstarby = new JLabel("bstarby2:");
		lblBstarby.setForeground(Color.CYAN);
		lblBstarby.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBstarby.setBounds(145, 513, 89, 20);
		step4.add(lblBstarby);
		
		JLabel lblToppling = new JLabel("toppling:");
		lblToppling.setForeground(Color.CYAN);
		lblToppling.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblToppling.setBounds(288, 514, 89, 20);
		step4.add(lblToppling);
		
		JLabel lblGroundShear = new JLabel("ground shear:");
		lblGroundShear.setForeground(Color.CYAN);
		lblGroundShear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGroundShear.setBounds(443, 514, 89, 20);
		step4.add(lblGroundShear);
		
		JLabel lblGroundBearing = new JLabel("Ground Bearing:");
		lblGroundBearing.setForeground(Color.CYAN);
		lblGroundBearing.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGroundBearing.setBounds(589, 514, 113, 20);
		step4.add(lblGroundBearing);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		tabbedPane.addTab("Step-5", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel label = new JLabel("Bank Type:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(10, 46, 67, 24);
		panel_4.add(label);
		
		JRadioButton radioButton_22 = new JRadioButton("Rock");
		buttonGroup_6.add(radioButton_22);
		radioButton_22.setSelected(true);
		radioButton_22.setBounds(90, 47, 55, 23);
		panel_4.add(radioButton_22);
		
		JRadioButton radioButton_23 = new JRadioButton("Soil");
		buttonGroup_6.add(radioButton_23);
		radioButton_23.setBounds(147, 47, 55, 23);
		panel_4.add(radioButton_23);
		
		JButton button_1 = new JButton("Generate Dimension limit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup_6.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
                      String a1 = null;
					
					Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
					while(bg1.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg1.nextElement();
						
						if(jrd.isSelected())
						a1=jrd.getText();
						
							
					}
					double mcn=Double.parseDouble(a1);
					
					if(a=="Rock")
					{
						if(mcn==2)
						{
							h1min=1.20;h1max=3.0;h2min=0.50;h2max=3.0;Bmin=3.60;Bmax=5.50;Lmin=2.90;Lmax=4.50;t=1;
						}
						if(mcn==4)
						{
							h1min=1.50;h1max=4;h2min=0.80;h2max=4;Bmin=5;Bmax=8.50;Lmin=2.90;Lmax=5;t=1;
						}
						if(mcn==6)
						{
							h1min=2;h1max=4.50;h2min=1;h2max=4.50;Bmin=6.70;Bmax=9.50;Lmin=3.30;Lmax=5.50;t=1.50;
						}
						if(mcn==8)
						{
							h1min=2.90;h1max=6.70;h2min=1.45;h2max=5.80;Bmin=9.50;Bmax=9.50;Lmin=4.80;Lmax=7.50;t=1.75;
						}
						if(mcn==10)
						{
							h1min=3.20;h1max=6.70;h2min=1.45;h2max=5.80;Bmin=11;Bmax=11;Lmin=5.40;Lmax=8;t=1.75;
						}
						if(mcn==12)
						{
							h1min=3.45;h1max=6.70;h2min=1.45;h2max=5.80;Bmin=12.5;Bmax=12.5;Lmin=5.40;Lmax=8;t=1.75;
						}
						
					}
					if(a=="Soil")
					{
						if(mcn==2)
						{
							h1min=1.20;h1max=3.5;h2min=1.20;h2max=3.5;Bmin=4.8;Bmax=6.50;Lmin=2.90;Lmax=5;
						}
						if(mcn==4)
						{
							h1min=1.50;h1max=4;h2min=1.20;h2max=4;Bmin=6.20;Bmax=9.50;Lmin=2.90;Lmax=5;
						}
						if(mcn==6)
						{
							h1min=2;h1max=4.50;h2min=1.20;h2max=4.50;Bmin=7.90;Bmax=11;Lmin=3.30;Lmax=6.50;
						}
						if(mcn==8)
						{
							h1min=3.70;h1max=6.70;h2min=2;h2max=5.80;Bmin=9.50;Bmax=9.50;Lmin=5;Lmax=7.50;
						}
						if(mcn==10)
						{
							h1min=3.70;h1max=6.70;h2min=2;h2max=5.80;Bmin=11;Bmax=11;Lmin=5.70;Lmax=8;
						}
						if(mcn==12)
						{
							h1min=3.7;h1max=6.70;h2min=2;h2max=5.80;Bmin=12.5;Bmax=12.5;Lmin=5.70;Lmax=8;
						}
					}
					String h1maxs=String.format("%.3f",h1max);
					String h1mins=String.format("%.3f",h1min);
					String h2maxs=String.format("%.3f",h2max);
					String h2mins=String.format("%.3f",h2min);
					String Bmaxs=String.format("%.3f",Bmax);
					String Bmins=String.format("%.3f",Bmin);
					String Lmaxs=String.format("%.3f",Lmax);
					String Lmins=String.format("%.3f",Lmin);
					String ts=String.format("%.3f",t);
					TVh1low.setText("min="+h1mins+"m max="+h1maxs+"m");
					TVh2low.setText("min="+h2mins+"m max="+h2maxs+"m");
					TVLlow.setText("min="+Lmins+"m max="+Lmaxs+"m");
					TVBlow.setText("min="+Bmins+"m max="+Bmaxs+"m");
					double h1=Double.parseDouble(TFh1low.getText());
					double h2=Double.parseDouble(TFh2low.getText());
					double l=Double.parseDouble(TFLlow.getText());
					double b=Double.parseDouble(TFBlow.getText());
					if(h1<h1min){
						h1=h1min;
						String h1s=String.format("%.3f",h1);
						TFh1low.setText(h1s);
					}
					if(h1>h1max){
						h1=h1max;
						String h1s=String.format("%.3f",h1);
						TFh1low.setText(h1s);
					}
					if(h2<h2min){
						h2=h2min;
						String h2s=String.format("%.3f",h2);
						TFh2low.setText(h2s);
					}
					if(h2>h2max){
						h2=h2max;
						String h2s=String.format("%.3f",h2);
						TFh2low.setText(h2s);
					}
					if(l<Lmin){
						l=Lmin;
						String ls=String.format("%.3f",l);
						TFLlow.setText(ls);
					}
					if(l>Lmax){
						l=Lmax;
						String ls=String.format("%.3f",l);
						TFLlow.setText(ls);
					}
					if(b<Bmin){
						b=Bmin;
						String bs=String.format("%.3f",b);
						TFBlow.setText(bs);
					}
					if(b>Bmax){
						b=Bmax;
						String bs=String.format("%.3f",b);
						TFBlow.setText(bs);
					}
					
						
					
					
				}catch(Exception e111){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
			
		});
		button_1.setBounds(208, 46, 169, 23);
		panel_4.add(button_1);
		
		JLabel label_7 = new JLabel("Enter trial H1(m):");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(10, 81, 107, 24);
		panel_4.add(label_7);
		
		TFh1low = new JTextField();
		TFh1low.setText("4");
		TFh1low.setColumns(10);
		TFh1low.setBounds(127, 84, 40, 20);
		panel_4.add(TFh1low);
		
		TVh1low = new JLabel("..");
		TVh1low.setForeground(Color.ORANGE);
		TVh1low.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVh1low.setBounds(177, 87, 252, 14);
		panel_4.add(TVh1low);
		
		JLabel label_12 = new JLabel("Enter trial H2(m):");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12.setBounds(10, 116, 107, 24);
		panel_4.add(label_12);
		
		TFh2low = new JTextField();
		TFh2low.setText("2.5");
		TFh2low.setColumns(10);
		TFh2low.setBounds(127, 119, 40, 20);
		panel_4.add(TFh2low);
		
		TVh2low = new JLabel("..");
		TVh2low.setForeground(Color.ORANGE);
		TVh2low.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVh2low.setBounds(177, 122, 252, 14);
		panel_4.add(TVh2low);
		
		JLabel label_16 = new JLabel("Enter trial B(m):");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_16.setBounds(10, 151, 107, 24);
		panel_4.add(label_16);
		
		TFBlow = new JTextField();
		TFBlow.setText("8.6");
		TFBlow.setColumns(10);
		TFBlow.setBounds(127, 154, 40, 20);
		panel_4.add(TFBlow);
		
		TVBlow = new JLabel("..");
		TVBlow.setForeground(Color.ORANGE);
		TVBlow.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVBlow.setBounds(177, 157, 252, 14);
		panel_4.add(TVBlow);
		
		JLabel label_18 = new JLabel("Enter trial L(m):");
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_18.setBounds(10, 186, 107, 24);
		panel_4.add(label_18);
		
		TFLlow = new JTextField();
		TFLlow.setText("5");
		TFLlow.setColumns(10);
		TFLlow.setBounds(127, 189, 40, 20);
		panel_4.add(TFLlow);
		
		TVLlow = new JLabel("..");
		TVLlow.setForeground(Color.ORANGE);
		TVLlow.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVLlow.setBounds(177, 192, 252, 14);
		panel_4.add(TVLlow);
		
		JLabel lblDesignOfFoundationlower = new JLabel("Design of Foundation(Lower Elevation)");
		lblDesignOfFoundationlower.setForeground(Color.LIGHT_GRAY);
		lblDesignOfFoundationlower.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDesignOfFoundationlower.setBounds(10, 11, 566, 24);
		panel_4.add(lblDesignOfFoundationlower);
		
		JLabel label_21 = new JLabel("Enter top Width(m):");
		label_21.setForeground(Color.WHITE);
		label_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_21.setBounds(396, 46, 136, 24);
		panel_4.add(label_21);
		
		TFtwidthlow = new JTextField();
		TFtwidthlow.setText("0.7");
		TFtwidthlow.setColumns(10);
		TFtwidthlow.setBounds(542, 49, 40, 20);
		panel_4.add(TFtwidthlow);
		
		JLabel label_22 = new JLabel("Enter height(m):");
		label_22.setForeground(Color.WHITE);
		label_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_22.setBounds(396, 81, 113, 24);
		panel_4.add(label_22);
		
		TFhtlow = new JTextField();
		TFhtlow.setText("0.9");
		TFhtlow.setColumns(10);
		TFhtlow.setBounds(519, 84, 40, 20);
		panel_4.add(TFhtlow);
		
		JLabel label_23 = new JLabel("Enter bottom Width(m):");
		label_23.setForeground(Color.WHITE);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_23.setBounds(395, 116, 150, 24);
		panel_4.add(label_23);
		
		TFbwidthlow = new JTextField();
		TFbwidthlow.setText("2");
		TFbwidthlow.setColumns(10);
		TFbwidthlow.setBounds(555, 119, 40, 20);
		panel_4.add(TFbwidthlow);
		
		JButton button_2 = new JButton("Calculate Additional Force and distance");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ht=Double.parseDouble(TFhtlow.getText());
				double twidth=Double.parseDouble(TFtwidthlow.getText());
				double bwidth=Double.parseDouble(TFbwidthlow.getText());
				double l=Double.parseDouble(TFLlow.getText());
				double B=Double.parseDouble(TFBlow.getText());
				double A,a1,a2,a0,a;
				  
				a1=twidth;
				a2=bwidth-twidth;
				A=22*ht*(a1+0.5*a2)*l;
				a0=(a1*a1+a1*a2+0.333*a2*a2)/(2*a1+a2);
				a=B-a0;
				 String amcs=String.format("%.3f",A);
				 String amcss=String.format("%.3f",a);
				 TFAlow.setText(amcs);
				 TFadistlow.setText(amcss);
			}
		});
		button_2.setBounds(409, 151, 269, 23);
		panel_4.add(button_2);
		
		JLabel label_24 = new JLabel("Enter Retaining Force(KN):");
		label_24.setForeground(Color.WHITE);
		label_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_24.setBounds(394, 186, 169, 24);
		panel_4.add(label_24);
		
		TFAlow = new JTextField();
		TFAlow.setText("274");
		TFAlow.setColumns(10);
		TFAlow.setBounds(573, 189, 40, 20);
		panel_4.add(TFAlow);
		
		JLabel label_25 = new JLabel("Enter distance a(m):");
		label_25.setForeground(Color.WHITE);
		label_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_25.setBounds(409, 217, 130, 24);
		panel_4.add(label_25);
		
		TFadistlow = new JTextField();
		TFadistlow.setText("7.1");
		TFadistlow.setColumns(10);
		TFadistlow.setBounds(549, 220, 40, 20);
		panel_4.add(TFadistlow);
		
		JLabel label_26 = new JLabel("If Foundation is Soil then Enter Details Below:");
		label_26.setForeground(Color.ORANGE);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_26.setBounds(288, 252, 310, 24);
		panel_4.add(label_26);
		
		JLabel label_27 = new JLabel("If Foundation is Rock then Enter Details Below:");
		label_27.setForeground(Color.ORANGE);
		label_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_27.setBounds(10, 221, 310, 24);
		panel_4.add(label_27);
		
		JLabel label_28 = new JLabel("Permissible Stress(KN/sq m):");
		label_28.setForeground(Color.WHITE);
		label_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_28.setBounds(10, 250, 180, 24);
		panel_4.add(label_28);
		
		TFpermissiblelow = new JTextField();
		TFpermissiblelow.setText("450");
		TFpermissiblelow.setColumns(10);
		TFpermissiblelow.setBounds(194, 253, 40, 20);
		panel_4.add(TFpermissiblelow);
		
		JLabel label_29 = new JLabel("Friction angle:");
		label_29.setForeground(Color.WHITE);
		label_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_29.setBounds(20, 277, 97, 24);
		panel_4.add(label_29);
		
		TFfrictionlow = new JTextField();
		TFfrictionlow.setText("35");
		TFfrictionlow.setColumns(10);
		TFfrictionlow.setBounds(127, 280, 40, 20);
		panel_4.add(TFfrictionlow);
		
		JLabel label_30 = new JLabel("RQD:");
		label_30.setForeground(Color.WHITE);
		label_30.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_30.setBounds(77, 313, 40, 24);
		panel_4.add(label_30);
		
		TFklow = new JTextField();
		TFklow.setText("1.75");
		TFklow.setColumns(10);
		TFklow.setBounds(127, 316, 40, 20);
		panel_4.add(TFklow);
		
		JLabel label_31 = new JLabel("Enter Anchor Rod Details:");
		label_31.setForeground(Color.ORANGE);
		label_31.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_31.setBounds(20, 348, 180, 24);
		panel_4.add(label_31);
		
		JLabel label_32 = new JLabel("Strength(N/sq mm):");
		label_32.setForeground(Color.WHITE);
		label_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_32.setBounds(20, 371, 130, 24);
		panel_4.add(label_32);
		
		TFrodlow = new JTextField();
		TFrodlow.setText("19");
		TFrodlow.setColumns(10);
		TFrodlow.setBounds(160, 374, 40, 20);
		panel_4.add(TFrodlow);
		
		JLabel label_33 = new JLabel("Enter diameter(mm):");
		label_33.setForeground(Color.WHITE);
		label_33.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_33.setBounds(20, 406, 130, 24);
		panel_4.add(label_33);
		
		TFdiamlow = new JTextField();
		TFdiamlow.setText("25");
		TFdiamlow.setColumns(10);
		TFdiamlow.setBounds(160, 409, 40, 20);
		panel_4.add(TFdiamlow);
		
		JButton button_3 = new JButton("Check...");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					xf1.format("%s","\n\n\nDesign of Foundation of Lower Elevation: \n");
					double h1=Double.parseDouble(TFh1low.getText());
					double h2=Double.parseDouble(TFh2low.getText());
					double l=Double.parseDouble(TFLlow.getText());
					double B=Double.parseDouble(TFBlow.getText());
					double ht=Double.parseDouble(TFhtlow.getText());
					double twidth=Double.parseDouble(TFtwidthlow.getText());
					double bwidth=Double.parseDouble(TFbwidthlow.getText());
					double A=Double.parseDouble(TFAlow.getText());
					double permissible=Double.parseDouble(TFpermissiblelow.getText());
					double rod=Double.parseDouble(TFrodlow.getText());
					double k=Double.parseDouble(TFk.getText());
					double friction=Double.parseDouble(TFfrictionlow.getText());
					double a=Double.parseDouble(TFadistlow.getText());
					double diam=Double.parseDouble(TFdiamlow.getText());
					double ha=Double.parseDouble(TFhalow.getText());
		double fs=Double.parseDouble(TFfrontinclinationlow.getText());
					double bs=Double.parseDouble(TFbackinclinationlow.getText());
					double Fsl = 0;
String a22 = null;
					
					Enumeration<AbstractButton> bg=buttonGroup_6.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a22=jrd.getText();
						
							
					}
					  String a11 = null;
						
						Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
						while(bg1.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg1.nextElement();
							
							if(jrd.isSelected())
							a11=jrd.getText();
							
								
						}
						double mcn=Double.parseDouble(a11);
					
					
					 xf1.format("%s%.3f%s%s","Total Area of Retaining Wall:",A,"sq.m","\n");
					 xf1.format("%s%.3f%s%s","Distance of resultant force:",a,"m","\n");
					 double Fblock1,Fblock2,ablock1,ablock2,totalmoment,totalvertical,maincableah,maincableav,handcableav,handcableah;
					 if(a22=="Rock")
					 {
					 Fblock1=0.5*l*B*(h1+h2)*22;
					 
					 ablock1=B/3*(2*h1+h2)/(h1+h2);
					 Fblock2=0.95*B*l*22;
					 ablock2=0.5*B;
					 maincableav=0.25;
					 handcableav=0.25;
					 maincableah=h2+0.7;
					 handcableah=h2+1.95;
					 double maincableTv=tmlow*Math.sin(3.14/180*Banglow);
					 double maincableTh=tmhigh*Math.cos(3.14/180*Banglow);
					 double handcableTv=thhigh*Math.sin(3.14/180*Banglow);
					 double handcableTh=thlow*Math.cos(3.14/180*Banglow);
					 double resistingmoment=Fblock1*ablock1+Fblock2*ablock2+a*A+maincableTv*maincableav+handcableTv*handcableav;
					 double overturningmoment=maincableTh*maincableah+handcableTh*handcableah;
					 totalmoment=resistingmoment-overturningmoment;
					 totalvertical=Fblock1+Fblock2+A+maincableTv+handcableTv;
					 double totalhorizontal=maincableTh+handcableTh;
					 xf1.format("%s%s","Moment Calculations:","\n");
					 xf1.format("%s%s%s%s%s%s%s%s%s%s","Force type",",","Vertical(KN)",",","Horizontal(KN)",",","distance from toe(m)",",","moment(KNm)","\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Block 1",",",Fblock1,",","-",",",ablock1,",",Fblock1*ablock1,"\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Block 2",",",Fblock2,",","-",",",ablock2,",",Fblock2*ablock2,"\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Retaining wall",",",A,",","-",",",a,",",A*a,"\n");
					 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Main Cable Horizontal",",","-",",",maincableTh,",",maincableah,",",maincableTh*maincableah,"\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Main Cable Vertical",",",maincableTv,",","-",",",maincableav,",",maincableTv*maincableav,"\n");
					 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Hand Cable Horizontal",",","-",",",handcableTh,",",handcableah,",",handcableTh*handcableah,"\n");
					 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Hand Cable Vertical",",",handcableTv,",","-",",",handcableav,",",handcableTv*handcableav,"\n");
					 
					 xf1.format("%s%s%.3f%s%.3f%s%s%s%.3f%s","Total Vertical=",",",totalvertical,"KN,Total Horizontal=",totalhorizontal,",","Total Moment=",",",totalmoment,"KNm \n");
					 double volume=(Fblock1+Fblock2)/22;
					 double gammar=180/3.14*Math.atan(totalhorizontal/totalvertical);
					 double alpha=180/3.14*Math.atan((h1-h2)/B);
					 double bstarby2=totalmoment/(totalvertical*(1+Math.tan(3.14/180*alpha)*Math.tan(3.14/180*gammar)));
					 xf1.format("%s%.3f%s","Volume=",volume,"cu.m \n");
					 xf1.format("%s%.3f%s","gamma r=",gammar,"\n");
					 xf1.format("%s%.3f%s","bstarby2=:",bstarby2,"m \n");
					 double fsovertoppling=resistingmoment/overturningmoment;
					 if(fsovertoppling>=1.5)
					 {
						 xf1.format("%s%.3f%s","Factor of Safety Against Overtoppling=",fsovertoppling,">1.5 okay \n");
						 
					 }
					 else{
						 xf1.format("%s%.3f%s","Factor of Safety Against Overtoppling=",fsovertoppling,"<1.5 fails... please revise design \n");
					 }
					 
					 double rvdash=totalvertical*Math.cos(alpha*3.14/180)+totalhorizontal*Math.sin(alpha*3.14/180);
					 double Bdash=B/Math.cos(alpha*3.14/180);
					 double bstarby2dash=bstarby2/Math.cos(alpha*3.14/180);
					 double edash=Bdash/2-bstarby2dash;
					 double stressmax=rvdash/(Bdash*l)*(1+6*edash/Bdash);
					 double stressmin=rvdash/(Bdash*l)*(1-6*edash/Bdash);
					 double X,aten,bten,Ast,N,Nmin = 0;
					 xf1.format("%s%.3f%s","angle alpha=",alpha,"\n");
					 xf1.format("%s%.3f%s","rv dash=",rvdash,"KN \n");
					 xf1.format("%s%.3f%s","B dash=",Bdash,"m \n");
					 xf1.format("%s%.3f%s","bstarby2dash=",bstarby2dash,"m \n");
					 xf1.format("%s%.3f%s","edash=",edash,"m \n");
					 xf1.format("%s%.3f%s","Maximum Vertical Stress=",stressmax,"KN/sq.m \n");
					 xf1.format("%s%.3f%s","Minimum Vertical Stress=",stressmin,"KN/sq.m \n\n");
					 double ultimate,rhdash;
					if(stressmin<0)
					{
						xf1.format("%s%s","Since min stress is negative so Anchor Rods Are Necessary.....","\n");
						X=Bdash*stressmin/(stressmin-stressmax);
						aten=Bdash-bstarby2dash-X/3;
						bten=B-1-bstarby2dash;
						Ast=Math.abs(stressmin)*X*l*aten/(bten*2*rod)*100;
						N=k*4*Ast/(3.14*diam*diam);
						 xf1.format("%s%.3f%s","X dash=",X,"m \n");
						 xf1.format("%s%.3f%s","a=",aten,"m \n");
						 xf1.format("%s%.3f%s","b=",bten,"m \n");
						 xf1.format("%s%.3f%s","Ast=",Ast,"sq.mm \n");
						 int i=0;
						 while(i<N)
						 {
							 i++;
						 }
							 
						 N=i;
						 xf1.format("%s%d%s","Required No of anchor Rods=",i,"\n");
						 if(bstarby2<B/3){
							 xf1.format("%s%.3f%s","bstarby2<B/3=",B/3,"\n");
							 if(mcn==4)
								 Nmin=4;
							 if(mcn>4)
								 Nmin=6;
							 if(N>Nmin)
								 xf1.format("%s%.0f%s%.0f%s%.0f%s","N>Nmin=",Nmin,"(OK) provide ",N," rods of diameter=",diam,"mm \n");
							 else
							 xf1.format("%s%.0f%s%.0f%s%.0f%s","N<Nmin=",Nmin," provide ",Nmin," rods of diameter=",diam,"mm \n");
						 }
						 ultimate=4*rvdash/(3*2*bstarby2dash*l);
							rhdash=totalhorizontal*Math.cos(alpha*3.14/180)-totalvertical*Math.sin(alpha*3.14/180);
							 double as=N*3.14*diam*diam/4;
							 Fsl=(rvdash*Math.tan(3.14/180*friction)+as*0.075)/rhdash;
							 
							 if(Fsl>1.5)
								 xf1.format("%s","Check Factor of Safety for Sliding  \n");
							 xf1.format("%s","presence of Rod:  \n");
							 if(Fsl>=1.5)
								 xf1.format("%s%.3f%s%.3f%s","Fsl=",Fsl,">",1.5,"Okay \n");
							 if(Fsl<1.5)
								 xf1.format("%s%.3f%s%.3f%s","Fsl=",Fsl,"<",1.5,"Not Okay Please Revise Design \n");
					}
					rhdash=-totalvertical*Math.sin(alpha*3.14/180)+totalhorizontal*Math.cos(alpha*3.14/180);
					ultimate=4*rvdash/(3*2*bstarby2dash*l);
					 xf1.format("%s%.3f%s","Rhdash=",rhdash,"KN \n");
					if(ultimate<=permissible)
						 xf1.format("%s%.3f%s%.3f%s","ULTIMATE STRESS=",ultimate,"<",permissible,"Okay \n");
					 if(ultimate>permissible)
						 xf1.format("%s%.3f%s%.3f%s","ULTIMATE STRESS=",ultimate,"<",permissible,"Not Okay Please Revise Design \n");
					rhdash=totalhorizontal*Math.cos(alpha*3.14/180)-totalvertical*Math.sin(alpha*3.14/180);
					if(stressmin>=0){
						xf1.format("%s","Tension is not produced so no rodS are required \n");
						 
						 
						
					}
					xf1.format("%s","Check Factor of Safety for Sliding(Rod are not Present)  \n");
					 double Fsl1=(rvdash*Math.tan(3.14/180*friction))/rhdash;
					 if(Fsl1>=1.3)
						 xf1.format("%s%.3f%s%.3f%s","Fsl=",Fsl1,">",1.3,"Okay \n");
					 if(Fsl1<1.3)
						 xf1.format("%s%.3f%s%.3f%s","Fsl=",Fsl1,"<",1.3,"Not Okay Please Revise Design \n");
					 String fsslide=String.format("%.3f",Fsl);
					 String fsslide1=String.format("%.3f",Fsl1);
					 String Ultimates=String.format("%.3f",ultimate);
					 String Permissibles=String.format("%.3f",permissible);
					 String bstarby2s=String.format("%.3f",bstarby2);
					 String bby4s=String.format("%.3f",B/3);
					 String fstopps=String.format("%.3f",fsovertoppling);
					 if(Fsl>=1.5)
						 TVcheck1.setText(fsslide+">"+"1.5 OK");
						if(Fsl<1.5)
							 TVcheck1.setText(fsslide+"<"+"1.5 Not OK");	
						if(bstarby2>=B/3)
							 TVcheck2.setText(bstarby2s+">"+bby4s+"1.5 OK");	
						if(bstarby2<B/3)
							 TVcheck2.setText(bstarby2s+"<"+bby4s+"1.5 NOT OK");	
						if(fsovertoppling>=1.5)
							 TVcheck3.setText(fstopps+">"+"1.5 OK");	
						if(fsovertoppling<1.5)
							 TVcheck3.setText(fstopps+"<"+"1.5 NOT OK");	
						if(Fsl1>=1.3)
							 TVcheck4.setText(fsslide1+">"+"1.3 OK");	
						if(Fsl1<1.3)
							 TVcheck4.setText(fsslide1+"<"+"1.3 not OK");	
						if(ultimate<=permissible)
							 TVcheck5.setText(Ultimates+"<"+Permissibles+"OK");	
						if(ultimate>permissible)
							 TVcheck5.setText(Ultimates+">"+Permissibles+"NOT OK");	
					 }
					 if(a22=="Soil")
					 {
						 double frontslope=Double.parseDouble(TFfrontslopelow.getText());
						 double soildepth=Double.parseDouble(TFsoildepthlow.getText());
						 double ssangle=Double.parseDouble(TFssanglelow.getText());
						 double sswt=Double.parseDouble(TFsswtlow.getText());
						 double bfangle=Double.parseDouble(TFbfanglelow.getText());
						 double bfwt=Double.parseDouble(TFbfwtlow.getText());
						 double soilperm=Double.parseDouble(TFsoilpermlow.getText());
						 double soilemb=Double.parseDouble(TFsoilemblow.getText());
						 String ass = null;
						 double nmc;
						 Enumeration<AbstractButton> bg3=buttonGroup_1.getElements();
							while(bg3.hasMoreElements()){
								JRadioButton jrd=(JRadioButton) bg3.nextElement();
								
								if(jrd.isSelected())
								ass=jrd.getText();
								
									
							}
							nmc=Double.parseDouble(ass);
						 xf1.format("%s","\n \n \nFoundation Characterstics:  \n");
						 xf1.format("%s","Type Of Bridge:Inclined Suspended  \n");
						 xf1.format("%s","River Bank:  \n");
						 xf1.format("%s","Cable Anchorage Type:Drum Anchorage  \n");
						 xf1.format("%s","Foundation:On Soil  \n");
						 xf1.format("%s","\n\nCable Structural Characterstics:  \n");
						 xf1.format("%s%.3f%s","No. Of Main Cable(Nm):     ",nmc," \n");
						 xf1.format("%s%.3f%s","Tension of Main Cable(Tm):    ",tmhigh,"KN \n");
						 xf1.format("%s%.3f%s","Tension of Hand Cable(Th):    ",thhigh,"KN \n");
						 xf1.format("%s%.3f%s","Cable Angle at FUll Load(Bf):    ",Banghigh,"degree \n");
						 xf1.format("%s%.3f%s","Front Slope of Rock(e1):    ",frontslope,"degree \n");
						 xf1.format("%s","\n\nSoil Parameters:  \n");
						 xf1.format("%s%.3f%s","Sub-Soil Depth:    ",soildepth,"m \n");
						 xf1.format("%s%.3f%s","Friction Angle of Sub-Soil:    ",ssangle,"degree \n");
						 xf1.format("%s%.3f%s","Unit weight of Sub-Soil:    ",sswt,"KN/sq. m \n");
						 xf1.format("%s%.3f%s","Friction Angle of Backfill SOil:    ",bfangle,"degree \n");
						 xf1.format("%s%.3f%s","Unit weight of Backfill Soil:    ",bfwt,"KN/sq. m \n");
						 
						 xf1.format("%s%.3f%s","Ground Bearing Pressure:    ",soilperm,"KN/sq. m \n");
						 xf1.format("%s%s%s","Ground Water Depth at:    ","Very Deep","degree \n");
						 xf1.format("%s%.3f%s","Minimum Embedded Depth:    ",soilemb,"m \n");
						 xf1.format("%s","\n\nFoundation Dimension:  \n");
						 xf1.format("%s%s%s%s%s%s","Foundation Dimensions(m)",",","Minimum",",","Maximum","\n");
						 xf1.format("%s%s%.3f%s%.3f%s","Front Height h1:",",",h1min,",",h1max,"\n");
						 xf1.format("%s%s%.3f%s%.3f%s","Back Height h2:",",",h2min,",",h2max,"\n");
						 xf1.format("%s%s%.3f%s%.3f%s","Breadth B:",",",Bmin,",",Bmax,"\n");
						 xf1.format("%s%s%.3f%s%.3f%s","Length L:",",",Lmin,",",Lmax,"\n");
						 xf1.format("%s","\n\nTrial Values of Dimension:  \n");
						 xf1.format("%s%s%s%s","Foundation Dimensions(m)",",","value","\n");
						 xf1.format("%s%s%.3f%s","Front Height h1:",",",h1,"\n");
						 xf1.format("%s%s%.3f%s","Back Height h2:",",",h2,"\n");
						 xf1.format("%s%s%.3f%s","Breadth B:",",",B,"\n");
						 xf1.format("%s%s%.3f%s","Length L:",",",l,"\n");
						 xf1.format("%s","Remark: \nThe dimension compiled were found by iteration with regard to economic design\n");
						 xf1.format("%s","\n\nActive Pressure:  \n");
						 xf1.format("%s%.3f%s","Active Pressure Height:   ",ha,"m \n");
						 xf1.format("%s%.3f%s","Embedded Depth:    ",soilemb,"m \n");
						 xf1.format("%s%.3f%s","Inclination of Front Slope:    ",fs,"degree \n");
						 xf1.format("%s%.3f%s","Inclination of Back Slope:    ",bs,"degree \n");
						 xf1.format("%s%.3f%s","Unit Weight of Dry Masonary:    ",17.0,"KN/cu.m \n");
						 
						 xf1.format("%s%.3f%s","Unit weight of Cement:     ",22.0,"KN/cu.m \n");
						 xf1.format("%s%.3f%s","Unit weight of Concrete:    ",22.0,"KN/cu.m \n");
						 xf1.format("%s%.3f%s%s","\n\nTotal Area of Retaining Wall:",A,"sq.m","\n");
						 xf1.format("%s%.3f%s%s","Distance of resultant force:",a,"m","\n");
						 double ah,sigma,rootvitra;
						 sigma=0.66667*bfangle;
						 double bfanglerad=3.14/180*bfangle;
						 double sigmarad=3.14/180*sigma;
						 double bsrad=3.14/180*bs;
						 rootvitra=Math.sin(bfanglerad+sigmarad)*Math.sin(bfanglerad-bsrad)/(Math.cos(sigmarad)*Math.cos(bsrad));
						 ah=Math.cos(bfanglerad)*Math.cos(bfanglerad)/((1+Math.sqrt(rootvitra))*(1+Math.sqrt(rootvitra)));
						 double alpha=180/3.14*Math.atan((h1-h2)/B);
						 xf1.format("%s","\n\nCofficient of Active Pressure:  \n");
						 xf1.format("%s%.3f%s","Inside Root=   ",rootvitra," \n");
						 xf1.format("%s%.3f%s","sigma:    ",sigma," \n");
						 xf1.format("%s%.3f%s","alpha ah:    ",ah," \n");
						 xf1.format("%s%s","\n\nBase Inclination:    "," \n");
						 xf1.format("%s%.3f%s","tanalpha(h1-h2)/B:    ",(h1-h2)/B," \n");
						 xf1.format("%s%.3f%s","alpha:    ",alpha,"degree \n");
						 if(alpha<=15)
							 xf1.format("%s","alpha < 15 degree ...........OK:  \n");
						 if(alpha>15)
							 xf1.format("%s","alpha > 15 degree ...........NOT OK Please Revise Design:  \n");
						 
						 
						 
						 
						
						 Fblock1=0.5*l*B*(h1+h2)*22;
						 
						 ablock1=B/3*(2*h1+h2)/(h1+h2);
						 Fblock2=0.95*(B-1.2)*l*22;
						 ablock2=0.5*B+0.6;
						 maincableav=1.45;
						 handcableav=1.45;
						 maincableah=h2+0.7;
						 handcableah=h2+1.95;
						 double activeh=0.5*ah*ha*ha*l*bfwt;
						 double activedisth=ha/3-h1+h2;
						 double activev=activeh*Math.tan(sigmarad);
						 double activedistv=B;
						 
						 double maincableTv=tmlow*Math.sin(3.14/180*Banglow);
						 double maincableTh=tmlow*Math.cos(3.14/180*Banglow);
						 double handcableTv=thlow*Math.sin(3.14/180*Banglow);
						 double handcableTh=thlow*Math.cos(3.14/180*Banglow);
						 double resistingmoment=Fblock1*ablock1+Fblock2*ablock2+a*A+maincableTv*maincableav+handcableTv*handcableav+activev*activedistv;
						 double overturningmoment=maincableTh*maincableah+handcableTh*handcableah+activeh*activedisth;
						 totalmoment=resistingmoment-overturningmoment;
						 totalvertical=Fblock1+Fblock2+A+maincableTv+handcableTv+activev;
						 double totalhorizontal=maincableTh+handcableTh+activeh;
						 xf1.format("%s%s","Moment Calculations:","\n");
						 xf1.format("%s%s%s%s%s%s%s%s%s%s","Force type",",","Vertical(KN)",",","Horizontal(KN)",",","distance from toe(m)",",","moment(KNm)","\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Block 1",",",Fblock1,",","-",",",ablock1,",",Fblock1*ablock1,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Block 2",",",Fblock2,",","-",",",ablock2,",",Fblock2*ablock2,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Retaining wall",",",A,",","-",",",a,",",A*a,"\n");
						 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Active Earth Pressure(Horizontal):",",","-",",",activeh,",",activedisth,",",activeh*activedisth,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Active Earth Pressure(Vertical)",",",activev,",","-",",",activedistv,",",activev*activedistv,"\n");
						 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Main Cable Horizontal",",","-",",",maincableTh,",",maincableah,",",maincableTh*maincableah,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Main Cable Vertical",",",maincableTv,",","-",",",maincableav,",",maincableTv*maincableav,"\n");
						 xf1.format("%s%s%s%s%.3f%s%.3f%s%.3f%s","Hand Cable Horizontal",",","-",",",handcableTh,",",handcableah,",",handcableTh*handcableah,"\n");
						 xf1.format("%s%s%.3f%s%s%s%.3f%s%.3f%s","Hand Cable Vertical",",",handcableTv,",","-",",",handcableav,",",handcableTv*handcableav,"\n");
						 
						 xf1.format("%s%s%.3f%s%.3f%s%s%s%.3f%s","Total Vertical=",",",totalvertical,"KN,Total Horizontal=",totalhorizontal,",","Total Moment=",",",totalmoment,"KNm \n");
						 double volume=(Fblock1+Fblock2)/22;
						 double gammar=180/3.14*Math.atan(totalhorizontal/totalvertical);
						 alpha=180/3.14*Math.atan((h1-h2)/B);
						 double bstarby2=totalmoment/(totalvertical*(1+Math.tan(3.14/180*alpha)*Math.tan(3.14/180*gammar)));
						 xf1.format("%s%.3f%s","Volume=",volume,"cu.m \n");
						 xf1.format("%s%.3f%s","OverTurning Moment(M-)=",overturningmoment,"KNm \n");
						 xf1.format("%s%.3f%s","Resisting Moment(M+)=",resistingmoment,"KNm \n");
						 xf1.format("%s%.3f%s","gamma r=",gammar,"\n");
						 xf1.format("%s%.3f%s","bstarby2=:",bstarby2,"m \n");
						 if(bstarby2>=B/4)
						 {
							 xf1.format("%s%.3f%s","bstarby2>B/4=",B/4," Okay.. \n");
							 
						 }
						 if(bstarby2<B/4)
						 {
							 xf1.format("%s%.3f%s","bstarby2<B/4=",B/4,"Not Okay.. \n");
							 
						 }
						 double slide=Math.tan(ssangle*3.14/180)/(Math.tan(gammar*3.14/180-alpha*3.14/180));
						 xf1.format("%s%.3f%s","\n\nFactor of Safety Against Sliding(Fsl)=",slide," \n");
						 
						 double fsovertoppling=resistingmoment/overturningmoment;
						 if(fsovertoppling>=1.5)
						 {
							 xf1.format("%s%.3f%s","\n\nFactor of Safety Against Overtoppling=",fsovertoppling,">1.5 okay \n");
							 
						 }
						 else{
							 xf1.format("%s%.3f%s","\n\nFactor of Safety Against Overtoppling=",fsovertoppling,"<1.5 fails... please revise design \n");
						 }
						 xf1.format("%s%s","\n\nUltimate bearing Capacity and safety factor against shear failure of ground:","\n");
						 double ssanglerad=ssangle*3.14/180;
						 double eb=Double.parseDouble(TFeb.getText());
						 double lstarinfl=2*bstarby2*Math.tan(0.785+0.5*ssanglerad)*Math.exp(0.5*3.14*Math.tan(ssanglerad));
						 double surcharge=sswt*soilemb;
						 double Nq=Math.tan(0.785+0.5*ssanglerad)*Math.tan(0.785+0.5*ssanglerad)*Math.exp(3.14*Math.tan(ssanglerad));
						 double Ny=1.8*(Nq-1)*Math.tan(ssanglerad);
						 double Sq=1+bstarby2*2/l*Math.tan(ssanglerad);
						 double Sy=1-0.4*bstarby2*2/l;
						 double dq=1+0.035*Math.tan(ssanglerad)*(1-Math.sin(ssanglerad))*(1-Math.sin(ssanglerad))*180/3.14*Math.atan(0.5*soilemb/bstarby2);
						 double dy=1;
						 double nnn=Math.tan(3.14/180.00*gammar-3.14/180.00*alpha);
						 double iq=Math.pow((1-0.5*nnn),5.0);
						 double iy=Math.pow((1-(0.7-0.0022*alpha)*nnn),5);
						 double bq=Math.exp(-0.035*alpha*Math.tan(ssanglerad));
						 double by=Math.exp(-0.047*alpha*Math.tan(ssanglerad));
						 double g=Math.pow((1-0.5*Math.tan(eb*3.14/180)),5);
						 double pstar=bstarby2*2*l*(surcharge*Nq*Sq*dq*iq*bq+0.5*sswt*bstarby2*2*Ny*Sy*dy*iy*by)*g;
						 double fsbearing=pstar/totalvertical;
						 xf1.format("%s%.3f%s","Lstarinfl=",lstarinfl,"m \n");
						 xf1.format("%s","\nFrom General Arrangement: \n");
						 xf1.format("%s%.3f%s%.3f%s","At L*infl=",lstarinfl,"m e1=eb=",eb,"degree \n");
						 xf1.format("%s%.3f%s","Surcharge Load(q+gamma1*t=",surcharge,"KN/sq.m(q=0) \n");
						 xf1.format("%s","Bearing Capacity Factors: \n");
						 xf1.format("%s%.3f%s","Nq=",Nq," \n");
						 xf1.format("%s%.3f%s","Ny=",Ny," \n");
						 xf1.format("%s","Shape Correction Factors: \n");
						 xf1.format("%s%.3f%s","Sq=",Sq,"\n");
						 xf1.format("%s%.3f%s","Sy=",Sy,"\n");
						 xf1.format("%s","Inclination of Loads: \n");
						 xf1.format("%s%.3f%s","iq=",iq," \n");
						 xf1.format("%s%.3f%s","iy=",iy," \n");
						 xf1.format("%s","Depth Correction Factors: \n");
						 xf1.format("%s%.3f%s","dq=",dq," \n");
						 xf1.format("%s%.3f%s","dy=",dy," \n");
						 xf1.format("%s","Inclination of Foundation Base: \n");
						 xf1.format("%s%.3f%s","bq=",bq," \n");
						 xf1.format("%s%.3f%s","by=",by," \n");
						 xf1.format("%s","Inclination of Base Line:(assume eb=e \n");
						 xf1.format("%s%.3f%s","gq=",g," \n");
						 xf1.format("%s%.3f%s","gy=",g," \n");
						 xf1.format("%s","Shear Resistance of Ground: \n");
						 xf1.format("%s%.3f%s","Pstar=",pstar," \n");
						 if(fsbearing>=2)
						 xf1.format("%s%.3f%s","Factor of safety against shear=",fsbearing,">2 okay \n");
						 if(fsbearing<2)
							 xf1.format("%s%.3f%s","Factor of safety against shear=",fsbearing,"<2 Not okay... please revise design \n");
						 
						 double rvdash=totalvertical*Math.cos(alpha*3.14/180)+totalhorizontal*Math.sin(alpha*3.14/180);
						 double Bdash=B/Math.cos(alpha*3.14/180);
						 double bstarby2dash=bstarby2/Math.cos(alpha*3.14/180);
						 double edash=Bdash/2-bstarby2dash;
						 double stressmax=rvdash/(Bdash*l)*(1+6*edash/Bdash);
						 double stressmin=rvdash/(Bdash*l)*(1-6*edash/Bdash);
						 double X,aten,bten,Ast,N,Nmin = 0;
						 xf1.format("%s%.3f%s","angle alpha=",alpha,"\n");
						 xf1.format("%s%.3f%s","rv dash=",rvdash,"KN \n");
						 xf1.format("%s%.3f%s","B dash=",Bdash,"m \n");
						 xf1.format("%s%.3f%s","bstarby2dash=",bstarby2dash,"m \n");
						 xf1.format("%s%.3f%s","edash=",edash,"m \n");
						 xf1.format("%s%.3f%s","Maximum Vertical Stress=",stressmax,"KN/sq.m \n");
						 xf1.format("%s%.3f%s","Minimum Vertical Stress=",stressmin,"KN/sq.m \n\n");
						 if(stressmax<=soilperm)
						 {
							 xf1.format("%s%.3f%s","Max. Stress<",soilperm,"KN/sq.m OK.. \n\n"); 
						 }
						 if(stressmax>soilperm)
						 {
							 xf1.format("%s%.3f%s","Max. Stress>",soilperm,"KN/sq.m NOT OK..please revise design \n\n"); 
						 }
						 double ultimate,rhdash,alpharad=alpha*3.14/180;
						 Ast=stressmax*l/(0.414)*(1.2*Math.cos(alpharad)-h2*Math.sin(alpharad))*(1.2*Math.cos(alpharad)-h2*Math.sin(alpharad))/(h2*Math.cos(alpharad)+1.2*Math.sin(alpharad)-0.2);
						double astmin=0.02/100*h2*l*1000000;
						N=Math.max(Ast,astmin)*4.0/(3.14*diam*diam);
						 xf1.format("%s","\n\nReinforcement of Ground: \n");
						 xf1.format("%s%.3f%s","Ast=",Ast,"sq.mm \n");
						 xf1.format("%s%.3f%s","Ast min=",astmin,"sq.m \n\n");
							
							
							 int i=0;
							 while(i<N)
							 {
								 i++;
							 }
							 xf1.format("%s%d%s%.3f%s","No of Rods Required=",i,"-",diam,"mm ribbed tor steel rod \n");
							
						
							 String fsslide=String.format("%.2f",slide);
							 String bstarby2s=String.format("%.2f",bstarby2);
							 String fstopps=String.format("%.2f",fsovertoppling);
							 String fsshears=String.format("%.2f",fsbearing);
							 String fsbearings=String.format("%.2f",A);
							 String bby4s=String.format("%.2f",B/4);
							 String groundbearings=String.format("%.2f",soilperm);
							 String stressmaxs=String.format("%.2f",stressmax);
							if(slide>=1.5)
							 TVcheck1low.setText(fsslide+">"+"1.5 OK");
							if(slide<1.5)
								 TVcheck1low.setText(fsslide+"<"+"1.5 Not OK");	
							if(bstarby2>=B/4)
								 TVcheck2low.setText(bstarby2s+">"+bby4s+"1.5 OK");	
							if(bstarby2<B/4)
								 TVcheck2low.setText(bstarby2s+"<"+bby4s+"1.5 NOT OK");	
							if(fsovertoppling>=1.5)
								 TVcheck3low.setText(fstopps+">"+"1.5 OK");	
							if(fsovertoppling<1.5)
								 TVcheck3low.setText(fstopps+"<"+"1.5 NOT OK");	
							if(fsbearing>=2)
								 TVcheck4low.setText(fsshears+">"+"2 OK");	
							if(fsbearing<2)
								 TVcheck4low.setText(fsshears+"<"+"2 not OK");	
							if(stressmax<=soilperm)
								 TVcheck5low.setText(stressmaxs+"<"+groundbearings+"OK");	
							if(stressmax>soilperm)
								 TVcheck5low.setText(stressmaxs+">"+groundbearings+"NOT OK");	
							
							xf1.close();
					 }
					 
				}catch(Exception e110){
					JOptionPane.showMessageDialog(null,e110);
				}
			}
		});
		button_3.setBounds(127, 479, 89, 23);
		panel_4.add(button_3);
		
		JLabel label_34 = new JLabel("sliding:");
		label_34.setForeground(Color.CYAN);
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_34.setBounds(10, 514, 89, 20);
		panel_4.add(label_34);
		
		JLabel label_35 = new JLabel("bstarby2:");
		label_35.setForeground(Color.CYAN);
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_35.setBounds(145, 513, 89, 20);
		panel_4.add(label_35);
		
		JLabel label_36 = new JLabel("toppling:");
		label_36.setForeground(Color.CYAN);
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_36.setBounds(288, 514, 89, 20);
		panel_4.add(label_36);
		
		JLabel label_37 = new JLabel("ground shear:");
		label_37.setForeground(Color.CYAN);
		label_37.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_37.setBounds(443, 514, 89, 20);
		panel_4.add(label_37);
		
		JLabel label_38 = new JLabel("Ground Bearing:");
		label_38.setForeground(Color.CYAN);
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_38.setBounds(589, 514, 113, 20);
		panel_4.add(label_38);
		
		TVcheck5low = new JLabel("..");
		TVcheck5low.setForeground(Color.WHITE);
		TVcheck5low.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck5low.setBounds(594, 534, 136, 24);
		panel_4.add(TVcheck5low);
		
		TVcheck4low = new JLabel("..");
		TVcheck4low.setForeground(Color.WHITE);
		TVcheck4low.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck4low.setBounds(455, 534, 140, 24);
		panel_4.add(TVcheck4low);
		
		TVcheck3low = new JLabel("..");
		TVcheck3low.setForeground(Color.WHITE);
		TVcheck3low.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck3low.setBounds(298, 534, 140, 24);
		panel_4.add(TVcheck3low);
		
		TVcheck2low = new JLabel("..");
		TVcheck2low.setForeground(Color.WHITE);
		TVcheck2low.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck2low.setBounds(160, 534, 130, 24);
		panel_4.add(TVcheck2low);
		
		TVcheck1low = new JLabel("..");
		TVcheck1low.setForeground(Color.WHITE);
		TVcheck1low.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVcheck1low.setBounds(10, 534, 118, 24);
		panel_4.add(TVcheck1low);
		
		JLabel label_44 = new JLabel("Sub-Soil Depth(m):");
		label_44.setForeground(Color.WHITE);
		label_44.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_44.setBounds(277, 282, 118, 24);
		panel_4.add(label_44);
		
		TFsoildepthlow = new JTextField();
		TFsoildepthlow.setText("9");
		TFsoildepthlow.setColumns(10);
		TFsoildepthlow.setBounds(405, 285, 40, 20);
		panel_4.add(TFsoildepthlow);
		
		JLabel label_45 = new JLabel("Frict. Angle of SS:");
		label_45.setForeground(Color.WHITE);
		label_45.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_45.setBounds(277, 317, 118, 24);
		panel_4.add(label_45);
		
		TFssanglelow = new JTextField();
		TFssanglelow.setText("30");
		TFssanglelow.setColumns(10);
		TFssanglelow.setBounds(405, 320, 40, 20);
		panel_4.add(TFssanglelow);
		
		JLabel label_46 = new JLabel("Unit Wt. of SS:");
		label_46.setForeground(Color.WHITE);
		label_46.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_46.setBounds(288, 352, 107, 24);
		panel_4.add(label_46);
		
		TFsswtlow = new JTextField();
		TFsswtlow.setText("18");
		TFsswtlow.setColumns(10);
		TFsswtlow.setBounds(405, 355, 40, 20);
		panel_4.add(TFsswtlow);
		
		JLabel label_47 = new JLabel("Frict. Angle of Back Fill:");
		label_47.setForeground(Color.WHITE);
		label_47.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_47.setBounds(245, 387, 150, 24);
		panel_4.add(label_47);
		
		TFbfanglelow = new JTextField();
		TFbfanglelow.setText("22");
		TFbfanglelow.setColumns(10);
		TFbfanglelow.setBounds(405, 390, 40, 20);
		panel_4.add(TFbfanglelow);
		
		JLabel label_48 = new JLabel("Unit Wt. of Back Fill:");
		label_48.setForeground(Color.WHITE);
		label_48.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_48.setBounds(255, 422, 140, 24);
		panel_4.add(label_48);
		
		TFbfwtlow = new JTextField();
		TFbfwtlow.setText("17");
		TFbfwtlow.setColumns(10);
		TFbfwtlow.setBounds(405, 425, 40, 20);
		panel_4.add(TFbfwtlow);
		
		JLabel label_49 = new JLabel("inclination eb=");
		label_49.setForeground(Color.WHITE);
		label_49.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_49.setBounds(298, 457, 97, 24);
		panel_4.add(label_49);
		
		TFeblow = new JTextField();
		TFeblow.setText("20.7");
		TFeblow.setColumns(10);
		TFeblow.setBounds(405, 460, 40, 20);
		panel_4.add(TFeblow);
		
		JLabel label_50 = new JLabel("Back Slope Inclination:");
		label_50.setForeground(Color.WHITE);
		label_50.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_50.setBounds(486, 441, 150, 24);
		panel_4.add(label_50);
		
		TFbackinclinationlow = new JTextField();
		TFbackinclinationlow.setText("11");
		TFbackinclinationlow.setColumns(10);
		TFbackinclinationlow.setBounds(662, 444, 40, 20);
		panel_4.add(TFbackinclinationlow);
		
		TFfrontinclinationlow = new JTextField();
		TFfrontinclinationlow.setText("20.5");
		TFfrontinclinationlow.setColumns(10);
		TFfrontinclinationlow.setBounds(662, 409, 40, 20);
		panel_4.add(TFfrontinclinationlow);
		
		JLabel label_51 = new JLabel("Front Slope Inclination:");
		label_51.setForeground(Color.WHITE);
		label_51.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_51.setBounds(477, 406, 159, 24);
		panel_4.add(label_51);
		
		JLabel label_52 = new JLabel("Active pressure height(ha):");
		label_52.setForeground(Color.WHITE);
		label_52.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_52.setBounds(467, 374, 169, 24);
		panel_4.add(label_52);
		
		TFhalow = new JTextField();
		TFhalow.setText("6");
		TFhalow.setColumns(10);
		TFhalow.setBounds(662, 377, 40, 20);
		panel_4.add(TFhalow);
		
		TFfrontslopelow = new JTextField();
		TFfrontslopelow.setText("9");
		TFfrontslopelow.setColumns(10);
		TFfrontslopelow.setBounds(662, 351, 40, 20);
		panel_4.add(TFfrontslopelow);
		
		JLabel label_53 = new JLabel("Front Slope of Rock:");
		label_53.setForeground(Color.WHITE);
		label_53.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_53.setBounds(500, 348, 136, 24);
		panel_4.add(label_53);
		
		JLabel label_54 = new JLabel("Embedded Depth(m):");
		label_54.setForeground(Color.WHITE);
		label_54.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_54.setBounds(486, 313, 150, 24);
		panel_4.add(label_54);
		
		TFsoilemblow = new JTextField();
		TFsoilemblow.setText("2.5");
		TFsoilemblow.setColumns(10);
		TFsoilemblow.setBounds(662, 316, 40, 20);
		panel_4.add(TFsoilemblow);
		
		TFsoilpermlow = new JTextField();
		TFsoilpermlow.setText("300");
		TFsoilpermlow.setColumns(10);
		TFsoilpermlow.setBounds(662, 285, 40, 20);
		panel_4.add(TFsoilpermlow);
		
		JLabel label_55 = new JLabel("Ground Bearing Pressure(Perm.):");
		label_55.setForeground(Color.WHITE);
		label_55.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_55.setBounds(455, 282, 208, 24);
		panel_4.add(label_55);
		
		JLabel label_9 = new JLabel("Enter Retaining Wall Detail:");
		label_9.setForeground(Color.ORANGE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(415, 18, 180, 24);
		panel_4.add(label_9);
		
	}
}
