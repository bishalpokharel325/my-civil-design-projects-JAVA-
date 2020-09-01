package steelcompressionmember;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class SteelCompressionMember {

	private JFrame frmDesignOfCompression;
	private JTextField TFcolumn;
	private JTextField TFlength;
	private JTextField TFbreadth;
	private JTextField el;
	private JTextField eb;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField TFgrade;
	private JTextField TFimport;
	private JLabel TVresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SteelCompressionMember window = new SteelCompressionMember();
					window.frmDesignOfCompression.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SteelCompressionMember() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDesignOfCompression = new JFrame();
		frmDesignOfCompression.getContentPane().setBackground(new Color(51, 51, 51));
		frmDesignOfCompression.getContentPane().setLayout(null);
		
		JLabel lblThisSoftwareChecks = new JLabel("This Software Designs and analyse steel compression member");
		lblThisSoftwareChecks.setForeground(new Color(0, 102, 204));
		lblThisSoftwareChecks.setFont(new Font("Microsoft Sans Serif", Font.BOLD | Font.ITALIC, 13));
		lblThisSoftwareChecks.setBounds(79, 23, 550, 32);
		frmDesignOfCompression.getContentPane().add(lblThisSoftwareChecks);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 65, 714, 526);
		frmDesignOfCompression.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("ANGLED SECTION", null, panel, null);
		tabbedPane.setBackgroundAt(0, new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("Lacing Design", null, panel_1, null);
		
		JPanel dssfjsldkjf = new JPanel();
		dssfjsldkjf.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("Column Base", null, dssfjsldkjf, null);
		dssfjsldkjf.setLayout(null);
		
		JLabel label = new JLabel("Please Input Following:");
		label.setForeground(new Color(0, 204, 204));
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		label.setBounds(208, 11, 156, 29);
		dssfjsldkjf.add(label);
		
		JLabel lblEnterColumnBase = new JLabel("Enter Column Base:");
		lblEnterColumnBase.setForeground(new Color(0, 204, 204));
		lblEnterColumnBase.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterColumnBase.setBounds(21, 60, 131, 29);
		dssfjsldkjf.add(lblEnterColumnBase);
		
		TFcolumn = new JTextField();
		TFcolumn.setBounds(146, 65, 86, 20);
		dssfjsldkjf.add(TFcolumn);
		TFcolumn.setColumns(10);
		
		JLabel lblEnterDimensionOf = new JLabel("Enter Dimension of Concrete Column:");
		lblEnterDimensionOf.setForeground(new Color(0, 204, 204));
		lblEnterDimensionOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterDimensionOf.setBounds(21, 100, 230, 29);
		dssfjsldkjf.add(lblEnterDimensionOf);
		
		JLabel lblLength = new JLabel("Length:");
		lblLength.setForeground(new Color(0, 204, 204));
		lblLength.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLength.setBounds(208, 127, 63, 29);
		dssfjsldkjf.add(lblLength);
		
		JLabel lblBreadth = new JLabel("Breadth:");
		lblBreadth.setForeground(new Color(0, 204, 204));
		lblBreadth.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBreadth.setBounds(208, 167, 63, 29);
		dssfjsldkjf.add(lblBreadth);
		
		TFlength = new JTextField();
		TFlength.setText("360");
		TFlength.setBounds(272, 132, 86, 20);
		dssfjsldkjf.add(TFlength);
		TFlength.setColumns(10);
		
		TFbreadth = new JTextField();
		TFbreadth.setText("310");
		TFbreadth.setColumns(10);
		TFbreadth.setBounds(272, 172, 86, 20);
		dssfjsldkjf.add(TFbreadth);
		
		JLabel lblEnterEccentricityIn = new JLabel("Enter Eccentricity in length direction:");
		lblEnterEccentricityIn.setForeground(new Color(0, 204, 204));
		lblEnterEccentricityIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterEccentricityIn.setBounds(21, 207, 230, 29);
		dssfjsldkjf.add(lblEnterEccentricityIn);
		
		JLabel lblEnterEccentricityIn_1 = new JLabel("Enter Eccentricity in breadth direction:");
		lblEnterEccentricityIn_1.setForeground(new Color(0, 204, 204));
		lblEnterEccentricityIn_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterEccentricityIn_1.setBounds(21, 247, 250, 29);
		dssfjsldkjf.add(lblEnterEccentricityIn_1);
		
		el = new JTextField();
		el.setText("0");
		el.setBounds(261, 212, 86, 20);
		dssfjsldkjf.add(el);
		el.setColumns(10);
		
		eb = new JTextField();
		eb.setText("0");
		eb.setColumns(10);
		eb.setBounds(261, 252, 86, 20);
		dssfjsldkjf.add(eb);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(new Color(0, 204, 204));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(378, 89, 230, 29);
		dssfjsldkjf.add(label_1);
		
		JLabel label_2 = new JLabel("Enter grade of Concrete(fck):");
		label_2.setForeground(new Color(0, 153, 204));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(21, 283, 183, 26);
		dssfjsldkjf.add(label_2);
		
		JRadioButton radioButton = new JRadioButton("20");
		buttonGroup.add(radioButton);
		radioButton.setSelected(true);
		radioButton.setBounds(21, 316, 109, 23);
		dssfjsldkjf.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("25");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(134, 316, 109, 23);
		dssfjsldkjf.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("35");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(134, 342, 109, 23);
		dssfjsldkjf.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("30");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(21, 342, 109, 23);
		dssfjsldkjf.add(radioButton_3);
		
		JLabel lblEnterGradeOf = new JLabel("Enter grade of steel(fy):");
		lblEnterGradeOf.setForeground(new Color(0, 204, 204));
		lblEnterGradeOf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterGradeOf.setBounds(272, 310, 158, 29);
		dssfjsldkjf.add(lblEnterGradeOf);
		
		TFgrade = new JTextField();
		TFgrade.setText("250");
		TFgrade.setColumns(10);
		TFgrade.setBounds(424, 315, 86, 20);
		dssfjsldkjf.add(TFgrade);
		
		JLabel lblImportFlangedSectioncsv = new JLabel("Import Flanged Section(.csv):");
		lblImportFlangedSectioncsv.setForeground(new Color(0, 204, 204));
		lblImportFlangedSectioncsv.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblImportFlangedSectioncsv.setBounds(272, 60, 191, 29);
		dssfjsldkjf.add(lblImportFlangedSectioncsv);
		
		TFimport = new JTextField();
		TFimport.setBounds(457, 65, 191, 20);
		dssfjsldkjf.add(TFimport);
		TFimport.setColumns(10);
		
		JButton btnCalculateThickness = new JButton("Calculate Thickness");
		btnCalculateThickness.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					double length=Double.parseDouble(TFlength.getText());
					double breadth=Double.parseDouble(TFbreadth.getText());
					double grade=Double.parseDouble(TFgrade.getText());
					double eel=Double.parseDouble(el.getText());
					double eeb=Double.parseDouble(eb.getText());
					String a = null;
					
					Enumeration<AbstractButton> bg=buttonGroup.getElements();
					while(bg.hasMoreElements()){
						JRadioButton jrd=(JRadioButton) bg.nextElement();
						
						if(jrd.isSelected())
						a=jrd.getText();
						
							
					}
					double concrete=Double.parseDouble(a);
					
					
					
					
					
					
					
				}catch(Exception e1000){
					JOptionPane.showMessageDialog(null,"please enter valid no.");
				}
			}
		});
		btnCalculateThickness.setBounds(258, 400, 172, 23);
		dssfjsldkjf.add(btnCalculateThickness);
		
		TVresult = new JLabel("..");
		TVresult.setForeground(new Color(204, 204, 0));
		TVresult.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		TVresult.setBounds(21, 452, 199, 20);
		dssfjsldkjf.add(TVresult);
		frmDesignOfCompression.setTitle("Design of Compression Steel");
		frmDesignOfCompression.setBounds(100, 100, 750, 641);
		frmDesignOfCompression.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
