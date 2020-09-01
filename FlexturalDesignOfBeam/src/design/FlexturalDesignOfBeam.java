package design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class FlexturalDesignOfBeam {

	private JFrame frmDesignOfBeam;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField TFdepth;
	private JTextField TFwidth;
	private JTextField TFdiam1;
	private JTextField TFno1;
	private JTextField TFno2;
	private JTextField TFdiam2;
	private JTextField TFno3;
	private JTextField TFdiam3;
	private JLabel TVresult;
	private JLabel TVmr;
	
	private JLabel TVsection;
	private JLabel TVxu;
	private JLabel TVbalwid;
	static double[][] myarray;
	private JTextField TFcdiam;
	private JTextField TFcno;
	private JTextField TFtdiam;
	private JTextField TFtno;
	private JTextField TFcc;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JTextField TFbm;
	private JTextField TFspan;
	private JTextField TFudl;
	private JTextField TFfos;
	private JTextField TFodepth;
	private JTextField TFdwidth;
	private JTextField TFtcc;
	private JTextField TFccc;
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private JTextField TFratio;
	private JTextField TFrwidth;
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlexturalDesignOfBeam window = new FlexturalDesignOfBeam();
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
	public FlexturalDesignOfBeam() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDesignOfBeam = new JFrame();
		frmDesignOfBeam.setTitle("Design Of Beam In Flexture");
		frmDesignOfBeam.getContentPane().setBackground(Color.DARK_GRAY);
		frmDesignOfBeam.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 60, 817, 654);
		frmDesignOfBeam.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 102));
		panel.setForeground(new Color(51, 102, 102));
		tabbedPane.addTab("Analysis(Moment Resistance Calculator)", null, panel, null);
		tabbedPane.setBackgroundAt(0, new Color(51, 102, 102));
		panel.setLayout(null);
		
		JLabel lblEnterGradeOf = new JLabel("Enter grade of Steel(fy):");
		lblEnterGradeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterGradeOf.setForeground(new Color(0, 0, 0));
		lblEnterGradeOf.setBounds(247, 11, 179, 26);
		panel.add(lblEnterGradeOf);
		
		JRadioButton radioButton = new JRadioButton("250");
		buttonGroup.add(radioButton);
		radioButton.setBounds(243, 44, 80, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("415");
		radioButton_1.setSelected(true);
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(325, 44, 80, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("500");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(407, 44, 80, 23);
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("550");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(243, 70, 80, 23);
		panel.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("600");
		buttonGroup.add(radioButton_4);
		radioButton_4.setBounds(325, 70, 80, 23);
		panel.add(radioButton_4);
		
		JLabel lblEnterGradeOf_1 = new JLabel("Enter grade of Concrete(fck):");
		lblEnterGradeOf_1.setForeground(Color.BLACK);
		lblEnterGradeOf_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterGradeOf_1.setBounds(247, 106, 183, 26);
		panel.add(lblEnterGradeOf_1);
		
		JRadioButton radioButton_5 = new JRadioButton("20");
		radioButton_5.setSelected(true);
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(247, 139, 109, 23);
		panel.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("25");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setBounds(360, 139, 109, 23);
		panel.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("30");
		buttonGroup_1.add(radioButton_7);
		radioButton_7.setBounds(247, 165, 109, 23);
		panel.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("35");
		buttonGroup_1.add(radioButton_8);
		radioButton_8.setBounds(360, 165, 109, 23);
		panel.add(radioButton_8);
		
		JLabel lblFillNecessaryData = new JLabel("Fill Necessary Data:");
		lblFillNecessaryData.setForeground(Color.BLACK);
		lblFillNecessaryData.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblFillNecessaryData.setBounds(247, 195, 183, 26);
		panel.add(lblFillNecessaryData);
		
		JLabel lblOverallDepthmm = new JLabel("Effective Depth(mm):");
		lblOverallDepthmm.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblOverallDepthmm.setBounds(247, 232, 126, 26);
		panel.add(lblOverallDepthmm);
		
		TFdepth = new JTextField();
		TFdepth.setText("460");
		TFdepth.setBounds(383, 236, 86, 20);
		panel.add(TFdepth);
		TFdepth.setColumns(10);
		
		JLabel lblWidthmm = new JLabel("Width(mm):");
		lblWidthmm.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblWidthmm.setBounds(247, 269, 126, 26);
		panel.add(lblWidthmm);
		
		TFwidth = new JTextField();
		TFwidth.setText("250");
		TFwidth.setBounds(383, 275, 86, 20);
		panel.add(TFwidth);
		TFwidth.setColumns(10);
		
		JLabel lblDiameterWithRespective = new JLabel("Fill Longitudinal Bar Details:");
		lblDiameterWithRespective.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblDiameterWithRespective.setBounds(10, 351, 197, 20);
		panel.add(lblDiameterWithRespective);
		
		JLabel lblDiameter = new JLabel("Diameter(mm)");
		lblDiameter.setBounds(10, 382, 86, 14);
		panel.add(lblDiameter);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(106, 382, 46, 14);
		panel.add(lblNumber);
		
		TFdiam1 = new JTextField();
		TFdiam1.setText("20");
		TFdiam1.setBounds(6, 396, 61, 20);
		panel.add(TFdiam1);
		TFdiam1.setColumns(10);
		
		TFno1 = new JTextField();
		TFno1.setText("6");
		TFno1.setColumns(10);
		TFno1.setBounds(94, 396, 61, 20);
		panel.add(TFno1);
		
		TFno2 = new JTextField();
		TFno2.setText("0");
		TFno2.setColumns(10);
		TFno2.setBounds(94, 427, 61, 20);
		panel.add(TFno2);
		
		TFdiam2 = new JTextField();
		TFdiam2.setText("0");
		TFdiam2.setColumns(10);
		TFdiam2.setBounds(6, 427, 61, 20);
		panel.add(TFdiam2);
		
		TFno3 = new JTextField();
		TFno3.setText("0");
		TFno3.setColumns(10);
		TFno3.setBounds(94, 458, 61, 20);
		panel.add(TFno3);
		
		TFdiam3 = new JTextField();
		TFdiam3.setText("0");
		TFdiam3.setColumns(10);
		TFdiam3.setBounds(6, 458, 61, 20);
		panel.add(TFdiam3);
		
		
		
		JButton btnCalculateMr = new JButton("Analyse SR section");
		
		btnCalculateMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double diameter1=Double.parseDouble(TFdiam1.getText());
					double diameter2=Double.parseDouble(TFdiam2.getText());
					double diameter3=Double.parseDouble(TFdiam3.getText());
					double no1=Double.parseDouble(TFno1.getText());
					double no2=Double.parseDouble(TFno2.getText());
					double no3=Double.parseDouble(TFno3.getText());
					double depth=Double.parseDouble(TFdepth.getText());
					double width=Double.parseDouble(TFwidth.getText());
					
					String a = null;
					double ast=(no1*3.14*diameter1*diameter1+no2*3.14*diameter2*diameter2+no3*3.14*diameter3*diameter3)/4;
					
					
					
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
					double xu=0.87*ast*steel/(0.36*concrete*width);
					double xul=(0.0035*depth)/(0.0055+0.87*steel/(2*100000));
					double temp=0;
					double fs=0;double es=0;
					double MR;
					myarray=new double[20][20];
					myarray[0][0]=0.00144;myarray[0][1]=288.7;
					myarray[1][0]=0.00163;myarray[1][1]=306.7;
					myarray[2][0]=0.00192;myarray[2][1]=324.8;
					myarray[3][0]=0.00241;myarray[3][1]=342.8;
					myarray[4][0]=0.00276;myarray[4][1]=351.8;
					myarray[5][0]=0.00380;myarray[5][1]=360.9;
					fs=0;
					if(xu<xul)
					{
						MR=0.36*concrete*xu*width*(depth-0.416*xu);
						String mrs=String.format("%.3f",MR/1000000);
						TVmr.setText(mrs+"KNm");
						String xus=String.format("%.3f",xu);
						TVxu.setText(xus+"mm");
						TVsection.setText("Underreinforced");
						
					}
					
					
					else{
						xu=xul;
						do
						{
							temp=xu;
							
							es=0.0035*(depth-xu)/xu-0.001;
							
						
							
								for(int i=0;i<6;i++){
									if(es>myarray[i][0]&&es<myarray[i+1][0]){
									fs=myarray[i][1]+(myarray[i+1][1]-myarray[i][1])*(es-myarray[i][0])/(myarray[i+1][0]-myarray[i][0]);
									}
								}
								xu=(fs*ast)/(0.36*concrete*width);
								if(fs>361)
									JOptionPane.showMessageDialog(null,"spacing between bars pugena");
						}while(Math.abs(temp-xu)>0.0001);
							
							
									
						
						MR=0.36*concrete*xu*width*(depth-0.416*xu)/1000000;
						String mrs=String.format("%.3f",MR);
						TVmr.setText(mrs+"KNm");
						TVsection.setText("Overreinforced");
						String xus=String.format("%.3f",xu);
						TVxu.setText(xus+"mm");
					}

					
					
					
				
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}

			
		});
		btnCalculateMr.setBounds(10, 489, 145, 23);
		panel.add(btnCalculateMr);
		
		JLabel lblTheMomentOf = new JLabel("Depth of neutral axis:");
		lblTheMomentOf.setBounds(216, 538, 151, 14);
		panel.add(lblTheMomentOf);
		
		JLabel lblTypeOfSectio = new JLabel("TYPE of Section:");
		lblTypeOfSectio.setBounds(243, 563, 141, 14);
		panel.add(lblTypeOfSectio);
		
		TVmr = new JLabel("0.0KNM");
		TVmr.setForeground(new Color(0, 0, 128));
		TVmr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		TVmr.setBounds(360, 587, 194, 14);
		panel.add(TVmr);
		
		TVsection = new JLabel(".....");
		TVsection.setForeground(new Color(0, 0, 128));
		TVsection.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		TVsection.setBounds(360, 562, 148, 14);
		panel.add(TVsection);
		
		JLabel lblputFor = new JLabel("(put 0 for rest)");
		lblputFor.setBounds(170, 430, 86, 14);
		panel.add(lblputFor);
		
		JLabel lblMomentOfResistance = new JLabel("Moment of Resistance:");
		lblMomentOfResistance.setBounds(216, 588, 172, 14);
		panel.add(lblMomentOfResistance);
		
	TVxu = new JLabel("0.0");
		TVxu.setForeground(new Color(0, 0, 128));
		TVxu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		TVxu.setBounds(370, 537, 132, 14);
		panel.add(TVxu);
		
		JLabel lblFillForSingly = new JLabel("Fill for Singly Reinforced Section");
		lblFillForSingly.setForeground(new Color(124, 252, 0));
		lblFillForSingly.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblFillForSingly.setBounds(10, 314, 240, 26);
		panel.add(lblFillForSingly);
		
		JLabel lblFillForDoubly = new JLabel("Fill for Doubly Reinforced Section");
		lblFillForDoubly.setForeground(new Color(124, 252, 0));
		lblFillForDoubly.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblFillForDoubly.setBounds(383, 306, 240, 26);
		panel.add(lblFillForDoubly);
		
		JLabel lblEnterCoverFor = new JLabel("Enter cover for Top Most Bar(mm):");
		lblEnterCoverFor.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblEnterCoverFor.setBounds(357, 351, 197, 20);
		panel.add(lblEnterCoverFor);
		
		JLabel lblFillLongitudinalBar = new JLabel("Fill Longitudinal Bar Details:");
		lblFillLongitudinalBar.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblFillLongitudinalBar.setBounds(357, 382, 197, 20);
		panel.add(lblFillLongitudinalBar);
		
		JLabel lblBarsInCompression = new JLabel("Bars in Compression:");
		lblBarsInCompression.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblBarsInCompression.setBounds(357, 413, 132, 20);
		panel.add(lblBarsInCompression);
		
		JLabel lblBarsInTension = new JLabel("Bars in Tension:");
		lblBarsInTension.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblBarsInTension.setBounds(360, 444, 126, 20);
		panel.add(lblBarsInTension);
		
		JLabel label = new JLabel("Diameter(mm)");
		label.setBounds(526, 399, 97, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Number");
		label_1.setBounds(622, 399, 46, 14);
		panel.add(label_1);
		
		TFcdiam = new JTextField();
		TFcdiam.setText("14");
		TFcdiam.setColumns(10);
		TFcdiam.setBounds(522, 413, 61, 20);
		panel.add(TFcdiam);
		
		TFcno = new JTextField();
		TFcno.setText("2");
		TFcno.setColumns(10);
		TFcno.setBounds(610, 413, 61, 20);
		panel.add(TFcno);
		
		TFtdiam = new JTextField();
		TFtdiam.setText("25");
		TFtdiam.setColumns(10);
		TFtdiam.setBounds(522, 444, 61, 20);
		panel.add(TFtdiam);
		
		TFtno = new JTextField();
		TFtno.setText("4");
		TFtno.setColumns(10);
		TFtno.setBounds(610, 444, 61, 20);
		panel.add(TFtno);
		
		JButton btnAnalyseDrSection = new JButton("Analyse DR section");
		btnAnalyseDrSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double depth=Double.parseDouble(TFdepth.getText());
					double width=Double.parseDouble(TFwidth.getText());
					double tdiam=Double.parseDouble(TFtdiam.getText());
					double tno=Double.parseDouble(TFtno.getText());
					double cdiam=Double.parseDouble(TFcdiam.getText());
					double cno=Double.parseDouble(TFcno.getText());
					double cc=Double.parseDouble(TFcc.getText());
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
					myarray=new double[20][20];
					myarray[0][0]=0.00144;myarray[0][1]=288.7;
					myarray[1][0]=0.00163;myarray[1][1]=306.7;
					myarray[2][0]=0.00192;myarray[2][1]=324.8;
					myarray[3][0]=0.00241;myarray[3][1]=342.8;
					myarray[4][0]=0.00276;myarray[4][1]=351.8;
					myarray[5][0]=0.00380;myarray[5][1]=360.9;
					double ast=3.14*tdiam*tdiam/4*tno;
					double asc=3.14*cdiam*cdiam/4*cno;
					double xul=(0.0035*depth)/(0.0055+0.87*steel/(2*100000));
					double xu=xul;
					double fsc=0;
					double fcc=0.446*concrete;
					double temp=0;
					do{
						temp=xu;
						double esc=0.0035*(xu-cc)/xu;
						for(int i=0;i<6;i++){
							if(esc>myarray[i][0]&&esc<myarray[i+1][0]){
							fsc=myarray[i][1]+(myarray[i+1][1]-myarray[i][1])*(esc-myarray[i][0])/(myarray[i+1][0]-myarray[i][0]);
							}
						}
						if(esc>0.002)
							fcc=0.446*concrete*(esc-250*esc*esc);
						else
							fcc=0.446*concrete;
						
							
						xu=(0.87*steel*ast)/(0.36*concrete*width)-asc*(fsc-fcc)/(0.36*concrete*width);

					}while(xu<xul&&Math.abs(temp-xu)>0.001);
					double MR=0;
					if(xu<xul)
					{
						MR=0.36*concrete*width*xu*(depth-0.416*xu)+asc*(fsc-fcc)*(depth-cc);
						String mrs=String.format("%.3f",MR/1000000);
						TVmr.setText(mrs+"KNm");
						String xus=String.format("%.3f",xu);
						TVxu.setText(xus+"mm");
						TVsection.setText("UnderReinforced");
					}
					double es=0;
					double fs=0;
					
					double esc;
					
					if(xu>xul){
						xu=xul;
						do{
							temp=xu;
							esc=0.0035*(xu-cc)/xu;
							es=0.0035*(depth-xu)/xu-0.001;
							for(int i=0;i<6;i++){
								if(esc>myarray[i][0]&&esc<myarray[i+1][0]){
								fsc=myarray[i][1]+(myarray[i+1][1]-myarray[i][1])*(esc-myarray[i][0])/(myarray[i+1][0]-myarray[i][0]);
								}
							}
							for(int i=0;i<6;i++){
								if(es>myarray[i][0]&&es<myarray[i+1][0]){
								fs=myarray[i][1]+(myarray[i+1][1]-myarray[i][1])*(es-myarray[i][0])/(myarray[i+1][0]-myarray[i][0]);
								}
							}
							if(esc<0.002)
								fcc=0.446*concrete*(esc-250*esc*esc);
							else
								fcc=0.446*concrete;
							
								
							xu=(fs*ast)/(0.36*concrete*width)-asc*(fsc-fcc)/(0.36*concrete*width);

						}while(Math.abs(temp-xu)>0.001);
						
						MR=0.36*concrete*width*xu*(depth-0.416*xu)+asc*(fsc-fcc)*(depth-cc);
						String mrs=String.format("%.3f",MR/1000000);
						TVmr.setText(mrs+"KNm");
						String xus=String.format("%.3f",xu);
						TVxu.setText(xus+"mm");
						TVsection.setText("OverReinforced");
						
					}
					
					
				}catch(Exception e3){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnAnalyseDrSection.setBounds(438, 489, 145, 23);
		panel.add(btnAnalyseDrSection);
		
		TFcc = new JTextField();
		TFcc.setText("40");
		TFcc.setBounds(564, 352, 80, 20);
		panel.add(TFcc);
		TFcc.setColumns(10);
		
		JLabel lblBuiltByBishal = new JLabel("Built BY-- BISHAL POKHAREL");
		lblBuiltByBishal.setForeground(new Color(75, 0, 130));
		lblBuiltByBishal.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblBuiltByBishal.setBounds(526, 570, 217, 32);
		panel.add(lblBuiltByBishal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 102, 102));
		tabbedPane.addTab("Design Of Beam Cross Section", null, panel_1, null);
		tabbedPane.setBackgroundAt(1, new Color(240, 255, 255));
		panel_1.setLayout(null);
		
		JLabel lblNotePutNecessary = new JLabel("NOTE: 1) PUT Necessary Data(fck,fy,BM,cover,diameters) In \"..when Cross Section Are Given \" TAB");
		lblNotePutNecessary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNotePutNecessary.setForeground(new Color(25, 25, 112));
		lblNotePutNecessary.setBounds(10, 25, 655, 19);
		panel_1.add(lblNotePutNecessary);
		
		JLabel lblclickTransferDimension = new JLabel("2)Enter Necessary INPUTS in this tab to find optimum dimension and PRESS TRANSFER DATA");
		lblclickTransferDimension.setForeground(new Color(25, 25, 112));
		lblclickTransferDimension.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblclickTransferDimension.setBounds(41, 51, 585, 19);
		panel_1.add(lblclickTransferDimension);
		
		JLabel lbltheCrosssectionDimension = new JLabel("3)the crossSection Dimension will be sent to \"..when cross section are Known\" Tab Automatically");
		lbltheCrosssectionDimension.setForeground(new Color(25, 25, 112));
		lbltheCrosssectionDimension.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lbltheCrosssectionDimension.setBounds(41, 81, 604, 19);
		panel_1.add(lbltheCrosssectionDimension);
		
		JLabel lblthenFillNecessary = new JLabel("4)THEN click on design result ;)");
		lblthenFillNecessary.setForeground(new Color(25, 25, 112));
		lblthenFillNecessary.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblthenFillNecessary.setBounds(41, 111, 358, 19);
		panel_1.add(lblthenFillNecessary);
		
		JLabel lblEnterWidthTo = new JLabel("ENTER WIDTH to EFFECTIVE depth Ratio:");
		lblEnterWidthTo.setForeground(Color.BLACK);
		lblEnterWidthTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterWidthTo.setBounds(10, 153, 273, 26);
		panel_1.add(lblEnterWidthTo);
		
		TFratio = new JTextField();
		TFratio.setText("0.5");
		TFratio.setBounds(301, 157, 86, 20);
		panel_1.add(TFratio);
		TFratio.setColumns(10);
		
		JLabel lblenterBetween = new JLabel("(enter between 0.5 to 0.75)");
		lblenterBetween.setBounds(412, 160, 214, 14);
		panel_1.add(lblenterBetween);
		
		JLabel lblAssumeBmTo = new JLabel("ASSUME BM TO BE??");
		lblAssumeBmTo.setForeground(Color.BLACK);
		lblAssumeBmTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAssumeBmTo.setBounds(10, 190, 179, 26);
		panel_1.add(lblAssumeBmTo);
		
		JRadioButton rdbtnLarge = new JRadioButton("LARGE");
		buttonGroup_6.add(rdbtnLarge);
		rdbtnLarge.setSelected(true);
		rdbtnLarge.setBounds(41, 223, 109, 23);
		panel_1.add(rdbtnLarge);
		
		JRadioButton rdbtnSmall = new JRadioButton("SMALL");
		buttonGroup_6.add(rdbtnSmall);
		rdbtnSmall.setBounds(152, 223, 109, 23);
		panel_1.add(rdbtnSmall);
		
		JButton btnGetDepthOf = new JButton("GET WIDTH OF BALANCED SECTION");
		btnGetDepthOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double r=Double.parseDouble(TFratio.getText());
					double m=Double.parseDouble(TFbm.getText());
					double wid=Double.parseDouble(TFrwidth.getText());
					
					
					if(r<0.5)
						r=0.5;
					if(r>0.75)
						r=0.75;
					String rs=String.format("%.3f",r);
					TFratio.setText(rs);
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup_6.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					String text=a;
					Enumeration<AbstractButton> bg5=buttonGroup_2.getElements();
					while(bg5.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg5.nextElement();
						
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
					double k=0.0035/(0.0055+0.87*steel/(2*100000));
					double d=400;double temp=0;
					if(text=="SMALL")
					{
					do{
						temp=d;
						d=d-((0.36*concrete*k*r*d*d*d*(1-0.416*k))-m*1000000)/(1.08*concrete*k*r*d*d*(1-0.416*k));
					}while(Math.abs(d-temp)>0.0001);
double b=r*d;
					
				
					
					
					if(b<200)
						b=200;
					String balwids=String.format("%.1f",b);
					TVbalwid.setText(balwids+"mm");
					if(wid<b)
					{
					int i=0;
					while(i<b){
						i++;
					}
					wid=i;
					}
					String wids=String.format("%.3f",wid);
					TFrwidth.setText(wids);
					
				
					}
					if(text=="LARGE")
					{
						do{
							temp=d;
							d=d-((0.36*concrete*k*r*d*d*d*(1-0.416*k))-0.6*m*1000000)/(1.08*concrete*k*r*d*d*(1-0.416*k));
						}while(Math.abs(d-temp)>0.0001);
						double b=r*d;
						
						
						
						
						if(b<200)
							b=200;
						String balwids=String.format("%.1f",b);
						TVbalwid.setText(balwids+"mm");
						if(wid<b)
						{
						int i=0;
						while(i<b){
							i++;
						}
						wid=i;
						}
						String wids=String.format("%.3f",wid);
						TFrwidth.setText(wids);
						
					}
					
					
				
					
				
					
					
					
				}catch(Exception e20){
					JOptionPane.showMessageDialog(null,e20);
				}
			}
		});
		btnGetDepthOf.setBounds(210, 301, 258, 23);
		panel_1.add(btnGetDepthOf);
		
		JLabel lblEnterWidthOf = new JLabel("ENTER width of beam greater than ");
		lblEnterWidthOf.setForeground(Color.BLACK);
		lblEnterWidthOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterWidthOf.setBounds(10, 264, 218, 26);
		panel_1.add(lblEnterWidthOf);
		
		TVbalwid = new JLabel("200 mm");
		TVbalwid.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVbalwid.setBounds(241, 270, 64, 14);
		panel_1.add(TVbalwid);
		
		TFrwidth = new JTextField();
		TFrwidth.setText("200");
		TFrwidth.setBounds(343, 268, 86, 20);
		panel_1.add(TFrwidth);
		TFrwidth.setColumns(10);
		
		JButton btnTransferData = new JButton("TRANSFER DATA");
		btnTransferData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double width=Double.parseDouble(TFrwidth.getText());
				double r=Double.parseDouble(TFratio.getText());
				double tcc=Double.parseDouble(TFtcc.getText());
                String a = null;
				
				Enumeration<AbstractButton> bg=buttonGroup_4.getElements();
				while(bg.hasMoreElements()){
					JRadioButton jrd=(JRadioButton) bg.nextElement();
					
					if(jrd.isSelected())
					a=jrd.getText();
					
						
				}
				double diam=Double.parseDouble(a);
				String ovdiams=String.format("%.3f",width/r+diam/2+tcc);
				TFodepth.setText(ovdiams);
				String amcs=String.format("%.3f",width);
				TFdwidth.setText(amcs);
				 
			}
		});
		btnTransferData.setBounds(467, 412, 159, 23);
		panel_1.add(btnTransferData);
		
		JLabel label_4 = new JLabel("Built BY-- BISHAL POKHAREL");
		label_4.setForeground(new Color(75, 0, 130));
		label_4.setFont(new Font("Tahoma", Font.ITALIC, 16));
		label_4.setBounds(507, 560, 217, 32);
		panel_1.add(label_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 102, 102));
		tabbedPane.addTab("Design of Beam when Cross Section are Known", null, panel_2, null);
		tabbedPane.setEnabledAt(2, true);
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("Enter grade of Steel(fy):");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(41, 30, 179, 26);
		panel_2.add(label_2);
		
		JRadioButton radioButton_9 = new JRadioButton("250");
		buttonGroup_2.add(radioButton_9);
		radioButton_9.setBounds(37, 63, 80, 23);
		panel_2.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("415");
		buttonGroup_2.add(radioButton_10);
		radioButton_10.setSelected(true);
		radioButton_10.setBounds(119, 63, 80, 23);
		panel_2.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("500");
		buttonGroup_2.add(radioButton_11);
		radioButton_11.setBounds(201, 63, 80, 23);
		panel_2.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("600");
		buttonGroup_2.add(radioButton_12);
		radioButton_12.setBounds(119, 89, 80, 23);
		panel_2.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("550");
		buttonGroup_2.add(radioButton_13);
		radioButton_13.setBounds(37, 89, 80, 23);
		panel_2.add(radioButton_13);
		
		JLabel label_3 = new JLabel("Enter grade of Concrete(fck):");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(41, 125, 183, 26);
		panel_2.add(label_3);
		
		JRadioButton radioButton_14 = new JRadioButton("20");
		buttonGroup_3.add(radioButton_14);
		radioButton_14.setSelected(true);
		radioButton_14.setBounds(41, 158, 109, 23);
		panel_2.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("25");
		buttonGroup_3.add(radioButton_15);
		radioButton_15.setBounds(154, 158, 109, 23);
		panel_2.add(radioButton_15);
		
		JRadioButton radioButton_16 = new JRadioButton("35");
		buttonGroup_3.add(radioButton_16);
		radioButton_16.setBounds(154, 184, 109, 23);
		panel_2.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("30");
		buttonGroup_3.add(radioButton_17);
		radioButton_17.setBounds(41, 184, 109, 23);
		panel_2.add(radioButton_17);
		
		JLabel lblEnterDesignBending = new JLabel("Enter Design Bending Moment to be Resisted(KNm):");
		lblEnterDesignBending.setForeground(Color.BLACK);
		lblEnterDesignBending.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDesignBending.setBounds(41, 214, 340, 26);
		panel_2.add(lblEnterDesignBending);
		
		TFbm = new JTextField();
		TFbm.setText("150");
		TFbm.setBounds(391, 218, 145, 20);
		panel_2.add(TFbm);
		TFbm.setColumns(10);
		
		JLabel lblQuicklyAnalyseSimply = new JLabel("Quickly Analyse Simply Supported Beam with  UDL:");
		lblQuicklyAnalyseSimply.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblQuicklyAnalyseSimply.setForeground(new Color(0, 51, 0));
		lblQuicklyAnalyseSimply.setBounds(431, 37, 311, 19);
		panel_2.add(lblQuicklyAnalyseSimply);
		
		JLabel lblEffectiveSpanm = new JLabel("Effective Span(m):");
		lblEffectiveSpanm.setBounds(431, 67, 109, 14);
		panel_2.add(lblEffectiveSpanm);
		
		TFspan = new JTextField();
		TFspan.setText("10.0");
		TFspan.setBounds(550, 64, 86, 20);
		panel_2.add(TFspan);
		TFspan.setColumns(10);
		
		JLabel lblEnterTotalUdl = new JLabel("Enter total UDL imposed(KN/m):");
		lblEnterTotalUdl.setBounds(350, 95, 190, 14);
		panel_2.add(lblEnterTotalUdl);
		
		TFudl = new JTextField();
		TFudl.setText("4.5");
		TFudl.setColumns(10);
		TFudl.setBounds(550, 92, 86, 20);
		panel_2.add(TFudl);
		
		JLabel lblEnterFactorOf = new JLabel("Enter Factor of Safety:");
		lblEnterFactorOf.setBounds(410, 128, 130, 14);
		panel_2.add(lblEnterFactorOf);
		
		TFfos = new JTextField();
		TFfos.setText("1.5");
		TFfos.setColumns(10);
		TFfos.setBounds(550, 125, 86, 20);
		panel_2.add(TFfos);
		
		JButton btnCalculateDesignedBm = new JButton("Calculate Designed BM");
		btnCalculateDesignedBm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double span=Double.parseDouble(TFspan.getText());
					double udl=Double.parseDouble(TFudl.getText());
					double fos=Double.parseDouble(TFfos.getText());
					double BM=fos*udl*span*span/8;
					String amcs=String.format("%.3f",BM);
					TFbm.setText(amcs);
					
				}catch(Exception e10){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnCalculateDesignedBm.setBounds(513, 184, 204, 23);
		panel_2.add(btnCalculateDesignedBm);
		
		JLabel lblorUseQuick = new JLabel("(OR use Quick analyser)");
		lblorUseQuick.setForeground(Color.BLACK);
		lblorUseQuick.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblorUseQuick.setBounds(550, 214, 167, 26);
		panel_2.add(lblorUseQuick);
		
		JLabel lblEnterOverallDepth = new JLabel("Enter Overall Depth Of Beam(mm):");
		lblEnterOverallDepth.setForeground(Color.BLACK);
		lblEnterOverallDepth.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterOverallDepth.setBounds(154, 251, 219, 26);
		panel_2.add(lblEnterOverallDepth);
		
		TFodepth = new JTextField();
		TFodepth.setText("400");
		TFodepth.setBounds(391, 255, 86, 20);
		panel_2.add(TFodepth);
		TFodepth.setColumns(10);
		
		JLabel lblEnterBeamWidthmm = new JLabel("Enter Beam Width(mm):");
		lblEnterBeamWidthmm.setForeground(Color.BLACK);
		lblEnterBeamWidthmm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterBeamWidthmm.setBounds(214, 282, 167, 26);
		panel_2.add(lblEnterBeamWidthmm);
		
		TFdwidth = new JTextField();
		TFdwidth.setText("250");
		TFdwidth.setColumns(10);
		TFdwidth.setBounds(391, 286, 86, 20);
		panel_2.add(TFdwidth);
		
		JLabel lblEnterCoverFor_1 = new JLabel("Enter cover for Tension Reinf.(mm):");
		lblEnterCoverFor_1.setForeground(Color.BLACK);
		lblEnterCoverFor_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterCoverFor_1.setBounds(155, 311, 226, 26);
		panel_2.add(lblEnterCoverFor_1);
		
		TFtcc = new JTextField();
		TFtcc.setText("20");
		TFtcc.setColumns(10);
		TFtcc.setBounds(391, 315, 86, 20);
		panel_2.add(TFtcc);
		
		JLabel lblAtleastmmFor = new JLabel("atleast 20mm for proper bonding");
		lblAtleastmmFor.setBounds(490, 318, 227, 14);
		panel_2.add(lblAtleastmmFor);
		
		JLabel lblEnterCoverFor_2 = new JLabel("Enter CLEAR cover for Compression Reinf.(mm):");
		lblEnterCoverFor_2.setForeground(Color.BLACK);
		lblEnterCoverFor_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterCoverFor_2.setBounds(70, 348, 311, 26);
		panel_2.add(lblEnterCoverFor_2);
		
		TFccc = new JTextField();
		TFccc.setText("20");
		TFccc.setColumns(10);
		TFccc.setBounds(391, 352, 86, 20);
		panel_2.add(TFccc);
		
		JLabel lblChooseDiameterOf = new JLabel("Choose Diameter of Tension Reinforcement");
		lblChooseDiameterOf.setForeground(Color.BLACK);
		lblChooseDiameterOf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblChooseDiameterOf.setBounds(248, 385, 288, 20);
		panel_2.add(lblChooseDiameterOf);
		
		JRadioButton radioButton_18 = new JRadioButton("16");
		buttonGroup_4.add(radioButton_18);
		radioButton_18.setBounds(111, 412, 80, 23);
		panel_2.add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("20");
		buttonGroup_4.add(radioButton_19);
		radioButton_19.setSelected(true);
		radioButton_19.setBounds(201, 412, 80, 23);
		panel_2.add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton("22");
		buttonGroup_4.add(radioButton_20);
		radioButton_20.setBounds(294, 412, 80, 23);
		panel_2.add(radioButton_20);
		
		JRadioButton radioButton_21 = new JRadioButton("25");
		buttonGroup_4.add(radioButton_21);
		radioButton_21.setBounds(391, 412, 80, 23);
		panel_2.add(radioButton_21);
		
		JRadioButton radioButton_22 = new JRadioButton("30");
		buttonGroup_4.add(radioButton_22);
		radioButton_22.setBounds(490, 412, 80, 23);
		panel_2.add(radioButton_22);
		
		JRadioButton radioButton_23 = new JRadioButton("35");
		buttonGroup_4.add(radioButton_23);
		radioButton_23.setBounds(590, 412, 80, 23);
		panel_2.add(radioButton_23);
		
		JLabel lblChooseDiameterOf_1 = new JLabel("Choose Diameter of Compression Reinforcement");
		lblChooseDiameterOf_1.setForeground(Color.BLACK);
		lblChooseDiameterOf_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblChooseDiameterOf_1.setBounds(248, 444, 322, 23);
		panel_2.add(lblChooseDiameterOf_1);
		
		JRadioButton radioButton_24 = new JRadioButton("16");
		buttonGroup_5.add(radioButton_24);
		radioButton_24.setBounds(111, 466, 80, 23);
		panel_2.add(radioButton_24);
		
		JRadioButton radioButton_25 = new JRadioButton("20");
		buttonGroup_5.add(radioButton_25);
		radioButton_25.setBounds(201, 466, 80, 23);
		panel_2.add(radioButton_25);
		
		JRadioButton radioButton_26 = new JRadioButton("22");
		buttonGroup_5.add(radioButton_26);
		radioButton_26.setBounds(294, 466, 80, 23);
		panel_2.add(radioButton_26);
		
		JRadioButton radioButton_27 = new JRadioButton("25");
		buttonGroup_5.add(radioButton_27);
		radioButton_27.setBounds(391, 466, 80, 23);
		panel_2.add(radioButton_27);
		
		JRadioButton radioButton_28 = new JRadioButton("30");
		buttonGroup_5.add(radioButton_28);
		radioButton_28.setBounds(490, 466, 80, 23);
		panel_2.add(radioButton_28);
		
		JRadioButton radioButton_29 = new JRadioButton("35");
		buttonGroup_5.add(radioButton_29);
		radioButton_29.setBounds(590, 466, 80, 23);
		panel_2.add(radioButton_29);
		
		JRadioButton radioButton_30 = new JRadioButton("12");
		buttonGroup_5.add(radioButton_30);
		radioButton_30.setSelected(true);
		radioButton_30.setBounds(21, 466, 80, 23);
		panel_2.add(radioButton_30);
		
		JRadioButton radioButton_31 = new JRadioButton("12");
		buttonGroup_4.add(radioButton_31);
		radioButton_31.setBounds(21, 412, 80, 23);
		panel_2.add(radioButton_31);
		
		JButton btnDesign = new JButton("DESIGN RESULT..");
		btnDesign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double overdepth=Double.parseDouble(TFodepth.getText());
					double dwidth=Double.parseDouble(TFdwidth.getText());
					double tcc=Double.parseDouble(TFtcc.getText());
					double ccc=Double.parseDouble(TFccc.getText());
					double dbm=Double.parseDouble(TFbm.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg1=buttonGroup_2.getElements();
					while(bg1.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg1.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double steel=Double.parseDouble(a);
					
					
					Enumeration<AbstractButton> bg2=buttonGroup_3.getElements();
					while(bg2.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg2.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double concrete=Double.parseDouble(a);
					
					
					Enumeration<AbstractButton> bg3=buttonGroup_4.getElements();
					while(bg3.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg3.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double tdiam=Double.parseDouble(a);
					Enumeration<AbstractButton> bg4=buttonGroup_5.getElements();
					while(bg4.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg4.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					myarray=new double[20][20];
					myarray[0][0]=0.00144;myarray[0][1]=288.7;
					myarray[1][0]=0.00163;myarray[1][1]=306.7;
					myarray[2][0]=0.00192;myarray[2][1]=324.8;
					myarray[3][0]=0.00241;myarray[3][1]=342.8;
					myarray[4][0]=0.00276;myarray[4][1]=351.8;
					myarray[5][0]=0.00380;myarray[5][1]=360.9;
					double cdiam=Double.parseDouble(a);
					double depth=overdepth-tcc-tdiam/2;
					double xul=(0.0035*depth)/(0.0055+0.87*steel/(2*100000));
					double mul=0.36*concrete*xul*dwidth*(depth-0.416*xul)*1/1000000;
					double cover=ccc+cdiam/2;
					double esc=0.0035*(xul-cover)/xul;
					double fsc=0;
					double fcc=8.92;
					double ast=0;
					double asc=0;
					double dst=0;
					double dsc=0;
					
					if(dbm>mul){
						for(int i=0;i<6;i++){
							if(esc>myarray[i][0]&&esc<myarray[i+1][0]){
							fsc=myarray[i][1]+(myarray[i+1][1]-myarray[i][1])*(esc-myarray[i][0])/(myarray[i+1][0]-myarray[i][0]);
							}
						}
						if(esc<0.002)
							fcc=0.446*concrete*(esc-250*esc*esc);
						else
							fcc=0.446*concrete;
						ast=mul*1000000/(0.87*steel*(depth-0.416*xul))+(dbm-mul)*1000000/(0.87*steel*(depth-cover));
						asc=(dbm-mul)*1000000/((fsc-fcc)*(depth-cover));
						dst=4*ast/(tdiam*tdiam*3.14);
						dsc=4*asc/(tdiam*tdiam*3.14);
						int i = 0;
						while(i<dst)
						{
						i++;
						}
						int j = 0;
						while(j<dsc)
						{
						j++;
						}
							
						String is=String.format("%d",i);
						String js=String.format("%d",j);
						String tdiams=String.format("%.1f",tdiam);
						String cdiams=String.format("%.1f",cdiam);
						TVresult.setText("Use DRS----"+is+"-"+tdiams+"mm rod at tension fibre and "+js+"-"+cdiams+"mm rod at compression fibre");
						}
					else
					{
						double x=200;
						double m=0;
						double a1=100;
						double b1=1000;
						double temp;
						do
						{
							temp=x;
							
							x=x-(0.36*concrete*x*depth*dwidth-0.1498*concrete*dwidth*x*x-dbm*1000000)/(0.36*concrete*dwidth*depth-0.3*concrete*x);
						}while(Math.abs(temp-x)>0.000001);
						ast=x*0.36*concrete*dwidth/(0.87*steel);
						dst=4*ast/(tdiam*tdiam*3.14);
						int i = 0;
						while(i<dst)
						{
						i++;
						}
						String is=String.format("%d",i);
						
						String tdiams=String.format("%.1f",tdiam);
						
						TVresult.setText("Use SRS----"+is+"-"+tdiams+"mm rod at tension fibre");
						
					}
					
					
					
					
					
				}catch(Exception e11){
					JOptionPane.showMessageDialog(null,e11);
				}
			}
			
		});
		btnDesign.setBounds(294, 496, 177, 23);
		panel_2.add(btnDesign);
		
		JLabel lblResult = new JLabel("RESULT:");
		lblResult.setForeground(new Color(51, 0, 153));
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResult.setBounds(22, 530, 59, 20);
		panel_2.add(lblResult);
		
		TVresult = new JLabel("...");
		TVresult.setForeground(new Color(0, 0, 102));
		TVresult.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		TVresult.setBounds(91, 533, 626, 38);
		panel_2.add(TVresult);
		
		JLabel label_5 = new JLabel("Built BY-- BISHAL POKHAREL");
		label_5.setForeground(new Color(75, 0, 130));
		label_5.setFont(new Font("Tahoma", Font.ITALIC, 16));
		label_5.setBounds(540, 583, 217, 32);
		panel_2.add(label_5);
		
		JLabel lblAnalysisAndDesign = new JLabel("Analysis and Design Of Rectangular Beams for Flexture(longitudinal Bar)");
		lblAnalysisAndDesign.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAnalysisAndDesign.setForeground(Color.WHITE);
		lblAnalysisAndDesign.setBounds(138, 11, 573, 28);
		frmDesignOfBeam.getContentPane().add(lblAnalysisAndDesign);
		frmDesignOfBeam.setBounds(100, 100, 801, 757);
		frmDesignOfBeam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
