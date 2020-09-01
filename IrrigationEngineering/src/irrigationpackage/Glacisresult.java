package irrigationpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Glacisresult extends JFrame {

	static JLabel TVhfldischarge;
	static JLabel TVhflhl;
	static JLabel TVhfljl;
	static JLabel TVplusse;
	static JLabel TVpljl;
	static JLabel TVhfldi;
	static JLabel TVplse;
	static JLabel TVplhl;
	static JLabel TVpldischarge;
	static JLabel TVhflusse;
	static JLabel TVhflse;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Glacisresult frame = new Glacisresult();
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
	public Glacisresult() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResults = new JLabel("Results:");
		lblResults.setBounds(10, 11, 46, 14);
		contentPane.add(lblResults);
		
		JLabel lblHighFloodCondition = new JLabel("High Flood Condition");
		lblHighFloodCondition.setBounds(166, 47, 136, 14);
		contentPane.add(lblHighFloodCondition);
		
		JLabel lblPondLevelCondition = new JLabel("Pond Level Condition");
		lblPondLevelCondition.setBounds(342, 47, 170, 14);
		contentPane.add(lblPondLevelCondition);
		
		JLabel lblDischargeIntensity = new JLabel("Discharge intensity");
		lblDischargeIntensity.setBounds(37, 79, 110, 14);
		contentPane.add(lblDischargeIntensity);
		
		JLabel lblHeadLoss = new JLabel("Head Loss");
		lblHeadLoss.setBounds(37, 104, 75, 14);
		contentPane.add(lblHeadLoss);
		
		JLabel lblDsSpecificEnergy = new JLabel("D/S specific energy");
		lblDsSpecificEnergy.setBounds(37, 129, 97, 14);
		contentPane.add(lblDsSpecificEnergy);
		
		JLabel lblJumpLevel = new JLabel("jump level");
		lblJumpLevel.setBounds(37, 154, 97, 14);
		contentPane.add(lblJumpLevel);
		
		JLabel lblUsSpecEnergy = new JLabel("u/s spec. energy");
		lblUsSpecEnergy.setBounds(37, 179, 97, 14);
		contentPane.add(lblUsSpecEnergy);
		
		TVhfldischarge = new JLabel("0.0");
		TVhfldischarge.setBounds(166, 79, 136, 14);
		contentPane.add(TVhfldischarge);
		
		TVpldischarge = new JLabel("0.0");
		TVpldischarge.setBounds(342, 79, 153, 14);
		contentPane.add(TVpldischarge);
		
		TVhflhl = new JLabel("0.0");
		TVhflhl.setBounds(166, 104, 136, 14);
		contentPane.add(TVhflhl);
		
		TVplhl = new JLabel("0.0");
		TVplhl.setBounds(342, 104, 97, 14);
		contentPane.add(TVplhl);
		
		TVhflse = new JLabel("0.0");
		TVhflse.setBounds(166, 129, 104, 14);
		contentPane.add(TVhflse);
		
		TVplse = new JLabel("0.0");
		TVplse.setBounds(342, 129, 97, 14);
		contentPane.add(TVplse);
		
		TVhfljl = new JLabel("0.0");
		TVhfljl.setBounds(166, 154, 104, 14);
		contentPane.add(TVhfljl);
		
		TVpljl = new JLabel("0.0");
		TVpljl.setBounds(342, 154, 97, 14);
		contentPane.add(TVpljl);
		
		TVhflusse = new JLabel("0.0");
		TVhflusse.setBounds(166, 179, 104, 14);
		contentPane.add(TVhflusse);
		
		TVplusse = new JLabel("0.0");
		TVplusse.setBounds(342, 179, 97, 14);
		contentPane.add(TVplusse);
	}

}
