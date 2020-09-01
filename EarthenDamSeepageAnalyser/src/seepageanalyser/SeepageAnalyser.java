package seepageanalyser;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.Enumeration;
import java.util.Formatter;
import java.awt.event.ActionEvent;

public class SeepageAnalyser {

	private JFrame frmEarthenDamSeepage;
	private JTextField TFwidth;
	private JTextField TFmu;
	private JTextField TFmd;
	private JTextField TFup;
	private JTextField TFdo;
	private JTextField TFcl;
	private JTextField TFkd;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField TFx;
	private JTextField TFdepth;
	private JTextField TFkf;
	private JTextField TFkc;
	private JTextField TFx1;
	private JTextField TFx2;
	private JTextField TFx3;
	private JTextField TFx4;
	private JLabel TVresult1;
	private JLabel TVresult2;
	private JLabel TVresult3;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField TFlocation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeepageAnalyser window = new SeepageAnalyser();
					window.frmEarthenDamSeepage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SeepageAnalyser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEarthenDamSeepage = new JFrame();
		frmEarthenDamSeepage.getContentPane().setBackground(new Color(51, 102, 102));
		frmEarthenDamSeepage.setTitle("Earthen Dam Seepage Analyser");
		frmEarthenDamSeepage.setBounds(100, 100, 911, 736);
		frmEarthenDamSeepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEarthenDamSeepage.getContentPane().setLayout(null);
		
		JLabel lblEnterDamDimensions = new JLabel("Enter Dam Dimensions:");
		lblEnterDamDimensions.setForeground(Color.BLACK);
		lblEnterDamDimensions.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDamDimensions.setBounds(10, 11, 179, 26);
		frmEarthenDamSeepage.getContentPane().add(lblEnterDamDimensions);
		
		JLabel lblTopWidthm = new JLabel("Top Width(m):");
		lblTopWidthm.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblTopWidthm.setBounds(10, 41, 126, 26);
		frmEarthenDamSeepage.getContentPane().add(lblTopWidthm);
		
		TFwidth = new JTextField();
		TFwidth.setText("5");
		TFwidth.setColumns(10);
		TFwidth.setBounds(146, 45, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFwidth);
		
		JLabel lblSlopeOfUpstream = new JLabel("Slope of UpStream:");
		lblSlopeOfUpstream.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblSlopeOfUpstream.setBounds(10, 78, 126, 26);
		frmEarthenDamSeepage.getContentPane().add(lblSlopeOfUpstream);
		
		TFmu = new JTextField();
		TFmu.setText("3");
		TFmu.setColumns(10);
		TFmu.setBounds(146, 84, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFmu);
		
		JLabel lblDownstreamSlope = new JLabel("DownStream Slope:");
		lblDownstreamSlope.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblDownstreamSlope.setBounds(10, 115, 126, 26);
		frmEarthenDamSeepage.getContentPane().add(lblDownstreamSlope);
		
		TFmd = new JTextField();
		TFmd.setText("2");
		TFmd.setColumns(10);
		TFmd.setBounds(146, 119, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFmd);
		
		JLabel lblEnterWaterLevels = new JLabel("Enter Water Levels:");
		lblEnterWaterLevels.setForeground(Color.BLACK);
		lblEnterWaterLevels.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterWaterLevels.setBounds(273, 11, 179, 26);
		frmEarthenDamSeepage.getContentPane().add(lblEnterWaterLevels);
		
		JLabel lblUpstreamm = new JLabel("Upstream(m):");
		lblUpstreamm.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblUpstreamm.setBounds(263, 41, 126, 26);
		frmEarthenDamSeepage.getContentPane().add(lblUpstreamm);
		
		TFup = new JTextField();
		TFup.setText("38");
		TFup.setColumns(10);
		TFup.setBounds(399, 45, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFup);
		
		JLabel lblDownstreamm = new JLabel("Downstream(m):");
		lblDownstreamm.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblDownstreamm.setBounds(263, 78, 126, 26);
		frmEarthenDamSeepage.getContentPane().add(lblDownstreamm);
		
		TFdo = new JTextField();
		TFdo.setText("0");
		TFdo.setColumns(10);
		TFdo.setBounds(399, 84, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFdo);
		
		JLabel lblCrestLevelm = new JLabel("Crest Level(m):");
		lblCrestLevelm.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblCrestLevelm.setBounds(263, 115, 126, 26);
		frmEarthenDamSeepage.getContentPane().add(lblCrestLevelm);
		
		TFcl = new JTextField();
		TFcl.setText("43");
		TFcl.setColumns(10);
		TFcl.setBounds(399, 119, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFcl);
		
		JLabel lblEnterPermeabilityCoff = new JLabel("Enter permeability Coff of Dam(10^4 m/s):");
		lblEnterPermeabilityCoff.setForeground(Color.BLACK);
		lblEnterPermeabilityCoff.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterPermeabilityCoff.setBounds(10, 152, 270, 26);
		frmEarthenDamSeepage.getContentPane().add(lblEnterPermeabilityCoff);
		
		TFkd = new JTextField();
		TFkd.setText("0.22");
		TFkd.setColumns(10);
		TFkd.setBounds(290, 156, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFkd);
		
		JLabel lblDrainageCondition = new JLabel("Drainage condition:");
		lblDrainageCondition.setForeground(Color.BLACK);
		lblDrainageCondition.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrainageCondition.setBounds(10, 189, 126, 26);
		frmEarthenDamSeepage.getContentPane().add(lblDrainageCondition);
		
		JRadioButton rdbtnHorizontalDrainAt = new JRadioButton("Horizontal Drain At Toe");
		buttonGroup.add(rdbtnHorizontalDrainAt);
		rdbtnHorizontalDrainAt.setBounds(146, 192, 146, 23);
		frmEarthenDamSeepage.getContentPane().add(rdbtnHorizontalDrainAt);
		
		JRadioButton rdbtnCircularDrain = new JRadioButton("Circular Drain");
		buttonGroup.add(rdbtnCircularDrain);
		rdbtnCircularDrain.setBounds(294, 192, 122, 23);
		frmEarthenDamSeepage.getContentPane().add(rdbtnCircularDrain);
		
		JRadioButton rdbtnRockAtToe = new JRadioButton("Rock at toe");
		buttonGroup.add(rdbtnRockAtToe);
		rdbtnRockAtToe.setSelected(true);
		rdbtnRockAtToe.setBounds(418, 192, 92, 23);
		frmEarthenDamSeepage.getContentPane().add(rdbtnRockAtToe);
		
		JLabel lblforHorizontalDrain = new JLabel("1)For Horizontal Drain enter distance from toe");
		lblforHorizontalDrain.setForeground(Color.BLACK);
		lblforHorizontalDrain.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblforHorizontalDrain.setBounds(20, 236, 288, 20);
		frmEarthenDamSeepage.getContentPane().add(lblforHorizontalDrain);
		
		JLabel lblforCircularDiameter = new JLabel("2)For Circular Diameter Position from toe");
		lblforCircularDiameter.setForeground(Color.BLACK);
		lblforCircularDiameter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblforCircularDiameter.setBounds(20, 262, 288, 20);
		frmEarthenDamSeepage.getContentPane().add(lblforCircularDiameter);
		
		JLabel lblforRockToe = new JLabel("3)For Rock toe Height of rock");
		lblforRockToe.setForeground(Color.BLACK);
		lblforRockToe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblforRockToe.setBounds(20, 293, 288, 20);
		frmEarthenDamSeepage.getContentPane().add(lblforRockToe);
		
		JRadioButton rdbtnNone = new JRadioButton("NONE");
		buttonGroup.add(rdbtnNone);
		rdbtnNone.setSelected(true);
		rdbtnNone.setBounds(523, 192, 92, 23);
		frmEarthenDamSeepage.getContentPane().add(rdbtnNone);
		
		TFx = new JTextField();
		TFx.setText("20");
		TFx.setColumns(10);
		TFx.setBounds(330, 263, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFx);
		
		JLabel lblifPervious = new JLabel("(IF Foundation is Pervious)");
		lblifPervious.setForeground(Color.BLACK);
		lblifPervious.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblifPervious.setBounds(519, 11, 179, 26);
		frmEarthenDamSeepage.getContentPane().add(lblifPervious);
		
		JLabel lblPerviousSurfaceDepth = new JLabel("pervious surface depth beneath bottom of dam(m)");
		lblPerviousSurfaceDepth.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblPerviousSurfaceDepth.setBounds(508, 41, 280, 26);
		frmEarthenDamSeepage.getContentPane().add(lblPerviousSurfaceDepth);
		
		TFdepth = new JTextField();
		TFdepth.setText("0");
		TFdepth.setColumns(10);
		TFdepth.setBounds(798, 45, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFdepth);
		
		JLabel lblputZeroIf = new JLabel("(put zero if impervious foundation)");
		lblputZeroIf.setBounds(548, 64, 179, 14);
		frmEarthenDamSeepage.getContentPane().add(lblputZeroIf);
		
		JLabel lblCentralCoreInformation = new JLabel("Central Impervious Core Information:");
		lblCentralCoreInformation.setForeground(Color.BLACK);
		lblCentralCoreInformation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCentralCoreInformation.setBounds(10, 324, 270, 26);
		frmEarthenDamSeepage.getContentPane().add(lblCentralCoreInformation);
		
		JLabel lblCoffOfPermeability = new JLabel("Coff of permeability beneath dam bottom(10^4m/s)");
		lblCoffOfPermeability.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblCoffOfPermeability.setBounds(508, 85, 298, 26);
		frmEarthenDamSeepage.getContentPane().add(lblCoffOfPermeability);
		
		TFkf = new JTextField();
		TFkf.setText("14");
		TFkf.setColumns(10);
		TFkf.setBounds(798, 84, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFkf);
		
		JLabel lblCoffOfPermeability_1 = new JLabel("Coff of permeability at Core(10^4m/s)");
		lblCoffOfPermeability_1.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblCoffOfPermeability_1.setBounds(20, 362, 212, 26);
		frmEarthenDamSeepage.getContentPane().add(lblCoffOfPermeability_1);
		
		TFkc = new JTextField();
		TFkc.setText("14");
		TFkc.setColumns(10);
		TFkc.setBounds(267, 366, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFkc);
		
		JLabel lblX = new JLabel("X1:");
		lblX.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblX.setBounds(20, 399, 16, 26);
		frmEarthenDamSeepage.getContentPane().add(lblX);
		
		TFx1 = new JTextField();
		TFx1.setText("7");
		TFx1.setColumns(10);
		TFx1.setBounds(47, 405, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFx1);
		
		JLabel lblX_1 = new JLabel("X2:");
		lblX_1.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblX_1.setBounds(20, 436, 16, 26);
		frmEarthenDamSeepage.getContentPane().add(lblX_1);
		
		TFx2 = new JTextField();
		TFx2.setText("7");
		TFx2.setColumns(10);
		TFx2.setBounds(47, 442, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFx2);
		
		JLabel lblX_2 = new JLabel("X3:");
		lblX_2.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblX_2.setBounds(146, 399, 16, 26);
		frmEarthenDamSeepage.getContentPane().add(lblX_2);
		
		TFx3 = new JTextField();
		TFx3.setText("7");
		TFx3.setColumns(10);
		TFx3.setBounds(172, 403, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFx3);
		
		JLabel lblX_3 = new JLabel("X4:");
		lblX_3.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblX_3.setBounds(146, 436, 16, 26);
		frmEarthenDamSeepage.getContentPane().add(lblX_3);
		
		TFx4 = new JTextField();
		TFx4.setText("7");
		TFx4.setColumns(10);
		TFx4.setBounds(172, 440, 86, 20);
		frmEarthenDamSeepage.getContentPane().add(TFx4);
		
		JButton btnAnalyse = new JButton("Analyse");
		btnAnalyse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double width=Double.parseDouble(TFwidth.getText());
					double mu=Double.parseDouble(TFmu.getText());
					double md=Double.parseDouble(TFmd.getText());
					double up=Double.parseDouble(TFup.getText());
					double dow=Double.parseDouble(TFdo.getText());
					double cl=Double.parseDouble(TFcl.getText());
					double x1=Double.parseDouble(TFx1.getText());
					double x2=Double.parseDouble(TFx2.getText());
					double x3=Double.parseDouble(TFx3.getText());
					double x4=Double.parseDouble(TFx4.getText());
					double kf=Double.parseDouble(TFkf.getText());
					double kd=Double.parseDouble(TFkd.getText());
					double kc=Double.parseDouble(TFkc.getText());
					double x=Double.parseDouble(TFx.getText());
					double depth=Double.parseDouble(TFdepth.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double L=0,n,L1=0,KFh,L2,D,x0,KF,b1,b,ang,A=0,y,B=0,temp,C=0,L0,del=0.1;
					double i;
					L=0.88*up*mu/(2*mu+1)+width+(cl-up)*mu+cl*md-dow*md;
					b1=width+(cl-up)*mu+cl*md;
					b=b1+0.3*up*mu;
					if(a=="NONE")
					{
						do
						{
							
							A=0.5*kd*0.0001*(up*up-(dow+del)*(dow+del))/(L-del*md)-kd*0.0001*del/md*(1+Math.log((dow+del)/del));
							del=del+0.00001;
						}while(Math.abs(A)>0.00001);
						String amcs=String.format("%.3f",del);
						String qs=String.format("%.3f",0.5*kd*(up*up-(dow+del)*(dow+del))/(L-del*md));
						TVresult1.setText("Required value of del="+amcs+"m");
						TVresult2.setText("Required value of specific discharge="+qs+"*10^-4 cumecs");
						ang=180/3.14*Math.atan(1/md);
						if(ang<30)
							KF=b1/Math.cos(3.14/180*ang)-Math.sqrt((b1/Math.cos(3.14/180*ang)*b1/Math.cos(3.14/180*ang)-up/Math.sin(3.14/180*ang)*up/Math.sin(3.14/180*ang)));
						else
							KF=(b*b+up*up)-Math.sqrt(b*b-up/Math.tan(3.14/180*ang)*up/Math.tan(3.14/180*ang));
						KFh=KF*Math.cos(3.14/180*ang);
						x0=Math.sqrt(b*b+up*up)-b;
						L2=0;
						for(i=0;i<=b+10;i=i+10)
						{
							if(i<KFh&&(i+10)>KFh)
								L1=i;
							if(i<(b+10)&&(i+10)>KFh)
								L2=i;
						}
							L2=L2-10;
							n=(L2-L1)/20;
							String location=TFlocation.getText();
							 Formatter xf;
							 xf=new Formatter(location);

							 for(i=L1;i<=L2;i=i+5)
							 {
								y=Math.sqrt(2*x0*i+x0*x0);
								 
							 xf.format("%.1f%s%.3f%s",i,",",y,"\n");
						
								
							 }
							 xf.close();
							 String KFs=String.format("%.3f",KF);
						TVresult3.setText("BI is Drawn such way that it enters perpendicular to us face and emerges through "+KFs+"m"+" from toe");
							
						del=0.1;
						
					}
					if(a=="Horizontal Drain At Toe")
					{
						b1=width+(cl-up)*mu+cl*md;
						b=b1+0.3*up*mu-x;
						x0=Math.sqrt(b*b+up*up)-b;
						L2=0;
						for(i=-200;i<=b+10;i=i+10)
						{
							if(i<-x0/2&&(i+10)>-x0/2)
								L1=i;
							if(i<(b+10)&&(i+10)>-x0/2)
								L2=i;
						}
							L2=L2;
							n=(L2-L1)/20;
							String location=TFlocation.getText();
							 Formatter xf;
							 xf=new Formatter(location);

							 for(i=0;i<=L2;i=i+5)
							 {
								y=Math.sqrt(2*x0*i+x0*x0);
								 
							 xf.format("%.1f%s%.3f%s",i,",",y,"\n");
						
								
							 }
							 xf.close();
							 String x0s=String.format("%.3f",x0);
							 String KFs=String.format("%.3f",x0/2);
							 String qs=String.format("%.3f",kd*x0);
								TVresult1.setText("Required distance of diretrex from focus "+x0s+"m");
								TVresult2.setText("Required value of specific discharge="+qs+"*10^-4 cumecs");
						TVresult3.setText("BI is Drawn such way that it enters perpen. to us face and emerges perpen. through "+KFs+"m from drain inner edge");
							
						del=0.001;
						
					}
					if(a=="Circular Drain")
					{
						b1=width+(cl-up)*mu+cl*md;
						b=b1+0.3*up*mu-x;
						x0=Math.sqrt(b*b+up*up)-b;
						L2=0;
						for(i=0;i<=b+10;i=i+10)
						{
							if(i<x&&(i+10)>x)
								L1=i;
							if(i<(b+10)&&(i+10)>x)
								L2=i;
						}
							
							n=(L2-L1)/20;
							String location=TFlocation.getText();
							 Formatter xf;
							 xf=new Formatter(location);

							 for(i=0;i<=L2;i=i+5)
							 {
								y=Math.sqrt(2*x0*i+x0*x0);
								 
							 xf.format("%.1f%s%.3f%s",i,",",y,"\n");
						
								
							 }
							 xf.close();
							 String x0s=String.format("%.3f",x0);
							 String KFs=String.format("%.3f",x0/2);
							 String qs=String.format("%.3f",kd*x0);
								TVresult1.setText("Required vertical position of center line of circle "+x0s+"m from bottom");
								TVresult2.setText("Required value of specific discharge="+qs+"*10^-4 cumecs");
						TVresult3.setText("BI is Drawn such way that it enters perpen. to us face and emerges perpen. through the circular drain");
							
						del=0.001;
						
					}
					if(a=="Rock at toe")
					{
						b1=width+(cl-up)*mu+cl*md;
						b=b1+0.3*up*mu-x-md*(1+3)-2-1*1.5;
						x0=Math.sqrt(b*b+up*up)-b;
						L2=0;
						for(i=0;i<=b+10;i=i+10)
						{
							if(i<x&&(i+10)>x)
								L1=i;
							if(i<(b+10)&&(i+10)>x)
								L2=i;
						}
							
							n=(L2-L1)/20;
							String location=TFlocation.getText();
							 Formatter xf;
							 xf=new Formatter(location);

							 for(i=0;i<=L2;i=i+5)
							 {
								y=Math.sqrt((i+x0)*(i+x0)-i*i);
								 
							 xf.format("%.1f%s%.3f%s",i,",",y,"\n");
						
								
							 }
							 xf.close();
							 String x0s=String.format("%.3f",x0);
							 String KFs=String.format("%.3f",x0/2);
							 String qs=String.format("%.3f",kd*x0);
								TVresult1.setText("Required vertical position of center line of circle "+x0s+"m from bottom");
								TVresult2.setText("Required value of specific discharge="+qs+"*10^-4 cumecs");
						TVresult3.setText("BI is Drawn such way that it enters perpen. to us face and emerges perpen. through the circular drain");
							
						del=0.001;
						
					}
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnAnalyse.setBounds(300, 492, 89, 23);
		frmEarthenDamSeepage.getContentPane().add(btnAnalyse);
		
		TVresult1 = new JLabel("...");
		TVresult1.setForeground(new Color(0, 0, 102));
		TVresult1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		TVresult1.setBounds(10, 526, 717, 38);
		frmEarthenDamSeepage.getContentPane().add(TVresult1);
		
		TVresult2 = new JLabel("...");
		TVresult2.setForeground(new Color(0, 0, 102));
		TVresult2.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		TVresult2.setBounds(10, 575, 626, 38);
		frmEarthenDamSeepage.getContentPane().add(TVresult2);
		
		TVresult3 = new JLabel("...");
		TVresult3.setForeground(new Color(0, 0, 102));
		TVresult3.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		TVresult3.setBounds(10, 624, 885, 38);
		frmEarthenDamSeepage.getContentPane().add(TVresult3);
		
		JRadioButton rdbtnTickIfPresent = new JRadioButton("Tick if Present");
		rdbtnTickIfPresent.setSelected(true);
		rdbtnTickIfPresent.setBounds(263, 327, 95, 23);
		frmEarthenDamSeepage.getContentPane().add(rdbtnTickIfPresent);
		
		TFlocation = new JTextField();
		TFlocation.setText("C:\\Users\\Bishal\\Documents\\export.csv");
		TFlocation.setBounds(300, 440, 315, 20);
		frmEarthenDamSeepage.getContentPane().add(TFlocation);
		TFlocation.setColumns(10);
		
		JButton btnExport = new JButton("Export");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					JFileChooser chooser = new JFileChooser();
					chooser.showOpenDialog(null);
					File f=chooser.getSelectedFile();
					String filename=f.getAbsolutePath();
					TFlocation.setText(filename);

				}catch(Exception e10){
					JOptionPane.showMessageDialog(null,e10);
				}
			
			}
		});
		btnExport.setBounds(637, 439, 89, 23);
		frmEarthenDamSeepage.getContentPane().add(btnExport);
	}
}
