package datamanipulations;

import java.awt.EventQueue;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Datamanipulate {

	private JFrame frame;
	static String xstrPath;
	static double[][] myarray;
	private JTextField TFlocation;
	private JTextField TFvalue;
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
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datamanipulate window = new Datamanipulate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Datamanipulate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TFlocation = new JTextField();
		TFlocation.setBounds(10, 11, 365, 20);
		frame.getContentPane().add(TFlocation);
		TFlocation.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent arg0) {
				try{
					String location=TFlocation.getText();
					setupmycsvarray(location);
					String amcs=String.format("%.3f",myarray[2][3]);
					TFvalue.setText(amcs+"cm");
					Formatter xf;
					xf=new Formatter("C:\\Users\\Bishal\\Desktop\\chineses.csv");
					 for(int i=0;i<5;i++)
					 {
						 for(int j=0;j<2;j++){
					 xf.format("%f%s",myarray[i][j]*myarray[i][j],",");
						 }
						 xf.format("%s","\n");
					 }
					xf.close();
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnNewButton.setBounds(88, 79, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		TFvalue = new JTextField();
		TFvalue.setBounds(38, 180, 86, 20);
		frame.getContentPane().add(TFvalue);
		TFvalue.setColumns(10);
	}

}
