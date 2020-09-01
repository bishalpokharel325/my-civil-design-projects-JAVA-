package installed;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Installedcapacity {

	private JFrame frmInstalledCapacityCalculator;
	private JTextField TFlocation;
	private JTextField TFinterest;
	private JTextField TFsell;
	private JTextField TFcost;
	private JTextField TFom;
	private JTextField TFlife;
	private JTextField TFhead;
	private JTextField TFefficiency;
	private JLabel TVmessage;
	private JLabel TVpower;
	static double[][] myarray;
	static String xstrPath;
	private JLabel TVpercent;
	private JTextField TFpowerlocation;

	/**
	 * Launch the application.
	 */
	static void setupmycsvarray(String location)
	{
		myarray=new double[20][20];
		Scanner scanIn=null;
		int rowc=0;
		String InputLine="";
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
					Installedcapacity window = new Installedcapacity();
					window.frmInstalledCapacityCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 

	/**
	 * Create the application.
	 */
	public Installedcapacity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInstalledCapacityCalculator = new JFrame();
		frmInstalledCapacityCalculator.setTitle("INSTALLED CAPACITY CALCULATOR");
		frmInstalledCapacityCalculator.setBounds(100, 100, 773, 499);
		frmInstalledCapacityCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInstalledCapacityCalculator.getContentPane().setLayout(null);
		
		JLabel lblInstalledCapacityCalculator = new JLabel("INSTALLED CAPACITY CALCULATOR");
		lblInstalledCapacityCalculator.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInstalledCapacityCalculator.setBounds(220, 11, 293, 34);
		frmInstalledCapacityCalculator.getContentPane().add(lblInstalledCapacityCalculator);
		
		JLabel lblEnterTheDatabase = new JLabel("DataBase Location:");
		lblEnterTheDatabase.setBounds(10, 115, 148, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblEnterTheDatabase);
		
		TFlocation = new JTextField();
		TFlocation.setText("C:\\Users\\Bishal\\Desktop\\csv.csv");
		TFlocation.setBounds(118, 112, 199, 20);
		frmInstalledCapacityCalculator.getContentPane().add(TFlocation);
		TFlocation.setColumns(10);
		
		JLabel lblEnterInterestRate = new JLabel("interest Rate:");
		lblEnterInterestRate.setBounds(10, 155, 111, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblEnterInterestRate);
		
		TFinterest = new JTextField();
		TFinterest.setText("10");
		TFinterest.setBounds(168, 152, 96, 20);
		frmInstalledCapacityCalculator.getContentPane().add(TFinterest);
		TFinterest.setColumns(10);
		
		JLabel lblEnterSellingPrice = new JLabel("Selling Price For Energy(US dollar/Mwh):");
		lblEnterSellingPrice.setBounds(10, 183, 238, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblEnterSellingPrice);
		
		TFsell = new JTextField();
		TFsell.setText("30");
		TFsell.setBounds(269, 180, 106, 20);
		frmInstalledCapacityCalculator.getContentPane().add(TFsell);
		TFsell.setColumns(10);
		
		JLabel lblEnterInstallationCostvariable = new JLabel("Installation Cost/Variable Cost(Us dollar/KW):");
		lblEnterInstallationCostvariable.setBounds(10, 211, 256, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblEnterInstallationCostvariable);
		
		TFcost = new JTextField();
		TFcost.setText("600");
		TFcost.setBounds(307, 211, 86, 20);
		frmInstalledCapacityCalculator.getContentPane().add(TFcost);
		TFcost.setColumns(10);
		
		JLabel lblEnterOperationAnd = new JLabel("Operation and Maintenance Cost(%):");
		lblEnterOperationAnd.setBounds(10, 236, 210, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblEnterOperationAnd);
		
		TFom = new JTextField();
		TFom.setText("2");
		TFom.setBounds(250, 239, 49, 20);
		frmInstalledCapacityCalculator.getContentPane().add(TFom);
		TFom.setColumns(10);
		
		JLabel lblOfVariable = new JLabel("% of Variable Cost");
		lblOfVariable.setBounds(309, 242, 117, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblOfVariable);
		
		JLabel lblEconomicLifeOf = new JLabel("Economic Life Of Plant(Years):");
		lblEconomicLifeOf.setBounds(10, 261, 182, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblEconomicLifeOf);
		
		TFlife = new JTextField();
		TFlife.setText("40");
		TFlife.setBounds(220, 261, 86, 20);
		frmInstalledCapacityCalculator.getContentPane().add(TFlife);
		TFlife.setColumns(10);
		
		JLabel lblEnterHeadm = new JLabel("Enter Head(m):");
		lblEnterHeadm.setBounds(10, 46, 86, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblEnterHeadm);
		
		TFhead = new JTextField();
		TFhead.setText("100");
		TFhead.setBounds(106, 43, 86, 20);
		frmInstalledCapacityCalculator.getContentPane().add(TFhead);
		TFhead.setColumns(10);
		
		JLabel lblEnterOverallEfficiency = new JLabel("Enter Overall efficiency Of Plant(%):");
		lblEnterOverallEfficiency.setBounds(10, 71, 210, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblEnterOverallEfficiency);
		
		TFefficiency = new JTextField();
		TFefficiency.setText("85");
		TFefficiency.setBounds(242, 68, 86, 20);
		frmInstalledCapacityCalculator.getContentPane().add(TFefficiency);
		TFefficiency.setColumns(10);
		
		JLabel lblResult = new JLabel("RESULT:");
		lblResult.setBounds(13, 338, 83, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblResult);
		
		JLabel lblOfTime = new JLabel("% of time duration for Best Installed Capacity:");
		lblOfTime.setBounds(13, 363, 270, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblOfTime);
		
		TVpercent = new JLabel("0.0%");
		TVpercent.setBounds(309, 363, 84, 14);
		frmInstalledCapacityCalculator.getContentPane().add(TVpercent);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Double.parseDouble(TFhead.getText());
					Double.parseDouble(TFefficiency.getText());
					double sell=Double.parseDouble(TFsell.getText());
					double cost=Double.parseDouble(TFcost.getText());
					double om=Double.parseDouble(TFom.getText());
					double life=Double.parseDouble(TFlife.getText());
					double interest=Double.parseDouble(TFinterest.getText());
					interest=interest/100;
					double I=Math.pow(1+interest,life);
					double var=cost*((I*interest)/(I-1));
					double x=(var+om/100*cost)/(sell*0.0876);
					
					setupmycsvarray(TFpowerlocation.getText());
					double a=0,b=0,c=0,d=0;
					for(int i=0;i<12;i++)
					{
						if(myarray[i][0]<x&&myarray[i+1][0]>x)
						{
							a=myarray[i][1];
							b=myarray[i+1][1];
							c=myarray[i][0];
							d=myarray[i+1][0];
							
							
						}
					}
					String percents=String.format("%.3f",x);
					TVpercent.setText(percents+"%");
					double r=(x-c)/(d-c);
					String amcs=String.format("%.3f",a+r*(b-a));
					
					TVpower.setText(amcs+"MW");
					
					
					
					
				}catch(Exception e5){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			
			}
		});
		btnCalculate.setBounds(0, 304, 89, 23);
		frmInstalledCapacityCalculator.getContentPane().add(btnCalculate);
		
		JButton btnConvertIntoPower = new JButton("Convert Into Power vs %t ");
		btnConvertIntoPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				   String location=TFlocation.getText();
				   double head=Double.parseDouble(TFhead.getText());
				   double efficiency=Double.parseDouble(TFefficiency.getText());
				   efficiency=efficiency/100;
				   setupmycsvarray(location);
				   Formatter xf;
				   xf=new Formatter(TFpowerlocation.getText());
				   for(int i=0;i<12;i++)
					 {
						 for(int j=0;j<2;j++)
							 if(j==0){
					 xf.format("%.3f%s",myarray[i][0],",");
							 }
							 else
						 {
							 xf.format("%.3f%s",myarray[i][1]*head*efficiency*9.81/1000,","); 
						 }
						 
						 xf.format("%s","\n");
					 }
				   xf.close();
				   String.format("%.3f",myarray[1][1]);
				   TVmessage.setText("Done.... Go to"+TFpowerlocation.getText());
					 }
				
				   
					
				catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnConvertIntoPower.setBounds(548, 111, 199, 23);
		frmInstalledCapacityCalculator.getContentPane().add(btnConvertIntoPower);
		
	TVmessage = new JLabel("..");
	TVmessage.setForeground(Color.GREEN);
		TVmessage.setBounds(419, 145, 309, 14);
		frmInstalledCapacityCalculator.getContentPane().add(TVmessage);
		
		JLabel lblCorrespondinPowermw = new JLabel("Correspondin Power(MW)=");
		lblCorrespondinPowermw.setBounds(10, 388, 182, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblCorrespondinPowermw);
		
		TVpower = new JLabel("0.0MW");
		TVpower.setBounds(208, 388, 91, 14);
		frmInstalledCapacityCalculator.getContentPane().add(TVpower);
		
		TFpowerlocation = new JTextField();
		TFpowerlocation.setText("C:\\Users\\Bishal\\Desktop\\power.csv");
		TFpowerlocation.setBounds(345, 112, 182, 20);
		frmInstalledCapacityCalculator.getContentPane().add(TFpowerlocation);
		TFpowerlocation.setColumns(10);
		
		JLabel lblPowerDurationLocation = new JLabel("Power Duration Location:");
		lblPowerDurationLocation.setBounds(338, 87, 175, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblPowerDurationLocation);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBorder(new LineBorder(Color.RED, 5));
		panel.setBounds(455, 183, 292, 249);
		frmInstalledCapacityCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Please Follow Following Steps:");
		label.setBounds(56, 10, 179, 18);
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("SansSerif", Font.ITALIC, 13));
		panel.add(label);
		
		JLabel lblPleaseFollowFollowing = new JLabel("1)Enter Head and efficiency");
		lblPleaseFollowFollowing.setBounds(10, 39, 179, 18);
		lblPleaseFollowFollowing.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblPleaseFollowFollowing.setForeground(Color.GREEN);
		panel.add(lblPleaseFollowFollowing);
		
		JLabel lblMakeACopy = new JLabel("2)Make a copy of csv of(%t vs Q) ");
		lblMakeACopy.setForeground(Color.GREEN);
		lblMakeACopy.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblMakeACopy.setBounds(10, 68, 246, 18);
		panel.add(lblMakeACopy);
		
		JLabel lblEnterLocationOf = new JLabel("3)Enter Location of Csv as given");
		lblEnterLocationOf.setForeground(Color.GREEN);
		lblEnterLocationOf.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblEnterLocationOf.setBounds(10, 97, 179, 18);
		panel.add(lblEnterLocationOf);
		
		JLabel lblenterNameOf = new JLabel("4)Enter power duration curve with location(.csv)");
		lblenterNameOf.setForeground(Color.GREEN);
		lblenterNameOf.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblenterNameOf.setBounds(10, 126, 272, 18);
		panel.add(lblenterNameOf);
		
		JLabel lblpressConvertInto = new JLabel("5)press convert into power button");
		lblpressConvertInto.setForeground(Color.GREEN);
		lblpressConvertInto.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblpressConvertInto.setBounds(10, 155, 272, 18);
		panel.add(lblpressConvertInto);
		
		JLabel lblEnterNecessaryData = new JLabel("6)Enter Necessary Data and press\"calculate\"");
		lblEnterNecessaryData.setForeground(Color.GREEN);
		lblEnterNecessaryData.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblEnterNecessaryData.setBounds(10, 184, 272, 18);
		panel.add(lblEnterNecessaryData);
		
		JLabel lbldone = new JLabel("7)Done ;)");
		lbldone.setForeground(Color.GREEN);
		lbldone.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lbldone.setBounds(10, 213, 272, 18);
		panel.add(lbldone);
		
		JLabel lblBuiltByBishal = new JLabel("Built By: BISHAL POKHAREL");
		lblBuiltByBishal.setForeground(new Color(128, 0, 0));
		lblBuiltByBishal.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 14));
		lblBuiltByBishal.setBounds(10, 435, 210, 14);
		frmInstalledCapacityCalculator.getContentPane().add(lblBuiltByBishal);
	}
}
