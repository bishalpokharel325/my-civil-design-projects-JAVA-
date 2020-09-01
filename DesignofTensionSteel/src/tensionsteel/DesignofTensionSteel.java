package tensionsteel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DesignofTensionSteel {

	private JFrame frmDesignOfTension;
	private JTextField TFgrade;
	private JTextField TFtension;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField TFimport;
	private JTextField TFexport;
	private JTextField TFl;
	private JTextField TFb;
	private JTextField TFt;
	private JLabel TVag;
	private JLabel TVecosection;
	private JLabel TVok;
	private JLabel TVblock;
	private JLabel TVrupture;
	static double ag;
	static int tot;

	/**
	 * Launch the application.
	 */
	
	static String xstrPath;
	static double[][] myarray;
	static double[][] myarray1;
	private JTextField TFlocation;
	private int rowc;
	private JTextField TFboltgrade;
	private JTextField TFend;
	private JTextField TFedge;
	private JTextField TFpitch;
	private JTextField TFdiam;
	private JTextField TFtgusset;
	private JTextField TFangle;
	private JTextField TFsize;
	private JLabel TVlimit;
	private JLabel TVresult;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JTextField TFno;
	private JTextField TFweld;
	private JTextField TFeverysutaible;
	static void setupmycsvarray(String location)
	{
		myarray=new double[200][200];
		Scanner scanIn=null;
		
		int rowc=0;
		int colc=0;
		int col=0;
		String InputLine="";
		double xnum=0;
		String xfilelocation;
		xfilelocation=location;
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
	static int setupmycsvarray1(String location)
	{
		myarray1=new double[200][200];
		Scanner scanIn=null;
		
		int rowc=0;
		int colc=0;
		int col=0;
		String InputLine="";
		double xnum=0;
		String xfilelocation;
		xfilelocation=location;
		try{
			File file=new File(xfilelocation);
			scanIn=new Scanner(file);
			while(scanIn.hasNextLine()){
				InputLine=scanIn.nextLine();
				String[] InArray=InputLine.split(",");
				for(int x=0;x<InArray.length;x++)
				{
					myarray1[rowc][x]=Double.parseDouble(InArray[x]);
				}
				rowc++;
				
				
			}
			
		
		}catch(Exception e0){
			JOptionPane.showMessageDialog(null,e0);
		}
		return rowc;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesignofTensionSteel window = new DesignofTensionSteel();
					window.frmDesignOfTension.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public DesignofTensionSteel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDesignOfTension = new JFrame();
		frmDesignOfTension.getContentPane().setBackground(new Color(0, 102, 102));
		frmDesignOfTension.setTitle("Design of Tension Member");
		frmDesignOfTension.setBounds(100, 100, 630, 701);
		frmDesignOfTension.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDesignOfTension.getContentPane().setLayout(null);
		
		JLabel lblThisSoftwareHelps = new JLabel("This Software Helps In Design of Tension Steel Members");
		lblThisSoftwareHelps.setFont(new Font("Microsoft Sans Serif", Font.BOLD | Font.ITALIC, 13));
		lblThisSoftwareHelps.setBounds(77, 11, 400, 32);
		frmDesignOfTension.getContentPane().add(lblThisSoftwareHelps);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 46, 594, 590);
		frmDesignOfTension.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("1)Section Selection", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Please Input Following:");
		label.setForeground(new Color(0, 204, 204));
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		label.setBounds(154, 11, 156, 29);
		panel.add(label);
		
		JLabel lblEnterGradeOf = new JLabel("Enter Grade Of Steel(fy):");
		lblEnterGradeOf.setForeground(new Color(0, 204, 204));
		lblEnterGradeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterGradeOf.setBounds(10, 51, 156, 29);
		panel.add(lblEnterGradeOf);
		
		TFgrade = new JTextField();
		TFgrade.setText("250");
		TFgrade.setBounds(164, 56, 43, 20);
		panel.add(TFgrade);
		TFgrade.setColumns(10);
		
		JLabel lblMpa = new JLabel("Mpa");
		lblMpa.setForeground(new Color(0, 204, 204));
		lblMpa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMpa.setBounds(217, 51, 43, 29);
		panel.add(lblMpa);
		
		JLabel lblDesignTensionForcekn = new JLabel("Design Tension Force(KN):");
		lblDesignTensionForcekn.setForeground(new Color(0, 204, 204));
		lblDesignTensionForcekn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDesignTensionForcekn.setBounds(10, 91, 174, 29);
		panel.add(lblDesignTensionForcekn);
		
		TFtension = new JTextField();
		TFtension.setText("150");
		TFtension.setBounds(174, 96, 86, 20);
		panel.add(TFtension);
		TFtension.setColumns(10);
		
		JLabel lblChooseArrangementFor = new JLabel("Choose arrangement for angled section:");
		lblChooseArrangementFor.setForeground(new Color(0, 204, 204));
		lblChooseArrangementFor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChooseArrangementFor.setBounds(10, 131, 250, 29);
		panel.add(lblChooseArrangementFor);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setSelected(true);
		buttonGroup.add(radioButton);
		radioButton.setBounds(10, 274, 109, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(206, 274, 135, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(404, 274, 109, 23);
		panel.add(radioButton_2);
		
		JLabel lblImportSteelTable = new JLabel("Import Steel table for Angled Section:");
		lblImportSteelTable.setForeground(new Color(0, 204, 204));
		lblImportSteelTable.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblImportSteelTable.setBounds(10, 304, 250, 29);
		panel.add(lblImportSteelTable);
		
		TFimport = new JTextField();
		TFimport.setText("C:\\Users\\Bishal\\Documents\\tensionangletable.csv");
		TFimport.setBounds(254, 309, 221, 20);
		panel.add(TFimport);
		TFimport.setColumns(10);
		
		JButton btnImport = new JButton("IMPORT");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFimport.setText(filename);
			}
		});
		btnImport.setBounds(490, 308, 89, 23);
		panel.add(btnImport);
		
		JLabel lblChooseSectionWith = new JLabel("Choose Section with Area greater than:");
		lblChooseSectionWith.setForeground(new Color(0, 204, 102));
		lblChooseSectionWith.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChooseSectionWith.setBounds(10, 459, 250, 29);
		panel.add(lblChooseSectionWith);
		
		JLabel lblMostEconomicSection = new JLabel("Most Economic Section is:");
		lblMostEconomicSection.setForeground(new Color(0, 204, 102));
		lblMostEconomicSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMostEconomicSection.setBounds(10, 487, 174, 29);
		panel.add(lblMostEconomicSection);
		
		JButton btnAngleSelection = new JButton("Calculate Required Area");
		btnAngleSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				double grade=Double.parseDouble(TFgrade.getText());
				double tension=Double.parseDouble(TFtension.getText());
				String export=TFexport.getText();
				
                String a = null;
				
				Enumeration<AbstractButton> bg=buttonGroup.getElements();
				while(bg.hasMoreElements()){
					JRadioButton jrd=(JRadioButton) bg.nextElement();
					
					if(jrd.isSelected())
					a=jrd.getText();
					
						
				}
				double value=Double.parseDouble(a);
				String location=TFimport.getText();
				setupmycsvarray(location);
				
				
				double[][] sutaible=new double[200][200];
				if(value==1)
				ag=tension*1.1/grade*10;
				else
					ag=tension*1.1/grade*10/2;
				int j=0,z=0,n=0;
				double greatest=100;
				String amcs=String.format("%.3f",ag);
				TVag.setText(amcs+"cm square");
				for(int i=0;i<137;i++){
					if(myarray[i][3]>ag&&myarray[i][3]<greatest)
					{
						j=i;
						greatest=myarray[i][3];
					}
					if(myarray[i][3]>ag)
					{
						sutaible[z][0]=myarray[i][0];
						sutaible[z][1]=myarray[i][1];
						sutaible[z][2]=myarray[i][2];
						sutaible[z][3]=myarray[i][3];
						z++;
					}
				}
				
				
				
				String lengths=String.format("%.3f",myarray[j][0]);
				String widths=String.format("%.3f",myarray[j][1]);
				String thicks=String.format("%.3f",myarray[j][2]);
				String areas=String.format("%.3f",myarray[j][3]);
				
				
				TVecosection.setText(" "+lengths+"*"+widths+"*"+thicks+" with gross area="+areas);
				TFl.setText(lengths);
				TFb.setText(widths);
				TFt.setText(thicks);
				 Formatter xf;
				 xf=new Formatter(export);

				 for(int i=0;i<z;i++)
				 {
					
				 xf.format("%.3f%s%.3f%s%.3f%s%.3f%s",sutaible[i][0],",",sutaible[i][1],",",sutaible[i][2],",",sutaible[i][3],"\n");
			
					
				 }
				 xf.close();
				
				
				
			}
			
				
			catch(Exception e1){
				JOptionPane.showMessageDialog(null,e1);
			}
		}	
			
		});
		btnAngleSelection.setBounds(121, 426, 220, 23);
		panel.add(btnAngleSelection);
		
		JLabel lblExportAngleSection = new JLabel("Export angle section with sutaible area(.csv):");
		lblExportAngleSection.setForeground(new Color(0, 204, 102));
		lblExportAngleSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblExportAngleSection.setBounds(10, 344, 331, 29);
		panel.add(lblExportAngleSection);
		
		TFexport = new JTextField();
		TFexport.setText("C:\\Users\\Bishal\\Documents\\hERAME.csv");
		TFexport.setColumns(10);
		TFexport.setBounds(16, 384, 221, 20);
		panel.add(TFexport);
		
		JLabel lblChooseSection = new JLabel("Choose Section:");
		lblChooseSection.setForeground(new Color(0, 204, 102));
		lblChooseSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChooseSection.setBounds(10, 522, 115, 29);
		panel.add(lblChooseSection);
		
		TFl = new JTextField();
		TFl.setBounds(121, 521, 43, 20);
		panel.add(TFl);
		TFl.setColumns(10);
		
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(new Color(0, 204, 51));
		label_1.setBounds(171, 527, 27, 14);
		panel.add(label_1);
		
		TFb = new JTextField();
		TFb.setColumns(10);
		TFb.setBounds(181, 522, 43, 20);
		panel.add(TFb);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(new Color(0, 204, 51));
		label_2.setBounds(231, 528, 27, 14);
		panel.add(label_2);
		
		TFt = new JTextField();
		TFt.setColumns(10);
		TFt.setBounds(243, 522, 43, 20);
		panel.add(TFt);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double l=Double.parseDouble(TFl.getText());
					double b=Double.parseDouble(TFb.getText());
					double t=Double.parseDouble(TFt.getText());
					int j=-1;
					for(int i=0;i<137;i++)
					{
						if(l==myarray[i][0]&&b==myarray[i][1]&&t==myarray[i][2])
							j=i;
					}
					if(j==-1){
						TVok.setText("please enter valid data");
					}
					else{
						if(myarray[j][3]>=ag)
							TVok.setText("Design is OK");
						else{
							TVok.setText("Design is not OK");
						JOptionPane.showMessageDialog(null,"please enter sutaible section from table");
						}
						
					
					 
						
					}
					
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null,e2);
				}
			}
		});
		btnSelect.setBounds(316, 522, 89, 23);
		panel.add(btnSelect);
		
		TVok = new JLabel("..");
		TVok.setForeground(new Color(0, 204, 102));
		TVok.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVok.setBounds(415, 522, 174, 29);
		panel.add(TVok);
		
		TVag = new JLabel("0.0");
		TVag.setForeground(new Color(204, 255, 102));
		TVag.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVag.setBounds(270, 459, 115, 29);
		panel.add(TVag);
		
		TVecosection = new JLabel("0.0");
		TVecosection.setForeground(new Color(204, 255, 102));
		TVecosection.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVecosection.setBounds(189, 487, 344, 29);
		panel.add(TVecosection);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFexport.setText(filename);
			}
		});
		btnBrowse.setBounds(252, 384, 89, 23);
		panel.add(btnBrowse);
		
		JLabel label_5 = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/type1.jpg")).getImage();
		label_5.setIcon(new ImageIcon(img));
		
		label_5.setBounds(10, 157, 156, 110);
		panel.add(label_5);
		
		JLabel lblNewLabel = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/type2.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(183, 157, 202, 110);
		panel.add(lblNewLabel);
		
		JLabel label_6 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/type3.jpg")).getImage();
		label_6.setIcon(new ImageIcon(img2));
		label_6.setBounds(405, 130, 174, 137);
		panel.add(label_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("Connection Design", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblForBolted = new JLabel("For Bolted");
		lblForBolted.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblForBolted.setForeground(Color.RED);
		lblForBolted.setBounds(48, 68, 102, 24);
		panel_1.add(lblForBolted);
		
		JLabel lblForWelded = new JLabel("For Welded");
		lblForWelded.setForeground(Color.RED);
		lblForWelded.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblForWelded.setBounds(373, 68, 102, 24);
		panel_1.add(lblForWelded);
		
		JLabel lblEnterGradeOf_1 = new JLabel("Enter grade of Bolt(fub):");
		lblEnterGradeOf_1.setForeground(new Color(0, 204, 204));
		lblEnterGradeOf_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterGradeOf_1.setBounds(10, 103, 156, 29);
		panel_1.add(lblEnterGradeOf_1);
		
		TFboltgrade = new JTextField();
		TFboltgrade.setText("400");
		TFboltgrade.setBounds(171, 108, 86, 20);
		panel_1.add(TFboltgrade);
		TFboltgrade.setColumns(10);
		
		JLabel lblEnterRequiredEnd = new JLabel("Enter end Distance(mm):");
		lblEnterRequiredEnd.setForeground(new Color(0, 204, 204));
		lblEnterRequiredEnd.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterRequiredEnd.setBounds(10, 143, 162, 29);
		panel_1.add(lblEnterRequiredEnd);
		
		JLabel lblEnterEdgeDistancemm = new JLabel("Enter edge Distance(mm):");
		lblEnterEdgeDistancemm.setForeground(new Color(0, 204, 204));
		lblEnterEdgeDistancemm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterEdgeDistancemm.setBounds(10, 183, 162, 29);
		panel_1.add(lblEnterEdgeDistancemm);
		
		JLabel lblEnterPitchDistancemm = new JLabel("Enter pitch Distance(mm):");
		lblEnterPitchDistancemm.setForeground(new Color(0, 204, 204));
		lblEnterPitchDistancemm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterPitchDistancemm.setBounds(10, 222, 162, 29);
		panel_1.add(lblEnterPitchDistancemm);
		
		TFend = new JTextField();
		TFend.setText("40");
		TFend.setBounds(171, 148, 86, 20);
		panel_1.add(TFend);
		TFend.setColumns(10);
		
		TFedge = new JTextField();
		TFedge.setText("25");
		TFedge.setColumns(10);
		TFedge.setBounds(181, 188, 86, 20);
		panel_1.add(TFedge);
		
		TFpitch = new JTextField();
		TFpitch.setText("60");
		TFpitch.setColumns(10);
		TFpitch.setBounds(182, 227, 86, 20);
		panel_1.add(TFpitch);
		
		JLabel lblEnterBoltDiametermm = new JLabel("Enter Bolt Diameter(mm):");
		lblEnterBoltDiametermm.setForeground(new Color(0, 204, 204));
		lblEnterBoltDiametermm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterBoltDiametermm.setBounds(10, 262, 162, 29);
		panel_1.add(lblEnterBoltDiametermm);
		
		TFdiam = new JTextField();
		TFdiam.setText("20");
		TFdiam.setColumns(10);
		TFdiam.setBounds(181, 267, 86, 20);
		panel_1.add(TFdiam);
		
		JButton btnDesignConnection = new JButton("Design Bolted Connection");
		btnDesignConnection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			try{
				double grade=Double.parseDouble(TFgrade.getText());
				double boltgrade=Double.parseDouble(TFboltgrade.getText());
				double edge=Double.parseDouble(TFedge.getText());
				double end=Double.parseDouble(TFend.getText());
				double pitch=Double.parseDouble(TFpitch.getText());
				double tension=Double.parseDouble(TFtension.getText());
				double diam=Double.parseDouble(TFdiam.getText());
				double tgusset=Double.parseDouble(TFtgusset.getText());
				double l=Double.parseDouble(TFl.getText());
				double b=Double.parseDouble(TFb.getText());
				double t=Double.parseDouble(TFt.getText());
				double gradeu=410;
				
				if(pitch<2.5*diam)
					pitch=2.5*diam;
				if(pitch>Math.min(32*t,300))
					pitch=Math.min(32*t,300);
				 String pitchs=String.format("%.3f",pitch);
				 TFpitch.setText(pitchs);
				 if(end<1.7*(diam+2))
						end=1.7*(diam+2);

					if(end>12*t*Math.sqrt(250/grade))
						end=12*t*Math.sqrt(250/grade);
					 String ends=String.format("%.3f",end);
					 TFend.setText(ends);
					 if(edge<1.7*(diam+2))
							edge=1.7*(diam+2);

						if(edge>12*t*Math.sqrt(250/grade))
							edge=12*t*Math.sqrt(250/grade);
						 String edges=String.format("%.3f",edge);
						 TFedge.setText(edges);
					 
				String a = null;
				
				
				
				
				Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
				while(bg1.hasMoreElements()){
					JRadioButton jrd=(JRadioButton) bg1.nextElement();
					
					if(jrd.isSelected())
					a=jrd.getText();
					
						
				}
				double base=0;
				if(a=="Longer")
				base=l;
				else
					base=b;
				Enumeration<AbstractButton> bg=buttonGroup.getElements();
				while(bg.hasMoreElements()){
					JRadioButton jrd=(JRadioButton) bg.nextElement();
					
					if(jrd.isSelected())
					a=jrd.getText();
					
						
				}
				double type=Double.parseDouble(a);
				double n=0,f1,f2,f,v,d0;
				if(type==1||type==2)
					n=1;
				else
					n=2;
				double bn=0,vdsb,vdpb,no;
				vdsb=boltgrade/(1.732*1.25)*(n*3.14*diam*diam/4)*0.001;
				d0=diam+2;
				double a1=end/(3*d0);
				double b1=pitch/(3*d0)-0.25;
				double c1=boltgrade/410;
				f1=Math.min(a1,b1);
				f2=Math.min(c1,1);
				f=Math.min(f1,f2);
				vdpb=2.5/1.25*t*diam*f*410*0.001;
				v=Math.min(vdsb,vdpb);
				no=tension/v;
				do
				{
					bn++;
				}while(bn<no);
				
				 String results=String.format("%.3f",bn);
				 TVresult.setText("Required no of bolts:"+results);
				 TFno.setText(results);
				
			    
				
				
			}catch(Exception e100){
				JOptionPane.showMessageDialog(null,"please enter valid no.");
			}
			}
		});
		btnDesignConnection.setBounds(10, 343, 156, 23);
		panel_1.add(btnDesignConnection);
		
		JLabel label_3 = new JLabel("Thickness Of Gusset plate(mm):");
		label_3.setForeground(new Color(0, 204, 204));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(291, 186, 192, 26);
		panel_1.add(label_3);
		
		TFtgusset = new JTextField();
		TFtgusset.setText("12");
		TFtgusset.setColumns(10);
		TFtgusset.setBounds(493, 190, 86, 20);
		panel_1.add(TFtgusset);
		
		JButton button = new JButton("Generate size limit for weld connection");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double l=Double.parseDouble(TFl.getText());
					double b=Double.parseDouble(TFb.getText());
					double t=Double.parseDouble(TFt.getText());
					double tgusset=Double.parseDouble(TFtgusset.getText());
					double size=Double.parseDouble(TFsize.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup_1.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					
					double base=0;
					if(a=="Larger")
					base=l;
					else
						base=b;
					double tmin = 3,tmax;
					tmax=t-1.5;
					
					if(tgusset<=10)tmin=3;
					if(tgusset>10&&tgusset<=20)tmin=5;
					if(tgusset>20&&tgusset<=32)tmin=6;
					if(tgusset>32&&tgusset<=50)tmin=8;
					String tmins=String.format("%.2f",tmin);
					
					String tmaxs=String.format("%.2f",tmax);
					
					TVlimit.setText("max="+tmins+"mm"+" min="+tmaxs+"mm");
					if(size<tmin)TFsize.setText(tmins);
					if(size>tmax)TFsize.setText(tmaxs);
					
						
					
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			
			
			}
		});
		button.setBounds(301, 228, 258, 23);
		panel_1.add(button);
		
		JLabel lblGussetPlateIs = new JLabel("Gusset plate is joint with:");
		lblGussetPlateIs.setForeground(new Color(0, 204, 204));
		lblGussetPlateIs.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGussetPlateIs.setBounds(10, 11, 170, 29);
		panel_1.add(lblGussetPlateIs);
		
		JRadioButton rdbtnLonger = new JRadioButton("Longer");
		rdbtnLonger.setSelected(true);
		buttonGroup_1.add(rdbtnLonger);
		rdbtnLonger.setBounds(171, 15, 109, 23);
		panel_1.add(rdbtnLonger);
		
		JRadioButton rdbtnShorter = new JRadioButton("Shorter");
		buttonGroup_1.add(rdbtnShorter);
		rdbtnShorter.setBounds(284, 15, 109, 23);
		panel_1.add(rdbtnShorter);
		
		JLabel lblMember = new JLabel("Member");
		lblMember.setForeground(new Color(0, 204, 204));
		lblMember.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMember.setBounds(409, 11, 170, 29);
		panel_1.add(lblMember);
		
		JRadioButton radioButton_3 = new JRadioButton("Shop Weld");
		buttonGroup_2.add(radioButton_3);
		radioButton_3.setSelected(true);
		radioButton_3.setBounds(373, 103, 86, 23);
		panel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("field weld");
		buttonGroup_2.add(radioButton_4);
		radioButton_4.setBounds(475, 103, 77, 23);
		panel_1.add(radioButton_4);
		
		JLabel label_4 = new JLabel("Fusion Angle(degree):");
		label_4.setForeground(new Color(51, 204, 255));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(333, 146, 149, 26);
		panel_1.add(label_4);
		
		TFangle = new JTextField();
		TFangle.setForeground(new Color(0, 0, 0));
		TFangle.setText("90");
		TFangle.setColumns(10);
		TFangle.setBounds(474, 150, 86, 20);
		panel_1.add(TFangle);
		
		TVlimit = new JLabel("....");
		TVlimit.setForeground(new Color(102, 255, 51));
		TVlimit.setBounds(306, 270, 253, 14);
		panel_1.add(TVlimit);
		
		JLabel lblEnterSizeOf = new JLabel("Enter Size Of Weld:");
		lblEnterSizeOf.setForeground(new Color(0, 204, 255));
		lblEnterSizeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterSizeOf.setBounds(333, 295, 124, 26);
		panel_1.add(lblEnterSizeOf);
		
		TFsize = new JTextField();
		TFsize.setText("6");
		TFsize.setColumns(10);
		TFsize.setBounds(467, 299, 86, 20);
		panel_1.add(TFsize);
		
		JButton btnDesignWeldedConnection = new JButton("Design Welded Connection");
		btnDesignWeldedConnection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double size=Double.parseDouble(TFsize.getText());
					double grade=Double.parseDouble(TFgrade.getText());
					double tension=Double.parseDouble(TFtension.getText());
					double l=Double.parseDouble(TFl.getText());
					double b=Double.parseDouble(TFb.getText());
					double t=Double.parseDouble(TFt.getText());
					double angle=Double.parseDouble(TFangle.getText());
					double tgusset=Double.parseDouble(TFtgusset.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double type=Double.parseDouble(a);
					
					
					Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
					while(bg1.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg1.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double base=0;
					if(a=="Longer")
					base=l;
					else
						base=b;
					
					
					Enumeration<AbstractButton> bg11=buttonGroup_2.getElements();
					while(bg11.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg11.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double fs=0;
					if(a=="Shop Weld")fs=1.25;
					if(a=="field weld")fs=1.5;
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
					lw=tension*1.732*fs*1000/(grade*k*size);
					String lws=String.format("%.3f",lw);
					double overlap=(lw-base)/2;
					if(overlap<Math.max(t*0.4,40)){
						overlap=Math.max(t*0.4,40);
						lw=base+2*overlap;
					}
					String overlaps=String.format("%.3f",lw/2);
					
					TVresult.setText("Total legth of weld required(min)="+lws+"mm"+"("+overlaps+"mm"+" on both sides");
					TFweld.setText(lws);
					
					
					
					
				}catch(Exception e10){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnDesignWeldedConnection.setBounds(306, 343, 246, 23);
		panel_1.add(btnDesignWeldedConnection);
		
		TVresult = new JLabel("...");
		TVresult.setForeground(Color.ORANGE);
		TVresult.setBounds(36, 431, 479, 14);
		panel_1.add(TVresult);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		buttonGroup_3.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(132, 71, 77, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton_5 = new JRadioButton("2");
		buttonGroup_3.add(radioButton_5);
		radioButton_5.setBounds(456, 71, 77, 23);
		panel_1.add(radioButton_5);
		
		JLabel lblEnterNoOf = new JLabel("Enter No of Bolts:");
		lblEnterNoOf.setForeground(new Color(0, 204, 204));
		lblEnterNoOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterNoOf.setBounds(4, 477, 118, 29);
		panel_1.add(lblEnterNoOf);
		
		TFno = new JTextField();
		TFno.setBounds(113, 482, 86, 20);
		panel_1.add(TFno);
		TFno.setColumns(10);
		
		JLabel lblEnterWeldDistance = new JLabel("Enter Weld Distance(mm):");
		lblEnterWeldDistance.setForeground(new Color(0, 204, 204));
		lblEnterWeldDistance.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterWeldDistance.setBounds(261, 477, 162, 29);
		panel_1.add(lblEnterWeldDistance);
		
		TFweld = new JTextField();
		TFweld.setColumns(10);
		TFweld.setBounds(433, 482, 86, 20);
		panel_1.add(TFweld);
		
		JButton btnConfirm = new JButton("Confirm bolt no");
		btnConfirm.setBounds(10, 528, 140, 23);
		panel_1.add(btnConfirm);
		
		JButton btnConfirmWeldDistance = new JButton("Confirm weld distance");
		btnConfirmWeldDistance.setBounds(261, 528, 185, 23);
		panel_1.add(btnConfirmWeldDistance);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("Rupture and Block Shear", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblDesignStrengthDue = new JLabel("Design Strength Due to Rupture");
		lblDesignStrengthDue.setForeground(Color.RED);
		lblDesignStrengthDue.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesignStrengthDue.setBounds(10, 11, 223, 24);
		panel_2.add(lblDesignStrengthDue);
		
		JButton btnCheck = new JButton("Check..");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String a = null;
					
					Enumeration<AbstractButton> bg55=buttonGroup_3.getElements();
					while(bg55.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg55.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double value=Double.parseDouble(a);
					if(value==1)
					{
						double grade=Double.parseDouble(TFgrade.getText());
						double boltgrade=Double.parseDouble(TFboltgrade.getText());
						double edge=Double.parseDouble(TFedge.getText());
						double end=Double.parseDouble(TFend.getText());
						double pitch=Double.parseDouble(TFpitch.getText());
						double tension=Double.parseDouble(TFtension.getText());
						double diam=Double.parseDouble(TFdiam.getText());
						double tgusset=Double.parseDouble(TFtgusset.getText());
						double l=Double.parseDouble(TFl.getText());
						double b=Double.parseDouble(TFb.getText());
						double t=Double.parseDouble(TFt.getText());
						double no=Double.parseDouble(TFno.getText());
						Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
						while(bg1.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg1.nextElement();
							
							if(jrd.isSelected())
							a=jrd.getText();
							
								
						}
						double base=0,other=0;
						if(a=="Longer")
						{
						base=l;
						other=b;
						}
						else{
							base=b;
							other=l;
						}
						double anc=(base-t/2-diam-2)*t;
						double ago=(other-t/2)*t;
						double bs=other+(base-edge)-t;
						double fac=1.4-0.076*(other/t)*(grade/boltgrade)*(bs/(pitch*(no-1)));
						if(fac<0.7)
							fac=0.7;
						if(fac>(boltgrade*1.1/(grade*1.25)));
						fac=boltgrade*1.1/(grade*1.25);
						double tdn=(0.9*anc*boltgrade/1.25+fac*ago*grade/1.1)*0.001;
						Enumeration<AbstractButton> bg=buttonGroup.getElements();
						while(bg.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg.nextElement();
							
							if(jrd.isSelected())
							a=jrd.getText();
							
								
						}
						double v=Double.parseDouble(a);
						if(v==2&&v==3)
							tdn=2*tdn;
						if(tension<=tdn){
						 String amcs=String.format("%.3f",tdn);
						 TVrupture.setText("The rupture Strength is:"+amcs+"KN"+" DESIGN IS OK");
						}
						else{
						 String amcss=String.format("%.3f",tdn);
						 TVrupture.setText("The rupture Strength is:"+amcss+" DESIGN IS NOT OK PLEASE REVISE");
						}
						double avg,avn,atg,atn,tdb;
						avg=(end+(no-1)*pitch)*t;
						avn=(end+(no-1)*pitch-(no-1)*(diam+2)-0.5*(diam+2))*t;
						atg=edge*t;
						atn=(edge-0.5*(diam+2))*t;
						tdb=Math.min(avg*grade/(1.732*1.1)+0.9*atn*410/1.25, atg*grade/1.1+0.9*avn*410/(1.732*1.25));
						tdb=0.001*tdb;
						if(v==2&&v==3)
							tdb=2*tdb;
						if(tension<=tdb){
							 String tdbs=String.format("%.3f",tdb);
							 TVblock.setText("The Block Strength is:"+tdbs+"KN"+" DESIGN IS OK");
							}
							else{
							 String tdbss=String.format("%.3f",tdb);
							 TVblock.setText("The Block Strength is:"+tdbss+" DESIGN IS NOT OK PLEASE REVISE");
							}
								
						
					}
					else if(value==2)
					{
						double l=Double.parseDouble(TFl.getText());
						double b=Double.parseDouble(TFb.getText());
						double t=Double.parseDouble(TFt.getText());
						
						double weld=Double.parseDouble(TFweld.getText());
						double grade=Double.parseDouble(TFgrade.getText());
						
						double tension=Double.parseDouble(TFtension.getText());
						Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
						while(bg1.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg1.nextElement();
							
							if(jrd.isSelected())
							a=jrd.getText();
							
								
						}
						double base=0,other=0;
						if(a=="Longer")
						{
						base=l;
						other=b;
						}
						else{
							base=b;
							other=l;
						}
						double anc=(base-t/2)*t;
						double ago=(other-t/2)*t;
						double bs=other;
						double fac=1.4-0.076*(other/t)*(grade/410)*(bs/(2*weld));
						if(fac<0.7)
							fac=0.7;
						if(fac>(410*1.1/(grade*1.25)));
						fac=410*1.1/(grade*1.25);
						double tdn=(0.9*anc*410/1.25+fac*ago*grade/1.1)*0.001;
						Enumeration<AbstractButton> bg=buttonGroup.getElements();
						while(bg.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg.nextElement();
							
							if(jrd.isSelected())
							a=jrd.getText();
							
								
						}
						double v=Double.parseDouble(a);
						if(v==2&&v==3)
							tdn=2*tdn;
						if(tension<=tdn){
						 String amcs=String.format("%.3f",tdn);
						 TVrupture.setText("The rupture Strength is:"+amcs+"KN"+" DESIGN IS OK");
						}
						else{
						 String amcss=String.format("%.3f",tdn);
						 TVrupture.setText("The rupture Strength is:"+amcss+" DESIGN IS NOT OK PLEASE REVISE");
						 TVblock.setText("Welded connection doesnt undergo block failure");
						}
						
						
					}
					
				}catch(Exception e150){
					JOptionPane.showMessageDialog(null,e150);
				}
			}
		});
		btnCheck.setBounds(227, 195, 89, 23);
		panel_2.add(btnCheck);
		
		JLabel lblDesignStrengthDue_1 = new JLabel("Design Strength Due to Block shear:");
		lblDesignStrengthDue_1.setForeground(Color.RED);
		lblDesignStrengthDue_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesignStrengthDue_1.setBounds(10, 103, 261, 24);
		panel_2.add(lblDesignStrengthDue_1);
		
	TVrupture = new JLabel("...");
		TVrupture.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVrupture.setForeground(Color.ORANGE);
		TVrupture.setBounds(10, 59, 504, 33);
		panel_2.add(TVrupture);
		
		TVblock = new JLabel("...");
		TVblock.setForeground(Color.ORANGE);
		TVblock.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVblock.setBounds(10, 138, 504, 33);
		panel_2.add(TVblock);
		
		JLabel lblGenerateAllSutaible = new JLabel("Generate all sutaible sections For Designing(Considering connection as well):");
		lblGenerateAllSutaible.setForeground(Color.RED);
		lblGenerateAllSutaible.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGenerateAllSutaible.setBounds(10, 273, 531, 24);
		panel_2.add(lblGenerateAllSutaible);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String a = null;
					int q=0;
					double[][] allsutaib=new double[2000][2000];
					double grade=Double.parseDouble(TFgrade.getText());
					double boltgrade=Double.parseDouble(TFboltgrade.getText());
					double edge=Double.parseDouble(TFedge.getText());
					double end=Double.parseDouble(TFend.getText());
					double pitch=Double.parseDouble(TFpitch.getText());
					double tension=Double.parseDouble(TFtension.getText());
					double diam=Double.parseDouble(TFdiam.getText());
					double tgusset=Double.parseDouble(TFtgusset.getText());
					double avg,avn,atg,atn;
					double no=Double.parseDouble(TFno.getText());
					double tdn=0;
					double tdb=0;
					Enumeration<AbstractButton> bg55=buttonGroup_3.getElements();
					while(bg55.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg55.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double value=Double.parseDouble(a);
					tot=setupmycsvarray1(TFexport.getText());
					for(int p=0;p<tot;p++)
					{
					if(value==1)
					{
						
						
						Enumeration<AbstractButton> bg1=buttonGroup_1.getElements();
						while(bg1.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg1.nextElement();
							
							if(jrd.isSelected())
							a=jrd.getText();
							
								
						}
						
						   double base=0,other=0;
						if(a=="Longer")
						{
						base=myarray1[p][0];
						other=myarray1[p][1];
						}
						else{
							base=myarray1[p][1];
							other=myarray1[p][0];
						}
						double anc=(base-myarray1[p][2]/2-diam-2)*myarray1[p][2];
						double ago=(other-myarray1[p][2]/2)*myarray1[p][2];
						double bs=other+(base-edge)-myarray1[p][2];
						double fac=1.4-0.076*(other/myarray1[p][2])*(grade/boltgrade)*(bs/(pitch*(no-1)));
						if(fac<0.7)
							fac=0.7;
						if(fac>(boltgrade*1.1/(grade*1.25)));
						fac=boltgrade*1.1/(grade*1.25);
						tdn=(0.9*anc*boltgrade/1.25+fac*ago*grade/1.1)*0.001;
						Enumeration<AbstractButton> bg=buttonGroup.getElements();
						while(bg.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg.nextElement();
							
							if(jrd.isSelected())
							a=jrd.getText();
							
								
						}
						double v=Double.parseDouble(a);
						if(v==2&&v==3)
							tdn=2*tdn;
						
						
						avg=(end+(no-1)*pitch)*myarray1[p][2];
						avn=(end+(no-1)*pitch-(no-1)*(diam+2)-0.5*(diam+2))*myarray1[p][2];
						atg=edge*myarray1[p][2];
						atn=(edge-0.5*(diam+2))*myarray1[p][2];
						tdb=Math.min(avg*grade/(1.732*1.1)+0.9*atn*410/1.25, atg*grade/1.1+0.9*avn*410/(1.732*1.25));
						tdb=0.001*tdb;
						if(v==2&&v==3)
							tdb=2*tdb;
						
						
						
						
						if(tension<tdb&&tension<tdn)
						{
							allsutaib[q][0]=myarray1[p][0];
							allsutaib[q][1]=myarray1[p][1];
							allsutaib[q][2]=myarray1[p][2];
							allsutaib[q][3]=myarray1[p][3];
							q++;
						}
					
					
					else if(value==2)
					{
						double l=myarray1[p][0];
						double b=myarray1[p][1];
						double t=myarray1[p][2];
						
						double weld=Double.parseDouble(TFweld.getText());
						double grade1=Double.parseDouble(TFgrade.getText());
						
						double tension1=Double.parseDouble(TFtension.getText());
						Enumeration<AbstractButton> bg11=buttonGroup_1.getElements();
						while(bg11.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg11.nextElement();
							
							if(jrd.isSelected())
							a=jrd.getText();
							
								
						}
						double base1=0,other1=0;
						if(a=="Longer")
						{
						base1=l;
						other1=b;
						}
						else{
							base1=b;
							other1=l;
						}
						double anc1=(base1-t/2)*t;
						double ago1=(other1-t/2)*t;
						double bs1=other1;
						double fac1=1.4-0.076*(other1/t)*(grade1/410)*(bs1/(2*weld));
						if(fac1<0.7)
							fac1=0.7;
						if(fac1>(410*1.1/(grade1*1.25)));
						fac1=410*1.1/(grade1*1.25);
						double tdn1=(0.9*anc1*410/1.25+fac1*ago1*grade1/1.1)*0.001;
						Enumeration<AbstractButton> bg111=buttonGroup.getElements();
						while(bg111.hasMoreElements()){
							JRadioButton jrd=(JRadioButton) bg111.nextElement();
							
							if(jrd.isSelected())
							a=jrd.getText();
							
								
						}
						
						double v1=Double.parseDouble(a);
						if(v1==2&&v1==3)
							tdn1=2*tdn1;
						
						
						if(tension1<tdn1)
						{
							allsutaib[q][0]=myarray1[p][0];
							allsutaib[q][1]=myarray1[p][1];
							allsutaib[q][2]=myarray1[p][2];
							allsutaib[q][3]=myarray1[p][3];
							q++;
						}
					}
						Formatter xf;
						 xf=new Formatter(TFeverysutaible.getText());

						 for(int i=0;i<q;i++)
						 {
							
						 xf.format("%.3f%s%.3f%s%.3f%s%.3f%s",allsutaib[i][0],",",allsutaib[i][1],",",allsutaib[i][2],",",allsutaib[i][3],"\n");
					
							
						 }
						 xf.close();
						}	
					}
						
				}catch(Exception e150){
					JOptionPane.showMessageDialog(null,e150);
				}
			
		
				
			}
		});
		btnGenerate.setBounds(451, 308, 89, 23);
		panel_2.add(btnGenerate);
		
		TFeverysutaible = new JTextField();
		TFeverysutaible.setText("C:\\Users\\Bishal\\Documents\\everysutaible.csv");
		TFeverysutaible.setBounds(20, 308, 367, 20);
		panel_2.add(TFeverysutaible);
		TFeverysutaible.setColumns(10);
	}
}
