package slabdesign;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class slabdesign {

	private JFrame frmDesignOfRcc;
	private JTextField TFconcrete;
	private JTextField TFsteel;
	private JTextField TFdatalocation;
	private JTextField TFsolution;
	private JTextField TFodepth;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField TFcover;
	private JLabel TVresult;

	/**
	 * Launch the application.
	 */
	private JTextField TFvalue;
	static String xstrPath;
	static double[][] myarray;
	private JTextField TFlocation;
	private JTextField TFno;
	private JTextField TFpart;
	private JTextField TFff;
	private JTextField TFcf;
	private JTextField TFunit;
	private JTextField TFfl;
	static void setupmycsvarray(String location)
	{
		myarray=new double[200][200];
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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					slabdesign window = new slabdesign();
					window.frmDesignOfRcc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public slabdesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDesignOfRcc = new JFrame();
		frmDesignOfRcc.setTitle("Design OF RCC Slab");
		frmDesignOfRcc.setBounds(100, 100, 735, 577);
		frmDesignOfRcc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDesignOfRcc.getContentPane().setLayout(null);
		
		JLabel lblEnterGradeOf = new JLabel("Enter Grade of Concrete(N/sq.mm):");
		lblEnterGradeOf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterGradeOf.setBounds(10, 13, 238, 14);
		frmDesignOfRcc.getContentPane().add(lblEnterGradeOf);
		
		TFconcrete = new JTextField();
		TFconcrete.setText("25");
		TFconcrete.setBounds(249, 11, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFconcrete);
		TFconcrete.setColumns(10);
		
		JLabel lblEnterGradeOf_1 = new JLabel("Enter Grade of Steel(N/sq.mm):");
		lblEnterGradeOf_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterGradeOf_1.setBounds(10, 40, 214, 14);
		frmDesignOfRcc.getContentPane().add(lblEnterGradeOf_1);
		
		TFsteel = new JTextField();
		TFsteel.setText("500");
		TFsteel.setColumns(10);
		TFsteel.setBounds(249, 38, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFsteel);
		
		JLabel lblEnterSlabData = new JLabel("Enter Slab Data in form of Csv:");
		lblEnterSlabData.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterSlabData.setBounds(10, 68, 214, 14);
		frmDesignOfRcc.getContentPane().add(lblEnterSlabData);
		
		TFdatalocation = new JTextField();
		TFdatalocation.setText("E:\\mysoftwares\\slabdata.csv");
		TFdatalocation.setColumns(10);
		TFdatalocation.setBounds(249, 66, 219, 20);
		frmDesignOfRcc.getContentPane().add(TFdatalocation);
		
		JButton button = new JButton("Browse");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFdatalocation.setText(filename);
			}
		});
		button.setBounds(478, 65, 89, 23);
		frmDesignOfRcc.getContentPane().add(button);
		
		JButton btnCalculate = new JButton("calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double concrete=Double.parseDouble(TFconcrete.getText());
					double steel=Double.parseDouble(TFsteel.getText());
					
					double cover=Double.parseDouble(TFcover.getText());
					double odepth=Double.parseDouble(TFodepth.getText());
					double no=Double.parseDouble(TFno.getText());
					double cf=Double.parseDouble(TFcf.getText());
					double ff=Double.parseDouble(TFff.getText());
					double unit=Double.parseDouble(TFunit.getText());
					double part=Double.parseDouble(TFpart.getText());
					double fl=Double.parseDouble(TFfl.getText());
					double MxP=0,MyP=0,MxN=0,MyN=0,ast=0,dst=0;double fst = 0,snd = 0,tau = 0,taubd=0;
					if(concrete==15)
					{
						fst=0.28;snd=0.35;tau=2.5;
					}
					if(concrete==20)
					{
						fst=0.28;snd=0.36;tau=2.8;taubd=1.2;
					}
					if(concrete==25)
					{
						fst=0.29;snd=0.36;tau=3.1;taubd=1.4;
					}
					if(concrete==30)
					{
						fst=0.29;snd=0.37;tau=3.5;taubd=1.5;
					}
					if(concrete==35)
					{
						fst=0.29;snd=0.37;tau=3.7;taubd=1.7;
					}
					if(concrete>=40)
					{
						fst=0.30;snd=0.38;tau=4;
					}
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double tdiam=Double.parseDouble(a);
					
				
					 Formatter xf;
					 xf=new Formatter(TFsolution.getText());
					 setupmycsvarray(TFdatalocation.getText());
					 for(int i=0;i<=no;i++)
					 {
						 xf.format("%s%s%s","\n \n Slab Panel:",myarray[i][0],"\n\n");
						 xf.format("%s","1. Design Data: \n");
						 xf.format("%s%.3f%s%.3f%s","Effective Span:",myarray[i][1],"m � ",myarray[i][2],"m\n");
						 xf.format("%s","Edge Condition: Interior panel\n");
						 xf.format("%s","Materials:\n");
						 xf.format("%s%.0f%s","Concrete Grade: M",concrete,"\n");
						 xf.format("%s%.0f%s","Steel Grade: FE",steel,"\n\n");
						 xf.format("%s%s","2. Relevent Codes:\n","IS 456:2000 and IS 875:1987 (part I and II) \n\n");
						 xf.format("%s","3. Allowable Stresses:\n");
						 xf.format("%s%.0f%s","fck:",concrete,"KN/m2 \n");
						 xf.format("%s%.0f%s","fck:",steel,"KN/m2 \n");
						 xf.format("%s","4. Assumed Slab Depth and local calculation:\n");
						 xf.format("%s%.3f%s","The slab depth is assumed to be ",odepth,"mm as per preliminary design\n");
						 xf.format("%s%.3f%s%.3f%s","Taking effective cover as ",cover,"mm assuming reinforcement bar of ",tdiam,"mm diameter \n\n");
						 xf.format("%s","5. Calculation of Loads:\n");
						 xf.format("%s%.3f%s%.3f%s","Self weight = 25 �",odepth/1000,"=",odepth/1000*25,"\n");
						 xf.format("%s%.3f%s","Live Load =",myarray[i][3],"KN/mm sq.\n");
						 if(ff<=0&&cf<=0)
						 {
							 xf.format("%s%.3f%s","Finishing Load =",fl,"KN/mm sq.\n");
						 }
						 else{
							 
							 
							 
							 
						 
						 xf.format("%s%.3f%s%.3f%s%.3f%s","Load from Floor Finish = ",ff/1000,"�",unit,"=",ff/1000*unit,"KN/mm sq.\n");
						 xf.format("%s%.3f%s%.3f%s%.3f%s","Load from Ceiling Finish = ",cf/1000,"�",unit,"=",cf/1000*unit,"KN/mm sq.\n");
						 }
						 xf.format("%s%.3f%s","Partition Load =",part,"KN/mm sq.\n");
						 xf.format("%s%.3f%s","Total Load on slab=",part+odepth/1000*25+fl,"KN/mm sq.\n");
						 xf.format("%s%.3f%s","Design Load on slab=1.5*Total Load=",1.5*(part+odepth/1000*25+fl),"KN/mm sq.\n");
						 double w=1.5*(part+odepth/1000*25+fl);
						 xf.format("%s","6. Long Span to short Span ratio:\n");
						 xf.format("%s%.3f%s%.3f%s%.3f%s","Long span to Short Span Ratio =Lx/Ly=",myarray[i][1],"/",myarray[i][2],"=",myarray[i][1]/myarray[i][2],"\n");
						 double e=1;
						 double Nalphax=0,Palphax=0,ratio=myarray[i][1]/myarray[i][2],Nalphay=0.032,Palphay=0.024,j=0;
						 double[] r = new double[500];
						 double[] N = new double[500];
						 double[] P = new double[500];
						 double Vu = 0,Mu=0,dast=0;
						 N[1]=0.032;N[2]=0.037;N[3]=0.043;N[4]=0.047;N[5]=0.051;N[6]=0.053;N[7]=0.060;N[8]=0.065;
							P[1]=0.024;P[2]=0.028;P[3]=0.032;P[4]=0.036;P[5]=0.039;P[6]=0.041;P[7]=0.045;P[8]=0.049;
							r[1]=1;r[2]=1.1;r[3]=1.2;;r[4]=1.3;r[5]=1.4;r[6]=1.5;r[7]=1.75;r[8]=2;
						
						 for(int z=1;z<=8;z++)
						 {
							
							
							 if(ratio>=r[z]&&ratio<=r[z+1])
							 {
								 Nalphax=N[z]+(ratio-r[z])/(r[z+1]-r[z])*(N[z+1]-N[z]);
								 Palphax=P[z]+(ratio-r[z])/(r[z+1]-r[z])*(P[z+1]-P[z]);
								 
							 }
						 }
						 xf.format("%s","7. TYPE OF SLAB:\n");
						 if(ratio<=2)
						 xf.format("%s","Since lx/ly<2 so it is two way slab \n");
						 else
							 xf.format("%s","Since lx/ly>2 so it is one way slab \n");
						 xf.format("%s","8. BM Analysis:\n");
						 if(ratio<=2)
						 {
							MxP=Palphax*w*myarray[i][2]*myarray[i][2];
							MxN=Nalphax*w*myarray[i][2]*myarray[i][2];
							MyP=Palphay*w*myarray[i][2]*myarray[i][2];
							MyN=Nalphay*w*myarray[i][2]*myarray[i][2];
							                                                   
							 xf.format("%s%.3f%s","alphax for Negative Moments at continuous edge=",Nalphax,"\n");
							 xf.format("%s%.3f%s","alphax for Positive Moments at mid-span=",Palphax,"\n");
							 xf.format("%s%.3f%s","alphay for Negative Moments at continuous edge=",Nalphay,"\n");
							 xf.format("%s%.3f%s","alphay for Positive Moments at mid-span=",Palphay,"\n");
							 xf.format("%s","Bending Moment in X-Direction(shorter span) \n");
							 xf.format("%s%.3f%s%.3f%s%.3f%s%.3f%s%.3f%s","Negative Bending Moment at continuous edge(Mx edge)=",Nalphax,"�",w,"�",myarray[i][2],"�",myarray[i][2],"=",MxN,"\n");
							 xf.format("%s%.3f%s%.3f%s%.3f%s%.3f%s%.3f%s","Positive Bending Moment at Mid-Span(Mx Midspan)=",Palphax,"�",w,"�",myarray[i][2],"�",myarray[i][2],"=",MxP,"\n");
							 xf.format("%s","\nBending Moment in Y-Direction(Longer span) \n");
							 xf.format("%s%.3f%s%.3f%s%.3f%s%.3f%s%.3f%s","Negative Bending Moment at continuous edge(My edge)=",Nalphay,"�",w,"�",myarray[i][2],"�",myarray[i][2],"=",MyN,"\n");
							 xf.format("%s%.3f%s%.3f%s%.3f%s%.3f%s%.3f%s","Positive Bending Moment at Mid-Span(My mid-span)=",Palphay,"�",w,"�",myarray[i][2],"�",myarray[i][2],"=",MyP,"\n");
							 xf.format("%s","Reinforcement Area Calculation in Shorter Direction(X-Direction): \n");
							 xf.format("%s","For Mid Section(Bottom Reinforcement):\n");
							 double x=200;
								double m=0;
								double a1=100;
								double b1=1000;
								double edepth=odepth-cover;
								double temp;
								do
								{
									temp=x;
									
									x=x-(0.36*concrete*x*edepth*1000-0.1498*concrete*1000*x*x-MxP*1000000)/(0.36*concrete*1000*edepth-0.3*concrete*x);
							}while(Math.abs(temp-x)>0.000001);
							ast=x*0.36*concrete*1000/(0.87*steel);
							double as=Math.max(ast,0.0015*1000*odepth);
								dst=4*as/(tdiam*tdiam*3.14);
							int k = 0;
							
							while(k<dst)
							{
							k++;
							}
								double cc=Math.min(1000/(k),300);
								cc=Math.min(cc,3*(odepth-cover));
								double cd=1000/(k);
								xf.format("%s","\nMu=(formula)");
								xf.format("%s","\nMu=(formula)");
								xf.format("%s","\nSolving the quadratic equation:");
								xf.format("%s%.3f%s%.3f%s","\nRequired Ast at mid-span from design consideration=",ast," sq. mm \nprovide",tdiam,"mm diameter\n");
								xf.format("%s%.3f%s","\nTemperature Reinforcement(Ast minimum)=15% of sectional area=",0.0015*1000*odepth," mm\n");
							
								xf.format("%s%.3f%s","Required Ast=Maximum of temperature and designed reinforcement=",as,"sq. mm\n\n");
								xf.format("%s","\nSpacing:");
								xf.format("%s%d%s","\nNo of Required Bars=",k," mm");
								xf.format("%s%.3f%s","\ncenter to center distance at mid-span=1000/no of required bars=",cd," mm\n");
								xf.format("%s","\nSpacing must be less than that of i)3 times effective depth ii)300mm iii)from design no of bars\n");
								xf.format("%s%.3f%s%.3f%s%.3f%s","\nMinimum Spacing=Min(300,",3*(odepth-cover),",",cd,")=",cc,"mm c/c \n");
								xf.format("%s%.3f%s","\nProvide",tdiam,"mm diameter at ...... mm c/c\n");
								 xf.format("%s","For End Section:(Top Reinforcement)");
								 x=200;
									
									b1=1000;
									edepth=odepth-cover;
									do
									{
										temp=x;
										
										x=x-(0.36*concrete*x*edepth*1000-0.1498*concrete*1000*x*x-MxN*1000000)/(0.36*concrete*1000*edepth-0.3*concrete*x);
								}while(Math.abs(temp-x)>0.000001);
								ast=x*0.36*concrete*1000/(0.87*steel);
								as=Math.max(ast,0.0015*1000*odepth);
								double astop=as;
								dst=4*as/(tdiam*tdiam*3.14);
								k = 0;
								
								while(k<dst)
								{
								k++;
								}
								cc=Math.min(1000/(k),300);
									cc=Math.min(cc,3*(odepth-cover));
									cd=1000/(k);
									xf.format("%s","\nMu=(formula)");
									xf.format("%s","\nMu=(formula)");
									xf.format("%s","\nSolving the quadratic equation:");
									xf.format("%s%.3f%s%.3f%s","\nRequired Ast at end-span from design consideration=",ast," sq. mm \nprovide",tdiam,"mm diameter\n");
								xf.format("%s%.3f%s","\nTemperature Reinforcement(Ast minimum)=15% of sectional area=",0.0015*1000*odepth," mm\n");
								
									xf.format("%s%.3f%s","Required Ast=Maximum of temperature and designed reinforcement=",as,"sq. mm\n\n");
								xf.format("%s","\nSpacing:");
								xf.format("%s%d%s","\nNo of Required Bars=",k," mm");
									xf.format("%s%.3f%s","\ncenter to center distance at end-span=1000/no of required bars=",cd," mm\n");
									xf.format("%s","\nSpacing must be less than that of i)3 times effective depth ii)300mm iii)from design no of bars\n");
									xf.format("%s%.3f%s%.3f%s%.3f%s","\nMinimum Spacing=Min(300,",3*(odepth-cover),",",cd,")=",cc,"mm c/c \n");
									xf.format("%s%.3f%s","\nProvide",tdiam,"mm diameter at ...... mm c/c\n");
									 xf.format("%s","Reinforcement Area Calculation in Longer Direction(Y-Direction): \n");
									 xf.format("%s","For Mid Section(Bottom Reinforcement):\n");
									 x=200;
										m=0;
										a1=100;
										b1=1000;
										edepth=odepth-cover-tdiam/2;
										do
										{
											temp=x;
											
											x=x-(0.36*concrete*x*edepth*1000-0.1498*concrete*1000*x*x-MxP*1000000)/(0.36*concrete*1000*edepth-0.3*concrete*x);
									}while(Math.abs(temp-x)>0.000001);
									ast=x*0.36*concrete*1000/(0.87*steel);
									as=Math.max(ast,0.0015*1000*edepth);
									double asbottom=as;
										dst=4*as/(tdiam*tdiam*3.14);
									k = 0;
									
									while(k<dst)
									{
									k++;
									}
										cc=Math.min(1000/(k),300);
										cc=Math.min(cc,3*(edepth));
										cd=1000/(k);
										xf.format("%s","\nMu=(formula)");
										xf.format("%s","\nMu=(formula)");
										xf.format("%s","\nSolving the quadratic equation:");
										xf.format("%s%.3f%s%.3f%s","\nRequired Ast at mid-span from design consideration=",ast," sq. mm \nprovide",tdiam,"mm diameter\n");
										xf.format("%s%.3f%s","\nTemperature Reinforcement(Ast minimum)=15% of sectional area=",0.0015*1000*edepth," mm\n");
									
										xf.format("%s%.3f%s","Required Ast=Maximum of temperature and designed reinforcement=",as,"sq. mm\n\n");
										xf.format("%s","\nSpacing:");
										xf.format("%s%d%s","\nNo of Required Bars=",k," mm");
										xf.format("%s%.3f%s","\ncenter to center distance at mid-span=1000/no of required bars=",cd," mm\n");
										xf.format("%s","\nSpacing must be less than that of i)3 times effective depth ii)300mm iii)from design no of bars\n");
										xf.format("%s%.3f%s%.3f%s%.3f%s","\nMinimum Spacing=Min(300,",3*(edepth),",",cd,")=",cc,"mm c/c \n");
										xf.format("%s%.3f%s","\nProvide",tdiam,"mm diameter at ...... mm c/c\n");
										 xf.format("%s","For End Section:(Top Reinforcement)");
										 x=200;
											
											b1=1000;
											edepth=odepth-cover-tdiam/2;
											do
											{
												temp=x;
												
												x=x-(0.36*concrete*x*edepth*1000-0.1498*concrete*1000*x*x-MxN*1000000)/(0.36*concrete*1000*edepth-0.3*concrete*x);
										}while(Math.abs(temp-x)>0.000001);
										ast=x*0.36*concrete*1000/(0.87*steel);
										as=Math.max(ast,0.0015*1000*edepth);
										dst=4*as/(tdiam*tdiam*3.14);
										k = 0;
										
										while(k<dst)
										{
										k++;
										}
										cc=Math.min(1000/(k),300);
											cc=Math.min(cc,3*(odepth-cover-tdiam/2));
											cd=1000/(k);
											xf.format("%s","\nMu=(formula)");
											xf.format("%s","\nMu=(formula)");
											xf.format("%s","\nSolving the quadratic equation:");
											xf.format("%s%.3f%s%.3f%s","\nRequired Ast at end-span from design consideration=",ast," sq. mm \nprovide",tdiam,"mm diameter\n");
										xf.format("%s%.3f%s","\nTemperature Reinforcement(Ast minimum)=15% of sectional area=",0.0015*1000*edepth," mm\n");
										
											xf.format("%s%.3f%s","Required Ast=Maximum of temperature and designed reinforcement=",as,"sq. mm\n\n");
										xf.format("%s","\nSpacing:");
										xf.format("%s%d%s","\nNo of Required Bars=",k," mm");
											xf.format("%s%.3f%s","\ncenter to center distance at end-span=1000/no of required bars=",cd," mm\n");
											xf.format("%s","\nSpacing must be less than that of i)3 times effective depth ii)300mm iii)from design no of bars\n");
											xf.format("%s%.3f%s%.3f%s%.3f%s","\nMinimum Spacing=Min(300,",3*(odepth-cover-tdiam/2),",",cd,")=",cc,"mm c/c \n");
											xf.format("%s%.3f%s","\nProvide",tdiam,"mm diameter at ...... mm c/c\n");
											xf.format("%s","\n9. Check For Shear:");
											double V=0.5*w*myarray[i][2]*ratio*ratio*ratio*ratio/(1+ratio*ratio*ratio*ratio);
											xf.format("%s%.3f%s","Shear Force(V)=0.5*w*lx*r^4/(1+r^4)=",V,"KN\n");
											xf.format("%s%.3f%s","Shear Strength(tu)=V/(bd)=",V*1000/(1000*(odepth-cover)),"KN\n");
											
											dast=Math.max(astop, asbottom);
											
											xf.format("%s%.3f%s","Area of Steel=",dast,"sq.mm \n");
											xf.format("%s%.3f%s","percent of Steel(pt)=100*ast/bd=",100*dast/(1000*(odepth-cover)),"KN\n");
											xf.format("%s","Design Shear Strength from IS456:2000 Table 19 :\n");
											double shearcoff;
											double pt=100*dast/(1000*(odepth-cover));
											if(pt<=0.15)
												shearcoff=fst;
											else
												shearcoff=fst+(pt-0.15)/0.1*(snd-fst);
											xf.format("%s%.3f%s","Shear strength=K*shear strength from table=",shearcoff*1.3,"N sq.mm \n");
											xf.format("%s%.3f%s","Maximum shear stress=",tau,"N sq.mm \n");
											if(shearcoff*1.3>=V*1000/(1000*(odepth-cover)))
												xf.format("%s","shear stress<shear strength it is safe in shear and no reinforcement is required");	
											
									Vu=V;		
											
								
							
						 }
						 if(ratio>2)
						 {
							double dead=w-myarray[i][3];
							double BMlivemid,BMdeadmid,BMliveend,BMdeadend;
							 xf.format("%s%.3f%s","\nDead Load Intensity=",dead,"KN/sq.m \n");
							 xf.format("%s%.3f%s","Live Load Intensity=",myarray[i][3],"KN/sq.m \n");
							
							 xf.format("%s","\nCofficient of Dead Load at Mid-Span=+1/16 \n");
							 xf.format("%s","Cofficient of Live Load at Mid-Span=+1/12 \n");
							 xf.format("%s","Cofficient of Dead Load at Support=-1/12 \n");
							 xf.format("%s","Cofficient of Live Load at Support=-1/9 \n");
							 BMlivemid=myarray[i][3]/12*myarray[i][2]*myarray[i][2];
								BMdeadmid=dead/16*myarray[i][2]*myarray[i][2];
								BMliveend=myarray[i][3]/9*myarray[i][2]*myarray[i][2];
								BMdeadend=dead/12*myarray[i][2]*myarray[i][2];
								 xf.format("%s%s%.3f%s","\nBending Moment at Mid-Span=","BM due to dead+BM due to live load=",BMlivemid+BMdeadmid,"KNm \n");
								 xf.format("%s%s%.3f%s","\nBending Moment at End support=","BM due to dead+BM due to live load=",BMliveend+BMdeadend,"KNm \n");
								 xf.format("%s","7. Reinforcement Calculations:\n");
								 double BMmid=BMlivemid+BMdeadmid;
								 double BMend=BMliveend+BMdeadend;
								 xf.format("%s","For Mid Section:");
								 double x=200;
									double m=0;
									double a1=100;
									double b1=1000;
									double edepth=odepth-cover;
									double temp;
									do
									{
										temp=x;
										
										x=x-(0.36*concrete*x*edepth*1000-0.1498*concrete*1000*x*x-BMmid*1000000)/(0.36*concrete*1000*edepth-0.3*concrete*x);
								}while(Math.abs(temp-x)>0.000001);
								ast=x*0.36*concrete*1000/(0.87*steel);
								double asbottom=ast;
								double as=Math.max(ast,0.0015*1000*edepth);
									dst=4*as/(tdiam*tdiam*3.14);
								int k = 0;
								
								while(k<dst)
								{
								k++;
								}
									double cc=Math.min(1000/(k),300);
									cc=Math.min(cc,3*(edepth));
									double cd=1000/(k);
									xf.format("%s","\nMu=(formula)");
									xf.format("%s","\nMu=(formula)");
									xf.format("%s","\nSolving the quadratic equation:");
									xf.format("%s%.3f%s%.3f%s","\nRequired Ast at mid-span from design consideration=",ast," sq. mm\n provide",tdiam,"mm diameter\n");
									xf.format("%s%.3f%s","\nTemperature Reinforcement(Ast minimum)=15% of sectional area=",0.0015*1000*edepth," mm\n");
								
									xf.format("%s%.3f%s","Required Ast=Maximum of temperature and designed reinforcement=",as,"sq. mm\n\n");
									xf.format("%s","\nSpacing:");
									xf.format("%s%d%s","\nNo of Required Bars=",k," mm");
									xf.format("%s%.3f%s","\ncenter to center distance at mid-span=1000/no of required bars=",cd," mm\n");
									xf.format("%s","\nSpacing must be less than that of i)3 times effective depth ii)300mm iii)from design no of bars\n");
									xf.format("%s%.3f%s%.3f%s%.3f%s","\nMinimum Spacing=Min(300,",3*(edepth),",",cd,")=",cc,"mm c/c \n");
									xf.format("%s%.3f%s","\nProvide",tdiam,"mm diameter at ...... mm c/c\n");
									
									
									 xf.format("%s","For End Section:");
									 x=200;
										
										b1=1000;
										
										do
										{
											temp=x;
											edepth=odepth-cover;
											x=x-(0.36*concrete*x*edepth*1000-0.1498*concrete*1000*x*x-BMend*1000000)/(0.36*concrete*1000*edepth-0.3*concrete*x);
									}while(Math.abs(temp-x)>0.000001);
									ast=x*0.36*concrete*1000/(0.87*steel);
									as=Math.max(ast,0.0015*1000*edepth);
									double astop=as;
									dst=4*as/(tdiam*tdiam*3.14);
									k = 0;
									
									while(k<dst)
									{
									k++;
									}
									cc=Math.min(1000/(k),300);
										cc=Math.min(cc,3*(edepth-cover));
										cd=1000/(k);
										xf.format("%s","\nMu=(formula)");
										xf.format("%s","\nMu=(formula)");
										xf.format("%s","\nSolving the quadratic equation:");
										xf.format("%s%.3f%s%.3f%s","\nRequired Ast at end-span from design consideration=",ast," sq. mm \nprovide",tdiam,"mm diameter\n");
									xf.format("%s%.3f%s","\nTemperature Reinforcement(Ast minimum)=15% of sectional area=",0.0015*1000*edepth," mm\n");
									
										xf.format("%s%.3f%s","Required Ast=Maximum of temperature and designed reinforcement=",as,"sq. mm\n\n");
									xf.format("%s","\nSpacing:");
									xf.format("%s%d%s","\nNo of Required Bars=",k," mm");
										xf.format("%s%.3f%s","\ncenter to center distance at end-span=1000/no of required bars=",cd," mm\n");
										xf.format("%s","\nSpacing must be less than that of i)3 times effective depth ii)300mm iii)from design no of bars\n");
										xf.format("%s%.3f%s%.3f%s%.3f%s","\nMinimum Spacing=Min(300,",3*(edepth),",",cd,")=",cc,"mm c/c \n");
										xf.format("%s%.3f%s","\nProvide",tdiam,"mm diameter at ...... mm c/c\n");
										xf.format("%s","\n9. Check For Shear:");
										double V=0.5*dead+0.6*myarray[i][3];
										xf.format("%s%.3f%s","Shear Force(V)=0.5*dead load+0.6*liveload=",V,"KN\n");
										xf.format("%s%.3f%s","Shear Strength(tu)=V/(bd)=",V*1000/(1000*(odepth-cover)),"KN\n");
										
										dast=Math.max(astop, asbottom);
										
										xf.format("%s%.3f%s","Area of Steel=",dast,"sq.mm \n");
										xf.format("%s%.3f%s","percent of Steel(pt)=100*ast/bd=",100*dast/(1000*(odepth-cover)),"KN\n");
										xf.format("%s","Design Shear Strength from IS456:2000 Table 19 :\n");
										double shearcoff;
										double pt=100*dast/(1000*(odepth-cover));
										if(pt<=0.15)
											shearcoff=fst;
										else
											shearcoff=fst+(pt-0.15)/0.1*(snd-fst);
										xf.format("%s%.3f%s","Shear strength=K*shear strength from table=",shearcoff*1.3,"N sq.mm \n");
										xf.format("%s%.3f%s","Maximum shear stress=",tau,"N sq.mm \n");
										if(shearcoff*1.3>=V*1000/(1000*(odepth-cover)))
											xf.format("%s","shear stress<shear strength it is safe in shear and no reinforcement is required\n");
										
										
								 Vu=V;
						 }
						 
						 xf.format("%s","\n9. Check For Development Length:\n");
						 xf.format("%s%.3f%s","Vu=",Vu,"KN \n");
						 xf.format("%s%.3f%s","Ast=",dast,"\n");
						 Mu=0.87*steel*dast*(odepth-cover-dast*steel/(1000*concrete))/1000000;
						 xf.format("%s%.3f%s","Mul=(formula)=",Mu,"*10^6 \n");
						 xf.format("%s%.3f%s","taubd=",taubd,"\n");
						 xf.format("%s%.3f%s","Required Development Length(Ld)=(formula)",4*tdiam*0.87*steel/(4*taubd),"\n");
						 xf.format("%s%.3f%s","Development length=1.3*mu/vu=",1.3*Mu/Vu*1000,"\n");
						 if(1.3*Mu/Vu>4*tdiam*0.87*steel/(4*taubd))
							 xf.format("%s","OK:\n");
						 else
							 xf.format("%s","NOT OK provide additional bs/2-cc-8*diam development lengh at support bent 90 degree=....");
						 
						 xf.format("%s","\n9. Check For Deflection:\n");
						 
						 
						 
						 
						
						
						
						
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
					 }
					
					 
					
					 xf.close();
					 
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
				
			}
		});
		btnCalculate.setBounds(234, 423, 89, 23);
		frmDesignOfRcc.getContentPane().add(btnCalculate);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResult.setBounds(10, 457, 77, 30);
		frmDesignOfRcc.getContentPane().add(lblResult);
		
	    TVresult = new JLabel(".............");
		TVresult.setBounds(20, 498, 46, 14);
		frmDesignOfRcc.getContentPane().add(TVresult);
		
		JLabel lblSolutioncsv = new JLabel("Solution .csv:");
		lblSolutioncsv.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSolutioncsv.setBounds(79, 115, 110, 14);
		frmDesignOfRcc.getContentPane().add(lblSolutioncsv);
		
		TFsolution = new JTextField();
		TFsolution.setText("E:\\mysoftwares\\solution.csv");
		TFsolution.setColumns(10);
		TFsolution.setBounds(204, 116, 219, 20);
		frmDesignOfRcc.getContentPane().add(TFsolution);
		
		JButton button_1 = new JButton("Browse");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFsolution.setText(filename);
				
			}
		});
		button_1.setBounds(433, 115, 89, 23);
		frmDesignOfRcc.getContentPane().add(button_1);
		
		JLabel lblChooseDiameterOf = new JLabel("Choose Diameter of Reinforcement");
		lblChooseDiameterOf.setForeground(Color.BLACK);
		lblChooseDiameterOf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblChooseDiameterOf.setBounds(10, 168, 288, 20);
		frmDesignOfRcc.getContentPane().add(lblChooseDiameterOf);
		
		JRadioButton radioButton = new JRadioButton("8");
		buttonGroup.add(radioButton);
		radioButton.setBounds(10, 195, 58, 23);
		frmDesignOfRcc.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("10");
		buttonGroup.add(radioButton_1);
		radioButton_1.setSelected(true);
		radioButton_1.setBounds(70, 195, 58, 23);
		frmDesignOfRcc.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("12");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(130, 195, 58, 23);
		frmDesignOfRcc.getContentPane().add(radioButton_2);
		
		JLabel lblEnterPreliminarySlab = new JLabel("Enter preliminary Slab depth(mm):");
		lblEnterPreliminarySlab.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterPreliminarySlab.setBounds(10, 369, 228, 14);
		frmDesignOfRcc.getContentPane().add(lblEnterPreliminarySlab);
		
		TFodepth = new JTextField();
		TFodepth.setText("150");
		TFodepth.setColumns(10);
		TFodepth.setBounds(249, 367, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFodepth);
		
		JLabel lblEnterEffectiveCovermm = new JLabel("Enter effective cover(mm):");
		lblEnterEffectiveCovermm.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterEffectiveCovermm.setBounds(43, 397, 192, 14);
		frmDesignOfRcc.getContentPane().add(lblEnterEffectiveCovermm);
		
		TFcover = new JTextField();
		TFcover.setText("25");
		TFcover.setColumns(10);
		TFcover.setBounds(249, 392, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFcover);
		
		JLabel lblFileHavingComplete = new JLabel("File Having complete Solutions in .csv format.....");
		lblFileHavingComplete.setForeground(Color.BLACK);
		lblFileHavingComplete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblFileHavingComplete.setBounds(69, 93, 332, 20);
		frmDesignOfRcc.getContentPane().add(lblFileHavingComplete);
		
		JLabel lblNoOfSlab = new JLabel("NO of slab panels:");
		lblNoOfSlab.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoOfSlab.setBounds(121, 147, 124, 14);
		frmDesignOfRcc.getContentPane().add(lblNoOfSlab);
		
		TFno = new JTextField();
		TFno.setText("9");
		TFno.setColumns(10);
		TFno.setBounds(270, 145, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFno);
		
		JLabel lblEnterPartitonWall = new JLabel("Enter Partiton wall intensity(KN/sq. m):");
		lblEnterPartitonWall.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterPartitonWall.setBounds(10, 227, 264, 14);
		frmDesignOfRcc.getContentPane().add(lblEnterPartitonWall);
		
		TFpart = new JTextField();
		TFpart.setText("1.5");
		TFpart.setColumns(10);
		TFpart.setBounds(295, 225, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFpart);
		
		JLabel label = new JLabel("Enter Floor finish Thickness(mm):");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(10, 281, 228, 14);
		frmDesignOfRcc.getContentPane().add(label);
		
		TFff = new JTextField();
		TFff.setText("80");
		TFff.setColumns(10);
		TFff.setBounds(249, 279, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFff);
		
		JLabel lblEnterCeilingFinish = new JLabel("Enter Ceiling finish Thickness(mm):");
		lblEnterCeilingFinish.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterCeilingFinish.setBounds(10, 308, 228, 14);
		frmDesignOfRcc.getContentPane().add(lblEnterCeilingFinish);
		
		TFcf = new JTextField();
		TFcf.setText("80");
		TFcf.setColumns(10);
		TFcf.setBounds(249, 306, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFcf);
		
		JLabel lblUnitWeightOf = new JLabel("UNIT weight of finish(KN/sq.mm):");
		lblUnitWeightOf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUnitWeightOf.setBounds(343, 277, 228, 14);
		frmDesignOfRcc.getContentPane().add(lblUnitWeightOf);
		
		TFunit = new JTextField();
		TFunit.setText("20");
		TFunit.setColumns(10);
		TFunit.setBounds(582, 275, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFunit);
		
		JLabel lblEnterFinishingDetails = new JLabel("Enter Finishing Details:");
		lblEnterFinishingDetails.setForeground(Color.BLACK);
		lblEnterFinishingDetails.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblEnterFinishingDetails.setBounds(10, 250, 288, 20);
		frmDesignOfRcc.getContentPane().add(lblEnterFinishingDetails);
		
		TFfl = new JTextField();
		TFfl.setText("20");
		TFfl.setColumns(10);
		TFfl.setBounds(249, 338, 86, 20);
		frmDesignOfRcc.getContentPane().add(TFfl);
		
		JLabel lblTotalFinishingLoadkn = new JLabel("Total Finishing Load(KN):");
		lblTotalFinishingLoadkn.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalFinishingLoadkn.setBounds(71, 340, 167, 14);
		frmDesignOfRcc.getContentPane().add(lblTotalFinishingLoadkn);
		
		JButton btnCalculateFinishingLoad = new JButton("calculate Finishing Load");
		btnCalculateFinishingLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double cf=Double.parseDouble(TFcf.getText());
					double ff=Double.parseDouble(TFff.getText());
					double unit=Double.parseDouble(TFunit.getText());
					
					double fl=(cf+ff)/1000*unit;
					 String amcs=String.format("%.3f",fl);
					 TFfl.setText(amcs);
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnCalculateFinishingLoad.setBounds(345, 337, 189, 23);
		frmDesignOfRcc.getContentPane().add(btnCalculateFinishingLoad);
		
		JLabel lblincludingPlaster = new JLabel("(INCLUDING PLASTER)");
		lblincludingPlaster.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblincludingPlaster.setBounds(353, 309, 228, 14);
		frmDesignOfRcc.getContentPane().add(lblincludingPlaster);
	}
}
