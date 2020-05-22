package gamePackage;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen {

	JFrame window;
	private GameEnvironment game;
	private int actions;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GameEnvironment game = new GameEnvironment(); Farm farm = new DesertFarm(); game.setFarm(farm);
			Crop avo = new Crop("Avocado", 1); farm.cropList.add(avo); game.farm.addChickenToFarm(); game.farm.addCowToFarm(); game.farm.addChickenToFarm();
			MainScreen main = new MainScreen(game);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
		window.setTitle("Main Screen");
		window.setBounds(100, 100, 509, 419);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		// View crops and animals
		JButton btnViewCropsAndAnimals = new JButton("View crops and animals");
		btnViewCropsAndAnimals.setBounds(297, 52, 183, 23);
		window.getContentPane().add(btnViewCropsAndAnimals);
		btnViewCropsAndAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.viewFarm(window);

			}
		});
		
		// View farm money
		JButton btnViewFarmMoney = new JButton("View farm money");
		btnViewFarmMoney.setBounds(297, 18, 183, 23);
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
		btnVisitToolMarket.setBounds(297, 86, 183, 23);
		window.getContentPane().add(btnVisitToolMarket);
		
		// Visit Crop Market
		JButton btnVisitCassiesCrop = new JButton("Visit Cassie's Crop Market");
		btnVisitCassiesCrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitCropMarket(window);
			}
		});
		btnVisitCassiesCrop.setBounds(270, 120, 210, 23);
		window.getContentPane().add(btnVisitCassiesCrop);
		
		// Visit Animal Market
		JButton btnVisitAndysAnimal = new JButton("Visit Andy's Animal Market");
		btnVisitAndysAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.visitAnimalMarket(window);
			}
		});
		btnVisitAndysAnimal.setBounds(270, 154, 210, 23);
		window.getContentPane().add(btnVisitAndysAnimal);
		

		
	}

	/**
	 * @return the actions
	 */
	public int getActions() {
		return actions;
	}

	/**
	 * @param actions the actions to set
	 */
	public void setActions(int actions) {
		this.actions = actions;
	}
	
}


