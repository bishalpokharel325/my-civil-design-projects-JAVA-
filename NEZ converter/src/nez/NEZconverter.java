package nez;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NEZconverter {

	private JFrame frmNezConverter;
	
	private JTextField TFdestination;
	private JLabel TVstatus;
	static int rowc=0;
	
	static String xstrPath;
	static double[][] myarray;
	private JTextField TFlocation;
	static void setupmycsvarray(String location)
	{
		myarray=new double[2000][2000];
		Scanner scanIn=null;
		rowc=0;
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
		}
			
			
		catch(Exception e0){
			JOptionPane.showMessageDialog(null,e0);
		}
		}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NEZconverter window = new NEZconverter();
					window.frmNezConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NEZconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNezConverter = new JFrame();
		frmNezConverter.setTitle("NEZ converter");
		frmNezConverter.getContentPane().setBackground(new Color(0, 0, 102));
		frmNezConverter.setBounds(100, 100, 817, 472);
		frmNezConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNezConverter.getContentPane().setLayout(null);
		
		JLabel lblEnterLocationOf = new JLabel("Enter Location of CSV file with RAW survey Data:");
		lblEnterLocationOf.setForeground(new Color(0, 255, 204));
		lblEnterLocationOf.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		lblEnterLocationOf.setBounds(10, 11, 392, 20);
		frmNezConverter.getContentPane().add(lblEnterLocationOf);
		
		TFlocation = new JTextField();
		TFlocation.setFont(new Font("Microsoft Sans Serif", Font.ITALIC, 11));
		TFlocation.setText("C:\\Users\\Bishal\\Desktop\\csv.csv");
		TFlocation.setBounds(10, 42, 365, 20);
		frmNezConverter.getContentPane().add(TFlocation);
		TFlocation.setColumns(10);
		
		JLabel lblEnterLocationOf_1 = new JLabel("Enter Location of CSV file with NEZ Data(with filename as given in example):");
		lblEnterLocationOf_1.setForeground(new Color(51, 204, 255));
		lblEnterLocationOf_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		lblEnterLocationOf_1.setBounds(10, 73, 542, 20);
		frmNezConverter.getContentPane().add(lblEnterLocationOf_1);
		
		TFdestination = new JTextField();
		TFdestination.setText("C:\\Users\\Bishal\\Desktop\\NEZ.csv");
		TFdestination.setFont(new Font("Microsoft Sans Serif", Font.ITALIC, 11));
		TFdestination.setColumns(10);
		TFdestination.setBounds(10, 104, 365, 20);
		frmNezConverter.getContentPane().add(TFdestination);
		
		JLabel lblNote = new JLabel("NOTE:");
		lblNote.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNote.setForeground(Color.RED);
		lblNote.setBounds(395, 195, 69, 20);
		frmNezConverter.getContentPane().add(lblNote);
		
		JLabel lblIfYouDont = new JLabel("IF CSV FILE DOESNT EXIST PROGRAM WILL MAKE NEW ONE FOR YOU ;)");
		lblIfYouDont.setForeground(Color.ORANGE);
		lblIfYouDont.setBounds(393, 226, 439, 14);
		frmNezConverter.getContentPane().add(lblIfYouDont);
		
		JButton btnConvert = new JButton("CONVERT....");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String location=TFlocation.getText();
					String destination=TFdestination.getText();
					TVstatus.setText("DONE!!! Now Go to:"+destination+" .......Welcome :)");
					setupmycsvarray(location);
					
					double[] bearing = new double[500];
					double[] horizontalangle = new double[500];
					double[] addition = new double[500];
					double[] Latitude = new double[500];
					double[] departure = new double[500];
					double[] Northing = new double[500];
					double[] Easting = new double[500];
					double[] vertical = new double[500];
					double a=0,b=0;
					
					
							for(int i=0;i<rowc;i++){
								horizontalangle[i]=myarray[i][6]+myarray[i][7]/60+myarray[i][8]/3600;
								vertical[i]=myarray[i][5]+myarray[i][4]-myarray[i][11]+myarray[i][10]; 
								
								
									a=myarray[i][3]-myarray[i][1];
									b=myarray[i][2]-myarray[i][0];
									
									if(a>=0&&b>=0){
									bearing[i]=180/Math.PI*Math.atan((a)/(b));
									}
									else if(b<0&&a>=0){
										bearing[i]=180-Math.abs(180/Math.PI*Math.atan(a/b));
									}
									else if(b<0&&a<0){
										bearing[i]=180+Math.abs(180/Math.PI*Math.atan(a/b));
									}
									else
									{
										bearing[i]=360-Math.abs(180/Math.PI*Math.atan(a/b));
									}
									
								
								addition[i]=bearing[i]+horizontalangle[i];
								if(addition[i]>360)
								{
									addition[i]=addition[i]-360;
								}
								Latitude[i]=myarray[i][9]*Math.cos(addition[i]*Math.PI/180);
								departure[i]=myarray[i][9]*Math.sin(addition[i]*Math.PI/180);
								Northing[i]=myarray[i][0]+Latitude[i];
								Easting[i]=myarray[i][1]+departure[i];



								
								}				
					
					
					
					
					
					
					 Formatter xf;
					 xf=new Formatter(destination);

					 for(int i=0;i<rowc;i++)
					 {
						
					 xf.format("%.3f%s%.3f%s%.3f%s",Northing[i],",",Easting[i],",",vertical[i],"\n");
				
						
					 }
					 xf.close();
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnConvert.setBackground(Color.GREEN);
		btnConvert.setBounds(269, 315, 153, 41);
		frmNezConverter.getContentPane().add(btnConvert);
		
		JLabel lblStatus = new JLabel("STATUS:");
		lblStatus.setFont(new Font("Simplified Arabic Fixed", Font.ITALIC, 15));
		lblStatus.setBounds(76, 378, 69, 14);
		frmNezConverter.getContentPane().add(lblStatus);
		
		TVstatus = new JLabel("..................");
		TVstatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TVstatus.setForeground(Color.GREEN);
		TVstatus.setBounds(155, 378, 488, 14);
		frmNezConverter.getContentPane().add(TVstatus);
		
		JLabel lblMakeSureRaw = new JLabel("Make Sure raw csv file as well as NEZ files are closed");
		lblMakeSureRaw.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMakeSureRaw.setForeground(Color.ORANGE);
		lblMakeSureRaw.setBounds(385, 251, 439, 14);
		frmNezConverter.getContentPane().add(lblMakeSureRaw);
		
		JLabel lblMakeSureData = new JLabel("Make sure data starts from first row(NO description at first row)");
		lblMakeSureData.setForeground(Color.ORANGE);
		lblMakeSureData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMakeSureData.setBounds(385, 276, 447, 14);
		frmNezConverter.getContentPane().add(lblMakeSureData);
		
		JLabel lblMakeSureAbout = new JLabel("(Make Sure about Format)");
		lblMakeSureAbout.setForeground(Color.RED);
		lblMakeSureAbout.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMakeSureAbout.setBounds(362, 11, 226, 20);
		frmNezConverter.getContentPane().add(lblMakeSureAbout);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFlocation.setText(filename);
			}
		});
		btnBrowse.setBounds(386, 41, 89, 23);
		frmNezConverter.getContentPane().add(btnBrowse);
		
		JButton button = new JButton("Browse");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				TFdestination.setText(filename);
			}
		});
		button.setBounds(386, 104, 89, 23);
		frmNezConverter.getContentPane().add(button);
	}
}
