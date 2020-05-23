package gamePackage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EndGameScreen extends JDialog {


	/**
	 * Create the dialog.
	 */
	public EndGameScreen(GameEnvironment game) {
		setResizable(false);
		setTitle("Finished");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextPane finishedGame = new JTextPane();
		finishedGame.setEditable(false);
		finishedGame.setFont(new Font("Tahoma", Font.PLAIN, 25));
		finishedGame.setText("You finished the game!");
		finishedGame.setBounds(93, 24, 263, 37);
		getContentPane().add(finishedGame);
		
		JLabel farmName = new JLabel("Farm name: " + game.farm.getFarmName());
		farmName.setHorizontalAlignment(SwingConstants.CENTER);
		farmName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		farmName.setBounds(0, 72, 444, 37);
		getContentPane().add(farmName);
		
		JLabel gameDuration = new JLabel("Game duration: " + game.getGameDuration() + " days");
		gameDuration.setHorizontalAlignment(SwingConstants.CENTER);
		gameDuration.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gameDuration.setBounds(0, 107, 444, 37);
		getContentPane().add(gameDuration);
		
		JLabel label_1 = new JLabel("Over this time, you made $" + (game.farm.farmMoney - game.farm.staticFarmMoney));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(0, 142, 444, 37);
		getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("--------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(2, 181, 444, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel scoreLabel = new JLabel("Your score was: " + game.calculateScore());
		scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		scoreLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scoreLabel.setBounds(0, 202, 444, 37);
		getContentPane().add(scoreLabel);
		
		JLabel label_2 = new JLabel("--------------------------------------------------------------------------------------------------------------");
		label_2.setBounds(0, 246, 444, 14);
		getContentPane().add(label_2);
		

	}
}
