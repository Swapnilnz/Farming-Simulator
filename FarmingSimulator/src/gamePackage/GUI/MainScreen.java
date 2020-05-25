package gamePackage.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

import gamePackage.GameEnvironment;

/**
 * Main screen of the game, hub for all actions
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class MainScreen {
	
	/**
	 * Main window
	 */
	JFrame window;
	/**
	 * Game to update
	 */
	private GameEnvironment game;
	
	/**
	 * Create the main screen
	 * @param incomingGame game to update
	 */
	public MainScreen(GameEnvironment incomingGame) {
		game = incomingGame;
		initialize();
		window.setVisible(true);
	}
	
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
		game.closeMainScreen(this);
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setResizable(false);
		window.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		window.setBackground(Color.WHITE);
		window.getContentPane().setBackground(Color.WHITE);
		window.setTitle("Main Screen");
		window.setBounds(100, 100, 736, 518);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		// Actions left
		JLabel actionsLabel = new JLabel("You have " + game.getNumActions() + " action(s) left");
		actionsLabel.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		actionsLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		actionsLabel.setIcon(new ImageIcon(MainScreen.class.getResource("/images/bigButton.png")));
		actionsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		actionsLabel.setBounds(502, 410, 210, 23);
		window.getContentPane().add(actionsLabel);
		
		
		// View crops and animals
		JButton btnViewCropsAndAnimals = new JButton("View crops and animals");
		btnViewCropsAndAnimals.setBackground(new Color(210, 180, 140));
		btnViewCropsAndAnimals.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewCropsAndAnimals.setHorizontalTextPosition(SwingConstants.CENTER);
		btnViewCropsAndAnimals.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnViewCropsAndAnimals.setBounds(495, 139, 210, 23);
		window.getContentPane().add(btnViewCropsAndAnimals);
		btnViewCropsAndAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.viewFarm(window);

			}
		});
		
		// View farm money
		JButton btnViewFarmMoney = new JButton("View farm money");
		btnViewFarmMoney.setBackground(new Color(210, 180, 140));
		btnViewFarmMoney.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewFarmMoney.setHorizontalTextPosition(SwingConstants.CENTER);
		btnViewFarmMoney.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnViewFarmMoney.setBounds(495, 173, 210, 23);
		window.getContentPane().add(btnViewFarmMoney);
		btnViewFarmMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.viewFarmMoney(window);
				;
			}
		});
		
		// Visit Tool Market
		JButton btnVisitToolMarket = new JButton("Visit Tom's Tool Market");
		btnVisitToolMarket.setBackground(new Color(210, 180, 140));
		btnVisitToolMarket.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVisitToolMarket.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVisitToolMarket.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnVisitToolMarket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitToolMarket(window);
			}
		});
		btnVisitToolMarket.setBounds(10, 11, 210, 23);
		window.getContentPane().add(btnVisitToolMarket);
		
		// Visit Crop Market
		JButton btnVisitCassiesCrop = new JButton("Visit Cassie's Crop Market");
		btnVisitCassiesCrop.setBackground(new Color(210, 180, 140));
		btnVisitCassiesCrop.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVisitCassiesCrop.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVisitCassiesCrop.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnVisitCassiesCrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitCropMarket(window);
			}
		});
		btnVisitCassiesCrop.setBounds(10, 47, 210, 23);
		window.getContentPane().add(btnVisitCassiesCrop);
		
		// Visit Animal Market
		JButton btnVisitAndysAnimal = new JButton("Visit Andy's Animal Market");
		btnVisitAndysAnimal.setBackground(new Color(210, 180, 140));
		btnVisitAndysAnimal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVisitAndysAnimal.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVisitAndysAnimal.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnVisitAndysAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitAnimalMarket(window);
			}
		});
		btnVisitAndysAnimal.setBounds(10, 81, 210, 23);
		window.getContentPane().add(btnVisitAndysAnimal);
		
		// Move on to next day
		JButton btnMoveOntoNext = new JButton("Move on to next day");
		btnMoveOntoNext.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnMoveOntoNext.setBackground(new Color(210, 180, 140));
		btnMoveOntoNext.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMoveOntoNext.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMoveOntoNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.nextDay(window, false);
				actionsLabel.setText("You have " + game.getNumActions() + " actions left");

			}
		});
		btnMoveOntoNext.setBounds(502, 445, 210, 23);
		window.getContentPane().add(btnMoveOntoNext);
		
		// Tend to crops
		JButton btnTendToCrops = new JButton("Tend to your crops");
		btnTendToCrops.setToolTipText("Makes them grow faster!");
		btnTendToCrops.setBackground(new Color(210, 180, 140));
		btnTendToCrops.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendToCrops.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTendToCrops.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnTendToCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.tendToCrops(window);
				actionsLabel.setText("You have " + game.getNumActions() + " actions left");
				
			}
		});
		btnTendToCrops.setBounds(258, 409, 210, 23);
		window.getContentPane().add(btnTendToCrops);
		
		// Feed animals
		JButton btnFeedYourAnimals = new JButton("Feed your animals");
		btnFeedYourAnimals.setBackground(new Color(210, 180, 140));
		btnFeedYourAnimals.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFeedYourAnimals.setHorizontalTextPosition(SwingConstants.CENTER);
		btnFeedYourAnimals.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnFeedYourAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.feedAnimals(window);
				actionsLabel.setText("You have " + game.getNumActions() + " actions left");

			}
		});
		btnFeedYourAnimals.setToolTipText("Uses animal feed, increases their health!");
		btnFeedYourAnimals.setBounds(10, 375, 210, 23);
		window.getContentPane().add(btnFeedYourAnimals);
		
		// Play with animals
		JButton btnPlayWithAnimals = new JButton("Play with animals");
		btnPlayWithAnimals.setBackground(new Color(210, 180, 140));
		btnPlayWithAnimals.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlayWithAnimals.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPlayWithAnimals.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnPlayWithAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.playWithAnimals(window);
				actionsLabel.setText("You have " + game.getNumActions() + " actions left");

			}
		});
		btnPlayWithAnimals.setToolTipText("Increases animal happiness!");
		btnPlayWithAnimals.setBounds(10, 409, 210, 23);
		window.getContentPane().add(btnPlayWithAnimals);

		
		// Harvest Crops
		JButton btnHarvestCrops = new JButton("Harvest crops");
		btnHarvestCrops.setBackground(new Color(210, 180, 140));
		btnHarvestCrops.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHarvestCrops.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHarvestCrops.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnHarvestCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.harvestCrops(window);
				actionsLabel.setText("You have " + game.getNumActions() + " actions left");

			}
		});
		btnHarvestCrops.setToolTipText("Get money!");
		btnHarvestCrops.setBounds(258, 445, 210, 23);
		window.getContentPane().add(btnHarvestCrops);
		
		// Tend to farm land
		JButton btnTendToFarmland = new JButton("Tend to farm land");
		btnTendToFarmland.setBackground(new Color(210, 180, 140));
		btnTendToFarmland.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTendToFarmland.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTendToFarmland.setBorder(new LineBorder(new Color(139, 69, 19), 1, true));
		btnTendToFarmland.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.tendToFarmLand(window);
				actionsLabel.setText("You have " + game.getNumActions() + " actions left");

			}
		});
		btnTendToFarmland.setToolTipText("Animals won't lose happiness overnight!");
		btnTendToFarmland.setBounds(10, 445, 210, 23);
		window.getContentPane().add(btnTendToFarmland);
		
		// Farm name on screen
		JLabel farmName = new JLabel(game.farm.getFarmName());
		farmName.setIcon(new ImageIcon(MainScreen.class.getResource("/images/sign.png")));
		farmName.setForeground(new Color(102, 51, 0));
		farmName.setHorizontalTextPosition(SwingConstants.CENTER);
		farmName.setBackground(new Color(255, 255, 255));
		farmName.setHorizontalAlignment(SwingConstants.CENTER);
		farmName.setFont(new Font("Ravie", Font.PLAIN, 20));
		farmName.setBounds(479, 11, 241, 113);
		window.getContentPane().add(farmName);
		
		// Background
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(MainScreen.class.getResource("/images/farm_background.gif")));
		background.setBounds(0, 0, 720, 479);
		window.getContentPane().add(background);
		
		
		
	}
}


