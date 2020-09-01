package irrigationpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Diversionheadworks extends JFrame {

	private JPanel contentPane;
	private JTextField TFdischarge;
	private JTextField TFhfl;
	private JTextField TFrbl;
	private JTextField TFpl;
	private JTextField TFhcs;
	private JTextField TFplds;
	private JTextField TFbr;
	private JTextField TFlacey;
	private JTextField TFgra;
	private JTextField TFafflux;
	protected static String discharges;
	protected static String headlosss;
	protected static String anotherhls;
	protected static String qs;
	protected static String spenergyhfls;
	protected static String spenergypls;
	protected static  String jlhfls ;
	protected static String jlpls;
	protected static String hflusplens;
	protected static String plusplens;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diversionheadworks frame = new Diversionheadworks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Diversionheadworks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 715);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDiversionHeadworkDesign = new JLabel("Diversion Headwork Design:");
		lblDiversionHeadworkDesign.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDiversionHeadworkDesign.setBounds(10, 11, 186, 30);
		contentPane.add(lblDiversionHeadworkDesign);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 52, 743, 551);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("pressure point analysis", null, panel, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Design of Sloping Glacis", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblEnterFollowingData = new JLabel("Enter Following Data:");
		lblEnterFollowingData.setForeground(Color.BLUE);
		lblEnterFollowingData.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEnterFollowingData.setBounds(10, 11, 128, 21);
		panel_3.add(lblEnterFollowingData);
		
		JLabel lblEnterMaximumDischarge = new JLabel("Enter maximum discharge intensity on weir crest(cumecs/ m leng):");
		lblEnterMaximumDischarge.setBounds(10, 36, 360, 14);
		panel_3.add(lblEnterMaximumDischarge);
		
		TFdischarge = new JTextField();
		TFdischarge.setText("10");
		TFdischarge.setBounds(380, 33, 86, 20);
		panel_3.add(TFdischarge);
		TFdischarge.setColumns(10);
		
		JLabel lblEnterHflBefore = new JLabel("Enter HFL before weir construction(in m):");
		lblEnterHflBefore.setBounds(10, 61, 237, 14);
		panel_3.add(lblEnterHflBefore);
		
		TFhfl = new JTextField();
		TFhfl.setText("255");
		TFhfl.setBounds(260, 61, 86, 20);
		panel_3.add(TFhfl);
		TFhfl.setColumns(10);
		
		JLabel lblEnterRlOf = new JLabel("Enter RL of river bed(in m):");
		lblEnterRlOf.setBounds(10, 86, 189, 14);
		panel_3.add(lblEnterRlOf);
		
		TFrbl = new JTextField();
		TFrbl.setText("249.5");
		TFrbl.setBounds(260, 83, 86, 20);
		panel_3.add(TFrbl);
		TFrbl.setColumns(10);
		
		JLabel lblPondLevelinM = new JLabel("pond Level(in m):");
		lblPondLevelinM.setBounds(10, 111, 128, 14);
		panel_3.add(lblPondLevelinM);
		
		TFpl = new JTextField();
		TFpl.setText("254");
		TFpl.setBounds(161, 108, 86, 20);
		panel_3.add(TFpl);
		TFpl.setColumns(10);
		
		JLabel lblHeightOfCrest = new JLabel("Height of crest Shutter(in m):");
		lblHeightOfCrest.setBounds(10, 136, 175, 14);
		panel_3.add(lblHeightOfCrest);
		
		TFhcs = new JTextField();
		TFhcs.setText("1");
		TFhcs.setBounds(203, 133, 86, 20);
		panel_3.add(TFhcs);
		TFhcs.setColumns(10);
		
		JLabel lblEnterAnticipatedDs = new JLabel("Enter anticipated  d/s details: ");
		lblEnterAnticipatedDs.setForeground(Color.BLUE);
		lblEnterAnticipatedDs.setBounds(10, 161, 175, 14);
		panel_3.add(lblEnterAnticipatedDs);
		
		JLabel lblPondLevelUsm = new JLabel("pond level u/s(m):");
		lblPondLevelUsm.setBounds(10, 186, 128, 14);
		panel_3.add(lblPondLevelUsm);
		
		TFplds = new JTextField();
		TFplds.setText("251.5");
		TFplds.setBounds(191, 183, 86, 20);
		panel_3.add(TFplds);
		TFplds.setColumns(10);
		
		JLabel lblBedRetrogationm = new JLabel("Bed Retrogation(m):");
		lblBedRetrogationm.setBounds(10, 211, 128, 14);
		panel_3.add(lblBedRetrogationm);
		
		TFbr = new JTextField();
		TFbr.setText("0.5");
		TFbr.setBounds(191, 208, 86, 20);
		panel_3.add(TFbr);
		TFbr.setColumns(10);
		
		JLabel lblLaceysSiltFactorm = new JLabel("Lacey's Silt Factor(m):");
		lblLaceysSiltFactorm.setBounds(10, 236, 128, 14);
		panel_3.add(lblLaceysSiltFactorm);
		
		TFlacey = new JTextField();
		TFlacey.setText("0.9");
		TFlacey.setBounds(191, 233, 86, 20);
		panel_3.add(TFlacey);
		TFlacey.setColumns(10);
		
		JLabel lblPermissibleExitGradient = new JLabel("permissible exit gradient:");
		lblPermissibleExitGradient.setBounds(10, 261, 150, 14);
		panel_3.add(lblPermissibleExitGradient);
		
		JLabel label = new JLabel("1:");
		label.setBounds(137, 261, 23, 14);
		panel_3.add(label);
		
		TFgra = new JTextField();
		TFgra.setText("7");
		TFgra.setBounds(203, 258, 86, 20);
		panel_3.add(TFgra);
		TFgra.setColumns(10);
		
		JLabel lblPermissibleAffluxm = new JLabel("Permissible Afflux(m):");
		lblPermissibleAffluxm.setBounds(10, 286, 150, 14);
		panel_3.add(lblPermissibleAffluxm);
		
		TFafflux = new JTextField();
		TFafflux.setText("1");
		TFafflux.setBounds(203, 283, 86, 20);
		panel_3.add(TFafflux);
		TFafflux.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate ");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Glacisresult c=new Glacisresult();
					double discharge=Double.parseDouble(TFdischarge.getText());
					double hfl=Double.parseDouble(TFhfl.getText());
					double rbl=Double.parseDouble(TFrbl.getText());
					double pl=Double.parseDouble(TFpl.getText());
					double hcs=Double.parseDouble(TFhcs.getText());
					double plds=Double.parseDouble(TFplds.getText());
					double br=Double.parseDouble(TFbr.getText());
					double lacey=Double.parseDouble(TFlacey.getText());
					double gra=Double.parseDouble(TFgra.getText());
					double afflux=Double.parseDouble(TFafflux.getText());
					double jlhfl,crestlevel,hflusplen,plusplen,jlpl,anotherhl,spenergyhfl,spenergypl,hflar,q,headloss,dsar,k,affluxx,levelds,uselevation,ushfl,scourdepth,regimevel,velocityhead;
					crestlevel=pl-hcs;
					k=Math.pow((discharge/1.7),0.667);
					uselevation=k+crestlevel;
					scourdepth=1.35*Math.pow(discharge*discharge/lacey,0.333);
					regimevel=discharge/scourdepth;
					velocityhead=(regimevel*regimevel)/19.6;
					ushfl=uselevation-velocityhead;
					levelds=hfl+velocityhead;
					affluxx=ushfl-levelds;
					hflar=hfl-br;
					dsar=levelds-br;
					headloss=uselevation-dsar;
					q=1.7*Math.pow(hcs,1.5);
					anotherhl=pl-plds;
					spenergyhfl=discharge/headloss*discharge/headloss/19.6+headloss;
					spenergypl=q/anotherhl*q/anotherhl/19.6+anotherhl;
					jlhfl=dsar-spenergyhfl;
					jlpl=plds-spenergypl;
					hflusplen=headloss+spenergyhfl;
					plusplen=anotherhl+spenergypl;
					 discharges=String.format("%.3f",q);
					 headlosss=String.format("%.3f",headloss);
					 jlhfls=String.format("%.3f",jlhfl);
					 spenergyhfls=String.format("%.3f",spenergyhfl);
					 hflusplens=String.format("%.3f",hflusplen);
					 qs=String.format("%.3f",q);
					 anotherhls=String.format("%.3f",anotherhl);
					 jlpls=String.format("%.3f",jlpl);
					 spenergypls=String.format("%.3f",spenergypl);
					 plusplens=String.format("%.3f",plusplen);
					 Glacisresult.TVhfldischarge.setText(discharges+"cumec/s per m");
					 Glacisresult.TVhflhl.setText(headlosss+"m");
					 Glacisresult.TVhfljl.setText(jlhfls+"m");
					 Glacisresult.TVhflse.setText(spenergyhfls+"m");
					 Glacisresult.TVhflusse.setText(hflusplens+"m");
					 Glacisresult.TVpldischarge.setText(qs+"cumec/s per m");
					 Glacisresult.TVplhl.setText(anotherhls+"m");
					 Glacisresult.TVpljl.setText(jlpls+"m");
					 Glacisresult.TVplse.setText(spenergypls+"m");
					 Glacisresult.TVplusse.setText(plusplens+"m");
					 
					c.setVisible(true);
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnCalculate.setForeground(Color.RED);
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalculate.setBounds(224, 333, 122, 38);
		panel_3.add(btnCalculate);
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Undersluice Design", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Silt Excluder Design", null, panel_2, null);
	}
}
