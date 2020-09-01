package sstb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SstbDtype {

	private JFrame frmSstbDtype;
	private JTextField TFspan;
	private JTextField TFheight;
	private JTextField TFhanddiam;
	private JTextField TFhandno;
	private JTextField TFwwdiam;
	private JTextField TFwwno;
	private JTextField TFwwwidth;
	private JTextField TFtension;
	private JLabel TVtension;
	private JLabel TVgi;
	private JLabel TVsag;
	private JLabel TVdiff;
	private JLabel TVfs;
	private JLabel TVdesign;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SstbDtype window = new SstbDtype();
					window.frmSstbDtype.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SstbDtype() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSstbDtype = new JFrame();
		frmSstbDtype.getContentPane().setForeground(Color.GREEN);
		frmSstbDtype.setTitle("SSTB D-Type");
		frmSstbDtype.setBounds(100, 100, 476, 677);
		frmSstbDtype.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSstbDtype.getContentPane().setLayout(null);
		
		JLabel lblIterationForChecking = new JLabel("ITERATION FOR CHECKING  ");
		lblIterationForChecking.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblIterationForChecking.setBounds(125, 11, 207, 30);
		frmSstbDtype.getContentPane().add(lblIterationForChecking);
		
		JLabel lblInputs = new JLabel("INPUTS:");
		lblInputs.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		lblInputs.setBounds(10, 44, 91, 30);
		frmSstbDtype.getContentPane().add(lblInputs);
		
		JLabel lblEnterSpanLengthm = new JLabel("ENTER SPAN LENGTH(m):");
		lblEnterSpanLengthm.setBounds(10, 88, 212, 14);
		frmSstbDtype.getContentPane().add(lblEnterSpanLengthm);
		
		TFspan = new JTextField();
		TFspan.setText("84");
		TFspan.setBounds(273, 85, 86, 20);
		frmSstbDtype.getContentPane().add(TFspan);
		TFspan.setColumns(10);
		
		JLabel lblEnterElevationDifference = new JLabel("ENTER ELEVATION DIFFERENCE BETWEEN SHADDLES(m):");
		lblEnterElevationDifference.setBounds(10, 113, 322, 14);
		frmSstbDtype.getContentPane().add(lblEnterElevationDifference);
		
		TFheight = new JTextField();
		TFheight.setText("1.4");
		TFheight.setBounds(364, 110, 86, 20);
		frmSstbDtype.getContentPane().add(TFheight);
		TFheight.setColumns(10);
		
		JLabel lblEnterHandrailsDetails = new JLabel("ENTER HANDRAILS DETAILS:");
		lblEnterHandrailsDetails.setBounds(10, 138, 183, 14);
		frmSstbDtype.getContentPane().add(lblEnterHandrailsDetails);
		
		JLabel lblDiameterm = new JLabel("diameter(mm):");
		lblDiameterm.setBounds(125, 163, 85, 14);
		frmSstbDtype.getContentPane().add(lblDiameterm);
		
		JLabel lblNumber = new JLabel("Number:");
		lblNumber.setBounds(125, 188, 68, 14);
		frmSstbDtype.getContentPane().add(lblNumber);
		
		TFhanddiam = new JTextField();
		TFhanddiam.setText("22");
		TFhanddiam.setBounds(220, 160, 86, 20);
		frmSstbDtype.getContentPane().add(TFhanddiam);
		TFhanddiam.setColumns(10);
		
		TFhandno = new JTextField();
		TFhandno.setText("2");
		TFhandno.setBounds(203, 185, 86, 20);
		frmSstbDtype.getContentPane().add(TFhandno);
		TFhandno.setColumns(10);
		
		JLabel lblEnterWalkWay = new JLabel("ENTER WALK WAY DETAILS:");
		lblEnterWalkWay.setBounds(10, 208, 183, 14);
		frmSstbDtype.getContentPane().add(lblEnterWalkWay);
		
		JLabel lblDiameterm_1 = new JLabel("diameter(mm):");
		lblDiameterm_1.setBounds(125, 233, 97, 14);
		frmSstbDtype.getContentPane().add(lblDiameterm_1);
		
		TFwwdiam = new JTextField();
		TFwwdiam.setText("32");
		TFwwdiam.setBounds(246, 230, 86, 20);
		frmSstbDtype.getContentPane().add(TFwwdiam);
		TFwwdiam.setColumns(10);
		
		JLabel label = new JLabel("Number:");
		label.setBounds(125, 261, 68, 14);
		frmSstbDtype.getContentPane().add(label);
		
		TFwwno = new JTextField();
		TFwwno.setText("2");
		TFwwno.setColumns(10);
		TFwwno.setBounds(246, 261, 86, 20);
		frmSstbDtype.getContentPane().add(TFwwno);
		
		JLabel lblWalkwayWidthm = new JLabel("walkway width(cm):");
		lblWalkwayWidthm.setBounds(125, 295, 121, 14);
		frmSstbDtype.getContentPane().add(lblWalkwayWidthm);
		
		TFwwwidth = new JTextField();
		TFwwwidth.setText("70");
		TFwwwidth.setBounds(256, 292, 86, 20);
		frmSstbDtype.getContentPane().add(TFwwwidth);
		TFwwwidth.setColumns(10);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double span=Double.parseDouble(TFspan.getText());
					double height=Double.parseDouble(TFheight.getText());
					double handdiam=Double.parseDouble(TFhanddiam.getText());
					double handno=Double.parseDouble(TFhandno.getText());
					double wwdiam=Double.parseDouble(TFwwdiam.getText());
					double wwno=Double.parseDouble(TFwwno.getText());
					double wwwidth=Double.parseDouble(TFwwwidth.getText());
					double tension=Double.parseDouble(TFtension.getText());
					double bd=0,gd=0,Ld=0,gi=0,b=0,gdh=0,gdw=0,gf=0,Ah=0,Aw=0,A=0,EA=0,bi=0,T=0,hf=0,tanb=0,FS=0;
					if(handdiam==22)
					{
						gdh=2.51*handno/100;
						Ah=handno*292;
						
					}
					if(handdiam==32)
					{
						gdh=3.8*handno/100;
						Ah=handno*442;
					}
					if(wwdiam==22)
					{
						gdw=2.51*wwno/100;
						Aw=wwno*292;
						
					}
					if(wwdiam==32)
					{
						gdw=3.8*wwno/100;
						Aw=wwno*442;
					}
					gd=gdw+gdh+0.4;
					gf=gd+(3+50/span)*wwwidth/100;
					A=Ah+Aw;
					EA=110*A;
					if(span<=80)
					{
						bd=span/20;
					}
					if(span>80)
					{
						bd=span/22;
					}
					bi=1.22*bd;
					do{
						b=bi;
						Ld=span*(1+8/3*(bd/span)*(bd/span)+1/2*(height/span)*(height/span));
						gi=64*EA*bi*(bi*bi-bd*bd)/(3*span*span*span*Ld)+bi/bd*gd;
						bi=bd+(bi-bd)*((gf-gd)/(gi-gd));
					}while(Math.abs(gf-gi)>0.001);
					hf=gf*span*span/(8*b);
					tanb=(4*b-height)/span;
					T=hf*Math.sqrt(1+tanb*tanb);
					FS=tension/T;
					
					String sags=String.format("%.3f",b);
					TVsag.setText(sags+"m");
					String diffs=String.format("%.5f",Math.abs(gf-gi));
					TVdiff.setText(diffs+"m");
					String dis=String.format("%.3f",gi);
					TVgi.setText(dis+"m");
					String tensions=String.format("%.3f",T);
					TVtension.setText(tensions+"KN");
					String fss=String.format("%.3f",FS);
					TVfs.setText(fss+"");
					
					if(FS<3)
						TVdesign.setText("not correct.");
					else
						TVdesign.setText("correct.");
						
					
					
					
					
					
					
					
					
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid data");
				}
			}
		});
		btnResult.setBounds(122, 371, 142, 43);
		frmSstbDtype.getContentPane().add(btnResult);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Serif", Font.BOLD, 14));
		lblResult.setBounds(10, 417, 52, 20);
		frmSstbDtype.getContentPane().add(lblResult);
		
		JLabel lblRequiredTheoriticalSagm = new JLabel("Required Theoritical SAG(m):");
		lblRequiredTheoriticalSagm.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblRequiredTheoriticalSagm.setBounds(10, 448, 199, 20);
		frmSstbDtype.getContentPane().add(lblRequiredTheoriticalSagm);
		
		JLabel wsdfdf = new JLabel("Final Value of gi(m):");
		wsdfdf.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		wsdfdf.setBounds(10, 479, 142, 20);
		frmSstbDtype.getContentPane().add(wsdfdf);
		
		JLabel lblGfgi = new JLabel("gf-gi:");
		lblGfgi.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblGfgi.setBounds(10, 510, 40, 20);
		frmSstbDtype.getContentPane().add(lblGfgi);
		
		JLabel lblTensionProducedIn = new JLabel("Tension produced in cable(KN);");
		lblTensionProducedIn.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblTensionProducedIn.setBounds(10, 541, 217, 20);
		frmSstbDtype.getContentPane().add(lblTensionProducedIn);
		
		JLabel lblEnterBreakingLoad = new JLabel("ENTER BREAKING LOAD FOR CABLE:");
		lblEnterBreakingLoad.setBounds(10, 322, 236, 14);
		frmSstbDtype.getContentPane().add(lblEnterBreakingLoad);
		
		TFtension = new JTextField();
		TFtension.setText("1942");
		TFtension.setBounds(273, 319, 86, 20);
		frmSstbDtype.getContentPane().add(TFtension);
		TFtension.setColumns(10);
		
		TVsag = new JLabel("0.00");
		TVsag.setFont(new Font("Verdana", Font.ITALIC, 12));
		TVsag.setBounds(219, 452, 68, 14);
		frmSstbDtype.getContentPane().add(TVsag);
		
		TVgi = new JLabel("0.00");
		TVgi.setFont(new Font("Verdana", Font.ITALIC, 12));
		TVgi.setBounds(177, 485, 68, 14);
		frmSstbDtype.getContentPane().add(TVgi);
		
		TVdiff = new JLabel("0.00");
		TVdiff.setFont(new Font("Verdana", Font.ITALIC, 12));
		TVdiff.setBounds(60, 514, 68, 14);
		frmSstbDtype.getContentPane().add(TVdiff);
		
		TVtension = new JLabel("0.00");
		TVtension.setFont(new Font("Verdana", Font.ITALIC, 12));
		TVtension.setBounds(252, 545, 107, 14);
		frmSstbDtype.getContentPane().add(TVtension);
		
		JLabel lblFs = new JLabel("FS=");
		lblFs.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblFs.setBounds(10, 572, 34, 20);
		frmSstbDtype.getContentPane().add(lblFs);
		
		TVfs = new JLabel("0.00");
		TVfs.setFont(new Font("Verdana", Font.ITALIC, 12));
		TVfs.setBounds(103, 578, 68, 14);
		frmSstbDtype.getContentPane().add(TVfs);
		
		JLabel lblDesignIs = new JLabel("Design is:");
		lblDesignIs.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		lblDesignIs.setBounds(10, 607, 91, 20);
		frmSstbDtype.getContentPane().add(lblDesignIs);
		
		TVdesign = new JLabel("final design result");
		TVdesign.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TVdesign.setForeground(Color.GREEN);
		TVdesign.setBackground(Color.GREEN);
		TVdesign.setBounds(103, 603, 143, 22);
		frmSstbDtype.getContentPane().add(TVdesign);
	}
}
