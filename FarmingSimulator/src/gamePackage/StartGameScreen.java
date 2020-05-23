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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class StartGameScreen {

	private JFrame window;
	private JTextField nameTextField;
	private JSpinner spinnerGameLength;
	private JSpinner farmersAge;
	private JComboBox<String> theFarmType;
	private GameEnvironment game;
	private JTextField farmTextField;

	/**
	 * Close the window
	 */
	public void closeWindow() {
		window.dispose();
	}
	
	/**
	 * Finished with the window --> close screen
	 */
	public void finishedWindow() {
		game.closeSetupScreen(this);
	}

	/**
	 * Create the application.
	 */
	public StartGameScreen(GameEnvironment incomingGame) {
		game = incomingGame;
		initialize();
		window.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setTitle("Farm Simulator Start Menu");
		window.setBounds(100, 100, 450, 360);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Farmer Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 115, 34);
		window.getContentPane().add(lblNewLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(141, 11, 183, 34);
		window.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblSelectFarmType = new JLabel("Select Farm Type:");
		lblSelectFarmType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelectFarmType.setBounds(10, 56, 134, 34);
		window.getContentPane().add(lblSelectFarmType);
		
		/*
		 * Farm type selection from combo box 
		 */
		JComboBox<String> theFarmType = new JComboBox<String>();
		theFarmType.setFont(new Font("Tahoma", Font.BOLD, 11));
		theFarmType.setModel(new DefaultComboBoxModel<String>(new String[] {"Swamp Farm", "Desert Farm", "Plains Farm", "Mountain Farm"}));
		theFarmType.setBounds(169, 56, 128, 34);
		window.getContentPane().add(theFarmType);
		
		JLabel lblNewLabel_2 = new JLabel("(3 - 15 Characters)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 37, 115, 14);
		window.getContentPane().add(lblNewLabel_2);
		
		/**
		 * Farm name
		 */
		JLabel lblFarmName = new JLabel("Farm Name:");
		lblFarmName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFarmName.setBounds(10, 201, 115, 34);
		window.getContentPane().add(lblFarmName);
		
		JLabel label_1 = new JLabel("(3 - 15 Characters)");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 227, 115, 14);
		window.getContentPane().add(label_1);
		
		farmTextField = new JTextField();
		farmTextField.setColumns(10);
		farmTextField.setBounds(141, 201, 183, 34);
		window.getContentPane().add(farmTextField);
		
		/*
		 * Set Game length between 5-15 days. Default is 5 days!
		 */
		
		JSpinner spinnerGameLength = new JSpinner();
		spinnerGameLength.setModel(new SpinnerNumberModel(5, 5, 15, 1));
		spinnerGameLength.setBounds(338, 103, 65, 34);
		window.getContentPane().add(spinnerGameLength);
		
		JLabel lblNewLabel_1 = new JLabel("How long would you like your farming adventure to last?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 101, 327, 39);
		window.getContentPane().add(lblNewLabel_1);
		
		/*
		 * Set Farmers age and message requesting to set.
		 */
		JSpinner farmersAge = new JSpinner();
		farmersAge.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		farmersAge.setBounds(169, 153, 65, 34);
		window.getContentPane().add(farmersAge);
		
		JLabel lblWhatIsYour = new JLabel("What is your farmers age?");
		lblWhatIsYour.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWhatIsYour.setBounds(10, 151, 162, 39);
		window.getContentPane().add(lblWhatIsYour);
		/*
		 * Start game button checks if game variables are set then starts game! 
		 */
		JButton btnNewButton = new JButton("Start Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((game.farmerNameChecker(nameTextField.getText())) && (game.farmerNameChecker(farmTextField.getText()))) {
					switch((String)theFarmType.getSelectedItem()) {
						case "Swamp Farm":
							game.farm = new SwampFarm();
							break;
						case "Desert Farm":
							game.farm = new DesertFarm();
							break;
						case "Plains Farm":
							game.farm = new PlainsFarm();
							break;
						case "Mountain Farm":
							game.farm = new MountainFarm();
							break;
					}
					game.farm.setFarmName(farmTextField.getText());
					game.farm.setFarmName(farmTextField.getText());
					game.getFarmerStats(nameTextField.getText(), (Integer) farmersAge.getValue());
					game.setNumDays((Integer) spinnerGameLength.getValue());
					finishedWindow();

				} else {
					PopUp popup = new PopUp(game, window, "Sorry that is not a valid farmer or farm name!");
					popup.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(169, 287, 89, 23);
		window.getContentPane().add(btnNewButton);
		
		
	}

	public String getNameTextField() {
		return nameTextField.getText();
	}
	
	public String getSetFarmType() {
		return (String)theFarmType.getSelectedItem();
	}
}
