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
		btnViewCropsAndAnimals.setBounds(258, 58, 210, 23);
		window.getContentPane().add(btnViewCropsAndAnimals);
		btnViewCropsAndAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.viewFarm(window);

			}
		});
		
		// View farm money
		JButton btnViewFarmMoney = new JButton("View farm money");
		btnViewFarmMoney.setBounds(258, 24, 210, 23);
		window.getContentPane().add(btnViewFarmMoney);
		btnViewFarmMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.viewFarmMoney(window);
				;
			}
		});
		
		// Visit Tool Market
		JButton btnVisitToolMarket = new JButton("Visit Tom's Tool Market");
		btnVisitToolMarket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitToolMarket(window);
			}
		});
		btnVisitToolMarket.setBounds(10, 24, 210, 23);
		window.getContentPane().add(btnVisitToolMarket);
		
		// Visit Crop Market
		JButton btnVisitCassiesCrop = new JButton("Visit Cassie's Crop Market");
		btnVisitCassiesCrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitCropMarket(window);
			}
		});
		btnVisitCassiesCrop.setBounds(10, 60, 210, 23);
		window.getContentPane().add(btnVisitCassiesCrop);
		
		// Visit Animal Market
		JButton btnVisitAndysAnimal = new JButton("Visit Andy's Animal Market");
		btnVisitAndysAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitAnimalMarket(window);
			}
		});
		btnVisitAndysAnimal.setBounds(10, 94, 210, 23);
		window.getContentPane().add(btnVisitAndysAnimal);
		
		// Move on to next day
		JButton btnMoveOntoNext = new JButton("Move on to next day");
		btnMoveOntoNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.nextDay(window, false);
			}
		});
		btnMoveOntoNext.setBounds(502, 445, 210, 23);
		window.getContentPane().add(btnMoveOntoNext);
		
		// Tend to crops
		JButton btnTendToCrops = new JButton("Tend to your crops");
		btnTendToCrops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.tendToCrops(window);
			}
		});
		btnTendToCrops.setBounds(258, 409, 210, 23);
		window.getContentPane().add(btnTendToCrops);
		
		// Feed animals
		JButton btnFeedYourAnimals = new JButton("Feed your animals");
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
		btnTendToFarmland.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.tendToFarmLand(window);
			}
		});
		btnTendToFarmland.setToolTipText("");
		btnTendToFarmland.setBounds(10, 445, 210, 23);
		window.getContentPane().add(btnTendToFarmland);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(MainScreen.class.getResource("/images/farm_background.gif")));
		background.setBounds(0, 0, 722, 480);
		window.getContentPane().add(background);
		
		
		
	}
}


