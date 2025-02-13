package gamePackage.GUI;

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
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import gamePackage.DesertFarm;
import gamePackage.Farm;
import gamePackage.GameEnvironment;
import gamePackage.MountainFarm;
import gamePackage.PlainsFarm;
import gamePackage.SwampFarm;

import java.awt.Color;

/**
 * Setup Screen class, gets inititial input from user
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class StartGameScreen {
	
	/**
	 * Main window
	 */
	private JFrame window;
	/**
	 * Text field where farmer name is entered
	 */
	private JTextField nameTextField;

	/**
	 * Main game
	 */
	private GameEnvironment game;
	/**
	 * Text field where farm name is entered
	 */
	private JTextField farmTextField;

	/**
	 * Close the window
	 */
	public void closeWindow() {
		window.dispose();
	}
	
	/**
	 * Finished with the window
	 */
	public void finishedWindow() {
		game.closeSetupScreen(this);
	}

	/**
	 * Create the setup screen
	 * @param incomingGame main game
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
		window.setResizable(false);
		window.setTitle("Farm Simulator Start Menu");
		window.setBounds(100, 100, 707, 295);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		JLabel farmTypeTip = new JLabel("Farms have different starting money and growth rates");
		farmTypeTip.setFont(new Font("Tahoma", Font.BOLD, 11));
		farmTypeTip.setIcon(new ImageIcon(StartGameScreen.class.getResource("/images/bigButton.png")));
		farmTypeTip.setHorizontalTextPosition(SwingConstants.CENTER);
		farmTypeTip.setHorizontalAlignment(SwingConstants.CENTER);
		farmTypeTip.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		farmTypeTip.setBounds(362, 52, 322, 14);
		window.getContentPane().add(farmTypeTip);
		
		// Hint for num characters
		JLabel hint1 = new JLabel("(3 - 15 Characters, alphabetic, no symbols)");
		hint1.setFont(new Font("Dialog", Font.BOLD, 11));
		hint1.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		hint1.setHorizontalTextPosition(SwingConstants.CENTER);
		hint1.setIcon(new ImageIcon(StartGameScreen.class.getResource("/images/bigButton.png")));
		hint1.setHorizontalAlignment(SwingConstants.CENTER);
		hint1.setBounds(10, 52, 314, 14);
		window.getContentPane().add(hint1);
		
		// Farmer name label
		JLabel farmerNameQuestion = new JLabel("Farmer Name:");
		farmerNameQuestion.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		farmerNameQuestion.setIcon(new ImageIcon(StartGameScreen.class.getResource("/images/setupButton.png")));
		farmerNameQuestion.setHorizontalTextPosition(SwingConstants.CENTER);
		farmerNameQuestion.setFont(new Font("Dialog", Font.BOLD, 12));
		farmerNameQuestion.setBounds(10, 14, 115, 34);
		window.getContentPane().add(farmerNameQuestion);
		
		// Farm name text field
		nameTextField = new JTextField();
		nameTextField.setBounds(141, 14, 183, 34);
		window.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		// Select farm type label
		JLabel lblSelectFarmType = new JLabel("Select Farm Type:");
		lblSelectFarmType.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblSelectFarmType.setIcon(new ImageIcon(StartGameScreen.class.getResource("/images/setupbutton2.png")));
		lblSelectFarmType.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSelectFarmType.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSelectFarmType.setBounds(362, 14, 136, 34);
		window.getContentPane().add(lblSelectFarmType);
		
		// Farm type selection from combo box 
		JComboBox<String> theFarmType = new JComboBox<String>();
		theFarmType.setFont(new Font("Tahoma", Font.BOLD, 11));
		theFarmType.setModel(new DefaultComboBoxModel<String>(new String[] {"Swamp Farm", "Desert Farm", "Plains Farm", "Mountain Farm"}));
		theFarmType.setBounds(508, 14, 176, 34);
		window.getContentPane().add(theFarmType);
		
		// Hint for num chars
		JLabel hint2 = new JLabel("(3 - 15 Characters, alphabetic, no symbols)");
		hint2.setFont(new Font("Dialog", Font.BOLD, 11));
		hint2.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		hint2.setIcon(new ImageIcon(StartGameScreen.class.getResource("/images/bigButton.png")));
		hint2.setHorizontalTextPosition(SwingConstants.CENTER);
		hint2.setHorizontalAlignment(SwingConstants.CENTER);
		hint2.setBounds(362, 130, 322, 14);
		window.getContentPane().add(hint2);
		
		// Farm name label
		JLabel lblFarmName = new JLabel("Farm Name:");
		lblFarmName.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		lblFarmName.setIcon(new ImageIcon(StartGameScreen.class.getResource("/images/setupButton.png")));
		lblFarmName.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFarmName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblFarmName.setBounds(362, 92, 115, 34);
		window.getContentPane().add(lblFarmName);
		
		// Farm name text field
		farmTextField = new JTextField();
		farmTextField.setColumns(10);
		farmTextField.setBounds(488, 92, 196, 34);
		window.getContentPane().add(farmTextField);

		// Spinner for set Game length between 5-15 days. Default is 5 days!
		JSpinner spinnerGameLength = new JSpinner();
		spinnerGameLength.setModel(new SpinnerNumberModel(5, 5, 15, 1));
		spinnerGameLength.setBounds(549, 155, 65, 34);
		window.getContentPane().add(spinnerGameLength);
		
		// How long would you like your game to last label
		JLabel gameLastQuestion = new JLabel("How long would you like your farming adventure to last?");
		gameLastQuestion.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		gameLastQuestion.setIcon(new ImageIcon(StartGameScreen.class.getResource("/images/bigButton.png")));
		gameLastQuestion.setHorizontalTextPosition(SwingConstants.CENTER);
		gameLastQuestion.setFont(new Font("Dialog", Font.BOLD, 12));
		gameLastQuestion.setBounds(97, 155, 442, 34);
		window.getContentPane().add(gameLastQuestion);
		
		// Spiner to set Farmers age 
		JSpinner farmersAge = new JSpinner();
		farmersAge.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		farmersAge.setBounds(222, 92, 102, 34);
		window.getContentPane().add(farmersAge);
		
		// What is your farmers age? label
		JLabel farmAgeQuestion = new JLabel("What is your farmers age?");
		farmAgeQuestion.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		farmAgeQuestion.setIcon(new ImageIcon(StartGameScreen.class.getResource("/images/button.jpg")));
		farmAgeQuestion.setHorizontalTextPosition(SwingConstants.CENTER);
		farmAgeQuestion.setFont(new Font("Dialog", Font.BOLD, 12));
		farmAgeQuestion.setBounds(10, 92, 202, 34);
		window.getContentPane().add(farmAgeQuestion);

		//Start game button checks if game variables are set then starts game
		JButton btnNewButton = new JButton("Start Game!");
		btnNewButton.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnNewButton.setBackground(new Color(210, 180, 140));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
					game.setFarmerStats(nameTextField.getText(), (Integer) farmersAge.getValue());
					game.setNumDays((Integer) spinnerGameLength.getValue());
					finishedWindow();

				} else {
					PopUp popup = new PopUp(game, window, "Sorry that is not a valid farmer or farm name!");
					popup.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(266, 200, 145, 50);
		window.getContentPane().add(btnNewButton);
		
		// Gives user stats of selected farm
		JButton checkFarmStats = new JButton("Farm Stats");
		checkFarmStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Farm farm;
				PopUp popup;
				switch((String)theFarmType.getSelectedItem()) {
				case "Swamp Farm":
					farm = new SwampFarm();
					popup = new PopUp(game, window, "Starting money: $" + farm.getFarmMoney() + ", Growth rate: " + farm.getGrowthRate());
					popup.setVisible(true);
					break;
				case "Desert Farm":
					farm = new DesertFarm();
					popup = new PopUp(game, window, "Starting money: $" + farm.getFarmMoney() + ", Growth rate: " + farm.getGrowthRate());
					popup.setVisible(true);

					break;
				case "Plains Farm":
					farm = new PlainsFarm();
					popup = new PopUp(game, window, "Starting money: $" + farm.getFarmMoney() + ", Growth rate: " + farm.getGrowthRate());
					popup.setVisible(true);

					break;
				case "Mountain Farm":
					farm = new MountainFarm();
					popup = new PopUp(game, window, "Starting money: $" + farm.getFarmMoney() + ", Growth rate: " + farm.getGrowthRate());
					popup.setVisible(true);

					break;
			}
			}
		});
		checkFarmStats.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		checkFarmStats.setBackground(new Color(210, 180, 140));
		checkFarmStats.setBounds(595, 68, 89, 23);
		window.getContentPane().add(checkFarmStats);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(StartGameScreen.class.getResource("/images/setupScreenGrass.png")));
		background.setBounds(0, 0, 716, 273);
		window.getContentPane().add(background);
		
		
	}
}
