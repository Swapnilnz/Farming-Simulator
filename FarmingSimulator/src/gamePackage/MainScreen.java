package gamePackage;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainScreen {

	JFrame window;
	private GameEnvironment game;
	private int actions;
	


	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
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
	 * Finished with the window --> close screen
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

		
		// View crops and animals
		JButton btnViewCropsAndAnimals = new JButton("View crops and animals");
		btnViewCropsAndAnimals.setHorizontalTextPosition(SwingConstants.CENTER);
		btnViewCropsAndAnimals.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnViewCropsAndAnimals.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnViewCropsAndAnimals.setBounds(10, 214, 210, 23);
		window.getContentPane().add(btnViewCropsAndAnimals);
		btnViewCropsAndAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.viewFarm(window);

			}
		});
		
		// View farm money
		JButton btnViewFarmMoney = new JButton("View farm money");
		btnViewFarmMoney.setHorizontalTextPosition(SwingConstants.CENTER);
		btnViewFarmMoney.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnViewFarmMoney.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnViewFarmMoney.setBounds(10, 248, 210, 23);
		window.getContentPane().add(btnViewFarmMoney);
		btnViewFarmMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.viewFarmMoney(window);
				;
			}
		});
		
		// Visit Tool Market
		JButton btnVisitToolMarket = new JButton("Visit Tom's Tool Market");
		btnVisitToolMarket.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVisitToolMarket.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnVisitToolMarket.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnVisitToolMarket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitToolMarket(window);
			}
		});
		btnVisitToolMarket.setBounds(10, 11, 210, 23);
		window.getContentPane().add(btnVisitToolMarket);
		
		// Visit Crop Market
		JButton btnVisitCassiesCrop = new JButton("Visit Cassie's Crop Market");
		btnVisitCassiesCrop.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVisitCassiesCrop.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnVisitCassiesCrop.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnVisitCassiesCrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitCropMarket(window);
			}
		});
		btnVisitCassiesCrop.setBounds(10, 47, 210, 23);
		window.getContentPane().add(btnVisitCassiesCrop);
		
		// Visit Animal Market
		JButton btnVisitAndysAnimal = new JButton("Visit Andy's Animal Market");
		btnVisitAndysAnimal.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVisitAndysAnimal.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnVisitAndysAnimal.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnVisitAndysAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitAnimalMarket(window);
			}
		});
		btnVisitAndysAnimal.setBounds(10, 81, 210, 23);
		window.getContentPane().add(btnVisitAndysAnimal);
		
		// Move on to next day
		JButton btnMoveOntoNext = new JButton("Move on to next day");
		btnMoveOntoNext.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMoveOntoNext.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnMoveOntoNext.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnMoveOntoNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.nextDay(window, false);
			}
		});
		btnMoveOntoNext.setBounds(502, 445, 210, 23);
		window.getContentPane().add(btnMoveOntoNext);
		
		// Tend to crops
		JButton btnTendToCrops = new JButton("Tend to your crops");
		btnTendToCrops.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTendToCrops.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnTendToCrops.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnTendToCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.tendToCrops(window);
			}
		});
		btnTendToCrops.setBounds(258, 409, 210, 23);
		window.getContentPane().add(btnTendToCrops);
		
		// Feed animals
		JButton btnFeedYourAnimals = new JButton("Feed your animals");
		btnFeedYourAnimals.setHorizontalTextPosition(SwingConstants.CENTER);
		btnFeedYourAnimals.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnFeedYourAnimals.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnFeedYourAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.feedAnimals(window);
			}
		});
		btnFeedYourAnimals.setToolTipText("Uses animal feed");
		btnFeedYourAnimals.setBounds(10, 375, 210, 23);
		window.getContentPane().add(btnFeedYourAnimals);
		
		// Play with animals
		JButton btnPlayWithAnimals = new JButton("Play with animals");
		btnPlayWithAnimals.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPlayWithAnimals.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnPlayWithAnimals.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnPlayWithAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.playWithAnimals(window);
			}
		});
		btnPlayWithAnimals.setToolTipText("Uses animal feed");
		btnPlayWithAnimals.setBounds(10, 409, 210, 23);
		window.getContentPane().add(btnPlayWithAnimals);

		
		// Harvest Crops
		JButton btnHarvestCrops = new JButton("Harvest crops");
		btnHarvestCrops.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHarvestCrops.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnHarvestCrops.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnHarvestCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.harvestCrops(window);
			}
		});
		btnHarvestCrops.setToolTipText("");
		btnHarvestCrops.setBounds(258, 445, 210, 23);
		window.getContentPane().add(btnHarvestCrops);
		
		// Tend to farm land
		JButton btnTendToFarmland = new JButton("Tend to farm land");
		btnTendToFarmland.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTendToFarmland.setIcon(new ImageIcon(MainScreen.class.getResource("/images/mainScreenButtons.png")));
		btnTendToFarmland.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnTendToFarmland.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.tendToFarmLand(window);
			}
		});
		btnTendToFarmland.setToolTipText("");
		btnTendToFarmland.setBounds(10, 445, 210, 23);
		window.getContentPane().add(btnTendToFarmland);
		
		JLabel farmName = new JLabel(game.farm.getFarmName());
		farmName.setForeground(new Color(102, 51, 0));
		farmName.setHorizontalTextPosition(SwingConstants.CENTER);
		farmName.setBackground(new Color(255, 255, 255));
		farmName.setHorizontalAlignment(SwingConstants.CENTER);
		farmName.setFont(new Font("Ravie", Font.PLAIN, 20));
		farmName.setBounds(456, 35, 210, 104);
		window.getContentPane().add(farmName);
		
		JLabel sign = new JLabel("");
		sign.setIcon(new ImageIcon(MainScreen.class.getResource("/images/sign.png")));
		sign.setBounds(432, 11, 250, 206);
		window.getContentPane().add(sign);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(MainScreen.class.getResource("/images/farm_background.gif")));
		background.setBounds(0, 0, 722, 480);
		window.getContentPane().add(background);
		
		
		
	}
}


