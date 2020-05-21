package gamePackage;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen {

	private JFrame window;
	private GameEnvironment game;

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
	
	public void viewFarm(GameEnvironment game) {
		ViewFarm viewFarm = new ViewFarm(game, window);
		viewFarm.setVisible(true);

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
		
		JButton btnNewButton = new JButton("View crops and animals");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewFarm(game);
			}
		});
		btnNewButton.setBounds(300, 11, 183, 23);
		window.getContentPane().add(btnNewButton);
		
	}
	
}


