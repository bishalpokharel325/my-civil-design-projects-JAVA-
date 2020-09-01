package steelflexturedesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class SteelFlexureDesign {

	private JFrame frmFlexuralDesignOf;
	private JTextField TFgrade;
	private JTextField TFbm;
	private JTextField TFshear;
	private JTextField TFimport;
	private JTextField TFexport;
	private JLabel TVresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SteelFlexureDesign window = new SteelFlexureDesign();
					window.frmFlexuralDesignOf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private JTextField TFvalue;
	static String xstrPath;
	static double[][] myarray;
	static double[][] myarray13;
	static double[][] myarray14;
	private JTextField TFlocation;
	private JTextField TFtable13;
	private JTextField TFtable14;
	private JTextField TFspan;
	private JTextField TFudl;
	private JTextField TFpoint;
	static void setupmycsvarray(String location)
	{
		myarray=new double[2000][2000];
		Scanner scanIn=null;
		int rowc=0;
		int row=0;
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
			JOptionPane.showMessageDialog(null,"please enter valid no.");
		}
	}
	static void setupmycsvarray13(String location)
	{
		myarray13=new double[2000][2000];
		Scanner scanIn=null;
		int rowc=0;
		int row=0;
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
					myarray13[rowc][x]=Double.parseDouble(InArray[x]);
				}
				rowc++;
				
			}
			
			
		}catch(Exception e000){
			JOptionPane.showMessageDialog(null,"please enter valid no.");
		}
	}
	static void setupmycsvarray14(String location)
	{
		myarray14=new double[2000][2000];
		Scanner scanIn=null;
		int rowc=0;
		int row=0;
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
					myarray14[rowc][x]=Double.parseDouble(InArray[x]);
				}
				rowc++;
				
			}
			
			
		}catch(Exception e000){
			JOptionPane.showMessageDialog(null,"please enter valid no.");
		}
	}
	
	static double dinterpolate(double[][] mya,double x,double y)
	{
	    double a1,a2,a0;
	    int i,j;
	    for(i=1;i<=30;i++)
	        if(x>mya[0][i])
	            break;
	    i--;
	    for(j=1;j<=15;j++)
	        if(y>mya[j][0])
	            break;
	    j--;
	    a1=mya[i][j]+(mya[i][j+1]-mya[i][j])*(x-mya[0][j])/(mya[0][j+1]-mya[0][j]);
	    a2=mya[i+1][j]+(mya[i+1][j+1]-mya[i+1][j])*(x-mya[0][j])/(mya[0][j+1]-mya[0][j]);
	    a0=a1+(a2-a1)*(y-mya[i][0])/(mya[i+1][0]-mya[i][0]);
	    return a0;
	}

	public SteelFlexureDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFlexuralDesignOf = new JFrame();
		frmFlexuralDesignOf.getContentPane().setBackground(new Color(0, 51, 0));
		frmFlexuralDesignOf.setTitle("Flexural Design of Steel ");
		frmFlexuralDesignOf.setBounds(100, 100, 638, 483);
		frmFlexuralDesignOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFlexuralDesignOf.getContentPane().setLayout(null);
		
		JLabel lblEnterSteelGradefy = new JLabel("Enter Steel Grade(fy):");
		lblEnterSteelGradefy.setForeground(new Color(0, 204, 204));
		lblEnterSteelGradefy.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterSteelGradefy.setBounds(10, 11, 156, 29);
		frmFlexuralDesignOf.getContentPane().add(lblEnterSteelGradefy);
		
		TFgrade = new JTextField();
		TFgrade.setText("250");
		TFgrade.setBounds(156, 16, 86, 20);
		frmFlexuralDesignOf.getContentPane().add(TFgrade);
		TFgrade.setColumns(10);
		
		JLabel lblEnterDesignedBm = new JLabel("Enter designed BM to be Resisted(KNm):");
		lblEnterDesignedBm.setForeground(new Color(0, 204, 204));
		lblEnterDesignedBm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDesignedBm.setBounds(10, 51, 256, 29);
		frmFlexuralDesignOf.getContentPane().add(lblEnterDesignedBm);
		
		TFbm = new JTextField();
		TFbm.setText("223.46");
		TFbm.setBounds(276, 56, 86, 20);
		frmFlexuralDesignOf.getContentPane().add(TFbm);
		TFbm.setColumns(10);
		
		JLabel lblEnterDesignShear = new JLabel("Enter Design Shear Force(KN):");
		lblEnterDesignShear.setForeground(new Color(0, 204, 204));
		lblEnterDesignShear.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDesignShear.setBounds(10, 117, 194, 29);
		frmFlexuralDesignOf.getContentPane().add(lblEnterDesignShear);
		
		TFshear = new JTextField();
		TFshear.setText("107.69");
		TFshear.setBounds(214, 122, 86, 20);
		frmFlexuralDesignOf.getContentPane().add(TFshear);
		TFshear.setColumns(10);
		
		JLabel lblImportSteelData = new JLabel("Import steel data for flanged section(.csv):");
		lblImportSteelData.setForeground(new Color(0, 204, 204));
		lblImportSteelData.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblImportSteelData.setBounds(10, 272, 276, 29);
		frmFlexuralDesignOf.getContentPane().add(lblImportSteelData);
		
		TFimport = new JTextField();
		TFimport.setText("C:\\Users\\Bishal\\Documents\\flangedsections.csv");
		TFimport.setBounds(296, 277, 213, 20);
		frmFlexuralDesignOf.getContentPane().add(TFimport);
		TFimport.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFimport.setText(filename);
			}
		});
		btnBrowse.setBounds(523, 276, 89, 23);
		frmFlexuralDesignOf.getContentPane().add(btnBrowse);
		
		JLabel TVresult = new JLabel("..");
		TVresult.setForeground(new Color(204, 204, 0));
		TVresult.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		TVresult.setBounds(10, 413, 199, 20);
		frmFlexuralDesignOf.getContentPane().add(TVresult);
		
		JButton btnFindRequiredSection = new JButton("find required section Modulus");
		btnFindRequiredSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double grade=Double.parseDouble(TFgrade.getText());
					double bm=Double.parseDouble(TFbm.getText());
					double shear=Double.parseDouble(TFshear.getText());
					double span=Double.parseDouble(TFspan.getText());
					double udl=Double.parseDouble(TFudl.getText());
					double point=Double.parseDouble(TFpoint.getText());
					
					setupmycsvarray(TFimport.getText());
					setupmycsvarray13(TFtable13.getText());
					setupmycsvarray14(TFtable14.getText());
					double zp=0,deflection,e,Bb,md,mdv = 0,mfd,vd,klbyr,hbytf,x1,x2,x3,x4,fcd;
					zp=bm*1.1/grade*1000;
					double fcbr;
					double[][] sutaible=new double[2000][2000];
					double[][] another=new double[2000][2000];
					int j=0,classi=-1;
					double temp;
					for(int i=0;i<60;i++)
					{
						if(myarray[i][6]>zp)
						{
							e=Math.sqrt(grade/250);
							if((myarray[i][1]-2*myarray[i][3])/myarray[i][4]<84*e)
								classi=1;
							else if((myarray[i][1]-2*myarray[i][3])/myarray[i][4]>84*e&&(myarray[i][1]-2*myarray[i][3])/myarray[i][4]<105*e)
								classi=2;
							else
								classi=3;
							if(classi==3)
								Bb=myarray[i][5]/myarray[i][6];
							else
								Bb=1;
							vd=myarray[i][1]*myarray[i][4]*grade/(1.732*1.1)*0.001;
							if(vd<shear)
								break;
							if(vd*0.600>shear){
							mdv=Bb*myarray[i][6]*grade/1.1;
							if(mdv>=1.2*myarray[i][5]*grade/1.1)
								mdv=1.2*myarray[i][5]*grade/1.1;
							
							
							}
							else{
								klbyr=span/myarray[i][8];
								hbytf=myarray[i][1]/myarray[i][3];
								fcbr=dinterpolate(myarray14,klbyr,hbytf);
								fcd=dinterpolate(myarray13,grade,fcbr);
								mfd=fcd*myarray[i][0]*100;
								md=Bb*myarray[i][6]*grade/1.1;
								if(md>=1.2*myarray[i][5]*grade/1.1)
									md=1.2*myarray[i][5]*grade/1.1;
								mdv=md-(2*shear/vd-1)*(2*shear/vd-1)*(md-mfd);
								if(mdv>=1.2*myarray[i][5]*grade/1.1)
									mdv=1.2*myarray[i][5]*grade/1.1;
								if(mdv<bm){
									
									break;
								}
							}
							if(mdv<bm){
								
								break;
							}
							deflection=5/384*udl*span*span*span*span*1000000000/(2*100000*myarray[i][7]*10000)+point*1000*span*1000*span*1000*span*1000*span/(48*2*100000*myarray[i][7]*10000);
							if(deflection>span*1000/240)
								break;
							
							sutaible[j][0]=myarray[i][0];
							sutaible[j][1]=myarray[i][1];
							sutaible[j][2]=myarray[i][2];
							sutaible[j][3]=myarray[i][3];
							sutaible[j][4]=myarray[i][4];
							sutaible[j][5]=myarray[i][5];
							sutaible[j][6]=myarray[i][6];
							j++;
						}
						
					}
					Formatter xf;
					 xf=new Formatter(TFexport.getText());

					 for(int i=0;i<j;i++)
					 {
						
					 xf.format("%.3f%s%.3f%s%.3f%s%.3f%s%.3f%s%.3f%s%.3f%s",sutaible[i][0],",",sutaible[i][1],",",sutaible[i][2],",",sutaible[i][3],",",sutaible[i][4],",",sutaible[i][5],",",sutaible[i][6],"\n");
				
						
					 }
					 xf.close();
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
				
			}
		});
		btnFindRequiredSection.setBounds(177, 352, 173, 23);
		frmFlexuralDesignOf.getContentPane().add(btnFindRequiredSection);
		
		JLabel lblExportSteelData = new JLabel("Export all sutaible flanged section(.csv):");
		lblExportSteelData.setForeground(new Color(0, 204, 204));
		lblExportSteelData.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblExportSteelData.setBounds(10, 312, 276, 29);
		frmFlexuralDesignOf.getContentPane().add(lblExportSteelData);
		
		TFexport = new JTextField();
		TFexport.setText("C:\\Users\\Bishal\\Documents\\sutaibleflanges.csv");
		TFexport.setColumns(10);
		TFexport.setBounds(296, 317, 213, 20);
		frmFlexuralDesignOf.getContentPane().add(TFexport);
		
		JButton button = new JButton("Browse");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFexport.setText(filename);
			}
		});
		button.setBounds(523, 316, 89, 23);
		frmFlexuralDesignOf.getContentPane().add(button);
		
		JLabel lblImportTable_1 = new JLabel("Import table 14 of IS code(.csv):");
		lblImportTable_1.setForeground(new Color(0, 204, 204));
		lblImportTable_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblImportTable_1.setBounds(10, 232, 276, 29);
		frmFlexuralDesignOf.getContentPane().add(lblImportTable_1);
		
		JLabel lblImportTable = new JLabel("Import table 13 of IS code(.csv):");
		lblImportTable.setForeground(new Color(0, 204, 204));
		lblImportTable.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblImportTable.setBounds(73, 192, 213, 29);
		frmFlexuralDesignOf.getContentPane().add(lblImportTable);
		
		TFtable13 = new JTextField();
		TFtable13.setText("C:\\Users\\Bishal\\Documents\\flangedsections.csv");
		TFtable13.setColumns(10);
		TFtable13.setBounds(296, 197, 213, 20);
		frmFlexuralDesignOf.getContentPane().add(TFtable13);
		
		TFtable14 = new JTextField();
		TFtable14.setText("C:\\Users\\Bishal\\Documents\\flangedsections.csv");
		TFtable14.setColumns(10);
		TFtable14.setBounds(296, 237, 213, 20);
		frmFlexuralDesignOf.getContentPane().add(TFtable14);
		
		JButton button_1 = new JButton("Browse");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFtable13.setText(filename);
			}
		});
		button_1.setBounds(523, 196, 89, 23);
		frmFlexuralDesignOf.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Browse");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFtable14.setText(filename);
			}
		});
		button_2.setBounds(523, 236, 89, 23);
		frmFlexuralDesignOf.getContentPane().add(button_2);
		
		JLabel lblEnterSpanLengthm = new JLabel("Enter Span Length(m):");
		lblEnterSpanLengthm.setForeground(new Color(0, 204, 204));
		lblEnterSpanLengthm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterSpanLengthm.setBounds(48, 157, 156, 29);
		frmFlexuralDesignOf.getContentPane().add(lblEnterSpanLengthm);
		
		TFspan = new JTextField();
		TFspan.setText("1.5");
		TFspan.setColumns(10);
		TFspan.setBounds(199, 162, 86, 20);
		frmFlexuralDesignOf.getContentPane().add(TFspan);
		
		JLabel lblEnterDesignUdlkn = new JLabel("Enter Design UDL(KN):");
		lblEnterDesignUdlkn.setForeground(new Color(0, 204, 204));
		lblEnterDesignUdlkn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDesignUdlkn.setBounds(10, 80, 149, 29);
		frmFlexuralDesignOf.getContentPane().add(lblEnterDesignUdlkn);
		
		TFudl = new JTextField();
		TFudl.setText("25.95");
		TFudl.setColumns(10);
		TFudl.setBounds(156, 86, 86, 20);
		frmFlexuralDesignOf.getContentPane().add(TFudl);
		
		JLabel lblEnterDesignPoint = new JLabel("Enter Design point load at midspan(KN):");
		lblEnterDesignPoint.setForeground(new Color(0, 204, 204));
		lblEnterDesignPoint.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDesignPoint.setBounds(252, 82, 257, 29);
		frmFlexuralDesignOf.getContentPane().add(lblEnterDesignPoint);
		
		TFpoint = new JTextField();
		TFpoint.setText("25.95");
		TFpoint.setColumns(10);
		TFpoint.setBounds(526, 85, 86, 20);
		frmFlexuralDesignOf.getContentPane().add(TFpoint);
	}
}
