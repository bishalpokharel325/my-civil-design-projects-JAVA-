package columndesign;

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

public class ColumnDesign {

	private JFrame frmDesignOfColumn;
	private JTextField TFconcrete;
	private JTextField TFsteel;
	private JTextField TFcolumndata;
	private JTextField TFcolumnsolution;
	private JLabel TVresult;
	private JLabel TVsafe;
	private JTextField TFno;
	private JLabel TVdesigntype;

	/**
	 * Launch the application.
	 */
	static String xstrPath;
	static double[][] myarray;
	private JTextField TFlocation;
	private JTextField TFcc;
	private JTextField TFpercent;
	private JTextField TFdiam;
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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColumnDesign window = new ColumnDesign();
					window.frmDesignOfColumn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ColumnDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDesignOfColumn = new JFrame();
		frmDesignOfColumn.setTitle("Design of Column ");
		frmDesignOfColumn.setBounds(100, 100, 621, 589);
		frmDesignOfColumn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDesignOfColumn.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Enter Grade of Concrete(N/sq.mm):");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(10, 13, 238, 14);
		frmDesignOfColumn.getContentPane().add(label);
		
		TFconcrete = new JTextField();
		TFconcrete.setText("25");
		TFconcrete.setColumns(10);
		TFconcrete.setBounds(249, 11, 86, 20);
		frmDesignOfColumn.getContentPane().add(TFconcrete);
		
		JLabel label_1 = new JLabel("Enter Grade of Steel(N/sq.mm):");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10, 40, 214, 14);
		frmDesignOfColumn.getContentPane().add(label_1);
		
		TFsteel = new JTextField();
		TFsteel.setText("500");
		TFsteel.setColumns(10);
		TFsteel.setBounds(249, 38, 86, 20);
		frmDesignOfColumn.getContentPane().add(TFsteel);
		
		JLabel lblEnterColumnData = new JLabel("Enter Column data in form  of Csv:");
		lblEnterColumnData.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterColumnData.setBounds(16, 72, 232, 14);
		frmDesignOfColumn.getContentPane().add(lblEnterColumnData);
		
		TFcolumndata = new JTextField();
		TFcolumndata.setText("E:\\mysoftwares\\columndata.csv");
		TFcolumndata.setColumns(10);
		TFcolumndata.setBounds(249, 70, 219, 20);
		frmDesignOfColumn.getContentPane().add(TFcolumndata);
		
		JLabel label_3 = new JLabel("File Having complete Solutions in .csv format.....");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_3.setBounds(80, 97, 332, 20);
		frmDesignOfColumn.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Solution .csv:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(90, 131, 110, 14);
		frmDesignOfColumn.getContentPane().add(label_4);
		
		TFcolumnsolution = new JTextField();
		TFcolumnsolution.setText("E:\\mysoftwares\\columnsolution.csv");
		TFcolumnsolution.setColumns(10);
		TFcolumnsolution.setBounds(210, 129, 219, 20);
		frmDesignOfColumn.getContentPane().add(TFcolumnsolution);
		
		JButton button = new JButton("Browse");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFcolumnsolution.setText(filename);

			}
		});
		button.setBounds(439, 128, 89, 23);
		frmDesignOfColumn.getContentPane().add(button);
		
		JButton button_1 = new JButton("Browse");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFcolumndata.setText(filename);

				
			}
		});
		button_1.setBounds(478, 69, 89, 23);
		frmDesignOfColumn.getContentPane().add(button_1);
		
		JLabel lblNoOfColumns = new JLabel("NO of Columns Data:");
		lblNoOfColumns.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoOfColumns.setBounds(100, 158, 174, 14);
		frmDesignOfColumn.getContentPane().add(lblNoOfColumns);
		
		TFno = new JTextField();
		TFno.setText("3");
		TFno.setColumns(10);
		TFno.setBounds(284, 156, 86, 20);
		frmDesignOfColumn.getContentPane().add(TFno);
		
		JButton btnStartRecording = new JButton("results");
		btnStartRecording.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double concrete=Double.parseDouble(TFconcrete.getText());
					double steel=Double.parseDouble(TFsteel.getText());
					double no=Double.parseDouble(TFno.getText());
					double cc=Double.parseDouble(TFcc.getText());
					double diam=Double.parseDouble(TFdiam.getText());
					double p=Double.parseDouble(TFpercent.getText());
					if(p<0.8)
					{
						String amcs=String.format("%.3f",0.8);
						TFpercent.setText(amcs);
						p=0.8;
					}  
					int q=1;
					if(p>4)
					{
						String amcs=String.format("%.3f",4);
						TFpercent.setText(amcs);
						p=4;
					}   
					double f=0;
					 double[] k1arr = new double[500];
					 double[] k2arr = new double[500];
					 double[] dd = new double[500];
					 int dt0=0,dt1=0,dt2=0,dt3=0,j=0;int safekinai=0;
					double k1 = 0,k2=0,pbb=0,pbd=0,puzb=0,puzd=0,mad=0,mab=0;
					if(concrete==25){
					dd[0]=0.05;dd[1]=0.1;dd[2]=0.15;dd[3]=0.2;
					
					k1arr[0]=0.219;k1arr[1]=0.207;k1arr[2]=0.196;k1arr[3]=0.184;
					
					
					k2arr[0]=0.545;k2arr[1]=0.425;k2arr[2]=0.256;k2arr[3]=0.040;
					}
					if(concrete==20){
						dd[0]=0.05;dd[1]=0.1;dd[2]=0.15;dd[3]=0.2;
						
						k1arr[0]=0.219;k1arr[1]=0.207;k1arr[2]=0.196;k1arr[3]=0.184;
						
						
						k2arr[0]=0.424;k2arr[1]=0.328;k2arr[2]=0.203;k2arr[3]=0.028;
						}
					
					Formatter xf;
					
					 xf=new Formatter(TFcolumnsolution.getText());
		             	
					setupmycsvarray(TFcolumndata.getText());
					xf.format("%s","Design of COLUMNS:");
					double eccx,eccy,eccminx,eccminy,condx,condy;
					double leff,lbyd=0,lbyb = 0;int maxno=0;
					xf.format("%s%.0f","\n\nGrade of Concrete= M",concrete);
					xf.format("%s%.0f","\nGrade of steel=FE",steel);
					
					for(int i=0;i<no;i++)
					{
						     double puz=0.4*concrete*0.001*(myarray[i][1]*myarray[i][2]-p*myarray[i][1]*myarray[i][2]*0.01)+myarray[i][1]*myarray[i][2]*0.001*0.67*steel*0.01;
						     xf.format("%s%.0f","\n\nColumn no.=",myarray[i][0]);
						xf.format("%s%.2f%s%.2f%s","\nColumn Size=",myarray[i][1],"mm *",myarray[i][2],"mm");
						xf.format("%s%.3f%s","\nColumn Length(l)=",myarray[i][3],"m \n");
						xf.format("%s%.3f%s","\nEffective Length=0.65*l=",0.65*myarray[i][3],"m \n");
						leff=0.65*myarray[i][3];
						
						lbyd=leff*1000/myarray[i][1];
						lbyb=leff*1000/myarray[i][2];
						double ccbyb=cc/myarray[i][2];
						double ccbyd=cc/myarray[i][1];
						
						if(lbyd<12)
						xf.format("%s%.3f%s","\nLeff/D=",lbyd,"<12 (Short Column along D) \n");
						else
						{
							xf.format("%s%.3f%s","\nLeff/D=",lbyd,">12 (Long Column along D) \n");
							xf.format("%s","Calculations of Additional Secondary Moment Due to Lateral Deflection:\n");
							for(int z=0;z<=3;z++)
							{
								if(ccbyd>=dd[z]&&ccbyd<=dd[z+1])
								{
									k1=k1arr[z]+(ccbyd-dd[z])/(dd[z+1]-dd[z])*(k1arr[z+1]-k1arr[z]);
									k2=k2arr[z]+(ccbyd-dd[z])/(dd[z+1]-dd[z])*(k2arr[z+1]-k2arr[z]);
								}
							}
							xf.format("%s","\n From Table 60 SP-16 (For rectangular column):\n");
							xf.format("%s%.3f%s","d'/D=",cc/myarray[i][1]," \n");
							xf.format("%s%.3f%s","value of k1=",k1," \n");
							xf.format("%s%.3f%s","value of k2=",k2," \n");
						
							pbd=concrete*myarray[i][1]*myarray[i][2]*0.001*(k1+k2*p/concrete);
							puzd=0.4*concrete*0.001*(myarray[i][1]*myarray[i][2]-p*myarray[i][1]*myarray[i][2]*0.01)+myarray[i][1]*myarray[i][2]*0.001*p*0.67*steel*0.01;
							f=(puzd-myarray[i][6])/(puzd-pbd);
							mad=myarray[i][6]*myarray[i][1]*0.0005*(leff/myarray[i][1])*(leff/myarray[i][1])*f;
							xf.format("%s%.3f%s","\nvalue of pb=(((((formula)))))=",pbd,"KN");
							xf.format("%s%.3f%s","\nvalue of puzd=(((((formula)))))=",puzd,"KN");
							xf.format("%s%.3f","\nvalue of k=(((((formula)))))=",f);
							xf.format("%s%.3f%s","\nvalue of Mad=(((((formula)))))=",mad,"KNm \n");
						}
						if(lbyb<12)
							xf.format("%s%.3f%s","\nLeff/b=",lbyb,"<12 (Short Column along b) \n");
							else
							{
								xf.format("%s%.3f%s","\nLeff/b=",lbyb,">12 (Long Column along b) \n");	
								xf.format("%s","Calculations of Additional Secondary Moment Due to Lateral Deflection:\n");
								for(int z=0;z<=3;z++)
								{
									if(ccbyb>=dd[z]&&ccbyb<=dd[z+1])
									{
										k1=k1arr[z]+(ccbyb-dd[z])/(dd[z+1]-dd[z])*(k1arr[z+1]-k1arr[z]);
										k2=k2arr[z]+(ccbyb-dd[z])/(dd[z+1]-dd[z])*(k2arr[z+1]-k2arr[z]);
									}
								}
								xf.format("%s","\n From Table 60 SP-16 (For rectangular column):\n");
								xf.format("%s%.3f%s","d'/b=",cc/myarray[i][2]," \n");
								xf.format("%s%.3f%s","value of k1=",k1," \n");
								xf.format("%s%.3f%s","value of k2=",k2," \n");
								
								pbb=concrete*myarray[i][1]*myarray[i][2]*0.001*(k1+k2*p/concrete);
								puzb=0.4*concrete*0.001*(myarray[i][1]*myarray[i][2]-p*myarray[i][1]*myarray[i][2]*0.01)+myarray[i][1]*myarray[i][2]*0.001*0.67*steel*0.01;
								f=(puzb-myarray[i][6])/(puzb-pbb);
								mab=myarray[i][6]*myarray[i][2]*0.0005*(leff/myarray[i][1])*(leff/myarray[i][1])*f;
								xf.format("%s%.3f%s","\nvalue of pb=(((((formula)))))=",pbb,"KN");
								xf.format("%s%.3f%s","\nvalue of puzb=(((((formula)))))=",puzb,"KN");
								xf.format("%s%.3f","\nvalue of k=(((((formula)))))=",f);
								xf.format("%s%.3f%s","\nvalue of Mab=(((((formula)))))=",mab,"KNm \n");
							}
						xf.format("%s%.3f%s","\n\nMaximum BM in X-Direction=",myarray[i][4],"KNm \n");
						xf.format("%s%.3f%s","\nMaximum BM in Y-Direction=",myarray[i][5],"KNm \n");
						xf.format("%s%.3f%s","\nMaximum Axial Load=",myarray[i][6],"KN \n");
						xf.format("%s","\n\nChecking for Minimum eccentricity:");
					
								xf.format("%s","emin=l/500+D(or b)/30 (mm) OR 20mm");
						xf.format("%s%s%s%s%s%s%s","\nDirection",",","eccentricity(e)=BM/P (mm)",",","minimum eccentricity(emin)",",","0.05*D (or b) (mm)");
						xf.format("%s%s%.3f%s%.3f%s%.3f","\nX-Direction",",",myarray[i][4]/myarray[i][6]*1000,",",Math.max(myarray[i][3]*2+myarray[i][1]/30,20),",",0.05*myarray[i][1]);
						xf.format("%s%s%.3f%s%.3f%s%.3f","\nY-Direction",",",myarray[i][5]/myarray[i][6]*1000,",",Math.max(myarray[i][3]*2+myarray[i][2]/30,20),",",0.05*myarray[i][2]);
						eccx=myarray[i][4]/myarray[i][6]*1000;
						eccy=myarray[i][5]/myarray[i][6]*1000;
						eccminx=Math.max(myarray[i][3]*2+myarray[i][1]/30,20);
						eccminy=Math.max(myarray[i][3]*2+myarray[i][2]/30,20);
						condx=0.05*myarray[i][1];
						condy=0.05*myarray[i][2];
						if(eccx<=condx&&eccy<=condy&&eccminx<=condx&&eccminy<=condy){
							xf.format("%s","\nCOLUMN IS DESIGNED AS AXIALLY LOADED COLUMN");
							dt0++;
							puz=0.4*concrete*0.001*(myarray[i][1]*myarray[i][2]-p/100*myarray[i][1]*myarray[i][2])+myarray[i][1]*myarray[i][2]*p*0.67*steel*0.01*0.001;
							if(puz>myarray[i][6])
							{
							xf.format("%s%.3f%s%s%.3f%s","\nSince Puz=",puz,">","Pu=",myarray[i][6]," so Design is SAFE");
							
							int n=0,squareno=1;
							double areaprovide=0;
							double arearequired=p*0.01*myarray[i][1]*myarray[i][2];
							
							double c=arearequired/(3.14/4*diam*diam);
							for(q=1;q<10;q++)
							{
								if(4*(q-1)>c)
									break;
							}
							
							maxno=Math.max(q,maxno);
							xf.format("%s%.0f%s%d","\nRequired no of",diam,"mm rod(in each sides)=",q);
							areaprovide=4*(q-1)*3.14/4*diam*diam;
						xf.format("%s%.3f%s%.3f","\nArea Provided=",areaprovide,">",arearequired);
							}
							else
							{
								xf.format("%s","\nDesign is unsafe please increase percent of steel");
								xf.format("%s%.3f%s%s%.3f%s","\nSince Puz=",puz,"<","Pu=",myarray[i][6]," so Design is NOT SAFE");
								safekinai++;
							}
						}
						else if((eccx>condx||eccminx>condx)&&(eccy<=condy&&eccminy<=condy))
						{
							dt1++;
							xf.format("%s","\nCOLUMN IS DESIGNED AS AXIALLY LOADED COLUMN SUBJECTED TO UNIAXIAL BENDING IN X-DIRECTION ");
							xf.format("%s%.3f","\nd'/D=",cc/myarray[i][1]);
							xf.format("%s%.3f","\nPu/fckbd=",1000*myarray[i][6]/(concrete*myarray[i][1]*myarray[i][2]));
							xf.format("%s%.3f","\nP/fck=",p/(concrete));
							
							if(myarray[i][7]!=0)
							{
								
								xf.format("%s","\nFrom SP-16 Chart No ?????????????");
								xf.format("%s%.3f","\nMux/(fck*b*d*d)=",myarray[i][7]);
								double muxl=concrete*myarray[i][7]*myarray[i][2]*myarray[i][1]*myarray[i][1]/1000000;
								if(myarray[i][4]<muxl)
								{
									xf.format("%s%.3f%s%.3f","\nColumn is Safe since Mux=",myarray[i][4],"KNm < Muxl=",muxl,"KNm");
									xf.format("%s%.3f","\nRequired Area of Steel=",p*0.001*myarray[i][1]*myarray[i][2]);
									
									int n=0,squareno=1;
									double areaprovide=0;
									double arearequired=p*0.001*myarray[i][1]*myarray[i][2];
									
									double c=arearequired/(3.14/4*diam*diam);
									for(q=1;q<10;q++)
									{
										if(4*(q-1)>c)
											break;
									}
									
									maxno=Math.max(q,maxno);
									xf.format("%s%.0f%s%d","\nRequired no of",diam,"mm rod(in each sides)=",q);
									areaprovide=4*(q-1)*3.14/4*diam*diam;
								xf.format("%s%.3f%s%.3f","\nArea Provided=",areaprovide,">",arearequired);
								}
								else
								{
									xf.format("%s%.3f%s%.3f","\nColumn is NOT Safe since Mux=",myarray[i][4],"KNm > Muxl=",muxl,"KNm");
									
									safekinai++;
								}
								

							}
								
						}
						if((eccy>condy||eccminy>condy)&&(eccx<=condx&&eccminx<=condx)){
							dt2++;
							xf.format("%s","\nCOLUMN IS DESIGNED AS AXIALLY LOADED COLUMN SUBJECTED TO UNIAXIAL BENDING IN Y-DIRECTION ");
							xf.format("%s","\nFrom SP-16 Chart No 48");
							xf.format("%s%.3f","\nd'/b=",cc/myarray[i][2]);
							xf.format("%s%.3f","\nPu/fckbd=",1000*myarray[i][6]/(concrete*myarray[i][1]*myarray[i][2]));
							xf.format("%s%.3f","\nP/fck=",p/(concrete));
							xf.format("%s%.3f","\nMuy/(fck*b*d*d)=",myarray[i][8]);
							double muxl=concrete*myarray[i][8]*myarray[i][2]*myarray[i][1]*myarray[i][1]/1000000;
							if(myarray[i][5]<muxl)
							{
								xf.format("%s%.3f%s%.3f","\nColumn is Safe since Muy=",myarray[i][5],"KNm < Muyl=",muxl,"KNm");
								xf.format("%s%.3f","\nRequired Area of Steel=",p*0.001*myarray[i][1]*myarray[i][2]);
								
								int n=0,squareno=1;
								double areaprovide=0;
								double arearequired=p*0.001*myarray[i][1]*myarray[i][2];
								
								double c=arearequired/(3.14/4*diam*diam);
								for(q=1;q<10;q++)
								{
									if(4*(q-1)>c)
										break;
								}
								
								maxno=Math.max(q,maxno);
								xf.format("%s%.0f%s%d","\nRequired no of",diam,"mm rod(in each sides)=",q);
								areaprovide=4*(q-1)*3.14/4*diam*diam;
							xf.format("%s%.3f%s%.3f","\nArea Provided=",areaprovide,">",arearequired);
							}
							else
							{
								xf.format("%s%.3f%s%.3f","\nColumn is Safe since Muy=",myarray[i][5],"KNm > Muyl=",muxl,"KNm");
								
								safekinai++;
							}
						}
						if(eccx>condx||eccminx>condx)
							if(eccy>condy||eccminy>condy)
								{
								
								j++;
								dt3++;
								
							xf.format("%s","\nCOLUMN IS DESIGNED AS AXIALLY LOADED COLUMN SUBJECTED TO BIAXIAL BENDING");
							xf.format("%s%.3f","\nd'/D=",cc/myarray[i][1]);
							xf.format("%s%.3f","\nd'/b=",cc/myarray[i][2]);
							
							xf.format("%s%.3f","\nPu/fckbd=",1000*myarray[i][6]/(concrete*myarray[i][1]*myarray[i][2]));
							xf.format("%s%.3f","\nP/fck=",p/(concrete));
							
							if(myarray[i][7]==0&&myarray[i][8]==0)
							{	
							String amcs=String.format("%d",j);
							TVresult.setText("NO of Biaxially bending Columns are:"+amcs+" plz enter value of Mu/(fck*b*d*d) in 8th and 9th column of their data");
							xf.format("%s","\nUsing Conservative Approach, enter value of Mu/(fck*b*d*d) in 8th and 9th column using sp16");
							}
							else
							{
								
								xf.format("%s","\nFrom SP-16 Chart No ?????????????");
								xf.format("%s%.3f","\nMux/(fck*b*d*d)=",myarray[i][7]);
								xf.format("%s%.3f","\nMuy/(fck*d*b*b)=",myarray[i][8]);
								xf.format("%s%.3f%s","\nPuz=",puz,"KN");
								double muxl=concrete*myarray[i][7]*myarray[i][2]*myarray[i][1]*myarray[i][1]/1000000;
								double muyl=concrete*myarray[i][8]*myarray[i][1]*myarray[i][2]*myarray[i][2]/1000000;
								double alphan=0.667+myarray[i][6]/puz*1.667;
								if(alphan<1)
									alphan=1;
								if(alphan>2)
									alphan=2;
								double checker=Math.pow(myarray[i][4]/muxl,alphan)+Math.pow(myarray[i][5]/muyl,alphan);
								xf.format("%s%.3f%s%.3f%s","\nMuxl=fck*b*d*d*",myarray[i][7],"=",muxl,"KNm");
								xf.format("%s%.3f%s%.3f%s","\nMuyl=fck*d*b*b*",myarray[i][8],"=",muyl,"KNm");
								xf.format("%s%.3f","\nalphan=0.667+Pu/Puz*1.667=",alphan);
								xf.format("%s%.3f","\nChecking CONDITION <<<<<<<>>>>>>>>>>><<<<>>>>>=",checker);
								if(checker<1){
									xf.format("%s","\nDesign is Safe");
								xf.format("%s%.3f","\nRequired Area of Steel=",p*0.001*myarray[i][1]*myarray[i][2]);
								
								int n=0,squareno=1;
								double areaprovide=0;
								double arearequired=p*0.001*myarray[i][1]*myarray[i][2];
								
								double c=arearequired/(3.14/4*diam*diam);
								for(q=1;q<10;q++)
								{
									if(4*(q-1)>c)
										break;
								}
								
								maxno=Math.max(q,maxno);
								xf.format("%s%.0f%s%d","\nRequired no of",diam,"mm rod(in each sides)=",q);
								areaprovide=4*(q-1)*3.14/4*diam*diam;
							xf.format("%s%.3f%s%.3f","\nArea Provided=",areaprovide,">",arearequired);
							 
							
							
								}
								else
								{
									xf.format("%s","\nDesign is unsafe please increase percent of steel");
									
									safekinai++;
								}
								
								
							}
								
							
					}
					
					
					
					
					}
					if(safekinai==0)
					{
						
						String amcs=String.format("%d",maxno);
						TVsafe.setText("SAFE!!! No of Bars Required="+amcs);
						xf.format("%s","\n\n Check For Spacing ");
						double maxshort=10000;
						double maxlong=10000;
						double temp=maxno;
						
						int t;
						for(t=0;t<no;t++)
						{
							if(myarray[t][1]>maxlong)
								maxlong=myarray[t][1];
							if(myarray[t][2]>maxshort)
								maxshort=myarray[t][2];
						}
						double spacex=(850-2*cc)/(temp-1);
						double spacey=(850-2*cc)/(temp-1);
						double space=Math.max(spacex,spacey);
						
						amcs=String.format("%.3f",space);
						TVsafe.setText("SAFE!!! Minimum Spacing="+amcs);
						
						
						
								
						
						if(space<300)
						{
						xf.format("%s%.3f%s","\n Maximum Spacing=",space,"mm < 300mm OK");
						xf.format("%s","\n \n Design of Lateral Ties:");
						xf.format("%s%.3f%s%.3f%s","\n1)diameter of tie= Maximum of (6mm,0.25*diam of longitudinal bar)=Maximum of (6mm,",0.25*diam,"mm)=",Math.max(6,0.25*diam),"mm");
						xf.format("%s%.3f%s%.3f%s%.3f%s","\n2)Spacing between Ties=Minimum of(16*diam,shorter side of column,300mm)\n=Minimum of(",16*diam,"mm ,",850.0,"mm ,300mm)\n=",Math.min(Math.min(16*diam,850.0),300.0),"mm");
						if(space>=75)
						{
							xf.format("%s%.3f%s%.3f%s","\nSInce spacing=",space,"mm >75 mm. Additional Confining Ties are required\nProvide diameter of Confining Tie=",Math.max(0.25*diam,6),"mm \narragement as shown in figure\n<<<>>>>>\n<<<>>>>>\n<<<>>>>>\n<<>>");
						}
						else
						{
							xf.format("%s","\nSince spacing<75mm Confining Ties are not required");
						}
						}
						
						
					}
					else
					{
						String amcs=String.format("%d",safekinai);
						TVsafe.setText("UNSAFE .................No of Columns failed="+amcs);
					}
					String dt0s=String.format("%d",dt0);
					String dt1s=String.format("%d",dt1+dt2);
					
					String dt3s=String.format("%d",dt3);
					TVdesigntype.setText("Axial column="+dt0s+" Unixially Bending Columns="+dt1s+" Biaxially bending columns="+dt3s);	
					
				
			
			
					xf.close();
				}
		catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
}
			
		}});
		btnStartRecording.setBounds(178, 297, 133, 23);
		frmDesignOfColumn.getContentPane().add(btnStartRecording);
		
		TVresult = new JLabel("..");
		TVresult.setFont(new Font("Tahoma", Font.BOLD, 10));
		TVresult.setBounds(10, 331, 585, 14);
		frmDesignOfColumn.getContentPane().add(TVresult);
		
		JLabel lblEnterClearCover = new JLabel("Enter Clear Cover d'(mm)=");
		lblEnterClearCover.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterClearCover.setBounds(107, 271, 198, 14);
		frmDesignOfColumn.getContentPane().add(lblEnterClearCover);
		
		TFcc = new JTextField();
		TFcc.setText("60");
		TFcc.setColumns(10);
		TFcc.setBounds(315, 269, 86, 20);
		frmDesignOfColumn.getContentPane().add(TFcc);
		
		JLabel lblEnterPercentOf = new JLabel("Enter trial percent of steel:");
		lblEnterPercentOf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterPercentOf.setBounds(66, 189, 198, 14);
		frmDesignOfColumn.getContentPane().add(lblEnterPercentOf);
		
		TFpercent = new JTextField();
		TFpercent.setText("2.75");
		TFpercent.setColumns(10);
		TFpercent.setBounds(274, 187, 86, 20);
		frmDesignOfColumn.getContentPane().add(TFpercent);
		
		TVsafe = new JLabel("RESULT");
		TVsafe.setForeground(Color.BLUE);
		TVsafe.setFont(new Font("Tahoma", Font.BOLD, 23));
		TVsafe.setBounds(10, 356, 585, 53);
		frmDesignOfColumn.getContentPane().add(TVsafe);
		
		JLabel lblEnterDiameterOf = new JLabel("Enter Diameter of Bars for 4-Faced Arrangement:");
		lblEnterDiameterOf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterDiameterOf.setBounds(26, 220, 322, 14);
		frmDesignOfColumn.getContentPane().add(lblEnterDiameterOf);
		
		TFdiam = new JTextField();
		TFdiam.setText("25");
		TFdiam.setColumns(10);
		TFdiam.setBounds(382, 218, 86, 20);
		frmDesignOfColumn.getContentPane().add(TFdiam);
		
		TVdesigntype = new JLabel("....");
		TVdesigntype.setForeground(Color.BLUE);
		TVdesigntype.setFont(new Font("Tahoma", Font.BOLD, 12));
		TVdesigntype.setBounds(10, 425, 585, 53);
	
		frmDesignOfColumn.getContentPane().add(TVdesigntype);
	}
}

