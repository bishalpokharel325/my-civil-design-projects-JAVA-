package slabpreliminary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Slabpreliminary {

	private JFrame frmPreliminaryDesignOf;
	private JTextField TFspan;
	private JTextField TFdl;
	private JTextField TFdiam;
	private JTextField TFcc;
	private JTextField TFconcrete;
	private JTextField TFsteel;
	private JTextField TFmf;
	private JTextField textField;
	private JTextField TFd;
	private JLabel TVresult;
	private JLabel TVcheck;
	private JLabel lblEnterLiveLoad;
	private JTextField TFll;
	private JLabel lblOverallDepth;
	private JLabel TVD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Slabpreliminary window = new Slabpreliminary();
					window.frmPreliminaryDesignOf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Slabpreliminary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPreliminaryDesignOf = new JFrame();
		frmPreliminaryDesignOf.setTitle("Preliminary Design of Slab");
		frmPreliminaryDesignOf.setBounds(100, 100, 450, 536);
		frmPreliminaryDesignOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPreliminaryDesignOf.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER span of slab:");
		lblNewLabel.setBounds(10, 33, 117, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblNewLabel);
		
		TFspan = new JTextField();
		TFspan.setText("4267");
		TFspan.setBounds(137, 30, 86, 20);
		frmPreliminaryDesignOf.getContentPane().add(TFspan);
		TFspan.setColumns(10);
		
		JLabel lblEnterDeadLoad = new JLabel("Enter Dead Load intensity other than self load(KN/sq.m):");
		lblEnterDeadLoad.setBounds(10, 58, 301, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblEnterDeadLoad);
		
		TFdl = new JTextField();
		TFdl.setText("3.5");
		TFdl.setBounds(321, 55, 86, 20);
		frmPreliminaryDesignOf.getContentPane().add(TFdl);
		TFdl.setColumns(10);
		
		JLabel lblEnterPreliminaryDiam = new JLabel("Enter preliminary diam of rebar(mm):");
		lblEnterPreliminaryDiam.setBounds(10, 83, 213, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblEnterPreliminaryDiam);
		
		TFdiam = new JTextField();
		TFdiam.setText("16");
		TFdiam.setColumns(10);
		TFdiam.setBounds(236, 83, 86, 20);
		frmPreliminaryDesignOf.getContentPane().add(TFdiam);
		
		JLabel lblEnterPreliminaryClear = new JLabel("Enter preliminary clear cover(mm):");
		lblEnterPreliminaryClear.setBounds(10, 108, 213, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblEnterPreliminaryClear);
		
		TFcc = new JTextField();
		TFcc.setText("20");
		TFcc.setColumns(10);
		TFcc.setBounds(236, 108, 86, 20);
		frmPreliminaryDesignOf.getContentPane().add(TFcc);
		
		JLabel lblConcreteGrade = new JLabel("Concrete Grade:");
		lblConcreteGrade.setBounds(10, 133, 86, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblConcreteGrade);
		
		JLabel lblSteelGrade = new JLabel("Steel Grade:");
		lblSteelGrade.setBounds(10, 161, 68, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblSteelGrade);
		
		TFconcrete = new JTextField();
		TFconcrete.setText("25");
		TFconcrete.setColumns(10);
		TFconcrete.setBounds(100, 133, 86, 20);
		frmPreliminaryDesignOf.getContentPane().add(TFconcrete);
		
		TFsteel = new JTextField();
		TFsteel.setText("500");
		TFsteel.setColumns(10);
		TFsteel.setBounds(91, 158, 86, 20);
		frmPreliminaryDesignOf.getContentPane().add(TFsteel);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double span=Double.parseDouble(TFspan.getText());
					double concrete=Double.parseDouble(TFconcrete.getText());
					double steel=Double.parseDouble(TFsteel.getText());
					double cc=Double.parseDouble(TFcc.getText());
					double diam=Double.parseDouble(TFdiam.getText());
					double d=Double.parseDouble(TFd.getText());
					double mf=Double.parseDouble(TFmf.getText());
					double ll=Double.parseDouble(TFll.getText());
					double dl=Double.parseDouble(TFdl.getText());
					double D=d+cc+diam/2;
					double dlbm=1.5*(D/1000*25+dl)*span*span/1000000;
					double llbm=1.5*ll*span*span/1000000;
					double dlbmsupport=dlbm/12;
					double llbmsupport=llbm/9;
					double bmsupport=dlbmsupport+llbmsupport;
					 double dlbmmid=dlbm/16;
					double llbmmid=llbm/12;
					double bmmid=dlbmmid+llbmmid;
					double mu=Math.max(bmmid,bmsupport);
					double x=200;
					double m=0;
					double a1=100;
					double b1=1000;
					double temp,ast,dst;
					do
					{
						temp=x;
						
						x=x-(0.36*concrete*x*d*1000-0.1498*concrete*1000*x*x-mu*1000000)/(0.36*concrete*1000*d-0.3*concrete*x);
					}while(Math.abs(temp-x)>0.000001);
					ast=x*0.36*concrete*1000/(0.87*steel);
					dst=4*ast/(diam*diam*3.14);
					int i = 0;
					while(i<dst)
					{
					i++;
					}
					double fs=0.58*steel*ast/(3.14/4*i*diam*diam);
					double percent=3.14/4*i*diam*diam/(1000*D)*100;
					String fss=String.format("%.3f",fs);
					String percents=String.format("%.3f",percent);
					TVresult.setText("fs="+fss+"N/mm sq"+" and %of steel="+percents+" Goto fig 4 for modification factor");
					String Ds=String.format("%.3f",D);
					TVD.setText(D+"mm");
							
							
							
							
							
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnCalculate.setBounds(94, 266, 89, 23);
		frmPreliminaryDesignOf.getContentPane().add(btnCalculate);
		
		TVresult = new JLabel("Click on Calculate for result");
		TVresult.setBounds(10, 323, 417, 14);
		frmPreliminaryDesignOf.getContentPane().add(TVresult);
		
		JLabel lblModificationFactor = new JLabel("Modification Factor:");
		lblModificationFactor.setBounds(7, 348, 104, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblModificationFactor);
		
		TFmf = new JTextField();
		TFmf.setText("1.5");
		TFmf.setColumns(10);
		TFmf.setBounds(121, 345, 86, 20);
		frmPreliminaryDesignOf.getContentPane().add(TFmf);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double mf=Double.parseDouble(TFmf.getText());
				double span=Double.parseDouble(TFspan.getText());
				double d=Double.parseDouble(TFd.getText());
				double limd=span/(mf*26);
				String percents=String.format("%.3f",limd);
				if(d<limd)
				TVcheck.setText(percents+"Please revise the design");
				else
					TVcheck.setText(percents+"Design is OK");
				
			}
		});
		btnCheck.setBounds(121, 376, 89, 23);
		frmPreliminaryDesignOf.getContentPane().add(btnCheck);
		
		TVcheck = new JLabel("Click on check for result");
		TVcheck.setBounds(7, 410, 267, 14);
		frmPreliminaryDesignOf.getContentPane().add(TVcheck);
		
		JLabel label = new JLabel("Steel Grade:");
		label.setBounds(10, 214, 68, -8);
		frmPreliminaryDesignOf.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setText("500");
		textField.setColumns(10);
		textField.setBounds(91, 211, 86, -5);
		frmPreliminaryDesignOf.getContentPane().add(textField);
		
		JLabel lblEffectiveDepth = new JLabel("effective depth:");
		lblEffectiveDepth.setBounds(10, 189, 101, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblEffectiveDepth);
		
		TFd = new JTextField();
		TFd.setText("200");
		TFd.setColumns(10);
		TFd.setBounds(124, 186, 86, 20);
		frmPreliminaryDesignOf.getContentPane().add(TFd);
		
		lblEnterLiveLoad = new JLabel("Enter LIve load:");
		lblEnterLiveLoad.setBounds(10, 217, 86, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblEnterLiveLoad);
		
		TFll = new JTextField();
		TFll.setText("5");
		TFll.setColumns(10);
		TFll.setBounds(124, 214, 86, 20);
		frmPreliminaryDesignOf.getContentPane().add(TFll);
		
		lblOverallDepth = new JLabel("Overall Depth:");
		lblOverallDepth.setBounds(10, 298, 86, 14);
		frmPreliminaryDesignOf.getContentPane().add(lblOverallDepth);
		
		TVD = new JLabel("0.0mm");
		TVD.setBounds(104, 300, 119, 14);
		frmPreliminaryDesignOf.getContentPane().add(TVD);
	}
}
