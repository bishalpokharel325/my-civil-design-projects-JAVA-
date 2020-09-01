package beamDesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class BeamDesign {

	private JFrame frmBeamDesignReport;
	private JTextField TFconcrete;
	private JTextField TFsteel;
	private JTextField TFbeamdata;
	private JTextField TFbeamsolution;
	private JTextField TFno;
	private JLabel TVresult;

	/**
	 * Launch the application.
	 */
	static String xstrPath;
	static double[][] myarray;
	static double[][] tucarray;
	static double[][] data;
	private JTextField TFlocation;
	private JTextField TFec;
	private JTextField TFdiam;
	private JTextField TFtuctable;
	private JTextField TFdiamshear;
	private JTextField TFlegs;
	private JTextField TFhangdiam;
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
		static void setupmytucarray(String location)
		{
			tucarray=new double[20][20];
			
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
						tucarray[rowc][x]=Double.parseDouble(InArray[x]);
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
					BeamDesign window = new BeamDesign();
					window.frmBeamDesignReport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BeamDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBeamDesignReport = new JFrame();
		frmBeamDesignReport.setTitle("Beam Design Report Maker");
		frmBeamDesignReport.setBounds(100, 100, 683, 466);
		frmBeamDesignReport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBeamDesignReport.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Enter Grade of Concrete(N/sq.mm):");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(10, 13, 238, 14);
		frmBeamDesignReport.getContentPane().add(label);
		
		TFconcrete = new JTextField();
		TFconcrete.setText("25");
		TFconcrete.setColumns(10);
		TFconcrete.setBounds(249, 11, 86, 20);
		frmBeamDesignReport.getContentPane().add(TFconcrete);
		
		JLabel label_1 = new JLabel("Enter Grade of Steel(N/sq.mm):");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10, 40, 214, 14);
		frmBeamDesignReport.getContentPane().add(label_1);
		
		TFsteel = new JTextField();
		TFsteel.setText("500");
		TFsteel.setColumns(10);
		TFsteel.setBounds(249, 38, 86, 20);
		frmBeamDesignReport.getContentPane().add(TFsteel);
		
		JLabel lblEnterBeamData = new JLabel("Enter Beam data in form  of Csv:");
		lblEnterBeamData.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterBeamData.setBounds(16, 72, 232, 14);
		frmBeamDesignReport.getContentPane().add(lblEnterBeamData);
		
		TFbeamdata = new JTextField();
		TFbeamdata.setText("E:\\mysoftwares\\beamdata.csv");
		TFbeamdata.setColumns(10);
		TFbeamdata.setBounds(249, 70, 219, 20);
		frmBeamDesignReport.getContentPane().add(TFbeamdata);
		
		JLabel label_3 = new JLabel("File Having complete Solutions in .csv format.....");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_3.setBounds(80, 97, 332, 20);
		frmBeamDesignReport.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Solution .csv:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(90, 131, 110, 14);
		frmBeamDesignReport.getContentPane().add(label_4);
		
		TFbeamsolution = new JTextField();
		TFbeamsolution.setText("E:\\mysoftwares\\beamsolution.csv");
		TFbeamsolution.setColumns(10);
		TFbeamsolution.setBounds(210, 129, 219, 20);
		frmBeamDesignReport.getContentPane().add(TFbeamsolution);
		
		JButton button = new JButton("Browse");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFbeamsolution.setText(filename);
			}
		});
		button.setBounds(439, 128, 89, 23);
		frmBeamDesignReport.getContentPane().add(button);
		
		JButton button_1 = new JButton("Browse");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFbeamdata.setText(filename);
			}
		});
		button_1.setBounds(478, 69, 89, 23);
		frmBeamDesignReport.getContentPane().add(button_1);
		
		TFno = new JTextField();
		TFno.setText("5");
		TFno.setColumns(10);
		TFno.setBounds(287, 193, 86, 20);
		frmBeamDesignReport.getContentPane().add(TFno);
		
		JLabel lblNoOfBeams = new JLabel("NO of Beams Data:");
		lblNoOfBeams.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoOfBeams.setBounds(103, 195, 174, 14);
		frmBeamDesignReport.getContentPane().add(lblNoOfBeams);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double concrete=Double.parseDouble(TFconcrete.getText());
					double steel=Double.parseDouble(TFsteel.getText());
					double no=Double.parseDouble(TFno.getText());
					double ec=Double.parseDouble(TFec.getText());
					double diamshear=Double.parseDouble(TFdiamshear.getText());
					double legs=Double.parseDouble(TFlegs.getText());
					double diam=Double.parseDouble(TFdiam.getText());
					double hangdiam=Double.parseDouble(TFhangdiam.getText());
					double astreqdef=0,astprodef=0,percent=0;
					setupmycsvarray(TFbeamdata.getText());
					setupmytucarray(TFtuctable.getText());
					 Formatter xf;
					 xf=new Formatter(TFbeamsolution.getText());
					 xf.format("%s","DESIGN OF BEAMS:\n\n\n");
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
					for(int i=0;i<=no;i++)
					{
						double L=myarray[i][1];
						double b=myarray[i][2];
						double D=myarray[i][3];
						double Mu=myarray[i][4];
						double Vu=myarray[i][5];
						double Tu=myarray[i][6],xul = 0,d=D-ec;
						if(steel==415)xul=0.48*d;
						if(steel==500)xul=0.46*d;
						double Mul=0.36*concrete*b*xul*(d-0.416*xul)/1000000;
						xf.format("%s","\nBeam ID:MB4F-9");
						xf.format("%s%.3f%s","\nLength of Beam=",myarray[i][1],"m");
						xf.format("%s%.0f%s","\nBeam Width(b)=",myarray[i][2],"mm");
						xf.format("%s%.0f%s","\nBeam Depth(D)=",myarray[i][3],"mm");
						xf.format("%s%.0f%s","\nConcrete Strength(fck)=",concrete,"N/sq mm");
						xf.format("%s%.0f%s","\nRebar Strength(fy)=",steel,"N/ sq mm");
						xf.format("%s","\nFor ");
						xf.format("%s%.3f%s","\nMaxm BM(Mul) =",myarray[i][4],"KNm");
						xf.format("%s%.3f%s","\nMaxm Shear Strength(Vul)=",myarray[i][5],"KN");
						xf.format("%s%.3f%s","\nMaxm Torsion(Tul)=",myarray[i][6],"KNm");
						xf.format("%s%.2f%s","\nEffective Cover(e)=",ec,"mm\n\n\n");
						xf.format("%s","1.Check for Torsion:\n");
						xf.format("%s","\nConsider Tul>Tuc");
						double vul=Vu+1.6*Tu/b*1000;
						double Mt=Tu/1.7*(1+D/b);
						double noreq=0;
						xf.format("%s%.3f%s","\nVul=Vu+1.6*Tu/b=",vul,"KN");
						xf.format("%s%.3f%s","\nMt=Tu(1+D/b)/1.7=",Mt,"KNm");
						double M=0,ast=0;
						if(Mu>=Mt)
						{
							xf.format("%s%.3f%s","\nSInce Mu>Mt so Design Longitudinal Reinforcement for Me1 \n Me1=Mu+Mt=",Mu+Mt,"KNm");
							M=Mu+Mt;
							
						}
						else{
							xf.format("%s%.3f%s","\nSInce Mu<Mt so Design Longitudinal Reinforcement for Me2 \n Me2=Mu-Mt=",Mt-Mu,"KNm");
							M=Mt-Mu;
						}
						xf.format("%s%.3f%s%.3f%s","\nXul=kul*d=",xul,"mm for FE",steel," grade Steel");
						xf.format("%s%.3f%s","\nMul=0.36fck*xul*b(d-0.416xul)=",Mul,"KNm");
						if(M<Mul)
						{
							xf.format("%s","\n since Me<Mul so Section is Designed as Singly Reinforced Section");
							double x=xul;
							
							double a1=100;
							double b1=1000;
							double temp;
							do
							{
								temp=x;
								
								x=x-(0.36*concrete*x*d*b-0.1498*concrete*b*x*x-M*1000000)/(0.36*concrete*b*d-0.3*concrete*x);
							}while(Math.abs(temp-x)>0.000001);
							ast=x*0.36*concrete*b/(0.87*steel);
							
							xf.format("%s%.3f%s%.3f%s","\nxu=",x," and Required Ast from ><<>>>><<< =",ast,"sq mm");
							xf.format("%s%.3f%s%.3f%s","\nProvide ",diam,"mm Rod With effective Cover of ",ec,"mm");
							noreq=ast/(3.14/4*diam*diam);
							int j=0;
							do
							{
								j++;
							}while(j<noreq);
							if(j==1)
								j++;
							double asthanger=0.15/100*b*d;
							double hangernoreq=asthanger/(3.14/4*hangdiam*hangdiam);
							int l=0;
							do
							{
								l++;
							}while(l<hangernoreq);
							if(l==1)
								l++;
							xf.format("%s%.3f%s%d%s%.3f%s","\nNo of Required ",diam,"mm Rebars at Tension SIde=",j," \nAst provided=",3.14/4*diam*diam*j,"sq mm");
							xf.format("%s%.3f%s","\nPercentage of Steel provided=Ast provided/(b*d)=",3.14/4*diam*diam*j/(b*d)*100,"%");
							xf.format("%s%.3f%s%d%s%.3f%s","\nNo of Required ",hangdiam,"mm Rebars in Compression Side=",l," \n Ast provided(>0.15% of bd)=",3.14/4*diam*diam*l,"sq mm");
							astreqdef=ast;
							astprodef=3.14/4*diam*diam*j;
							percent=3.14/4*diam*diam*j/(b*d)*100;
							double tuc=0;
							
							for(int u=0;u<13;u++){
								if(percent>tucarray[u][0]&&percent<tucarray[u+1][0])
								tuc = tucarray[u][ind]+(percent-tucarray[u][0])/(tucarray[u+1][0]-tucarray[u][0])*(tucarray[u+1][ind]-tucarray[u][ind]);
							}
							xf.format("%s%.3f%s","\nTul=Vul/(b*d)=",vul/(b*d)*1000,"N/sq.mm");
							xf.format("%s%.3f%s","\nFrom IS456:2000 Tuc(from table)=",tuc,"N/mm");
							double Tul=vul/(b*d)*1000;
							if(Tul>tuc)
							{
								xf.format("%s","\nSince Tul>Tuc \n so Longitudinal and transverse reinforcement is Designed for equivalent BM and SF");
								xf.format("%s","\nDesign for Shear Reinforcement:");
								double asv=3.14/4*legs*diamshear*diamshear;
								double clearcover=ec-diam/2;
								double b2=(b-clearcover*2-diam);
								double d2=d-clearcover-hangdiam/2;
								double x1=b2+diamshear+diam;
								double y1=d2+diamshear+diam/2+hangdiam/2;
										xf.format("%s%.3f%s","\nAsv=3.14/4*diam*diam*no of legs=",asv,"sq.mm");
										xf.format("%s%.3f%s","\nb1=b-2*clearcover-t.diam=",b2,"mm");
										xf.format("%s%.3f%s","\nd1=d-clearcover-c.diam=",d2,"mm");
										xf.format("%s%.3f%s","\nx1=b1+diamshear+diam=",x1,"mm");
										xf.format("%s%.3f%s","\ny1=d2+diamshear+diam/2+hangdiam/2=",y1,"mm");
										double Sv=(0.87*steel*asv*b2*d2)*0.001/(Tu+0.4*Vu*b2);
										xf.format("%s%.3f%s","\nSpacing Sv=(0.87*fy*Asv*b1*d1)/(Tu+0.4*Vul*b1)=",Sv,"mm");
										double Svmax=0.87*steel*asv*0.001/(Tul-tuc);
										xf.format("%s%.3f%s","\nMaximum Spacing svmax=0.87*fy*asv/(Tul-Tuc)=",Svmax,"mm");
										double svprovided1=Math.min(Sv,Svmax);
										double svprovided2=Math.min(svprovided1,x1);
										double svprovide2=Math.min(svprovided2,(x1+y1)/2);
										double svprovide3=Math.min(svprovide2,0.75*d);
										if(svprovide3>100)
										xf.format("%s%.3f%s","\nProvide Spacing=less than Minimum of(Sv,Svmax,x1,(x1+y1)/2,0.75*d)=",svprovide3,"mm >100mm ok");
										else
											xf.format("%s%.3f%s","\nProvide Spacing=less than Minimum of(Sv,Svmax,x1,(x1+y1)/2,0.75*d)=",svprovide3,"mm c/c <100mm so Increase The Legs and Revise The Design");	
										if(D>450)
										{
											xf.format("%s","\nSince D>450mm Additional SIde Bar is Required.");
											double astadditional=0.1/100*b*D;
											
											double addnoreq=astadditional/(3.14/4*hangdiam*hangdiam);
											double m=0;
											do
											{
												m++;
											}while(m<addnoreq);
											int even=0;
											do{
												even++;
											}while(even<m);
											xf.format("%s%.3f%s","\nRequired Area of Additional Bar=0.1/100*b*D=",astadditional,"sq mm");
											xf.format("%s%d%s","\nRequired No of Additional Bar=",even,"on two sides of Beam");
										}
										else
										{
											xf.format("%s","\nSince D<450mm so No Additional SIde bar is required.");
										}
							}
							else{
								xf.format("%s","\nSince Tul>Tuc \n so Longitudinal and transverse reinforcement is Designed for equivalent BM and SF");
								if(Mu<Mul)
								{
									xf.format("%s","\n since Mu<Mul so Section is Designed as Singly Reinforced Section");
									x=xul;
									
									a1=100;
									b1=1000;
									
									do
									{
										temp=x;
										
										x=x-(0.36*concrete*x*d*b-0.1498*concrete*b*x*x-Mu*1000000)/(0.36*concrete*b*d-0.3*concrete*x);
									}while(Math.abs(temp-x)>0.000001);
									ast=x*0.36*concrete*b/(0.87*steel);
									xf.format("%s%.3f%s%.3f%s","\nxu=",x," and Required Ast from ><<>>>><<< =",ast,"sq mm");
									xf.format("%s%.3f%s%.3f%s","\nProvide ",diam,"mm Rod With effective Cover of ",ec,"mm");
									noreq=ast/(3.14/4*diam*diam);
									 
									j=0;
									do
									{
										j++;
									}while(j<noreq);
									if(j==1)
										j++;
									asthanger=0.15/100*b*d;
									hangernoreq=asthanger/(3.14/4*hangdiam*hangdiam);
									l=0;
									do
									{
										l++;
									}while(l<hangernoreq);
									if(l==1)
										l++;
									xf.format("%s%.3f%s%d%s%.3f%s","\nNo of Required ",diam,"mm Rebars at Tension SIde=",j," with Ast provided=",3.14/4*diam*diam*j,"sq mm");
									
									xf.format("%s%.3f%s","\nPercentage of Steel provided=Ast provided/(b*d)=",3.14/4*diam*diam*j/(b*d)*100,"%");
									xf.format("%s%.3f%s%d%s%.3f%s","\nNo of Required ",hangdiam,"mm Rebars in Compression Side=",l," with Ast provided(>0.15% of bd)=",3.14/4*diam*diam*l,"sq mm");
									double Tuc=0;
									astreqdef=ast;
									astprodef=3.14/4*diam*diam*j;
									percent=3.14/4*diam*diam*j/(d*b)*100;
									for(int n=0;i<13;i++){
										if(percent>tucarray[n][0]&&percent<tucarray[n+1][0])
										tuc = tucarray[n][ind]+(percent-tucarray[n][0])/(tucarray[n+1][0]-tucarray[n][0])*(tucarray[n+1][ind]-tucarray[n][ind]);
									}
									double tuv=Vu/(d*b)*1000;
									double sv=0;
									double vuc=0;
									xf.format("%s","\n\nDesign for Shear Reinforcement\nHere");
									xf.format("%s%.3f%s","\n percent of Steel=Ast provided/bd=",percent,"%");
									xf.format("%s%.3f%s","\n for IS456:2000 ,\nTuc=function of(percent,grade of concrete)=",tuc,"N/sqmm");
									xf.format("%s%.3f%s","\n Tuv=Vu/(b*d)=",tuv,"N/sqmm");
									if(tuv<tuc&&tuv<tumax)
									{
										xf.format("%s","\nSince tuv<tuc and  tuv<tumax,Provide Minimum reinforcement");
										sv=0.87*steel*3.14*legs/4*diam*diam/(0.4*b);
										xf.format("%s%.3f%s","\nSv=0.87*steel*3.14*legs/4*diam*diam/(0.4*b)=",sv,"mm");
										if(sv>Math.min(300,0.75*d))
											sv=Math.min(300,0.75*d);
										
										if(sv>100){
											xf.format("%s%.3f%s","\n Spacing provided=less than minimum of(sv,300mm,0.75*d)=",sv,"mm>100mm ok");
											
										
										}
										else
										{
											xf.format("%s%.3f%s","\n Spacing provided=less than minimum of(sv,300mm,0.75*d)=",sv,"mm<100mm please revise the Design");
										}
									}
									else if(tuv>tuc&&tuv<tumax){
										xf.format("%s","\nSince tuv>tuc and  tuv<tumax,Provide Shear Reinforcement(stirrups and bendup bars are Designed");
										vuc=tuc*d*b;
										xf.format("%s%.3f%s","\n Vuc=Tuc*d*b=",vuc,"KN");
										double vbb=0.87*steel*(noreq*Math.sin(3.14/180*45));
										xf.format("%s%.3f%s","\n Vbb=0.87*fy(Ast*sin(alpha))=",vbb,"KN");
										if(vbb>0.5*(Vu*1000-vuc)){
											vbb=0.5*(Vu*1000-vuc);
											xf.format("%s%.3f%s%.3f%s","\n Since vbb>",0.5*(Vu*1000-vuc),"KN So Provide Vbb=",0.5*(Vu*1000-vuc),"KN");
										}
										
										sv=(0.87*steel*3.14*legs/4*diam*diam*d)/(Vu*1000-vuc-vbb);
										xf.format("%s%.3f%s","\n Spacing(Sv)=(0.87*steel*3.14*legs/4*diam*diam*d)/(Vu*1000-vuc-vbb)=",sv,"mm c/c");
										if(sv>Math.min(300,0.75*d))
											sv=Math.min(300,0.75*d);
										if(sv>100){
											
											xf.format("%s%.3f%s","\n Spacing provided=less than minimum of(sv,300mm,0.75*d)=",sv,"mm>100mm ok");
										
										
										 
										}
										
										
										else
										{
											
											
												xf.format("%s%.3f%s","\n Spacing provided=less than minimum of(sv,300mm,0.75*d)=",sv,"mm<100mm please revise the Design");
											
											 
										}
										
										

									}
									else
									{
										xf.format("%s","\nSince tuv>tuc and  tuv>tumax,Section will Experience Punching Failure So Increase Depth");
									}
									
								}
							}
							
						}
						else
						{
							xf.format("%s","\n SEction is Doubly Reinforced Section");
							data=new double[20][20];
							data[0][0]=0.00144;data[0][1]=288.7;
							data[1][0]=0.00163;data[1][1]=306.7;
							data[2][0]=0.00192;data[2][1]=324.8;
							data[3][0]=0.00241;data[3][1]=342.8;
							data[4][0]=0.00276;data[4][1]=351.8;
							data[5][0]=0.00380;data[5][1]=360.9;
							double fs=0,fcc=0,fsc=0;double esc=0.0035*(xul-ec)/xul;
							for(int po=0;po<6;po++){
								if(esc>data[po][0]&&esc<data[po+1][0]){
								fsc=data[po][1]+(data[po+1][1]-data[po][1])*(esc-data[po][0])/(data[po+1][0]-data[po][0]);
								}
							}
							if(esc<0.002){
								fcc=0.446*concrete*(esc-250*esc*esc);
								xf.format("%s%.3f","\nSince esc<0.002, fcc=",fcc);
							}
							else{
								fcc=0.446*concrete;
								xf.format("%s%.3f","\n fcc=0.446*fck=",fcc);
							}
							ast=Mul*1000000/(0.87*steel*(d-0.416*xul))+(M-Mul)*1000000/(0.87*steel*(d-ec));
							double asc=(M-Mul)*1000000/((fsc-fcc)*(d-ec));
							double reqno=4*ast/(diam*diam*3.14);
							double hangernoreq=4*asc/(hangdiam*hangdiam*3.14);
							astreqdef=ast;
							
							int i1 = 0;
							int j=0;
							do
							{
								j++;
							}while(j*3.14/4*diam*diam<ast);
							
						
							
							int l=0;
							do
							{
								l++;
							}while(l<hangernoreq);
							if(l==1)
								l++;
							astprodef=j*3.14/4*diam*diam;
							percent=astprodef/astreqdef;
							xf.format("%s%.3f","\n esc=0.0035*(xul-cc)/xul=",esc);
							xf.format("%s%.3f","\n From sp16,fsc=",fsc);
							xf.format("%s%.3f%s","\n Required area of Steel in Tension Side \n ast=Mul*1000000/(0.87*steel*(d-0.416*xul))+(M-Mul)*1000000/(0.87*steel*(d-ec)) \n=",ast,"sq.mm");
							xf.format("%s%.3f%s","\n Required area of Steel in Compression Side asc \n =(M-Mul)*1000000/((fsc-fcc)*(d-ec)) \n =",asc,"sq.mm");
							
							xf.format("%s%.0f%s%d%s%.3f%s","\nNo of Required ",diam,"mm Rebars at Tension SIde=",j," with Ast provided=",3.14*diam/4*diam*j,"sq mm");
							
							xf.format("%s%.3f%s","\nPercentage of Steel provided=Ast provided/(b*d)=",3.14*diam/4*diam*j/(b*d)*100,"%");
							
							
							double tuc=0;
							
							for(int u=0;u<13;u++){
								if(percent>tucarray[u][0]&&percent<tucarray[u+1][0])
								tuc = tucarray[u][ind]+(percent-tucarray[u][0])/(tucarray[u+1][0]-tucarray[u][0])*(tucarray[u+1][ind]-tucarray[u][ind]);
							}
							xf.format("%s%.3f%s","\nTul=Vul/(b*d)=",vul/(b*d)*1000,"N/sq.mm");
							xf.format("%s%.3f%s","\nFrom IS456:2000, Tuc(from table)=",tuc,"N/mm");
							double Tul=vul/(b*d)*1000;
							if(Tul>tuc)
							{
								xf.format("%s","\nSince Tul>Tuc \n so Longitudinal and transverse reinforcement is Designed for equivalent BM and SF");
								xf.format("%s","\nDesign for Shear Reinforcement:");
								double asv=3.14/4*legs*diamshear*diamshear;
								double clearcover=ec-diam/2;
								double b2=(b-clearcover*2-diam);
								double d2=d-clearcover-hangdiam/2;
								double x1=b2+diamshear+diam;
								double y1=d2+diamshear+diam/2+hangdiam/2;
										xf.format("%s%.3f%s","\nAsv=3.14/4*diam*diam*no of legs=",asv,"sq.mm");
										xf.format("%s%.3f%s","\nb1=b-2*clearcover-t.diam=",b2,"mm");
										xf.format("%s%.3f%s","\nd1=d-clearcover-c.diam=",d2,"mm");
										xf.format("%s%.3f%s","\nx1=b1+diamshear+diam=",x1,"mm");
										xf.format("%s%.3f%s","\ny1=d2+diamshear+diam/2+hangdiam/2=",y1,"mm");
										double Sv=(0.87*steel*asv*b2*d2)*0.001/(Tu+0.4*Vu*b2);
										xf.format("%s%.3f%s","\nSpacing Sv=(0.87*fy*Asv*b1*d1)/(Tu+0.4*Vul*b1)=",Sv,"mm");
										double Svmax=0.87*steel*asv*0.001/(Tul-tuc);
										xf.format("%s%.3f%s","\nMaximum Spacing svmax=0.87*fy*asv/(Tul-Tuc)=",Svmax,"mm");
										double svprovided1=Math.min(Sv,Svmax);
										double svprovided2=Math.min(svprovided1,x1);
										double svprovide2=Math.min(svprovided2,(x1+y1)/2);
										double svprovide3=Math.min(svprovide2,0.75*d);
										if(svprovide3>100)
										xf.format("%s%.3f%s","\nProvide Spacing=less than Minimum of(Sv,Svmax,x1,(x1+y1)/2,0.75*d)=",svprovide3,"mm >100mm ok");
										else
											xf.format("%s%.3f%s","\nProvide Spacing=less than Minimum of(Sv,Svmax,x1,(x1+y1)/2,0.75*d)=",svprovide3,"mm c/c <100mm so Increase The Legs and Revise The Design");	
										if(D>450)
										{
											xf.format("%s","\nSince D>450mm Additional SIde Bar is Required.");
											double astadditional=0.1/100*b*D;
											
											double addnoreq=astadditional/(3.14/4*hangdiam*hangdiam);
											double m=0;
											do
											{
												m++;
											}while(m<addnoreq);
											int even=0;
											do{
												even++;
											}while(even<m);
											xf.format("%s%.3f%s","\nRequired Area of Additional Bar=0.1/100*b*D=",astadditional,"sq mm");
											xf.format("%s%d%s","\nRequired No of Additional Bar=",even,"on two sides of Beam");
										}
										else
										{
											xf.format("%s","\nSince D<450mm so No Additional SIde bar is required.");
										}
							}
							
						}
						
						xf.format("%s","\n 4. Check For Deflection");
						double Leng=myarray[i][1];
						xf.format("%s%.3f%s","\n L=",Leng,"m");
						xf.format("%s","\n L/d<=alpha*Beta*gamma*sigma*lamda");
						xf.format("%s","\n For Continuous Beam, alpha=26");
						xf.format("%s","\n For Span less than 10m , Beta=1");
						xf.format("%s","\n For Rectangular Beam, sigma=1");
						xf.format("%s","\n Taking % of compression reinforcement 0 , lamda=1");
						xf.format("%s","\n For Value of Gamma:");
						xf.format("%s%.3f%s","\n Ast Required=",astreqdef,"sq mm");
						xf.format("%s%.3f%s","\n Ast Provided=",astprodef,"sq mm");
						xf.format("%s%.3f%s","\n % of Tension Reinforcement=",percent,"%");
						double fs=0.58*steel*astreqdef/astprodef;
						xf.format("%s%.3f%s","\n fs=0.58*steel*astreqdef/astprodef=",fs,"N/mm sq");
						
						if(myarray[i][7]==0)
						{
							xf.format("%s","\n Please Enter modification factor from IS456:2000 pg no 38");
						}
						else
						{
							double gamma=myarray[i][7];
							xf.format("%s%.3f%s","\n From IS456:2000 fig no 4 , Gamma=",gamma,",");
							xf.format("%s%.3f","\n L/d=",Leng/d*1000);
							if(Leng/d*1000<=26*gamma)
							{
								xf.format("%s%.3f%s%.3f%s%.3f%s","\n 26*1*1*1*",gamma,"=",26*gamma,">",Leng/d*1000,",");
								xf.format("%s","\nBeam is Serviceable in Deflection");
							}
							else
							{
								xf.format("%s%.3f%s%.3f%s%.3f%s","\n 26*1*1*1*",gamma,"=",26*gamma,"<",Leng/d*1000,",");
								xf.format("%s","\nBeam is NOT Serviceable in Deflection");	
							}
						}
						
					}
					
					
					
					xf.close();
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnResult.setBounds(229, 329, 89, 23);
		frmBeamDesignReport.getContentPane().add(btnResult);
		
		TVresult = new JLabel("RESULT");
		TVresult.setForeground(Color.BLUE);
		TVresult.setFont(new Font("Tahoma", Font.BOLD, 23));
		TVresult.setBounds(10, 363, 585, 53);
		frmBeamDesignReport.getContentPane().add(TVresult);
		
		JLabel lblEnterEffectiveCovermm = new JLabel("Enter Effective Cover(mm):");
		lblEnterEffectiveCovermm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterEffectiveCovermm.setBounds(48, 226, 219, 14);
		frmBeamDesignReport.getContentPane().add(lblEnterEffectiveCovermm);
		
		TFec = new JTextField();
		TFec.setText("40");
		TFec.setColumns(10);
		TFec.setBounds(277, 224, 86, 20);
		frmBeamDesignReport.getContentPane().add(TFec);
		
		JLabel lblDiameterOfRebar = new JLabel("Diameter of Rebar(mm):");
		lblDiameterOfRebar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDiameterOfRebar.setBounds(48, 253, 174, 14);
		frmBeamDesignReport.getContentPane().add(lblDiameterOfRebar);
		
		TFdiam = new JTextField();
		TFdiam.setText("25");
		TFdiam.setColumns(10);
		TFdiam.setBounds(232, 251, 86, 20);
		frmBeamDesignReport.getContentPane().add(TFdiam);
		
		JLabel lblTucTablecsv = new JLabel("Tuc Table .csv:");
		lblTucTablecsv.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTucTablecsv.setBounds(80, 159, 120, 14);
		frmBeamDesignReport.getContentPane().add(lblTucTablecsv);
		
		TFtuctable = new JTextField();
		TFtuctable.setText("E:\\mysoftwares\\tuc.csv");
		TFtuctable.setColumns(10);
		TFtuctable.setBounds(210, 157, 219, 20);
		frmBeamDesignReport.getContentPane().add(TFtuctable);
		
		JButton button_2 = new JButton("Browse");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFtuctable.setText(filename);

			}
		});
		button_2.setBounds(439, 156, 89, 23);
		frmBeamDesignReport.getContentPane().add(button_2);
		
		JLabel lblDiameterOfShear = new JLabel("Diameter of Shear reinf(mm):");
		lblDiameterOfShear.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDiameterOfShear.setBounds(16, 280, 209, 14);
		frmBeamDesignReport.getContentPane().add(lblDiameterOfShear);
		
		TFdiamshear = new JTextField();
		TFdiamshear.setText("10");
		TFdiamshear.setColumns(10);
		TFdiamshear.setBounds(235, 278, 86, 20);
		frmBeamDesignReport.getContentPane().add(TFdiamshear);
		
		JLabel lblNoOfShear = new JLabel("No of Shear Legs:");
		lblNoOfShear.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoOfShear.setBounds(343, 280, 120, 14);
		frmBeamDesignReport.getContentPane().add(lblNoOfShear);
		
		TFlegs = new JTextField();
		TFlegs.setText("4");
		TFlegs.setColumns(10);
		TFlegs.setBounds(473, 278, 86, 20);
		frmBeamDesignReport.getContentPane().add(TFlegs);
		
		JLabel lblDiameterOfHanger = new JLabel("Diameter of Hanger bar(mm):");
		lblDiameterOfHanger.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDiameterOfHanger.setBounds(343, 249, 216, 14);
		frmBeamDesignReport.getContentPane().add(lblDiameterOfHanger);
		
		TFhangdiam = new JTextField();
		TFhangdiam.setText("12");
		TFhangdiam.setColumns(10);
		TFhangdiam.setBounds(571, 251, 86, 20);
		frmBeamDesignReport.getContentPane().add(TFhangdiam);
	}
}
