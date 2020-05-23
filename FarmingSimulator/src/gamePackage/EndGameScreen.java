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
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class EndGameScreen extends JDialog {


	/**
	 * Create the dialog.
	 */
	public EndGameScreen(GameEnvironment game) {
		setResizable(false);
		setTitle("Finished");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Exit game");
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/button.jpg")));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		btnNewButton.setBounds(179, 242, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel scoreLabel = new JLabel("You got " + game.calculateScore() + " points!");
		scoreLabel.setOpaque(true);
		scoreLabel.setBackground(new Color(154, 205, 50));
		scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		scoreLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scoreLabel.setBounds(0, 202, 444, 37);
		getContentPane().add(scoreLabel);
		
		JLabel farmName = new JLabel("Farm name: " + game.farm.getFarmName());
		farmName.setBorder(new LineBorder(new Color(139, 69, 19), 2, true));
		farmName.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/bigButton.png")));
		farmName.setHorizontalTextPosition(SwingConstants.CENTER);
		farmName.setHorizontalAlignment(SwingConstants.CENTER);
		farmName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		farmName.setBounds(0, 72, 444, 37);
		getContentPane().add(farmName);
		
		JLabel gameDuration = new JLabel("Your game lasted " + game.getGameDuration() + " days");
		gameDuration.setBorder(new LineBorder(new Color(139, 69, 19), 2, true));
		gameDuration.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/bigButton.png")));
		gameDuration.setHorizontalTextPosition(SwingConstants.CENTER);
		gameDuration.setHorizontalAlignment(SwingConstants.CENTER);
		gameDuration.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gameDuration.setBounds(0, 107, 444, 37);
		getContentPane().add(gameDuration);
		
		JLabel label_1 = new JLabel("Over this time, you made $" + (game.farm.farmMoney - game.farm.staticFarmMoney));
		label_1.setBorder(new LineBorder(new Color(139, 69, 19), 2, true));
		label_1.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/bigButton.png")));
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(0, 142, 444, 37);
		getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("--------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(2, 181, 444, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("--------------------------------------------------------------------------------------------------------------");
		label_2.setBounds(0, 246, 444, 14);
		getContentPane().add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("Congratulations! Game Finished!");
		lblNewLabel_2.setBorder(new LineBorder(new Color(139, 69, 19), 4, true));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/bigButton.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(0, 26, 444, 37);
		getContentPane().add(lblNewLabel_2);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(EndGameScreen.class.getResource("/images/endGameBackground.png")));
		background.setBounds(0, 0, 444, 271);
		getContentPane().add(background);
		

	}
}
