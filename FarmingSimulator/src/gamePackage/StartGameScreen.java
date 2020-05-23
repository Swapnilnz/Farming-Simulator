package gamePackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartGameScreen {

	private JFrame frmFarmSimulatorStart;
	private JTextField nameTextField;
	private JSpinner spinnerGameLength;
	private JSpinner farmersAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGameScreen window = new StartGameScreen();
					window.frmFarmSimulatorStart.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartGameScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFarmSimulatorStart = new JFrame();
		frmFarmSimulatorStart.setTitle("Farm Simulator Start Menu");
		frmFarmSimulatorStart.setBounds(100, 100, 450, 300);
		frmFarmSimulatorStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFarmSimulatorStart.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Farmer Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 115, 34);
		frmFarmSimulatorStart.getContentPane().add(lblNewLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(141, 11, 183, 34);
		frmFarmSimulatorStart.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblSelectFarmType = new JLabel("Select Farm Type:");
		lblSelectFarmType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelectFarmType.setBounds(10, 56, 134, 34);
		frmFarmSimulatorStart.getContentPane().add(lblSelectFarmType);
		
		/*
		 * Set Game length between 5-15 days. Default is 5 days!
		 */
		
		JSpinner spinnerGameLength = new JSpinner();
		spinnerGameLength.setModel(new SpinnerNumberModel(18, 18, 40, 1));
		spinnerGameLength.setBounds(338, 103, 65, 34);
		frmFarmSimulatorStart.getContentPane().add(spinnerGameLength);
		
		JLabel lblNewLabel_1 = new JLabel("How long would you like your farming adventure to last?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 101, 327, 39);
		frmFarmSimulatorStart.getContentPane().add(lblNewLabel_1);
		
		/*
		 * Set Farmers age and message requesting to set.
		 */
		JSpinner farmersAge = new JSpinner();
		farmersAge.setModel(new SpinnerNumberModel(5, 5, 15, 1));
		farmersAge.setBounds(169, 151, 65, 34);
		frmFarmSimulatorStart.getContentPane().add(farmersAge);
		
		JLabel lblWhatIsYour = new JLabel("What is your farmers age?");
		lblWhatIsYour.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWhatIsYour.setBounds(10, 151, 162, 39);
		frmFarmSimulatorStart.getContentPane().add(lblWhatIsYour);
		
		JButton btnNewButton = new JButton("Start Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(169, 215, 89, 23);
		frmFarmSimulatorStart.getContentPane().add(btnNewButton);
	}
}
