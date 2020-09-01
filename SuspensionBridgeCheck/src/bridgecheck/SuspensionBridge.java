package bridgecheck;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class SuspensionBridge {

	private JFrame frmDesignOfSuspension;
	private JTextField TFspan;
	private JTextField TFheight;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField TFhandno;
	private JTextField TFwwno;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel TVdesign;
	private JLabel TVfs;
	private JLabel TVtension;
	private JLabel TVsag;
	private JLabel TVgi;
	private JLabel TVdiff;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField TFbd;
	private JTextField TFdl;
	private JTextField TFdr;
	private JLabel TVres;
	private JLabel TVntension;
	private JLabel TVfact;
	private JLabel TVdesresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuspensionBridge window = new SuspensionBridge();
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
	public SuspensionBridge() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDesignOfSuspension = new JFrame();
		frmDesignOfSuspension.setTitle("Design of Suspension Bridge(Check)");
		frmDesignOfSuspension.getContentPane().setBackground(new Color(0, 102, 102));
		frmDesignOfSuspension.setBounds(100, 100, 635, 700);
		frmDesignOfSuspension.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDesignOfSuspension.getContentPane().setLayout(null);
		
		JLabel lblThisSoftwareChecks = new JLabel("This Software Checks Design of Suspension Bridge");
		lblThisSoftwareChecks.setBounds(76, 11, 400, 32);
		lblThisSoftwareChecks.setFont(new Font("Microsoft Sans Serif", Font.BOLD | Font.ITALIC, 13));
		frmDesignOfSuspension.getContentPane().add(lblThisSoftwareChecks);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 52, 599, 605);
		frmDesignOfSuspension.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("SSTB Design Check", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblPleaseInputFollowing = new JLabel("Please Input Following:");
		lblPleaseInputFollowing.setForeground(new Color(0, 204, 204));
		lblPleaseInputFollowing.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblPleaseInputFollowing.setBounds(148, 11, 156, 29);
		panel.add(lblPleaseInputFollowing);
		
		JLabel lblEnter = new JLabel(" Enter Span Length(m):");
		lblEnter.setForeground(new Color(0, 204, 204));
		lblEnter.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnter.setBounds(80, 51, 156, 29);
		panel.add(lblEnter);
		
		TFspan = new JTextField();
		TFspan.setText("117");
		TFspan.setColumns(10);
		TFspan.setBounds(246, 56, 86, 20);
		panel.add(TFspan);
		
		JLabel lblEnterShaddlesElevation = new JLabel("Enter Shaddles Elevation Difference(m):");
		lblEnterShaddlesElevation.setForeground(new Color(0, 204, 204));
		lblEnterShaddlesElevation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterShaddlesElevation.setBounds(80, 91, 260, 29);
		panel.add(lblEnterShaddlesElevation);
		
		TFheight = new JTextField();
		TFheight.setText("1.4");
		TFheight.setColumns(10);
		TFheight.setBounds(350, 96, 86, 20);
		panel.add(TFheight);
		
		JLabel lblDiameterm = new JLabel("Diameter Of HandRail (mm):");
		lblDiameterm.setForeground(new Color(0, 204, 204));
		lblDiameterm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDiameterm.setBounds(80, 131, 178, 29);
		panel.add(lblDiameterm);
		
		JRadioButton radioButton = new JRadioButton("22");
		buttonGroup.add(radioButton);
		radioButton.setBounds(264, 135, 62, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("32");
		radioButton_1.setSelected(true);
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(328, 135, 62, 23);
		panel.add(radioButton_1);
		
		JLabel lblNoOfHandrails = new JLabel("NO of handRails:");
		lblNoOfHandrails.setForeground(new Color(0, 204, 204));
		lblNoOfHandrails.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoOfHandrails.setBounds(80, 171, 106, 29);
		panel.add(lblNoOfHandrails);
		
		TFhandno = new JTextField();
		TFhandno.setText("2");
		TFhandno.setColumns(10);
		TFhandno.setBounds(196, 176, 86, 20);
		panel.add(TFhandno);
		
		JLabel lblDiameterOfWalkway = new JLabel("Diameter Of WalkWay (mm):");
		lblDiameterOfWalkway.setForeground(new Color(0, 204, 204));
		lblDiameterOfWalkway.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDiameterOfWalkway.setBounds(60, 211, 178, 29);
		panel.add(lblDiameterOfWalkway);
		
		JRadioButton radioButton_2 = new JRadioButton("22");
		buttonGroup_1.add(radioButton_2);
		radioButton_2.setBounds(244, 215, 62, 23);
		panel.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("32");
		radioButton_3.setSelected(true);
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(308, 215, 62, 23);
		panel.add(radioButton_3);
		
		JLabel lblNoOfWalkway = new JLabel("NO of walkWay cables:");
		lblNoOfWalkway.setForeground(new Color(0, 204, 204));
		lblNoOfWalkway.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoOfWalkway.setBounds(80, 251, 156, 29);
		panel.add(lblNoOfWalkway);
		
		TFwwno = new JTextField();
		TFwwno.setText("2");
		TFwwno.setColumns(10);
		TFwwno.setBounds(246, 256, 86, 20);
		panel.add(TFwwno);
		
		JLabel lblWalkwayWidthm = new JLabel("WalkWay Width(mm):");
		lblWalkwayWidthm.setForeground(new Color(0, 204, 204));
		lblWalkwayWidthm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWalkwayWidthm.setBounds(80, 291, 133, 29);
		panel.add(lblWalkwayWidthm);
		
		JButton btnCheckForDtype = new JButton("Check for D-type");
		btnCheckForDtype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double handdiam=Double.parseDouble(a);
					
					
					Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
					while(bg1.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg1.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double wwdiam=Double.parseDouble(a);
					Enumeration<AbstractButton> bg11=buttonGroup_2.getElements();
					while(bg11.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg11.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double wwwidth=Double.parseDouble(a);
					double span=Double.parseDouble(TFspan.getText());
					double height=Double.parseDouble(TFheight.getText());
					
					double handno=Double.parseDouble(TFhandno.getText());
					
					double wwno=Double.parseDouble(TFwwno.getText());
					
					double tension=386*handno+585*wwno;
					
					double bd=0,gd=0,Ld=0,gi=0,b=0,gdh=0,gdw=0,gf=0,Ah=0,Aw=0,A=0,EA=0,bi=0,T=0,hf=0,tanb=0,FS=0;
					if(handdiam==22)
					{
						gdh=2.51*handno/100;
						Ah=handno*292;
						
					}
					if(handdiam==32)
					{
						gdh=3.8*handno/100;
						Ah=handno*442;
					}
					if(wwdiam==22)
					{
						gdw=2.51*wwno/100;
						Aw=wwno*292;
						
					}
					if(wwdiam==32)
					{
						gdw=3.8*wwno/100;
						Aw=wwno*442;
					}
					gd=gdw+gdh+0.4;
					gf=gd+(3+50/span)*wwwidth/100;
					A=Ah+Aw;
					EA=110*A;
					if(span<=80)
					{
						bd=span/20;
					}
					if(span>80)
					{
						bd=span/22;
					}
					bi=1.22*bd;
					do{
						b=bi;
						Ld=span*(1+8/3*(bd/span)*(bd/span)+1/2*(height/span)*(height/span));
						gi=64*EA*bi*(bi*bi-bd*bd)/(3*span*span*span*Ld)+bi/bd*gd;
						bi=bd+(bi-bd)*((gf-gd)/(gi-gd));
					}while(Math.abs(gf-gi)>0.001);
					hf=gf*span*span/(8*b);
					tanb=(4*b-height)/span;
					T=hf*Math.sqrt(1+tanb*tanb);
					FS=tension/T;
					
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
					
					if(FS<3)
						TVdesign.setText("not correct.");
					else
						TVdesign.setText("correct.");
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnCheckForDtype.setBounds(10, 331, 142, 43);
		panel.add(btnCheckForDtype);
		
		JLabel label_1 = new JLabel("Required Theoritical SAG(m):");
		label_1.setForeground(new Color(204, 204, 0));
		label_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_1.setBounds(10, 385, 199, 20);
		panel.add(label_1);
		
		TVsag = new JLabel("0.00");
		TVsag.setForeground(new Color(0, 102, 51));
		TVsag.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVsag.setBounds(219, 389, 68, 14);
		panel.add(TVsag);
		
		TVgi = new JLabel("0.00");
		TVgi.setForeground(new Color(0, 102, 51));
		TVgi.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVgi.setBounds(177, 422, 133, 14);
		panel.add(TVgi);
		
		JLabel label_4 = new JLabel("Final Value of gi(m):");
		label_4.setForeground(new Color(204, 204, 0));
		label_4.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_4.setBounds(10, 416, 142, 20);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("gf-gi:");
		label_5.setForeground(new Color(204, 204, 0));
		label_5.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_5.setBounds(10, 447, 40, 20);
		panel.add(label_5);
		
		TVdiff = new JLabel("0.00");
		TVdiff.setForeground(new Color(0, 102, 51));
		TVdiff.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVdiff.setBounds(60, 451, 96, 14);
		panel.add(TVdiff);
		
		JLabel label_7 = new JLabel("Tension produced in cable(KN);");
		label_7.setForeground(new Color(204, 204, 0));
		label_7.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_7.setBounds(10, 478, 217, 20);
		panel.add(label_7);
		
		TVtension = new JLabel("0.00");
		TVtension.setForeground(new Color(0, 102, 51));
		TVtension.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVtension.setBounds(219, 481, 107, 14);
		panel.add(TVtension);
		
		TVfs = new JLabel("0.00");
		TVfs.setForeground(new Color(0, 102, 51));
		TVfs.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVfs.setBounds(60, 512, 68, 14);
		panel.add(TVfs);
		
		JLabel label_10 = new JLabel("FS=");
		label_10.setForeground(new Color(204, 204, 0));
		label_10.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_10.setBounds(10, 509, 34, 20);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Design is:");
		label_11.setForeground(new Color(204, 204, 0));
		label_11.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_11.setBounds(10, 544, 91, 20);
		panel.add(label_11);
		
		TVdesign = new JLabel("final design result");
		TVdesign.setForeground(Color.GREEN);
		TVdesign.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TVdesign.setBackground(Color.GREEN);
		TVdesign.setBounds(103, 540, 143, 22);
		panel.add(TVdesign);
		
		JRadioButton radioButton_4 = new JRadioButton("70");
		buttonGroup_2.add(radioButton_4);
		radioButton_4.setBounds(223, 295, 62, 23);
		panel.add(radioButton_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("106");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup_2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(287, 295, 68, 23);
		panel.add(rdbtnNewRadioButton);
		
		JButton btnCheckForNtype = new JButton("Check for N-type");
		btnCheckForNtype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = null;
				
				Enumeration<AbstractButton> bg=buttonGroup.getElements();
				while(bg.hasMoreElements()){
					JRadioButton jrd=(JRadioButton) bg.nextElement();
					
					if(jrd.isSelected())
					a=jrd.getText();
					
						
				}
				double handdiam=Double.parseDouble(a);
				
				
				Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
				while(bg1.hasMoreElements()){
					JRadioButton jrd=(JRadioButton) bg1.nextElement();
					
					if(jrd.isSelected())
					a=jrd.getText();
					
						
				}
				double wwdiam=Double.parseDouble(a);
				Enumeration<AbstractButton> bg11=buttonGroup_2.getElements();
				while(bg11.hasMoreElements()){
					JRadioButton jrd=(JRadioButton) bg11.nextElement();
					
					if(jrd.isSelected())
					a=jrd.getText();
					
						
				}
				double wwwidth=Double.parseDouble(a);
				double span=Double.parseDouble(TFspan.getText());
				double height=Double.parseDouble(TFheight.getText());
				
				double handno=Double.parseDouble(TFhandno.getText());
				
				double wwno=Double.parseDouble(TFwwno.getText());
				double bd=Double.parseDouble(TFbd.getText());
				double dl=Double.parseDouble(TFdl.getText());
				double dr=Double.parseDouble(TFdr.getText());
				
				double tension=386*handno+585*wwno;
				double Ld=span*(1+8/3*(bd/span)*(bd/span));
				double aa=16*bd/span*(5-24*(bd*bd/(span*span)));
				double bb=15+40*(bd*bd/(span*span))+40*(bd*bd*bd*bd/(span*span*span*span));
				double B=Math.atan(4.2*bd/span);
				double b=1.05*bd;
				double temp=b,H=0,T=0,dL=0,DDr=0,DDl=0,db=0,gdh = 0,gdw = 0,Aw = 0,gd,gf,Ah1=0,EA,A;
				if(handdiam==22)
				{
					gdh=2.51*handno/100;
					Ah1=handno*292;
					
				}
				if(handdiam==32)
				{
					gdh=3.8*handno/100;
					Ah1=handno*442;
				}
				if(wwdiam==22)
				{
					gdw=2.51*wwno/100;
					Aw=wwno*292;
					
				}
				if(wwdiam==32)
				{
					gdw=3.8*wwno/100;
					Aw=wwno*442;
				}
				gd=gdw+gdh+0.4;
				gf=gd+(3+50/span)*wwwidth/100;
				A=Ah1+Aw;
				EA=110*A;
				do
				{
					temp=b;
					H=gf*span*span/(8*b);
					T=H*Math.sqrt(1+16*(b*b/(span*span)));
					dL=(2*H+T)*Ld/(3*EA)*(gf-gd)/gf;
					DDr=T*dr/(EA)*(gf-gd)/gf;
					
					DDl=T*dl/(EA)*(gf-gd)/gf;
					db=15*dL/(aa)+bb*(DDr+DDl)/aa;
					b=bd+db;
					
					
					
				}while(Math.abs(b-temp)>0.005);
				double hf = gf*span*span/(8*b);
				double tanb = (4*b-height)/span;
				T=hf*Math.sqrt(1+tanb*tanb);
				double FS = tension/T;
				String amcs=String.format("%.3f",temp);
				TVres.setText(amcs+"m");
				String loads=String.format("%.3f",T);
				TVntension.setText(loads+"KN");
				String facts=String.format("%.3f",FS);
				TVfact.setText(facts);
				if(FS<3)
					
				
				TVdesresult.setText(" NOT CORRECT");
				else
					TVdesresult.setText(" CORRECT");
				
				
				
				
				
			}
		});
		btnCheckForNtype.setBounds(396, 331, 142, 43);
		panel.add(btnCheckForNtype);
		
		JLabel lblBd = new JLabel("Bd(m):");
		lblBd.setForeground(new Color(0, 204, 204));
		lblBd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBd.setBounds(389, 291, 47, 29);
		panel.add(lblBd);
		
		TFbd = new JTextField();
		TFbd.setText("8.85");
		TFbd.setBounds(442, 296, 96, 20);
		panel.add(TFbd);
		TFbd.setColumns(10);
		
		JLabel lblDlm = new JLabel("DL(m):");
		lblDlm.setForeground(new Color(0, 204, 204));
		lblDlm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDlm.setBounds(389, 259, 47, 29);
		panel.add(lblDlm);
		
		TFdl = new JTextField();
		TFdl.setText("34.2");
		TFdl.setColumns(10);
		TFdl.setBounds(442, 264, 96, 20);
		panel.add(TFdl);
		
		JLabel lblDrm = new JLabel("DR(m):");
		lblDrm.setForeground(new Color(0, 204, 204));
		lblDrm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrm.setBounds(389, 228, 47, 29);
		panel.add(lblDrm);
		
		TFdr = new JTextField();
		TFdr.setText("12.3");
		TFdr.setColumns(10);
		TFdr.setBounds(442, 228, 96, 20);
		panel.add(TFdr);
		
		JLabel lblForDtype = new JLabel("For N-type..");
		lblForDtype.setForeground(new Color(153, 0, 0));
		lblForDtype.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblForDtype.setBounds(396, 188, 106, 29);
		panel.add(lblForDtype);
		
		TVres = new JLabel("0.00");
		TVres.setForeground(new Color(0, 102, 51));
		TVres.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVres.setBounds(504, 391, 80, 14);
		panel.add(TVres);
		
		JLabel label = new JLabel("Required Theoritical SAG(m):");
		label.setForeground(new Color(204, 204, 0));
		label.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label.setBounds(308, 389, 199, 20);
		panel.add(label);
		
		JLabel lblTensionProducedIn = new JLabel("Tension Produced in Cable(KN):");
		lblTensionProducedIn.setForeground(new Color(204, 204, 0));
		lblTensionProducedIn.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblTensionProducedIn.setBounds(285, 432, 217, 20);
		panel.add(lblTensionProducedIn);
		
	TVntension = new JLabel("0.00");
		TVntension.setForeground(new Color(0, 102, 51));
		TVntension.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVntension.setBounds(504, 432, 80, 14);
		panel.add(TVntension);
		
		TVfact = new JLabel("0.00");
		TVfact.setForeground(new Color(0, 102, 51));
		TVfact.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		TVfact.setBounds(504, 469, 80, 14);
		panel.add(TVfact);
		
		JLabel lblFactorOfSafety = new JLabel("Factor of Safety:");
		lblFactorOfSafety.setForeground(new Color(204, 204, 0));
		lblFactorOfSafety.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblFactorOfSafety.setBounds(369, 466, 122, 20);
		panel.add(lblFactorOfSafety);
		
		JLabel label_2 = new JLabel("Design is:");
		label_2.setForeground(new Color(204, 204, 0));
		label_2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		label_2.setBounds(328, 511, 91, 20);
		panel.add(label_2);
		
		TVdesresult = new JLabel("final design result");
		TVdesresult.setForeground(Color.GREEN);
		TVdesresult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TVdesresult.setBackground(Color.GREEN);
		TVdesresult.setBounds(421, 507, 143, 22);
		panel.add(TVdesresult);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 102));
		tabbedPane.addTab("New tab", null, panel_1, null);
		tabbedPane.setBackgroundAt(1, new Color(51, 0, 102));
	}
}
