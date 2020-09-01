package slabloadcalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SlabLoadCalculator {

	private JFrame frmSlabLoadCalculator;
	private JTextField TFlocation;
	private JTextField TFslabdepth;
	private JTextField TFdensity;
	private JTextField TFexport;
	private JLabel TVresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SlabLoadCalculator window = new SlabLoadCalculator();
					window.frmSlabLoadCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SlabLoadCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSlabLoadCalculator = new JFrame();
		frmSlabLoadCalculator.setTitle("Slab Load Calculator");
		frmSlabLoadCalculator.setBounds(100, 100, 594, 468);
		frmSlabLoadCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSlabLoadCalculator.getContentPane().setLayout(null);
		
		TFlocation = new JTextField();
		TFlocation.setBounds(10, 58, 329, 20);
		frmSlabLoadCalculator.getContentPane().add(TFlocation);
		TFlocation.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnBrowse.setBounds(361, 57, 89, 23);
		frmSlabLoadCalculator.getContentPane().add(btnBrowse);
		
		JLabel lblImportcsvFile = new JLabel("Import .csv file with dimensions");
		lblImportcsvFile.setBounds(10, 33, 185, 14);
		frmSlabLoadCalculator.getContentPane().add(lblImportcsvFile);
		
		JLabel lblEnterDepthOf = new JLabel("Enter Depth of Slab(mm):");
		lblEnterDepthOf.setBounds(10, 89, 128, 14);
		frmSlabLoadCalculator.getContentPane().add(lblEnterDepthOf);
		
		TFslabdepth = new JTextField();
		TFslabdepth.setText("150");
		TFslabdepth.setBounds(148, 89, 86, 20);
		frmSlabLoadCalculator.getContentPane().add(TFslabdepth);
		TFslabdepth.setColumns(10);
		
		JLabel lblEnterDensitykncubicMeter = new JLabel("enter Density(KN/cubic meter):");
		lblEnterDensitykncubicMeter.setBounds(10, 114, 149, 14);
		frmSlabLoadCalculator.getContentPane().add(lblEnterDensitykncubicMeter);
		
		TFdensity = new JTextField();
		TFdensity.setText("25");
		TFdensity.setBounds(158, 111, 86, 20);
		frmSlabLoadCalculator.getContentPane().add(TFdensity);
		TFdensity.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate and Export");
		btnCalculate.setBounds(148, 182, 191, 23);
		frmSlabLoadCalculator.getContentPane().add(btnCalculate);
		
		TFexport = new JTextField();
		TFexport.setBounds(10, 140, 297, 20);
		frmSlabLoadCalculator.getContentPane().add(TFexport);
		TFexport.setColumns(10);
		
		JButton btnExportResult = new JButton("Export Result");
		btnExportResult.setBounds(317, 139, 115, 23);
		frmSlabLoadCalculator.getContentPane().add(btnExportResult);
		
	TVresult = new JLabel("..");
		TVresult.setBounds(10, 234, 46, 14);
		frmSlabLoadCalculator.getContentPane().add(TVresult);
	}
}
