package unitcalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Unitcalculator {

	private JFrame frmUnitCalculator;
	private JTextField TFwatt;
	private JTextField TFno;
	private JTextField TFhour;
	private JTextField TFminute;
	private JTextField TFfirstunit;
	private JTextField TFfirstprice;
	private JTextField TFrate;
	private JLabel TVdaily;
	private JLabel TVmonthly;
	private JLabel TVmonthlyrs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Unitcalculator window = new Unitcalculator();
					window.frmUnitCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Unitcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnitCalculator = new JFrame();
		frmUnitCalculator.setTitle("Unit Calculator");
		frmUnitCalculator.setBounds(100, 100, 450, 515);
		frmUnitCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnitCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("device kati watt ko? ");
		lblNewLabel.setBounds(10, 32, 145, 14);
		frmUnitCalculator.getContentPane().add(lblNewLabel);
		
		TFwatt = new JTextField();
		TFwatt.setText("0");
		TFwatt.setBounds(185, 29, 86, 20);
		frmUnitCalculator.getContentPane().add(TFwatt);
		TFwatt.setColumns(10);
		
		JLabel lblGharMaKati = new JLabel("ghar ma kati wota cha?");
		lblGharMaKati.setBounds(10, 74, 145, 14);
		frmUnitCalculator.getContentPane().add(lblGharMaKati);
		
		TFno = new JTextField();
		TFno.setText("0");
		TFno.setBounds(222, 71, 86, 20);
		frmUnitCalculator.getContentPane().add(TFno);
		TFno.setColumns(10);
		
		JLabel lblTyoDeviceDin = new JLabel("tyo device din ma kati ghanta chalaunu huncha?");
		lblTyoDeviceDin.setBounds(10, 110, 285, 14);
		frmUnitCalculator.getContentPane().add(lblTyoDeviceDin);
		
		TFhour = new JTextField();
		TFhour.setBounds(10, 135, 98, 20);
		frmUnitCalculator.getContentPane().add(TFhour);
		TFhour.setColumns(10);
		
		JLabel lblGhanta = new JLabel("ghanta");
		lblGhanta.setBounds(118, 141, 57, 14);
		frmUnitCalculator.getContentPane().add(lblGhanta);
		
		TFminute = new JTextField();
		TFminute.setBounds(185, 138, 86, 20);
		frmUnitCalculator.getContentPane().add(TFminute);
		TFminute.setColumns(10);
		
		JLabel lblMinute = new JLabel("minute");
		lblMinute.setBounds(301, 141, 46, 14);
		frmUnitCalculator.getContentPane().add(lblMinute);
		
		JButton btnNatija = new JButton("NATIJA");
		btnNatija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double watt=Double.parseDouble(TFwatt.getText());
					double no=Double.parseDouble(TFno.getText());
					double hour=Double.parseDouble(TFhour.getText());
					double minute=Double.parseDouble(TFminute.getText());
					double first=Double.parseDouble(TFfirstunit.getText());
					double firstcharge=Double.parseDouble(TFfirstprice.getText());
					double rate=Double.parseDouble(TFrate.getText());
					double dinko,mahinako,mahinakocharge;
					dinko=watt*no*(hour+minute/60)/1000;
					mahinako=dinko*30;
					mahinakocharge=firstcharge+(mahinako-first)*rate;
					String dinkos=String.format("%.1f",dinko);
					String mahinakos=String.format("%.1f",mahinako);
					String mahinakocharges=String.format("%.1f",mahinakocharge);
					TVdaily.setText(dinkos+" units");
					TVmonthly.setText(mahinakos+" units");
					TVmonthlyrs.setText("RS. "+mahinakocharges);
					

					
					
					
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"please enter valid data");
				}
			}
		});
		btnNatija.setBounds(10, 273, 145, 37);
		frmUnitCalculator.getContentPane().add(btnNatija);
		
		JLabel lblDinKoUtheko = new JLabel("DIN KO UTHEKO UNIT:");
		lblDinKoUtheko.setBounds(10, 340, 139, 14);
		frmUnitCalculator.getContentPane().add(lblDinKoUtheko);
		
		TVdaily = new JLabel("0.0");
		TVdaily.setBounds(159, 340, 112, 14);
		frmUnitCalculator.getContentPane().add(TVdaily);
		
		JLabel lblEkMahinamaUthene = new JLabel("EK MAHINAMA UTHENE UNIT:");
		lblEkMahinamaUthene.setBounds(10, 365, 186, 14);
		frmUnitCalculator.getContentPane().add(lblEkMahinamaUthene);
		
		TVmonthly = new JLabel("0.0");
		TVmonthly.setBounds(206, 365, 112, 14);
		frmUnitCalculator.getContentPane().add(TVmonthly);
		
		JLabel lblMahinaMaUthne = new JLabel("mahina ma uthne paisa:");
		lblMahinaMaUthne.setBounds(10, 390, 165, 14);
		frmUnitCalculator.getContentPane().add(lblMahinaMaUthne);
		
		
		
		JLabel lblMahasul = new JLabel("MAHASUL?");
		lblMahasul.setBounds(10, 166, 86, 14);
		frmUnitCalculator.getContentPane().add(lblMahasul);
		
		JLabel lblPahilo = new JLabel("PAHILO ");
		lblPahilo.setBounds(10, 191, 46, 14);
		frmUnitCalculator.getContentPane().add(lblPahilo);
		
		TFfirstunit = new JTextField();
		TFfirstunit.setText("20");
		TFfirstunit.setBounds(55, 191, 46, 20);
		frmUnitCalculator.getContentPane().add(TFfirstunit);
		TFfirstunit.setColumns(10);
		
		JLabel lblUnitKo = new JLabel("UNIT KO");
		lblUnitKo.setBounds(118, 191, 46, 14);
		frmUnitCalculator.getContentPane().add(lblUnitKo);
		
		TFfirstprice = new JTextField();
		TFfirstprice.setText("80");
		TFfirstprice.setBounds(185, 188, 86, 20);
		frmUnitCalculator.getContentPane().add(TFfirstprice);
		TFfirstprice.setColumns(10);
		
		JLabel lblTyespachiKoPrati = new JLabel("TYESPACHI KO PRATI UNIT?");
		lblTyespachiKoPrati.setBounds(10, 216, 165, 14);
		frmUnitCalculator.getContentPane().add(lblTyespachiKoPrati);
		
		TFrate = new JTextField();
		TFrate.setText("0");
		TFrate.setBounds(208, 219, 86, 20);
		frmUnitCalculator.getContentPane().add(TFrate);
		TFrate.setColumns(10);
		
		TVmonthlyrs = new JLabel("0.0");
		TVmonthlyrs.setBounds(216, 390, 102, 14);
		frmUnitCalculator.getContentPane().add(TVmonthlyrs);
	}
}
